package com.biz.single.service;

public class SafeLazySingleV2 {

	private SafeLazySingleV2() {}
	
	public static SafeLazySingleV2 instance;
	
	public static SafeLazySingleV2 getInstance() {
		
		if(instance == null) {
			
			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();	
			}
			
		}
		return instance;
	}
	
}
