package com.biz.pay.domain;

import com.biz.pay.service.PrintService;
import com.biz.pay.service.ReadService;

public class PayEx_02 {

	public static void main(String[] args) {

		ReadService rs = new ReadService();
		PrintService ps = new PrintService();
		
		String fileName = "src/com/biz/pay/pay.txt";
		
		try {
			rs.readPayList(fileName);
			ps.setPayList(rs.getPayList());
			ps.viewPay();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
