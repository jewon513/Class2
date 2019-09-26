package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class iolistService {

	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 임의 상품정보를 추출한 후
	 * 상품 매입정보를 생성
	 * 1. 날짜 : 2019-09-26
	 * 2. 단가 : 상품단가에서 부가세를 제외한 금액
	 * 3. 부가세 : (상품정보의 상품단가) - (2번에서 계산한)단가
	 * 4. 수량 : 10개부터 100개까지
	 * 5. 합계 : 단가 * 수량
	 * 
	 * 생성된 상품매입 정보를 20개 생성하여 
	 * buyList에 추가
	 */
	public void buyMake(int length) {
		
		buyList = new ArrayList<BuyVO>();
		Random rnd = new Random();
		
		for (int i = 0; i < length; i++) {
			String s = proList.get(rnd.nextInt(proList.size()));
			String[] list = s.split(":");
			String proName = list[0];
			String strPrice = list[1]; // 상품정보의 상품단가의 String형
			
			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String data = sd.format(date);
			int intPrice = Integer.valueOf(strPrice); // 상품정보의 상품단가 int형
			int price = (int)(intPrice/1.1); // 부가세 제외 단가
			int vat = intPrice - price; // 상품정보의 상품단가에서 부가세 제외 단가를 뺌
			int qty = rnd.nextInt(91)+10;
			int total = qty*price;
			
			BuyVO vo = new BuyVO();
			vo.setData(data);
			vo.setProName(proName);
			vo.setPrice(price);
			vo.setVat(vat);
			vo.setQty(qty);
			vo.setTotal(total);
			
			buyList.add(vo);
		}
		
	}
	public void viewList() {
		System.out.println("날짜\t\t상품이름\t단가\t부가세\t수량\t합계");
		System.out.println("=================================================================");
		for (int i = 0; i < buyList.size(); i++) {
			System.out.printf("%s\t%-10s\t%d\t%d\t%d\t%d\n",
					buyList.get(i).getData(),
					buyList.get(i).getProName(),
					buyList.get(i).getPrice(),
					buyList.get(i).getVat(),
					buyList.get(i).getQty(),
					buyList.get(i).getTotal());
		}
	}
	
	
	public void readProduct(String proFileName) throws Exception {
		
		proList = new ArrayList<String>();
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null) break;
			
			if(reader.length()<1) continue;
			
			proList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
		
	}
	
}
