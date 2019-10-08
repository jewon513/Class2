package com.biz.single.service;

public class SafeLazySingleV2 {

	private SafeLazySingleV2() {}
	
	public volatile static SafeLazySingleV2 instance;
	// 잘 관리하지 않으면 날아간다.
	// 컴퓨터 하드웨어적인 Main memory 영역에 저장해서 운영체제가 관리하도록 하라.
	
	public static SafeLazySingleV2 getInstance() {
		
		if(instance == null) {
			
			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();	
			}
			
		}
		return instance;
	}
	
}
