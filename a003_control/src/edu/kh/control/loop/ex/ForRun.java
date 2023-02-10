package edu.kh.control.loop.ex;

import java.util.Scanner;

public class ForRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ForEx fx = new ForEx();
		
		System.out.print("실행할 에문 번호 : ");
		
		int num = sc.nextInt();
		
		switch(num){
		case 1 : fx.ex1();break;
		case 2 : fx.ex2();break;
		case 3 : fx.ex3();break;
		case 4 : fx.ex4();break;
		case 5 : fx.ex5();break;
		case 6 : fx.ex6();break;
		case 7 : fx.ex7();break;
		case 8 : fx.ex8();break;
		case 9 : fx.ex9();break;
		case 10 : fx.ex10();break;
		case 11 : fx.ex11();break;
		case 12 : fx.ex12();break;
		case 13 : fx.ex13();break;
		case 14 : fx.ex14();break;
		
	}
	
}



}