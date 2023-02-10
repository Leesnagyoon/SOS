package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPracticeRun {
public static void main(String[] args) {
	
	ForPractice fp = new ForPractice();
	Scanner sc = new Scanner(System.in);
	System.out.print("실행 할 예문 : ");
	int num = sc.nextInt();
	
	switch (num){
			case 1 : fp.practice1();break;
			case 2 : fp.practice2();break;
			case 3 : fp.practice3();break;
			case 4 : fp.practice4();break;
			case 5 : fp.practice5();break;
	}
	
}
}
