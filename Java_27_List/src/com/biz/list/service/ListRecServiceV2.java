package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

/*
 * ReceiveService
 */
public class ListRecServiceV2 {

	private String name;
	private List<String> myStrList;
	private List<String> recStrList;

	public ListRecServiceV2() {
		
	}
	
	/*
	 * myStrList : ListServiceV1에서 임의로 생성한 List
	 * recStrList : 외부에서 주입되는 List
	 */
	
	public ListRecServiceV2(List<String> recStrList, String name) {
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
		this.name = name;
	}
	
	public void remove() {
		this.myStrList.add(this.recStrList.get(0));
		this.recStrList.remove(0);
	}
	
	public void viewList() {
//		for(String str : this.recStrList) {
//			System.out.println(str);
//		}
		
		System.out.println("=========================");
		System.out.println(this.name);
		System.out.println("=========================");
		System.out.println(recStrList.toString());
		System.out.println(myStrList.toString());
	}
	
}
