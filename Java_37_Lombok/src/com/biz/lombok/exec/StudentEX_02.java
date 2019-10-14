package com.biz.lombok.exec;

import java.util.Scanner;

import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보 .txt 파일을 읽어서 
 * 1. 모든 학생의 리스트를 콘솔에 보이고
 * 2. 이름을 입력받아 해당하는 학생을 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학생을 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 그 범위의 학년에 해당하는 학생을 콘솔에 보이기
 */
public class StudentEX_02 {

	public static void main(String[] args) {

		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		Scanner scan = new Scanner(System.in);
		
		String fileName = "src/com/biz/lombok/학생정보.txt";
		
		try {
			sRead.readStudent(fileName);
			sView.setStdList(sRead.getStdList());
			
			while(true) {
				System.out.println("============================================================================");
				System.out.println("학생 정보 열람");
				System.out.println("============================================================================");
				System.out.println("1.전체학생 조회\t2.이름으로 조회\t3.학년으로 조회\t4.학년범위로 조회  5.종료");
				System.out.println("============================================================================");
				System.out.print("번호 선택 >> ");
				String strM = scan.nextLine();
				int intM = 0 ;
				try {
					intM = Integer.valueOf(strM);
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요");
				}
				if(intM == 1 ) sView.view();
				else if (intM == 2 ) {
					System.out.print("이름을 입력해주세요 >> ");
					String strName = scan.nextLine();
					sView.view(strName);
				}else if (intM == 3) {
					System.out.print("학년을 입력해주세요 >>");
					String strGrade = scan.nextLine();
					int intGrade = 0;
					try {
						intGrade=Integer.valueOf(strGrade);
						sView.view(intGrade);
					} catch (Exception e) {
						System.out.println("숫자만 입력해주세요");
					}
				}else if (intM == 4) {
					System.out.print("최소학년을 입력해주세요 >> ");
					String strGrGrdae = scan.nextLine();
					System.out.print("최대학년을 입력해주세요 >> ");
					String strLessGrade =scan.nextLine();
					int grGrade = 0;
					int lessGrade = 0;
					try {
						grGrade = Integer.valueOf(strGrGrdae);
						lessGrade = Integer.valueOf(strLessGrade);
						sView.view(grGrade, lessGrade);
					} catch (Exception e) {
						System.out.println("숫자만 입력해주세요");
					}
				}else if (intM == 5) {
					break;
				}else {
					System.out.println("다시 입력해주세요");
				}
				}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
