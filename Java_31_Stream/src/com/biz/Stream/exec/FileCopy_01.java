package com.biz.Stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {

	public static void main(String[] args) {

		String imgSrcFile= "src/com/biz/Stream/2019_03.png";
		String imgCopyPath = "src/com/biz/Stream/";
		Random rnd = new Random();
		
		/*
		 * 인터페이스와 기능이 비슷한 추상 클래스
		 */
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			// 원본파일 open 하기
			is = new FileInputStream(imgSrcFile);
			imgCopyPath += Math.abs(rnd.nextInt()) + ".png";   //Math.abs() : 정수의 절대값을 계산하는 method
			os = new FileOutputStream(imgCopyPath);
			// 한번에 파일을 읽어서 복사할 용량
			byte[] bytes = new byte[1024];
			while(true) {
				/*
				 *FileInputStream의 read() method에 byte 배열을 매개변수로 전달을 하면
				 *파일에서 읽은 내용(data)을 byte 배열에 담아 전달을 하고
				 *byte 배열에 담은 데이터 개수를 return 해준다.
				 */
				int length = is.read(bytes);
				// read() method가 return한 값이 1 미만이면 파일을 모두 읽었다라고 판단한다.
				if(length<1) break;
				os.write(bytes);
			}
			is.close();
			os.close();
			System.out.println("File Copy OK!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
