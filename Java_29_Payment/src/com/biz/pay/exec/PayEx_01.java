package com.biz.pay.exec;

import com.biz.pay.service.PayReadServiceV1;

public class PayEx_01 {

	public static void main(String[] args) {

		PayReadServiceV1 pr = new PayReadServiceV1();
		
		String payFile = "src/com/biz/pay/pay.txt";
		
		try {
			pr.readPay(payFile);
			for(String str : pr.getPayStrList()) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
