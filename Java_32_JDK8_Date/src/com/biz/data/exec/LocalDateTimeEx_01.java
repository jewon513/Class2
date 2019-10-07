package com.biz.data.exec;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt.toString());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());

		System.out.printf("%02d:%02d:%02d",
				ldt.getHour(),
				ldt.getMinute(),
				ldt.getSecond());
		
		System.out.println(ldt.with(TemporalAdjusters.firstDayOfYear()));
		
		//임의의 시간 생성하기
		LocalDateTime makeDateTime = LocalDateTime.now();
		
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(5);
		makeDateTime = makeDateTime.withDayOfMonth(20);
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		
		System.out.println(makeDateTime);
	}
	
	

}
