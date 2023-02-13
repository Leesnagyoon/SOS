package edu.kh.control.loop.ex;

import java.util.Scanner;

public class WhileRun {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("실행 예문 : ");
	int input =sc.nextInt();
	
	
	WhileEx we = new WhileEx();
	
	
	switch (input) {
	case 1 : we.ex1();break;
	case 2 : we.ex2();break;
	case 3 : we.ex3();break;
	case 4 : we.ex4();break;
	
	
	}
	
	
}
}
