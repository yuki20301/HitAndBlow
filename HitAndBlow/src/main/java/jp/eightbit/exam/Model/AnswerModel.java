package jp.eightbit.exam.Model;

import jakarta.validation.constraints.NotNull;

public class AnswerModel {

	@NotNull
	private int ansDigit1;
	
	@NotNull
	private int ansDigit2;
	
	@NotNull
	private int ansDigit3;
	
	@NotNull
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
}