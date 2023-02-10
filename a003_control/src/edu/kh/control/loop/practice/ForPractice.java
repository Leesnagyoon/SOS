package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractice {

	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		
		//ex.
		// 1 이상의 숫자를 입력하세요 : 4               1이상의 숫자를 입력하세요 : 0
		// 1 2 3 4                               1 이상의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) { System.out.print("1이상의 숫자를 입력해주세요");
		
		}else {
			for(int i = 1;i<=input;i++ ) {
			   System.out.print(i+" ");
			}
		
		
	}
	}
	public void practice2() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//ex
		//1이상의 숫자를 입력하세요 : 4        1이상의 숫자를 입력하세요 : 0
		//4 3 2 1                       1 이상의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) { System.out.print("1이상의 숫자를 입력해주세요");
		
		}else { for(int i = input; i >=1;i--) {
			System.out.print(i+" ");
		}
		}
		
	}
	public void practice3() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		//ex 정수를 하나 입력하세요 :8
		// 1+2+3+4+5+6+7+8 = 36
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1;i<=input;i++) {
			sum += i;
			System.out.print(i);
			
			if(i==input) { System.out.print("");
				
			}else {System.out.print(" + ");
				
			}
		}
		
		System.out.println(" = " + sum);
		
		
		
	}
	public void practice4() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면"1 이상의 숫자를 입력해주세요"를 출력하세요.
		
		//ex 첫 번째 숫자:8  첫 번째 숫자 : 9
		//   두 번째 숫자:4  두 번째 숫자 : 0
		// 45678              1 이상의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int input = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		if(input==0) {System.out.print("1 이상의 숫자를 입력해주세요.");}
		else {
	    for(int i=input1;i<=input;i++) {
	    	System.out.print(i+" ");
		}
		}
		
	}
	public void practice5() {
		//사용자로부터 입력 받은 숫자의 구구단을 출력하세요.
		//ex 숫자 :4
		//구구단 4단 출력
		//""
		//""
		//""
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		for(int i =1;i<=input;i++) {
			System.out.printf("%d * %d = %2d \n",input,i,input*i);
			
		}
		
		
		
		
		
	}
	
	}

