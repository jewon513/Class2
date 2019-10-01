package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {

	
	public void print(String fileName, List<PaperVO> paperList) throws Exception {
		
		PrintWriter fileOut = new PrintWriter(fileName);
		
		for(PaperVO vo : paperList) {
			fileOut.printf("%-5s\t%d\n",vo.getPaper(),vo.getCount());
			
			fileOut.flush();
		}
		
		fileOut.close();
		
	}
	
}
