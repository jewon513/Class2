package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 외부의 pay.txt 파일을 열어서
 * 급여 내역을 문자열형 List에 담는 코드를 작성
 */

public class PayReadServiceV1 {
	
	// 급여 내역 문자열형 List 선언
	private List<String> payStrList;
	
	public List<String> getPayStrList(){
		return this.payStrList;
	}
	
	public void readPay(String payFile) throws Exception {
		
		payStrList = new ArrayList<String>();
		
		FileReader fileReader = new FileReader(payFile);
		BufferedReader buffer = new BufferedReader (fileReader);
		
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			payStrList.add(reader);
		}
		
		buffer.close();
		fileReader.close();
	}
	
	
	
}
