package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_01 {

	public static void main(String[] args) {

		WordListMakeService wm = new WordListMakeService();
		WordQuizService qs = new WordQuizServiceV2();
		
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		try {
			wm.makeWordList(wordFileName);
			List<String> wordStrList = wm.getWordStrList();
			List<WordVO> wordVOList = wm.getWordVOList();
			qs.setWordVOList(wordVOList);
			//qs.viewEngword();
			
			qs.quizExec();
			
//			for (int i = 0; i < wordVOList.size(); i++) {
//				System.out.printf("%s\t\t%s\n",wordVOList.get(i).getEndWord(),
//						wordVOList.get(i).getKorMeans());
//			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" 집에 가고 싶습니다. ");
		}
		
	}

}
