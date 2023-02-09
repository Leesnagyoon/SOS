package edu.kr.control.condition.ex;

import java.util.Scanner;

public class SwitchEx {
/* Switch문 (switch - case 문)
 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
 * -> 식의 결과에 맞는 case문이 수행됨
 * 
 * [작성법]
 * switch(식){//식 수행 결과는 true/false가 아닌 값(정수,문자열 제일 많이 씀)
 * 
 * case 결과값 1 : 수행코드 1; break;
 * case 결과값 2 : 수행코드 2; break;
 * case 결과값 3 : 수행코드 3; break;
 * default : 모든 case가 만족하지 않을 경우 수행하는 코드; 
 * 
 */
	//예시 1번
	public void ex1() {
	        //키보드로 정수를 입력 받아
		    //1이면 "RED"
		    //2이면 "ORANGE"
		    //3이면 "YELLOW"
		    //4이면 "GREEN"
		    //1~4가 아니면 "BLUE"를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int input = sc.nextInt();
		
		String res;
		//1번 if - else if - else 버전
		
//		if(input==1) {res = "RED";}
//		else if(input==2) {res = "ORANGE";}
//		else if(input==3) {res = "YELLOW";}
//		else if(input ==4) {res = "GREEN";}
//		else {res="BLUE";}
	    //2번 switch 버전
		switch(input){
		case 1 : res = "RED"; break;
		case 2 : res = "ORANGE"; break;
		case 3 : res = "YELLOW"; break;
		case 4 : res = "GREEN"; break;
		default : res = "bLUE";
		}
		
		
		System.out.println(res);
	
}


























}