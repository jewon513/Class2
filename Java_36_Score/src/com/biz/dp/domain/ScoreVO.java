package com.biz.dp.domain;

public class ScoreVO {

	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;
	
	public ScoreVO() {}
	
	/*
	 *  Builder 클래스를 매개변수로 가지는 생성자를 코드 선언
	 *  Builder 클래스는 현재 ScoreVO가 가지고 있는 Inner class이다.
	 */
	private ScoreVO(Builder builder) {
		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
	}

	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}
	
	/*
	 * Builder 클래스를 선언
	 */
	
	public static class Builder{
		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;
		
		public Builder() {
			
		}

		public Builder s_num(String s_num) {
			this.s_num = s_num;
			return this;
		}

		public Builder s_kor(int s_kor) {
			this.s_kor=s_kor;
			return this;
		}

		public Builder s_eng(int s_eng) {
			this.s_eng=s_eng;
			return this;
		}

		public Builder s_math(int s_math) {
			this.s_math=s_math;
			return this;
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
		
	}
}









