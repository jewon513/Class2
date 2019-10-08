package com.biz.classes.exec;

public class ClassEx_01 {

	// main()은 static method 이며
	// Project가 시작하면 JVM이 제일 먼저 찾아서 실행하는 method
	// 진입점 method
	
	// static으로 설정된 method에서 필드변수에 접근하려면
	// 필드변수도 static이어야 한다.
	
	static String strName = "홍길동";
	
	public static void main(String[] args) {
		strName = "이몽룡";
		getName(strName);
		System.out.println(strName);
	}

	/*
	 * main() method에서 getName() method를 호출하면서
	 * strName 변수를 파라메터로 전달하였다.
	 * 이때 strName 변수 이름등과는 아무런 상관 없이
	 * strName 변수에 담긴 값만 getName() method에 전달된다.
	 * getName() 메서드 내부에서 strName 변수이 값을 변경해도
	 * main() method에서 참조하는 strName 변수의 값은
	 * 아무런 변동이 없다.
	 * ==> Call By Value;
	 */
	// static으로 선언된 method에서 다른 method를 호출하려면
	// 호출되는 method도 static으로 선언되어야 한다.
	public static void getName(String strName) {
		strName = "성춘향";
	}

}
