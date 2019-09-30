package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListMakeServiceV1 {

	List<String> strList;
	
	public ListMakeServiceV1() {
		strList = new ArrayList<String>();
	}
		
	public List<String> getStrList(){
		return strList;
	}
		
	public void makeStrList() {
		for (int i = 0; i < 20; i++) {
			String str = String.format("A-%03d", i+1);
			strList.add(str);
		}
	}

}
