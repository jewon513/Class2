package com.biz.iolist.exec;

import com.biz.iolist.service.iolistService;

public class iolistEx_04 {

	public static void main(String[] args) {

		iolistService is = new iolistService();
		
		String proFileName ="src/com/biz/iolist/과자가격.txt";
		
		try {
			is.readProduct(proFileName);
			is.buyMake(50);
			is.viewList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
