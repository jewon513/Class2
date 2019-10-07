package com.biz.Stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {

		String imgFile="src/com/biz/Stream/2019_02.png";
		
		FileInputStream fs = null;
		BufferedInputStream buffer = null;
		
		/*
		 * BufferedInputStream
		 * FileInputStream으로 open된 파일을 읽어서 buffer 메모리에 임시 저장하고
		 * read() method를 통해서 buffer로 부터 값을 읽어들인다.
		 */
		try {
			fs = new FileInputStream(imgFile);
			buffer = new BufferedInputStream(fs);
			byte[] bytes = new byte[32];
			buffer.read(bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.printf("%02X ",bytes[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
