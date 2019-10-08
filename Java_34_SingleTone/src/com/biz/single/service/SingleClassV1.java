package com.biz.single.service;

public class SingleClassV1 {

	private static SingleClassV1 myObject = new SingleClassV1();
	
	/*
	 * 클래스 생성자를 private로 선언하여 new SingleClassV1 생성자 코드를 사용할 수 없도록 했다. 
	 */
	
	private SingleClassV1() {
		
	}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
	
	
	
	
	

}
