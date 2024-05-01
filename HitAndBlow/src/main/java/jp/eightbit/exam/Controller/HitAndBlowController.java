package jp.eightbit.exam.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.eightbit.exam.Model.AnswerModel;
import jp.eightbit.exam.Model.UserChoiceModel;
import jp.eightbit.exam.Service.HitAndBlowService;

@Controller
public class HitAndBlowController {

	private final HitAndBlowService habS;
	
	public HitAndBlowController(HitAndBlowService hitandblowservice) {
		this.habS = hitandblowservice;
	}
	
	@GetMapping("/")
	public String routeToIndex(UserChoiceModel model) {
		model = new UserChoiceModel();
		return "index";
	}
	
	@GetMapping("/HitAndBlow")
	public String routeToHitAndBlow(UserChoiceModel userchoicemodel, Model model) {
		habS.generateAnswer();
		model.addAttribute("userChoice", userchoicemodel);
		return "HitAndBlow";
	}
	
	@PostMapping("/answer")
	public String answerCheck(@Validated UserChoiceModel userchoicemodel, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("error", "数値を入力してください！");
			return "HitAndBlow";
		}else {
			List<UserChoiceModel> userList = habS.check();
			model.addAttribute("userchoicemodel", userchoicemodel);
			model.addAttribute("userList", userList);
			return "HitAndBlow";
		}
	}
}
