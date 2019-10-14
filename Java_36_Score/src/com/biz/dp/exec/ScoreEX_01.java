package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEX_01 {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		ScoreVO sVO = new ScoreVO();
		
		// 빌드패턴으로 객체를 생성
		ScoreVO scoreBVO = new ScoreVO.Builder()
									.s_num("001")
									.s_kor(90)
									.s_eng(80)
									.s_eng(70)
									.build();
		
		scoreList.add(scoreBVO);

		scoreList.add(new ScoreVO.Builder()
				.s_num("002")
				.s_kor(90)
				.s_eng(80)
				.s_eng(70)
				.build());
	}

}
