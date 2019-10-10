package com.biz.books.exec;

import java.io.FileNotFoundException;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.ExcelSaveServiceV1;

public class BookEx_04 {

	public static void main(String[] args) {

		BookReadServiceV1 bs = new BookReadServiceV1();
		ExcelSaveServiceV1 es = new ExcelSaveServiceV1();
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		
		try {
			bs.readBookInfo(bookFile);
			List<BookVO> bookList = bs.getBookList();
			es.setBookList(bookList);
			es.excelSave(bookSavePath+"도서정보_01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
