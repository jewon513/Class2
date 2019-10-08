package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {

	public static void main(String[] args) {

		SafeSingleClassV1 scc = SafeSingleClassV1.getInstance();
		
		scc.setName("홍길동");
		scc.setNation("Republic of Korea");
		
		SafeSingleClassV1 scc1 = SafeSingleClassV1.getInstance();
		
		System.out.println("너는 누구냐 ? >> " + scc1.getName());
		System.out.println("고향이 어디냐 ? >> " + scc1.getNation());
		
	}

}
