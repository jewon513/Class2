package com.biz.pay.domain;

import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEX_01 {

	public static void main(String[] args) {

		PaperMakeServiceV2 ps = new PaperMakeServiceV2();
		PaperWriterServiceV1 pw = new PaperWriterServiceV1();
		
		String fileName = "src/com/biz/pay/화폐매수.txt";
		
		try {
			pw.print(fileName, ps.make(3758750));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
