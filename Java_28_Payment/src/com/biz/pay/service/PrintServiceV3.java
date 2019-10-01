package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.List;

public class PrintServiceV3 {

	private List<String> payList;
	
	public void viewPay(String fileName, int num) throws Exception {
		
		PrintWriter pw = new PrintWriter(fileName);
		
		String ps = payList.get(num);
		
		String[] temp = ps.split(":");
		pw.println("====================================");
		pw.printf("사원번호 : %s, 급여액 : %s\n", temp[0], temp[1]);
		pw.println("====================================");
		int pay = Integer.valueOf(temp[1]);
		int paper = 50000;
		int count = 0;
		int sw = 1;
		
		while (true) {
			count = pay / paper;
			pay = pay % paper;

			pw.printf("%5d\t%2d\n", paper,count);
			
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
		
		
		pw.flush();
		pw.close();
	}

	public void setPayList(List<String> payList) {
		this.payList = payList;
	}
}
