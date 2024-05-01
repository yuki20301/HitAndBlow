package jp.eightbit.exam.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.DatatypeConverter;
import jp.eightbit.exam.Model.AnswerModel;
import jp.eightbit.exam.Model.RankingModel;
import jp.eightbit.exam.Model.UserChoiceModel;
import jp.eightbit.exam.UserDataRepository.UserDataRepository;
import jp.eightbit.exam.UserEntity.UserEntity;

@Service
public class HitAndBlowService {
	
//	@Autowired
	private AnswerModel answer = new AnswerModel();; 
	
//	@Autowired
	private UserChoiceModel user = new UserChoiceModel();
	
	private RankingModel rank = new RankingModel();
	
	@Autowired
	private UserDataRepository udRepo;	
	
	List<UserChoiceModel> userList = new ArrayList<>();
	
	public void generateAnswer() {
		//生成メソッドで生成された配列のうち、インデックスの上から4番目までを答えに格納
		List<Integer> answerNum = rundamNumber1();
		
		answer.setAnsDigit1(answerNum.get(0));
		answer.setAnsDigit2(answerNum.get(1));
		answer.setAnsDigit3(answerNum.get(2));
		answer.setAnsDigit4(answerNum.get(3));
	}
	
	//答えが重複しない（0～9を不規則に並べた配列）メソッド
	private List<Integer> rundamNumber1(){
		List<Integer> num = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			num.add(i);
		}
		
		Collections.shuffle(num);
		return num;
	}
	
	//答えが重複する（ランダムメソッド使用）メソッド
	private List<Integer> rundamNumber2(){
		List<Integer> num = new ArrayList();
		
		for(int i = 0; i < 4; i++) {
			num.add((int) (Math.random() * 10));
		}
		
		return num;
	}

	//入力された4つの数字が答えと一致しているか判定し、入力値と判定をリストに格納して返すメソッド
	public UserChoiceModel check(UserChoiceModel userChoice){
		int hit = 0;
		int blow = 0;
		
		List<Integer> uList = new ArrayList<>();
		uList.add(userChoice.getUserChoiceDigit1());
		uList.add(userChoice.getUserChoiceDigit2());
		uList.add(userChoice.getUserChoiceDigit3());
		uList.add(userChoice.getUserChoiceDigit4());
		
		List<Integer> aList = new ArrayList<>();
		aList.add(answer.getAnsDigit1());
		aList.add(answer.getAnsDigit2());
		aList.add(answer.getAnsDigit3());
		aList.add(answer.getAnsDigit4());
		
		
		for(int i = 0; aList.size() > i; i++) {
			for(int j = 0; uList.size() > j; j++) {
				
				if(aList.get(i) == uList.get(j)) {				//答えと解答で共通する1つの数字があったとき
					if(i == j) {
						hit += 1;								//その数字の入っているインデックスが一致したとき、hitに＋１
					}else {
						blow += 1;								//一致してないとき、blowに＋１
					}
				}
				
			}
		}
		
		userChoice.setCountHit(hit);
		userChoice.setCountBlow(blow);
		
		return userChoice;
	}
	
	public UserChoiceModel setDigits(UserChoiceModel guess, String Digit1, String Digit2, String Digit3, String Digit4) throws NumberFormatException {
		
		guess.setUserChoiceDigit1(Integer.parseInt(Digit1));
		guess.setUserChoiceDigit2(Integer.parseInt(Digit2));
		guess.setUserChoiceDigit3(Integer.parseInt(Digit3));
		guess.setUserChoiceDigit4(Integer.parseInt(Digit4));
		
		return guess;
	}
	
	public String getAverage(int play, int total) {
		double ave = 0;
		System.out.println("[プレイ回数 : "+ play +"] [累計プレイターン数 : "+ total +"]");
		ave = (double)total / play;
		System.out.println(ave +" = "+ String.format("%.2f", ave));
		return String.format("%.2f", ave);
	}
	
	public int getLatest(int latest, int clearTime) {
		int num = 0;
		if(latest >= clearTime) {
			num = latest;
		}else {
			num = clearTime;
		}
		return num;
	}
	
	public int getfastest(int fastest, int clearTime) {
		int num = 0;
		if(fastest == 0) {
			num = clearTime;
		}else {
			if(fastest <= clearTime) {
				num = fastest;
			}else {
				num = clearTime;
			}
		}
		return num;
	}
	
	public int setTotal(int total, int clearTime) {
		return total += clearTime;
	}
	
	public String getNow() {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime nowDate = LocalDateTime.now();
		return nowDate.format(dtf1);
	}
	
	public int setNumOfPlay(int NumOfPlay) {
		return NumOfPlay += 1;
	}
	
	public int setNumOfClear(int NumOfClear) {
		return NumOfClear += 1;
	}
	
	public List<UserEntity> findall(){
		List<UserEntity> user = new ArrayList<>();
		user = udRepo.findAll();
		return user;
	}
	
	public UserEntity findone(String email) {
		return udRepo.findByEmail(email);
	}
	
	public void save(UserEntity u) {
		udRepo.save(u);
	}
	
	public List<RankingModel> generateRanking(List<UserEntity> list){
		List<RankingModel> ranking = new ArrayList<>();
		int count = 1;
		
		list.sort(Comparator.comparing(UserEntity::getShortestClear));
		for(UserEntity user: list) {
			RankingModel rm = new RankingModel();
			if(user.getShortestClear() == 0) {
				continue;
			}
			if(count > 3) {
				break;
			}
			rm.setRank(count);
			rm.setNameFast(user.getUserName());
			rm.setFastest(user.getShortestClear());
			ranking.add(rm);
			count += 1;
		}
		
		count = 1;
		
		list.sort(Comparator.comparing(UserEntity::getAverage));
		for(RankingModel rankModel: ranking) {
			if(count > 3) {
				break;
			}
			rankModel.setAve(list.get(count).getAverage());
			rankModel.setNameAve(list.get(count).getUserName());
			count += 1;
		}

		return ranking;
	}
	
	public String toHash(String pass) throws Exception {
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pass.getBytes(StandardCharsets.UTF_8));
		String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
		
		return sha256;
	}
	
	public AnswerModel getAnswer() {
		return answer;
	}
	
	public UserChoiceModel getUserAns() {
		return user;
	}
}