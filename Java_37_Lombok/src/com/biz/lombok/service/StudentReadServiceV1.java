package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	
	public List<StudentVO> getStdList(){
		return this.stdList;
	}
	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장한다.
	 */
	public void readStudent(String fileName) throws Exception {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		stdList = new ArrayList<StudentVO>();
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			// 0 num , 1 name, 2 tel, 3 grade, 4 addr
			String[] list = reader.split(":");
			StudentVO vo = new StudentVO();
			vo.setS_num(list[0]);
			vo.setS_name(list[1]);
			vo.setS_tel(list[2]);
			vo.setS_grade(Integer.valueOf(list[3]));
			vo.setS_addr(list[4]);
			
			stdList.add(vo);
		
		}
		buffer.close();
		fileReader.close();
		
	}
	
}
