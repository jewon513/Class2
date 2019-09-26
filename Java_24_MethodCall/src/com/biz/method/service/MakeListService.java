package com.biz.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeListService {

	private List<Integer> intList;
	Random rnd = new Random();
	
	public List<Integer> getListAll(){
		
		intList = new ArrayList<Integer>();
		
		int num1=rnd.nextInt();
		int num2=rnd.nextInt();
		int num3=rnd.nextInt();
		int num4=rnd.nextInt();
		int num5=rnd.nextInt();
		
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);
		intList.add(num4);
		intList.add(num5);
		
		return this.intList;
	}
	
	public List<Integer> getListAll(int length){
		intList = new ArrayList<Integer>();
		
		for (int i = 0; i < length; i++) {
			int num =rnd.nextInt();
			intList.add(num);
		}
		
		return intList;
	}
}
