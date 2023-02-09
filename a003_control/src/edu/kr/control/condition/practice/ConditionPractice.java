package edu.kr.control.condition.practice;

public class ConditionPractice {
	
	public void practice1() {//키보드로 입력 받은 정수가 양수이면서 짝수일 때만 "짝수입니다."를 출력하고
		//짝수가 아니면 "홀수입니다."를 출력하세요.
		//양수가아니면 "양수만 입력해주세요."를 출력하세요
		
		//실행화면
		//숫자를 한 개 입력하세요 : 8
		//짝수입니다.
		
		//실행화면 2
		//숫자를 한 개 입력하세요 : 17
		//홀수입니다.
		
		//실행화면 3
		//숫자를 한 개 입력하세요 : -3
		//양수만 입력해주세요.
		
	}
	public void practice2() {//국어,영어,수학 세 과목의 점수를 키보드로 입력 받고 합게와 평균을 계산하고
		//합계와 평균을 이용하여 합격/불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		
		//합격했을 경우 과목 별 점수와 합계,평균,"축하합니다, 합격입니다!"를 출력하고
		//불합격인 경우에는 "불합격입니다."를 출력하세요.
		
		//실행화면           실행화면2
		//국어점수 : 88      국어점수 : 88
		//수학점수 : 50      수학점수 : 50
		//영어점수 : 40      영어점수 : 45
		//불합격 입니다.       국어 : 88
//                         수학: 50		
		//                 영어 : 45
		//                 합계 : 183
		//                 평균 : 61.0
		//                 축하합니다, 합격입니다!
		
	}
	public void practice3() {//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.
		//(2월 윤달은 생각하지 않습니다.)
		//잘못 입력한 경우 "00월은 잘못 입력된 달입니다."를 출력하세요 (switch문 사용)
		
		//실행화면1
		//1~12 사이의 정수 입력 : 8
		//8월은 31일까지 있습니다.
		
		//실행화면 2
		//1~12 사이의 정수 입력 : 99
		//99월은 잘못 입력된 달입니다.
		
	}
	public void practice4() { // 키 , 몸무게를 double로 입력 받고 BMI 지수를 게산하여 
		//계산 결과에 따라 저체중/정상체중/과제충/비만을 출력하세요.
		//BMI = 몸무게 /(키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중/ 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 /  25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		// 실행 화면 
		//키 (m)를 입력해 주세요 : 1.65
		//몸무게 (kg)를 입력해 주세요 : 58.4
		//BMI 지수 :21.45087235996327
		//정상체중
		
	}
	public void practice5() { //중간고사,기말고사,과제점수,출석횟수를 입력하고 Pass 또는 Fail을 출력
		//평가 비율은 중간고사 20% , 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		//이 때 ,출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30%이상 결석시 Fail을 출력하세요
		
		//출력화면 ( PDF 참조)
		
	}

	
	
	
	
}