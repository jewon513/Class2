package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2 {
	
	private List<PaperVO> paperList;	
	
	public List<PaperVO> make(int pay) {

		paperList = new ArrayList<PaperVO>();
		
		int paper = 50000;
		int count = 0;
		int sw = 1;
		
		while (true) {
			count = pay / paper;
			pay = pay % paper;

			PaperVO vo = new PaperVO(paper+"",count);
			paperList.add(vo);
			if (sw > 0) {
				paper = paper / 5;
			} else {
				paper = paper / 2;
			}
			sw *= -1;
			if (paper < 10) {
				break;
			}
		}
		
		return this.paperList;
		
	}
	
}
