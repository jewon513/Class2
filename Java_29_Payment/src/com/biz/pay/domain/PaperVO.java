package com.biz.pay.domain;

public class PaperVO {

	private String member;
	private String paper; // 화폐의 액면가 이름
	private int count; //
	
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
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

	@Override
	public String toString() {
		return "PaperVO [member=" + member + ", paper=" + paper + ", count=" + count + "]";
	}
	
	
	
	
	
}
