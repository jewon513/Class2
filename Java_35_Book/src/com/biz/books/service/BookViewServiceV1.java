package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {

	List<BookVO> bookList;
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	// 도서명으로 검색을 하여 해당하는 문자열이 포함된 리스트만 보여주기
	public void search(String text) {
		this.listTitle();
		for(BookVO vo : bookList) {
			//문자열이 포함되어 있는지 확인하는 method()
			if(vo.getB_title().contains(text.trim())) {
				this.body(vo);	
			}
		}
	}
	
	// 가격 범위를 지정하여 검색
	public void search(int startPrice, int endPrice) {
		this.listTitle();
		for(BookVO vo : bookList) {
			//문자열이 포함되어 있는지 확인하는 method()
			int price =vo.getB_price();
			if(price>=startPrice && price<=endPrice) {
				this.body(vo);	
			}
		}
	}
	
	public void view() {
		this.listTitle();
		
		for(BookVO vo : bookList) {
			this.body(vo);
			}
		System.out.println("==========================================================================");
	}
	
	private void listTitle() {
		System.out.println("==========================================================================");
		System.out.println("\t\t\t\t도서정보 v1");
		System.out.println("==========================================================================");
		System.out.println("ISBN\t\t도서명\t\t출판사\t\t저자\t\t가격");
		System.out.println("--------------------------------------------------------------------------");
	}
	
	private void body(BookVO vo) {
		System.out.print(vo.getB_isbn()+"\t");
		System.out.print(vo.getB_title()+"\t");
		System.out.print(vo.getB_comp()+"\t");
		System.out.print(vo.getB_writer()+"\t");
		System.out.print(vo.getB_price()+"\n");
	}
}
