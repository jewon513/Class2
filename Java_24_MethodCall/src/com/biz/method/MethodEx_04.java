package com.biz.method;

import java.util.ArrayList;
import java.util.List;

import com.biz.method.service.MakeListService;

public class MethodEx_04 {

	public static void main(String[] args) {
		
		MakeListService mls = new MakeListService();
		
		List<Integer> list = mls.getListAll(100);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
