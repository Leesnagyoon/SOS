package edu.kh.operator.ex;

import java.util.Scanner;




public class OperatorEx5 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		// 복합 대입 연산자 : += -+ *= /= %=
		// - 기존 변수에 저장된 값과 새로 대입되는 값의 산술 연산 결과를 대입
		// - += (누적)    -=(차감)
		
		
		int a =10;
		    a = 20; // num = 30
		    a += 30; // num = 50
		    a -= 5; // num = 45
		    
		System.out.println(a); //a = 45
		
		int a1= 10;
		
		a1++; //a1 = a1+1
		
		System.out.println("a1을 1 증가 :"+a1); //11
		
		a1 += 4; //a1 = a1 + 4;
		
		System.out.println(a1); //15
		
		a1 -= 10; // a1 = a1-10;
		
        System.out.println("a1을 10감소 : "+ a1); //5
		
		a1 *= 3; //a1= a1*3;
		
		System.out.println("a1을 3배 증가 :"+ a1); //15
		
		a1 /= 6; // a1 = a1 / 6;
		
		System.out.println("a1을 6으로 나눴을 때 몫 : "+ a1); // 2
		
		a1 %=2; //a1 = a1 % 2;
		System.out.println("a1을 2로 나눴을 때 나머지 :"+ a1 ); //0
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
