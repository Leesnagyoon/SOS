package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayRun1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("실행 예제 :" );
	int input = sc.nextInt();
	
	ArrayEx1 ae1 = new ArrayEx1();
	
	switch(input) {
	case 1 :ae1.ex1(); break;
	case 2 :ae1.ex2(); break;
	case 3 :ae1.ex3(); break;
	case 4 :ae1.ex4(); break;
	case 5 :ae1.ex5(); break;
	case 6 :ae1.ex6(); break;
	case 7 :ae1.ex7(); break;
	case 8 :ae1.ex8(); break;
	
	}
	
}
}
