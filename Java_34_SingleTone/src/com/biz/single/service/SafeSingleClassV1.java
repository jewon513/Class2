package com.biz.single.service;

public class SafeSingleClassV1 {

	private static SafeSingleClassV1 testObject;
	
	private String name;
	private String nation;
	
	private SafeSingleClassV1() {
		// private임
	}
	
	public synchronized static SafeSingleClassV1 getInstance() {
		if(testObject == null) {
			testObject = new SafeSingleClassV1();	
		}
		return testObject;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public String getNation() {
		return nation;
	}
	
	
	
	
}
