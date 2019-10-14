package com.biz.dp.domain;

public class StudentVO {

	/*
	 * 	정보은닉
	 *  클래스의 필드(멤버변수) private를 설정하는 것
	 *  
	 *  캡슐화
	 *  getter() setter() 외부에서 간접적으로 접근 할 수 있는 통로를 설정
	 *  단순히 접근 통로 뿐만 아니라
	 *  내부에서 필드에 어떤 연산을 수행하고 값을 변경한 후 외부에 노출되는 경우를 막아줌
	 *  외부에서 주입되는 값을 검증하는 코드를 추가하여 논리적으로 잘못된 데이터가 필드변수에 추가되는 것을 막는일.
	 *  
	 *  정보은닉과 캡슐화를 하고 나서 만약 많은양의 데이터를 VO를 통해서 처리를 하려면
	 *  		예) 어떤 값을 VO에 담아서 리스트에 추가하는 일
	 *  객체를 생성하고, getter()나 setter()를 이용해서 변수를 사용, 세팅 하는 일을 수행하는데
	 *  이 방식이 상당히 번거롭게 작용하는 경우가 있다.
	 *  
	 *  getter() method를 이용할 때 불편함을 보완하기 위해서
	 *  생성자에 값을 주입하고 객체를 생성하는 방법을 사용한다.
	 *  
	 *  
	 */
	private String st_num;
	private String st_name;
	private String st_tel;
	private String st_addr;
	private int st_grade;
	private String st_dept;
	
	public String getSt_num() {
		return st_num;
	}
	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_tel() {
		return st_tel;
	}
	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}
	public String getSt_addr() {
		return st_addr;
	}
	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	public String getSt_dept() {
		return st_dept;
	}
	public void setSt_dept(String st_dept) {
		this.st_dept = st_dept;
	}
	
	public StudentVO() {
	}
	
	public StudentVO(String st_num, String st_name, String st_tel, String st_addr, int st_grade, String st_dept) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_addr = st_addr;
		this.st_grade = st_grade;
		this.st_dept = st_dept;
	}
	
	
	
}