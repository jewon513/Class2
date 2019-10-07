package com.biz.Stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectEx_01 {

	public static void main(String[] args) {

		String objSaveFile = "src/com/biz/Stream/obj.dat";
		
		String strName = "홍길동";
		String strNation = "Republic Of Korea";
		Integer intYear = 2019;
		
		OutputStream os = null;
		ObjectOutput obj = null;
		try {
			os = new FileOutputStream(objSaveFile);
			obj = new ObjectOutputStream(os);
			obj.writeObject(strName);
			obj.writeObject(strNation);
			obj.writeObject(intYear);
			
			obj.flush();
			obj.close();
			os.close();
			
			System.out.println("Object File Write Ok!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
