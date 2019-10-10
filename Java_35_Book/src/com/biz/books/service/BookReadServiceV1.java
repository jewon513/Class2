package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSetting;

/*
 * 도서정보.txt 파일을 읽어서 문자열을 콜론(:)을 기준으로 분리하고 BookVO에 담은 후 bookList에 추가하는 method를 작성
 */
public class BookReadServiceV1 {

	private List<BookVO> bookList;

	public void readBookInfo(String bookFile) throws Exception {
		bookList = new ArrayList<BookVO>();

		FileReader fileReader = new FileReader(bookFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			// 0 1 2 3 4 5 6 7
			// ISBN:출판사:도서명:저자:역자:발행일:페이지:가격
			String[] list = reader.split(":");
			BookVO vo = new BookVO();
			vo.setB_isbn(list[BookSetting.FILE.ISBN]);
			vo.setB_comp(list[BookSetting.FILE.COMP]);
			vo.setB_title(list[BookSetting.FILE.TITLE]);
			vo.setB_writer(list[BookSetting.FILE.WRITER]);
			vo.setB_trans(list[BookSetting.FILE.TRANS]);
			vo.setB_date(list[BookSetting.FILE.DATE]);

			int page = Integer.valueOf(list[BookSetting.FILE.PAGE]);
			int price = Integer.valueOf(list[BookSetting.FILE.PRICE].trim());

			vo.setB_page(page);
			vo.setB_price(price);

			bookList.add(vo);

		}
		buffer.close();
		fileReader.close();

	}

	public List<BookVO> getBookList() {
		return bookList;
	}

}
