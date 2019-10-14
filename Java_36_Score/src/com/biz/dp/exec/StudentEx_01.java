package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		StudentVO sVO = new StudentVO();
		/*
		 * 자바 빈즈패턴
		 */
		sVO.setSt_num("001");
		sVO.setSt_name("홍길동");
		sVO.setSt_tel("010-111");
		sVO.setSt_addr("서울특별시");
		sVO.setSt_grade(3);
		
		stdList.add(sVO);
		
		sVO = new StudentVO("002","이몽룡","010-111","서울특별시",3,"005");
		stdList.add(sVO);
		sVO = new StudentVO("003","성춘향","010-222","남원시",3,"005");
		stdList.add(sVO);
		
		stdList.add(new StudentVO("004","임꺽정","010-222","남원시",3,"005"));

		//		생성자를 이용하는 객체 생성
		// 1. 생성자의 매개변수를 순서 등을 명확히 인식해야만 오류가 없는 값을 추가 할 수 있다.
		// 2. 지금 당장 추가하지 않아도 될 필드 값도 의무적으로 추가해야 하는 단점이 있다.
	}

}
