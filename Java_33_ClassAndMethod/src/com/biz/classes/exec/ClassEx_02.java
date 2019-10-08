package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {

		ClassServiceV1 cs; // cs 객체 선언
		cs = new ClassServiceV1();
		
		String strName = "홍길동";
		cs.getName(strName);
		
		System.out.println("strName : " + strName);
		
		String[] strNames = new String[2];
		strNames[0] = "이몽룡";
		strNames[1] = "성춘향";
		
		System.out.println("strNames[0] : " + strNames[0]);
		System.out.println("strNames[1] : " + strNames[1]);
		
		cs.getName(strNames);
	
		System.out.println("strNames[0] : " + strNames[0]);
		System.out.println("strNames[1] : " + strNames[1]);
		
		
		
	}

}
