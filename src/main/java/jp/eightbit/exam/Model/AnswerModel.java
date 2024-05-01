package jp.eightbit.exam.Model;

import jakarta.validation.constraints.NotNull;

public class AnswerModel {

	private int ansDigit1;

	private int ansDigit2;

	private int ansDigit3;

	private int ansDigit4;

	public int getAnsDigit1() {
		return ansDigit1;
	}

	public void setAnsDigit1(int ansDigit1) {
		this.ansDigit1 = ansDigit1;
	}

	public int getAnsDigit2() {
		return ansDigit2;
	}

	public void setAnsDigit2(int ansDigit2) {
		this.ansDigit2 = ansDigit2;
	}

	public int getAnsDigit3() {
		return ansDigit3;
	}

	public void setAnsDigit3(int ansDigit3) {
		this.ansDigit3 = ansDigit3;
	}

	public int getAnsDigit4() {
		return ansDigit4;
	}

	public void setAnsDigit4(int ansDigit4) {
		this.ansDigit4 = ansDigit4;
	}

	@Override
	public String toString() {
		return "AnswerModel [ " + ansDigit1 + ", " + ansDigit2 + ", " + ansDigit3 + ", " + ansDigit4 + " ]";
	}
}