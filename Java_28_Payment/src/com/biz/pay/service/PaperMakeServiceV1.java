package com.biz.pay.service;

public class PaperMakeServiceV1 {
	
	public void make(int pay) {

		int paper = 50000;
		int count = 0;
		int sw = 1;
		
		while (true) {

			count = pay / paper;
			pay = pay % paper;

			System.out.printf("%5d권 %2d개\n",paper,count);

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
