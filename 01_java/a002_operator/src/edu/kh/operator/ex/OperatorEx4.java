package edu.kh.operator.ex;

import java.util.Scanner;

public class OperatorEx4 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		// 삼항 연산자 (if) ( '조건식' ? '식' 1: '식'2;)
				// 비교 / 논리 / 논리부정
				// -> true/false
				
				
		System.out.println("[홀짝 검사기]");
		
		System.out.print("정수 하나를 입력해주세요 : ");
		
		int input1 = sc.nextInt(); //정수 입력 받기
	
		
		//Math.abs(숫자) -> 절대값
		//조건식 ? true인 경우 : false인 경우
	    String result = Math.abs(input1) % 2 == 1 ? "홀수 입니다." 
	    		: input1 == 0? "0입니다.":"짝수 입니다.";
	    
		
		System.out.println(result);
		
		
		
	
		
		
	}
	
	
	
	
	
}
