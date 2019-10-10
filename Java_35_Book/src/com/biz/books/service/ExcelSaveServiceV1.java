package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * text 파일은 java에서 기본적으로 읽고 쓰기가 가능하다
 * 그 외 binary(이미지, 영상, 음성, 엑셀) 들은 기본적으로 읽기는 가능하지만
 * 읽어서 연산처리를 하는 것은 매우 어렵다.
 * 
 * Binary 파일을 읽고 쓰는데는 3rd Party SDK를 사용한다.
 * 
 * 엑셀 저장하기는 text 파일 저장하기를 조금 응용하면 아쉬운대로 사용이 가능하다.
 */

public class ExcelSaveServiceV1 {
	
	private List<BookVO> bookList;
	
	// comma separater values;
	private String excelExt = ".csv";
	int listSize = 10;
	FileWriter fileWriter;
	BufferedWriter buffer;
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	private void bufferOpen(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fo = new FileOutputStream(fileName + excelExt);
		
		//한글 encoding을 변환
		OutputStreamWriter os = new OutputStreamWriter(fo, "euc-kr");
		
		buffer = new BufferedWriter(os);
	}
	
	public void excelSave(String fileName) throws Exception {
		
		this.bufferOpen(fileName);
		
		this.title();
		listSize = 1;
		//
		for(BookVO vo : bookList) {
			this.body(vo);
			listSize++;
		}
		this.footer();
		
		buffer.flush();
		buffer.close();

	}
	public void excelSave(String fileName,String text) throws Exception {
		
		this.bufferOpen(fileName);
		
		this.title();
		listSize = 1;
		//
		for(BookVO vo : bookList) {
			if(vo.getB_title().equals(text.trim())) {
				this.body(vo);
				listSize++;
			}
		}
		this.footer();
		
		buffer.flush();
		buffer.close();

	}
	
	public void excelSave(String fileName,int start, int end) throws Exception {
		
		this.bufferOpen(fileName);
		
		this.title();
		listSize = 1;
		//
		for(BookVO vo : bookList) {
			int price = vo.getB_price();
			if(price>=start && price<=end) {
				this.body(vo);
				listSize++;
			}
		}
		this.footer();
		
		buffer.flush();
		buffer.close();

	}
	
	private void title() throws IOException {
		
		//ISBN, TITLE, COMP, WRITER, DATE, PRICE
		buffer.write("ISBN,");
		buffer.write("도서명,");
		buffer.write("출판사,");
		buffer.write("저자,");
		buffer.write("발행일,");
		buffer.write("가격,");
		buffer.newLine(); // 엔터키를 입력
		buffer.flush();
	}
	
	private void body(BookVO vo) throws IOException {
		buffer.write("'"+vo.getB_isbn()+",");
		buffer.write(vo.getB_title()+",");
		buffer.write(vo.getB_comp()+",");
		buffer.write(vo.getB_writer()+",");
		buffer.write(vo.getB_date()+",");
		buffer.write(vo.getB_price()+",");
		buffer.newLine(); // 엔터키를 입력
		buffer.flush();
	}
	
	private void footer() throws IOException {
		
		buffer.write("도서개수,");
		buffer.write("=COUNTA(B2..B"+listSize+"),");
		buffer.newLine(); // 엔터키를 입력
		buffer.flush();
	}
}
