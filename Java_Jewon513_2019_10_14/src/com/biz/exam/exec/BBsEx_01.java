package com.biz.exam.exec;

import java.util.Scanner;

import com.biz.exam.service.BBsReadService;
import com.biz.exam.service.BBsReadServiceV1;
import com.biz.exam.service.BBsViewService;
import com.biz.exam.service.BBsViewServiceV1;

public class BBsEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BBsReadService rs = new BBsReadServiceV1();
		BBsViewService vs = new BBsViewServiceV1();
		String bbsFile = "src/com/biz/exam/bbs.txt";
		
		// 파일을 읽고 넘기는 부분
		try {
			rs.readBBs(bbsFile);
			vs.setBBsList(rs.getBBsList());	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 시작부분
		while(true) {
			System.out.println("====================================================");
			System.out.println("\t\t게시판 관리 시스템v1");
			System.out.println("====================================================");
			System.out.println("1.전체 2.제목 3.날짜 4.정렬 0.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("업무 선택 >>");
			String strM = scan.nextLine();
			int intM = 0;
			try {
				intM = Integer.valueOf(strM);
				if(intM==0) {
					break;
				}else if(intM==1) {
					vs.viewBBs();
				}else if(intM==2) {
					System.out.print("제목을 입력하세요 >> ");
					String subject = scan.nextLine();
					vs.viewBBs(subject);
				}else if(intM==3) {
					System.out.print("시작 날짜를 입력하세요 >> ");
					String strSDate = scan.nextLine();
					System.out.print("끝 날짜를 입력하세요 >> ");
					String strEDate = scan.nextLine();
					int sDate = 0;
					int eDate = 0;
					try {
						sDate = Integer.valueOf(strSDate);
						eDate = Integer.valueOf(strEDate);
						vs.viewBBs(sDate, eDate);
					} catch (Exception e) {
						System.out.println("\t\t숫자만 입력해주세요");
					}
				}else if(intM==4) {
					System.out.println("오름차순 정렬은 : 1 ");
					System.out.println("내림차순 정렬은 : 2 ");
					System.out.print("선택해주세요 >> ");
					String strInputSort = scan.nextLine();
					int inputSort = 0;
					try {
						inputSort = Integer.valueOf(strInputSort);
						if(inputSort==1) {
							vs.viewBBs(true);
						}
						else if(inputSort==2) {
							vs.viewBBs(false);
						}else {
							System.out.println("\t\t다시 입력해주세요.");
						}
					} catch (Exception e) {
						System.out.println("\t\t숫자만 입력해주세요.");
					}
					
				}else {
					System.out.println("\t\t다시 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("\t\t숫자만 입력해주세요.");
			}
			
		}// While end
		
		System.out.println("종료합니다.");
		
	}

}
