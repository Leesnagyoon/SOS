package edu.kh.variable;

public class VariableEx3 {

	public static void main(String[] args) {

		// 변수 : 메모리에 값을 저장할 수 있는 공간
		// 저장된 값은 변할 수 있다.

		// 상수 : 메모리에 값을 저장할 수 있는 공간
		// 한번 저장된 값은 변할 수 없다.

		// 상수 예약어 : final

		// 변수 값 변경 확인
		int num1 = 100;
		num1 = 200;

		// 상수 값 변경 확인
		final int num2 = 99;
		//num2 = 999;
		
		//The final local variable num2 cannot be assigned. 
		//It must be blank and not using a compound assignment
		//-> 한 번 값이 저장된 상수 num2에 다른 값을 저장하지 못함
		
		
		/* 상수 명명 규칙 및 활용법*/
		// - 명명규칙 : 모두 대문자 표기 , 단어 구분시 _ 사용
		
		final int CONSTANT_NUMBER = 100;
		
		
		// - 활용법
		final double PI = 3.14;
		
		double result = PI * 10 * 10; //314.0
		
		System.out.println(PI);
		System.out.println(result);
		
		
		final int UP = 5;
		final int DOWN = -5;
		final int INIT = 0;  // (초기화)처음으로
		
		System.out.println("---------------");
		
		
		int result2 = INIT;
		System.out.println(result2); //0
		
		
		// 대입 연산자 (=) 기호를 기준으로
		// 오른쪽부터 해석
		result2 = result2 + UP;
		
		System.out.println(result2);
		
		result2 = result2 + DOWN + DOWN;
		//           5  - 5 -5 =-5
		
		System.out.println(result2); // -5
		
		
		
		
		
		
		
		
	}

}
