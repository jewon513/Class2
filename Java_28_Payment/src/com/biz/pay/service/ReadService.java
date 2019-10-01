package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadService {

	List <String> payList;
	
	public void readPayList(String fileName) throws Exception {
		
		payList = new ArrayList<String>();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fr);
		
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader ==null) break;
			
			payList.add(reader);
			
		}
		buffer.close();
		fr.close();
		
	}
	
	public List<String> getPayList(){
		return this.payList;
	}
}
