package com.biz.pay.exec;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {

		PaperMakeServiceV1 pm = new PaperMakeServiceV1();
		
		String payFile = "src/com/biz/pay/pay.txt";
		
		pm.make(3786790);
		for(PaperVO vo :pm.getPaperList()) {
			System.out.println(vo.getPaper() +"\t"+vo.getCount());
		}
		
		
	}

}
