package edu.kr.control.condition.practice;

import java.util.Scanner;

public class ConditionPracticeRun {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ConditionPractice cp = new ConditionPractice();
	
	System.out.print("실행할 예제의 번호 : ");
	int num = sc.nextInt();
	
	switch(num) {
	case 1 : cp.practice1();break;
	case 2 : cp.practice1();break;
	case 3 : cp.practice1();break;
	case 4 : cp.practice1();break;
	case 5 : cp.practice1();break;
	default : System.out.print("없는 번호 입니다.");
	
	}
	
		
	
	
	
	
}
}
