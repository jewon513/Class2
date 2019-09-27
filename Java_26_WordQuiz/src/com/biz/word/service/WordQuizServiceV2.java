package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuizServiceV2 extends WordQuizServiceV1{

	int rndIndex;

//	public void setWordVOList(List<WordVO> wordVOList) {
//		this.wordVOList = wordVOList;
//	}

	// wordVOList에서 임의 1개의 영문단어를 추출하여
	// 알파벳을 한개씩 분해하여
	// 무작위로 섞어서 콘솔에 보여라
	public void viewEngword() {
		
		rndIndex = rnd.nextInt(wordVOList.size());
	
		String[] list = wordVOList.get(rndIndex).getEndWord().split("");
		
		// 문자열 배열을 문자열형 List로 바꾸는 방법
		List<String> quizWords = Arrays.asList(list);
		
		Collections.shuffle(quizWords);
		
		System.out.println(quizWords);
		 
	}
	
	// viewEngWord() method에서 뒤섞어 보여준 단어의 원형을 
	// 키보드로 입력받고 맞는지 틀린지 보여주는 코드작성
	@Override
	public void quizExec() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("행복나라 영어 정복 v1");
		System.out.println("==============================================");
		this.viewEngword();
		String answer = wordVOList.get(rndIndex).getEndWord();
		System.out.println("TEST : " + answer);
		System.out.println("==============================================");
		while(true) {
			System.out.print("답을 입력하세요 (끝내시려면 end를 입력하세요)>> ");
			String input = scan.nextLine();
			if(answer.equals(input)) {
				System.out.println("정답입니다.");
				System.out.printf("정답 : %s / 의미 : %s\n",
						wordVOList.get(rndIndex).getEndWord(),
						wordVOList.get(rndIndex).getKorMeans());
				System.out.print("계속 하시려면 yes 를 입력하세요 >> : ");
				String input2 = scan.nextLine();
				if(input2.equals("yes")) {
					this.quizExec();
				}
				System.out.println("게임을 종료합니다.");
				break;
			}else if(input.equals("end")){
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
}
