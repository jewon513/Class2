package com.biz.lombok.domain;

public class test {

	public static void main(String[] args) {
		int intSum = 0;
		int num = 1;
		for (int i = 0; i < 100; i++) {
			intSum += num;
			num++;
		}
		System.out.println(intSum);
		
		add(20,40);
	}

	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
}
