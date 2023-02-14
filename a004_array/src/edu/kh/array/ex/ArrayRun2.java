package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayRun2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayEx2 ae2 = new ArrayEx2();
	
    System.out.println("실행할 예문 : ");
    int input = sc.nextInt();
    
    switch (input) {
    
    case 1 : ae2.ex1(); break;
    case 2 : ae2.ex2(); break;
    case 3 : ae2.ex3(); break;
    
    
    }



}
}
