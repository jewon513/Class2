package com.biz.classes.service.parents;

/*
 * abstract 클래스 : 추상클래스
 * 클래스는 클래스인데 미완성된 모양만 잡힌 클래스이다.
 * 부모 클래스로서 역할을 수행하는 클래스
 * 
 * 주요용도
 * 부모클래스로서 역할을 수행하는 클래스
 * 부모클래스 : 주요기능을 미리 만들어두고 상속받은곳에서 method의 기능을 사용하도록 하는 것 변수들도 선언해 두고 상속받은 곳에서 사용하도록 하는 것이 가능함.
 * 
 */

public abstract class RemoconABSV2 {

	protected String name;
	
	public void power() {
		System.out.println(name + "을(를) 켭니다.");
	}

	public abstract void volUp();

	public abstract void volDown();

	public abstract void ChUp();

	public abstract void ChDown();

	public abstract void setName(String name);
	
}
