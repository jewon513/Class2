package com.biz.books.exec;

import java.util.Scanner;

import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_02 {

	public static void main(String[] args) {

		BookReadServiceV1 bs = new BookReadServiceV1();
		BookViewServiceV1 vs = new BookViewServiceV1();
		Scanner scan = new Scanner(System.in);
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		
		try {
			bs.readBookInfo(bookFile);
			vs.setBookList(bs.getBookList());
//			vs.view();
//			vs.search("아침");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("======================================================");
			System.out.println("도서검색");
			System.out.println("======================================================");
			System.out.println("1.제목\t2.가격\t0.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM==0) break;
			
			if(intM == 1) {
				System.out.print("제목 >> ");
				vs.search(scan.nextLine());
			}else if(intM == 2) {
				System.out.print("최저가격 >> ");
				String sPrice = scan.nextLine();
				System.out.print("최고가격 >> ");
				String ePrice = scan.nextLine();
				
				try {
					vs.search(Integer.valueOf(sPrice), Integer.valueOf(ePrice));
				} catch (Exception e) {
					System.out.println("가격은 숫자형식으로 입력하세요.");
				}
				
			}
			
			
		}
		System.out.println("업무종료");
		
	}

}
