package com.biz.word.exec;

import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV2;

public class WordQuizStart_01 {

	public static void main(String[] args) {
		
		WordListMakeService wm = new WordListMakeService();
		WordQuizService qs = new WordQuizServiceV2();
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";

		try {
			wm.makeWordList(wordFileName);
			qs.setWordVOList(wm.getWordVOList());
			qs.quizExec();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
