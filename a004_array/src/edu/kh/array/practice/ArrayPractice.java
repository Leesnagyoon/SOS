package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
   public void ex1() {
	   //길이가 9인 배열을 선언 및 할당하고,1부터 9까지의 값을 반복문을 이용하여
	   //순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	   //짝수번째 인덱스 값의 합을 출력하세요.(0번째 인덱스는 짝수로 취급)
	   
	   //실행 화면 
	   //1 2 3 4 5 6 7 8 9
	   //짝수 번째 인덱스 합 : 25
	   
	   int[]arr = new int[9];
	   int sum = 0;
	   for(int col=0;col<arr.length;col++) {
		   arr[col]=col+1;
		   System.out.print(arr[col]+" ");
		   if(col%2 == 0) {
			   sum+=col+1;
		   }
	   } System.out.println(); 
	   System.out.println("짝수 번째 인덱스 합 : "+ sum);
	   
	   
	   
   }
public void ex2() {
	//길이가 9인 배열을 선언 및 할당하고 , 9부터 1까지의 값을 반복문을 이용하여
	//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	//홀수 번째 인덱스 값의 합을 출력하세요.(0번째 인덱스는 짝수로 취급)
	
	//실행화면
	//9 8 7 6 5 4 3 2 1
	//홀수 번째 인덱스 합 : 20
	
	int[]arr= new int[9];
	int sum = 0;
	for(int col =arr.length-1;col>=0;col--) {
		arr[col]=col+1;
		System.out.print(arr[col]+" ");
		if(col%2!=0) {
			sum+=col+1;
		}
	} System.out.println();
	  System.out.println("홀수 번째 인덱스 합 : "+sum);
	
}
public void ex3() {
	//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	
	//실행화면
	//양의 정수 : 5
	// 1 2 3 4 5
	
	//실행화면
	//양의 정수 : 5
	//1 2 3 4 5 6 7 8 
	Scanner sc = new Scanner(System.in);
	System.out.print("양의 정수 입력 : ");
	int input = sc.nextInt();
	int[]arr = new int[input];
	
	for(int row = 0; row<arr.length;row++) {
		arr[row]=row+1;
		System.out.print(arr[row]+" ");
	}
	
	
	
	
	
}
	
}
