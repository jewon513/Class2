package com.biz.word.service;

import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService{

	protected List<WordVO> wordVOList;
	protected Random rnd;

	public WordQuizServiceV1() {
		rnd = new Random();
	}

	public WordQuizServiceV1(List<WordVO> wordVOList) {
		rnd = new Random();
		this.wordVOList = wordVOList;
	}

	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}

	// wordVOList에서 임의 1개의 영문단어를 추출하여 console에 표시
	public void viewEngword() {
		
		int rndIndex = rnd.nextInt(wordVOList.size());
		
		System.out.println(wordVOList.get(rndIndex).getEndWord());
		
		
	}

	@Override
	public void quizExec() {
		// TODO Auto-generated method stub
		
	}

	
}
