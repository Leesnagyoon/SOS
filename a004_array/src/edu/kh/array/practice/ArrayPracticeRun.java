package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPracticeRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayPractice ap = new ArrayPractice();
		
		System.out.print("실행 예제 : ");
		int input = sc.nextInt();
		
		switch(input){
		case 1 : ap.ex1();;break;
		case 2 : ap.ex2();;break;
		case 3 : ap.ex3();;break;
		
		
		}
		
		
	}

}
