package jp.eightbit.exam.Controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.eightbit.exam.Model.AnswerModel;
import jp.eightbit.exam.Model.UserChoiceModel;
import jp.eightbit.exam.Service.HitAndBlowService;
import jp.eightbit.exam.UserEntity.UserEntity;

@Controller
public class HitAndBlowController {

	private final HitAndBlowService habS;
	
	public HitAndBlowController(HitAndBlowService hitandblowservice) {
		this.habS = hitandblowservice;
	}
	
	private UserEntity userData;
	private List<UserChoiceModel> userChoiseList = new ArrayList<>();

	@GetMapping("/")
	public String routeToLogin(Model model) {
		model.addAttribute("UserEntity", new UserEntity());
		
		userData = null;
		
		return "login";
	}
	
	@PostMapping("/try")
	public String otameshi(@RequestParam("clientId") String	clientId,
							@RequestParam("credential") String credencial,
							@RequestParam("select_by")  String selectBy,
                            @RequestParam("g_csrf_token") String gCsrfToken) throws GeneralSecurityException, IOException {
		
		System.out.println("処理開始");
		
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier
				.Builder(new NetHttpTransport(), GsonFactory.getDefaultInstance())
		        .setAudience(Collections.singletonList("683598622008-lpj7nun0i0ti8get37vnd1ttmq3iirkb.apps.googleusercontent.com")).build();
		GoogleIdToken idToken = verifier.verify(credencial);
        if (idToken != null) {
            GoogleIdToken.Payload payload = idToken.getPayload();  
            System.out.println("email:" + payload.getEmail());
            System.out.println("name:" + payload.get("name"));
            System.out.println("familyName:" + payload.get("family_name"));
        } else {
            System.out.println("Invalid ID token.");
        }

		System.out.println("処理終了");
		return "login";
	}

	@PostMapping("/login")
	public String toIndex(@RequestParam("email")String email, @RequestParam("pass")String pass, Model model) {
		String path = "login";
		UserEntity userE = null;

		List<UserEntity> userList = new ArrayList<>();
		userList = habS.findall();
		
		if(email.isBlank()) {
			model.addAttribute("message", "メールアドレスもしくはパスワードが入力されていません！");
			userE = new UserEntity();
		}else {
			for(UserEntity u: userList) {
				if(u.getEmail().equals(email)) {				
					try {
						String hashPass = habS.toHash(pass);
						System.out.println(hashPass);

						if(u.getPassword().equals(hashPass)) {
							userData = habS.findone(email);
							path = "index";
							userE = userData;
							break;
							
						}else {
							model.addAttribute("message", "ユーザー名もしくはパスワードが違います！");
							userE = new UserEntity();
						}
					} catch (Exception e) {
						model.addAttribute("message", "エラーが発生しました。["+ e.getClass().getName() +" : "+ e.getMessage() +"]");
						userE = new UserEntity();
						return path;
					}
				}
			}
		}
		
		//コメントしてみた
		
		model.addAttribute("UserEntity", userE);
		model.addAttribute("ranking", habS.generateRanking(habS.findall()));
		return path;
	}
	
	@PostMapping("/regist")
	public String regist(@ModelAttribute("UserEntity") @Validated UserEntity user,BindingResult result , Model model) {
		if(result.hasErrors()) {
			model.addAttribute("error1", "失敗しました");
			model.addAttribute("error2", result.getAllErrors());
			return "login";
		}else {
			List<UserEntity> userList = new ArrayList<>();
			userList = habS.findall();
			for(UserEntity u: userList) {
				if(user.getUserName().equals(u.getUserName())) {
					model.addAttribute("error1", "そのユーザー名は既に使われています");
					return "login";
				}
			}
		}
		try {
			user.setPassword(habS.toHash(user.getPassword()));
		} catch (Exception e) {
			model.addAttribute("error1", "失敗しました");
			model.addAttribute("error2", e.getClass().getName() +" : "+ e.getMessage());
			return "login";
		}
		user.setAverage("99.00");
		habS.save(user);
		model.addAttribute("error1", "登録完了！！");
		return "login";
	}
/*
	@GetMapping("/")
	public String routeToIndex(UserChoiceModel model) {
		model = new UserChoiceModel();
		return "index";
	}
*/
	@GetMapping("/start")
	public String routeToHitAndBlow(UserChoiceModel userchoicemodel, Model model) {
		habS.generateAnswer();
		userData.setLastPlay(habS.getNow());
		userData.setNumOfPlay(habS.setNumOfPlay(userData.getNumOfPlay()));
		
		model.addAttribute("title", "問題");
		model.addAttribute("answer", "？ ？ ？ ？");
		
		System.out.println(habS.getAnswer());
		
		return "HitAndBlow";
	}
	
	@PostMapping("/answer")
	public String answerCheck(@RequestParam("guessDigit1") String digit1,
							  @RequestParam("guessDigit2") String digit2,
							  @RequestParam("guessDigit3") String digit3,
							  @RequestParam("guessDigit4") String digit4, Model model) {
		
		UserChoiceModel guess = new UserChoiceModel();
		
		try {
			habS.setDigits(guess, digit1, digit2, digit3, digit4);
		} catch (NumberFormatException e) {
			model.addAttribute("List", userChoiseList);
			model.addAttribute("title", "問題");
			model.addAttribute("answer", "？ ？ ？ ？");
			model.addAttribute("model", "！！空欄があります！！");
			return "HitAndBlow";
		}
		
		guess = habS.check(guess);
		userChoiseList.add(guess);
		
		int lastIndex = userChoiseList.size() - 1;
			
		userChoiseList.get(lastIndex).setId(lastIndex + 1);
		
		System.out.println(userChoiseList.get(lastIndex));
		System.out.println("HIT : " + userChoiseList.get(lastIndex).getCountHit());
		System.out.println("BLOW : " + userChoiseList.get(lastIndex).getCountBlow());
		
		model.addAttribute("List", userChoiseList);
		
		if(guess.getCountHit() == 4) {
			model.addAttribute("title", "答え");
			model.addAttribute("answer", habS.getAnswer());
			
			userData.setShortestClear(habS.getfastest(userData.getShortestClear(), guess.getId()));
			userData.setLongestClear(habS.getLatest(userData.getLongestClear(), guess.getId()));
			userData.setTotal(habS.setTotal(userData.getTotal(), guess.getId()));
			userData.setNumOfClear(habS.setNumOfClear(userData.getNumOfClear()));
			userData.setAverage(habS.getAverage(userData.getNumOfClear(), userData.getTotal()));
			
			System.out.println(userData.getUserName() +" : "+ userData.getAverage());
			
			habS.save(userData);
			
			return "result";
		}else {
			model.addAttribute("title", "問題");
			model.addAttribute("answer", "？ ？ ？ ？");
		}
		
		return "HitAndBlow";
	}
	
	@GetMapping("/retired")
	public String retire(Model model) {
		
		model.addAttribute("title", "答え");
		model.addAttribute("answer", habS.getAnswer());
		model.addAttribute("List", userChoiseList);
		
		userData.setTotal(habS.setTotal(userData.getTotal(), userChoiseList.size()));
		userData.setAverage(habS.getAverage(userData.getNumOfClear(), userData.getTotal()));
		habS.save(userData);
		
		return "result";
	}
	
	@GetMapping("/index")
	public String toindex(Model model){
		userChoiseList.clear();
		model.addAttribute("UserEntity", userData);
		model.addAttribute("ranking", habS.generateRanking(habS.findall()));
		return "index";
	}
	
	@GetMapping("/title")
	public String toTitle(Model model) {
		userData = null;
		model.addAttribute("UserEntity", new UserEntity());
		return "login";
	}
}
