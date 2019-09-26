package com.biz.method;

import com.biz.method.service.CalcService;

public class MethodEx_03 {

	public static void main(String[] args) {
		
		CalcService cs = new CalcService();
		
		for (int i = 0; i < 5; i++) {
			cs.addNum(23);
		}
		
	}
	
}
