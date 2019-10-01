package com.biz.pay.domain;

public class PaperVO {

	private String paper;
	private int count;
	
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public PaperVO(String paper, int count) {
		this.paper = paper;
		this.count = count;
	}
	
	public PaperVO() {
		/*
		 * 기본생성자
		 */
	}
	
	@Override
	public String toString() {
		return "PaperVO [paper=" + paper + ", count=" + count + "]";
	}
	
}
