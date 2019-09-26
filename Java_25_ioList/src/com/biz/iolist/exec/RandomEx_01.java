package com.biz.iolist.exec;

public class RandomEx_01 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			double rnd1 = Math.random();
			/*
			 * 0부터 1 미만의 값을 double 형으로 생성하는 method
			 */
			System.out.println(rnd1);
		}

		int start = 800;
		int end = 5000;
		for (int i = 0; i < 10; i++) {
			double rnd1 = Math.random();
			int num = (int)(rnd1*(end-start+1)+start);
			// start~end까지 범위의 임의의 수를 생성하라.
			System.out.println(num);
		}

	}

}
