package jp.eightbit.exam.Model;

import jakarta.validation.constraints.NotNull;

public class UserChoiceModel {

	@NotNull(message = "数値を入れてください")
	private int userChoiceDigit1;
	
	@NotNull(message = "数値を入れてください")
	private int userChoiceDigit2;
	
	@NotNull(message = "数値を入れてください")
	private int userChoiceDigit3;
	
	@NotNull(message = "数値を入れてください")
	private int userChoiceDigit4;
	
	private int countHit;
	
	private int countBlow;

	public int getUserChoiceDigit1() {
		return userChoiceDigit1;
	}

	public void setUserChoiceDigit1(int userChoiceDigit1) {
		this.userChoiceDigit1 = userChoiceDigit1;
	}

	public int getUserChoiceDigit2() {
		return userChoiceDigit2;
	}

	public void setUserChoiceDigit2(int userChoiceDigit2) {
		this.userChoiceDigit2 = userChoiceDigit2;
	}

	public int getUserChoiceDigit3() {
		return userChoiceDigit3;
	}

	public void setUserChoiceDigit3(int userChoiceDigit3) {
		this.userChoiceDigit3 = userChoiceDigit3;
	}

	public int getUserChoiceDigit4() {
		return userChoiceDigit4;
	}

	public void setUserChoiceDigit4(int userChoiceDigit4) {
		this.userChoiceDigit4 = userChoiceDigit4;
	}

	public int getCountHit() {
		return countHit;
	}

	public void setCountHit(int countHit) {
		this.countHit = countHit;
	}

	public int getCountBlow() {
		return countBlow;
	}

	public void setCountBlow(int countBlow) {
		this.countBlow = countBlow;
	}
}
