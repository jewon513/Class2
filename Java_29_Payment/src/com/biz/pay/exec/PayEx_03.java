package com.biz.pay.exec;

import com.biz.pay.service.PaperPrintServiceV1;

public class PayEx_03 {

	public static void main(String[] args) {

		
		PaperPrintServiceV1 pp = new PaperPrintServiceV1();
		
		
		String payFile = "src/com/biz/pay/pay.txt";
		
		pp.setPayfile(payFile);
		try {
			pp.makePaperList();
			pp.viewPaper();
			pp.printPaper();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
