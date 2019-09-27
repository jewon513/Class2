package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordListMakeService {

	List<String> wordStrList;
	List<WordVO> wordVOList;
	/*
	 * wordFileName 파일을 열어서
	 * 문자열을 읽어 들인 다음
	 * 단어:의미 형식의 문자열을 생성하고
	 * wordStrList에 담기
	 */
	
	
	public void makeWordList(String wordFileName) throws Exception {
		
		wordStrList = new ArrayList<String>();
		wordVOList = new ArrayList<WordVO>();
		
		FileReader fileReader = new FileReader(wordFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] words = reader.split(":");
			
			String word = String.format("%s:%s", words[1],words[2]);
			wordStrList.add(word);
			
			
			WordVO wordVO = new WordVO();
			wordVO.setEndWord(words[1]);
			wordVO.setKorMeans(words[2]);
			
			wordVOList.add(wordVO);
			
		}
		buffer.close();
		fileReader.close();
		
	}

	public List<String> getWordStrList() {
		return wordStrList;
	}

	public List<WordVO> getWordVOList() {
		return wordVOList;
	}
	
}
