package jp.eightbit.exam.Model;

public class UserChoiceModel {
	
	private int id;

	private int userChoiceDigit1;
	
	private int userChoiceDigit2;
	
	private int userChoiceDigit3;
	
	private int userChoiceDigit4;
	
	private int countHit;
	
	private int countBlow;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "UserChoiceModel [ " + userChoiceDigit1 + ", " + userChoiceDigit2 + ", " + userChoiceDigit3 + ", " + userChoiceDigit4 + "]";
	}
}
