package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsReadServiceV1 implements BBsReadService {

	private List<BBsVO> BBsList;
	
	@Override
	public void readBBs(String bbsFile) throws Exception {
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader (fileReader);
		String reader = new String();
		
		BBsList = new ArrayList<BBsVO>();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			// 0 순번 , 1 작성자, 2 작성일자, 3 제목, 4 내용, 5 조회수
			String[] list = reader.split(":");
			BBsVO vo = new BBsVO();
			
			vo.setSeq(Integer.valueOf(list[0]));
			vo.setDate(Integer.valueOf(list[2]));
			vo.setAuth(list[1]);
			vo.setSubject(list[3]);
			vo.setText(list[4]);
			vo.setCount(Integer.valueOf(list[5]));
			
			BBsList.add(vo);
			
		}
		buffer.close();
		fileReader.close();
	}

	@Override
	public List<BBsVO> getBBsList() {
		return this.BBsList;
	}

}
