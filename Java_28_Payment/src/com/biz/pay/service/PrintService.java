package com.biz.pay.service;

import java.util.List;

public class PrintService {

	private List<String> payList;
	
	public void viewPay() {
		
		for(String ps : payList) {
			String[] temp = ps.split(":");
			System.out.println("====================================");
			System.out.printf("사원번호 : %s, 급여액 : %s\n", temp[0], temp[1]);
			System.out.println("====================================");
			int pay = Integer.valueOf(temp[1]);
			int paper = 50000;
			int count = 0;
			int sw = 1;
			
			while (true) {
				count = pay / paper;
				pay = pay % paper;

				System.out.printf("%5d\t%2d\n", paper,count);
				
				if (sw > 0) {
					paper = paper / 5;
				} else {
					paper = paper / 2;
				}
				sw *= -1;
				if (paper < 10) {
					break;
				}
			}
		}
		
	}
	
	public void setPayList(List<String> payList) {
		this.payList = payList;
	}
}
