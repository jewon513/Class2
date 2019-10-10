package com.biz.books.exec;

import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_01 {

	public static void main(String[] args) {

		BookReadServiceV1 bs = new BookReadServiceV1();
		BookViewServiceV1 vs = new BookViewServiceV1();
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		
		try {
			bs.readBookInfo(bookFile);
			vs.setBookList(bs.getBookList());
//			vs.view();
//			vs.search("아침");
			vs.search(30000, 40000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
