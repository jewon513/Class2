package com.biz.single.exec;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);

		System.out.print(" 아무 문자나 입력 !! >> ");
		String str1 = scan1.nextLine();
		
		System.out.print(" 아무 문자나 입력 !! >> ");
		String str2 = scan2.nextLine();

		System.out.print(" 아무 문자나 입력 !! >> ");
		String str3 = scan3.nextLine();

		System.out.println(str1 + " : " + str2 + " : " + str3);

	}

}
