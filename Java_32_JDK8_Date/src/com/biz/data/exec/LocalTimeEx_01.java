package com.biz.data.exec;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx_01 {

	public static void main(String[] args) {

		
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter ftime = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		String curTime = ftime.format(localTime);
		System.out.println(curTime);
		
		DateTimeFormatter f24Time = DateTimeFormatter.ofPattern("HH:mm:ss");
		curTime = f24Time.format(localTime);
		System.out.println(curTime);
	}

}
