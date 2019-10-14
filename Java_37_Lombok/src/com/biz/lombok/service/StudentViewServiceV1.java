package com.biz.lombok.service;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

	
	@Override
	public void view() {
		this.head();
		for(StudentVO vo : stdList) {
			this.body(vo);
		}
	}

	@Override
	public void view(String strName) {
		this.head();
		for(StudentVO vo : stdList) {
			if(vo.getS_name().contains(strName)) {
				this.body(vo);
			}
		}
	}

	@Override
	public void view(int intGrade) {
		this.head();
		for(StudentVO vo : stdList) {
			if(vo.getS_grade()==intGrade) {
				this.body(vo);
			}
		}
	}

	@Override
	public void view(int grGrade, int lessGrade) {
		this.head();
		for(StudentVO vo : stdList) {
			if(vo.getS_grade()>=grGrade && vo.getS_grade()<=lessGrade) {
				this.body(vo);
			}
		}
	}
	
	private void head() {
		System.out.println("=======================================================");
		System.out.println("학생정보");
		System.out.println("=======================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t\t학년");
		System.out.println("-------------------------------------------------------");
	}
	
	private void body(StudentVO vo) {
		System.out.printf("%s\t%s\t%s\t%5s\t%d\n",
				vo.getS_num(),
				vo.getS_name(),
				vo.getS_tel(),
				vo.getS_addr(),
				vo.getS_grade());
	}
	

	
}
