package com.biz.method;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {

	public static void main(String[] args) {
		
		MakeListService ms = new MakeListService();
		ViewListService vs = new ViewListService();
		
		int aa =vs.setListAllAndView(ms.getListAll(30));
		
		System.out.println(aa);
		
	}
}
