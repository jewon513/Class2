package com.biz.pay.domain;

import com.biz.pay.service.PrintServiceV2;
import com.biz.pay.service.ReadService;

public class PayEx_03 {

	public static void main(String[] args) {

		ReadService rs = new ReadService();
		PrintServiceV2 ps = new PrintServiceV2();
		
		String fileName = "src/com/biz/pay/pay.txt";
		String fileName2 = "src/com/biz/pay/사원별화폐매수.txt";
		
		try {
			rs.readPayList(fileName);
			ps.setPayList(rs.getPayList());
			ps.viewPay(fileName2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
