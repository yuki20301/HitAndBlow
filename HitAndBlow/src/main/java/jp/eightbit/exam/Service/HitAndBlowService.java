package jp.eightbit.exam.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.eightbit.exam.Model.AnswerModel;
import jp.eightbit.exam.Model.UserChoiceModel;

@Service
public class HitAndBlowService {
	
//	@Autowired
	private AnswerModel answer = new AnswerModel();; 
	
//	@Autowired
	private UserChoiceModel user = new UserChoiceModel();
	
	List<UserChoiceModel> userList = new ArrayList<>();
	
	public void generateAnswer() {
		//生成メソッドで生成された配列のうち、インデックスの上から4番目までを答えに格納
		List<Integer> answerNum = rundamNumber1();
		
		answer.setAnsDigit1(answerNum.get(0));
		answer.setAnsDigit2(answerNum.get(1));
		answer.setAnsDigit3(answerNum.get(2));
		answer.setAnsDigit4(answerNum.get(3));
		
		System.out.println(answer);
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
	public List<UserChoiceModel> check(){
		int hit = 0;
		int blow = 0;
		
		List<Integer> uList = new ArrayList<>();
		uList.add(user.getUserChoiceDigit1());
		uList.add(user.getUserChoiceDigit2());
		uList.add(user.getUserChoiceDigit3());
		uList.add(user.getUserChoiceDigit4());
		
		List<Integer> aList = new ArrayList<>();
		aList.add(answer.getAnsDigit1());
		aList.add(answer.getAnsDigit2());
		aList.add(answer.getAnsDigit3());
		aList.add(answer.getAnsDigit4());
		
		
		for(int i: aList) {
			for(int j: uList) {
				
				if(aList.get(i) == uList.get(j)) {	//答えと解答である1つの数字が一致したとき
					if(i == j) {
						hit += 1;					//同じ位置であれば、hitに＋１
					}else {
						blow += 1;					//位置が違えば、blowに＋１
					}
				}
				
			}
		}
		
		user.setUserChoiceDigit1(uList.get(0));
		user.setUserChoiceDigit2(uList.get(1));
		user.setUserChoiceDigit3(uList.get(2));
		user.setUserChoiceDigit4(uList.get(3));
		user.setCountHit(hit);
		user.setCountBlow(blow);
		
		userList.add(user);
		
		System.out.println(user);
		
		return userList;
	}
	
}