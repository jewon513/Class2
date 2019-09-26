package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.MakeProductSerivceV2;
import com.biz.iolist.service.WriteProductSerivce;

public class iolistEx_03 {

	public static void main(String[] args) {

		String proFileName = "src/com/biz/iolist/과자이름.txt";
		String proWriteFile = "src/com/biz/iolist/과자가격.txt";
		
		MakeProductSerivceV2 ms = new MakeProductSerivceV2();
		
		
		try {
			List<String> productList = ms.getProductList(proFileName);
			WriteProductSerivce ws = new WriteProductSerivce(productList);
			ws.productWrite(proWriteFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
