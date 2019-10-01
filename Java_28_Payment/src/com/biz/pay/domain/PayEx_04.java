package com.biz.pay.domain;

import com.biz.pay.service.PrintServiceV3;
import com.biz.pay.service.ReadService;

public class PayEx_04 {

	public static void main(String[] args) {

		ReadService rs = new ReadService();
		PrintServiceV3 ps = new PrintServiceV3();
		
		String fileName = "src/com/biz/pay/pay.txt";
		String fileName2 = "src/com/biz/pay/HA_";
		
		try {
			rs.readPayList(fileName);
			ps.setPayList(rs.getPayList());
			for (int i = 0; i < rs.getPayList().size(); i++) {
				ps.viewPay(fileName2+String.format("%03d.txt", i+1), i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
