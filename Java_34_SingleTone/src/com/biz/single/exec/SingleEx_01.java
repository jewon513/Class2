package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx_01 {

	public static void main(String[] args) {

		// 싱글톤 패턴으로 설정된 클래스는
		// new 생성자로 객체(인스턴스)를 만들지 않고
		// 별도의 method()를 통해서 가져다쓴다.
		
		SingleClassV1 sc1 = SingleClassV1.getInstance();
		SingleClassV1 sc2 = SingleClassV1.getInstance();
		
		System.out.println(sc1);
		System.out.println(sc2);
		
		/*
		 * 싱글톤 객체
		 * 프로젝트 전체에서 공유해야할 어떤 데이터들을
		 * 예) 사용자 정보, 시스템 설정값
		 * 메모리에 저장해두고 여러 클래스에서 공유해서 사용하고자 할때 사용하는 방법
		 * 
		 * 일반적인 static class와의 차이점
		 * multi thread 환경에서 안전하게 사용할 수 있도록 설정이 가능하다.
		 */
	}

}
