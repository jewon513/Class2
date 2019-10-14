package com.biz.exam.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsViewServiceV1 implements BBsViewService {

	private List<BBsVO> BBsList;
	
	@Override
	public void setBBsList(List<BBsVO> BBsList) {
		this.BBsList = BBsList;
	}

	@Override
	public void viewBBs() {
		this.head();
		for(BBsVO vo : BBsList) {
			this.body(vo);
		}
	}

	@Override
	public void viewBBs(String subject) {
		this.head();
		for(BBsVO vo : BBsList) {
			if(vo.getSubject().contains(subject)) {
				this.body(vo);
			}
		}
	}

	@Override
	public void viewBBs(int sDate, int eDate) {
		this.head();
		for(BBsVO vo : BBsList) {
			if(vo.getDate()>=sDate && vo.getDate()<=eDate) {
				this.body(vo);
			}
		}
	}

	@Override
	public void viewBBs(boolean sort) {
		this.head();
		if(sort == true) {
			Collections.sort(BBsList, new Comparator<BBsVO>() {

				@Override
				public int compare(BBsVO o1, BBsVO o2) {
					return o1.getCount()-o2.getCount();
				}
				
			});
		}else {
			Collections.sort(BBsList, new Comparator<BBsVO>() {

				@Override
				public int compare(BBsVO o1, BBsVO o2) {
					return o2.getCount()-o1.getCount();
				}
				
			});
		}
		for(BBsVO vo : BBsList) {
			this.body(vo);
		}
	}

	private void head() {
		System.out.println("==================================================================================================================================");
		System.out.println("순번\t작성일자\t작성자\t\t제목\t\t\t\t\t내용\t\t\t\t\t조회수");
		System.out.println("==================================================================================================================================");
	}
	
	private void body(BBsVO vo) {
		System.out.printf("%d\t%d\t%s\t%10s\t\t%30s\t%20d\n",
				vo.getSeq(),
				vo.getDate(),
				vo.getAuth(),
				vo.getSubject(),
				vo.getText(),
				vo.getCount());
	}
}
