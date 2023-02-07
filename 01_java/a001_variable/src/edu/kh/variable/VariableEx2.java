package edu.kh.variable;

//class : 자바 코드 작성 영역
public class VariableEx2 {

	// main method : 자바 코드 실행을 위한 구문
	public static void main(String[] args) {

		// System.out.println("확인"); // 한 줄 출력
		// 실행 : ctrl + f11 또는 Run 버튼 클릭

		// 8개 자료형(데이터의 크기에 따라 다름)

		// 기본자료형
		// 논리형 변수 선언 boolean isTrue; (true/false)(1byte)
		//
		// 문자형 변수 선언 char ch; ('A' ,'B', '가')(하나의 단어만)(2byte, 유니코드(UTF-16))
		//
		// 정수형 변수 선언 byte bNum; (크기별로)(1byte)
		// short sNum; (2byte)
		// int iNum; (4byte)(정수 기본형)
		// long lNum; (8byte)

		// 실수형 변수 선언 float fNum; (4byte)(소수점아래 8자리)
		// (소수에 관하여) double dNum;(8byte,실수 기본형)(소수점아래 16자리)

		// 기본자료형x(참조형)
		// 문자열 변수 선언 String str; ("abcd" , "Hello World"등)
		// (char ch; 문자형 변수를 응용한 변수 선언)

		// E = 0이 n개

		// 변수의 명명 규칙
		// 1.대소문자가 구분되며 길이 제한이 없다.
		int apple;
		//int apple;  Duplicate local variable apple (변수명 중복)
	    int applE;
		
	    int freeTradeAgreement;
	    int showMeTheMoney;
	    int aijfdoajeijfoiajeifajejtaoietjw;
	    
	    
		// 2.예약어를 사용하면 안 된다. ex)true, final, String 등
		//int int;
		//double char;
		//boolean final;
		
	    // 3.숫자로 시작하면 안 된다. ex)age1은 가능하지만 1age는 불가능
		//long 100number;  //에러 
		long number100;
		
	    
	    // 4.특수 문자는 '_'와 '$'만을 허용한다.
		float $num$ber;
		float _num_ber;
		//float #num#ber;  //에러
		
		// -'$'는 내부 클래스에서 사용
		// -'_'사용 시 컴파일 에러는 없지만 관례상 사용하지 않는 것이 좋음
		// ex) sh@rp는 불가능하지만 $harp는 가능

		
		// 5.여러 단어 이름은 단어의 첫 글자를 대문자로 한다.(개발자들 간의 약속)
		// 단, 첫 시작 글자는 소문자로 하는 것이 관례이다.
		
		int studentAge;
		char helloWorld;
		
		// 참고) 변수명에 언어 제한이 없음
		int 정수1번;
		double 실수1번입니다;
		char 東;
		
		
		
		
		
		// = 대입
		// ex) int age;
		// age = 10; (10이라는 값을 age에 대입한다)

		// 리터럴 - 변수에 대입되는 값 자체
		// ex ) short s = 32767;
		// ex ) int i = 100; (기본 정수 표기법)
		// ex ) long l = 10000L;(L)
		// ex ) float f = 0.123f;(f)
		// ex ) double d = 3.14; (.) (기본 실수 표기법)
		// ex ) char c = 'A'('')또는 0~65535 사이 정수
		// ex ) String str = "ABC"("")
		// ex ) boolean : true, false 만 가능

		// ex) byte , short : 10,0,-312 (int와 동일)
		// 왜 int와 동일할까?
		// -> byte , short 는 옛날 코드와의 호환을 위해 만들어진 자료형
		// --> 사용 빈도가 낮아서 별도의 리터럴 표기법을 제작 X
		// ---> 임시로 int 표기법 사용

		// 변수 : 메모리에 값을 저장하기 위한 공간

		// 변수 선언 : 메모리에 값을 저장할 공간을 생성(할당)

		// 자료형 변수명
		boolean booleanData;
		// 논리형 데이터 ( true/false)를 저장할 공간
		// 1byte를 메모리(RAM)에 할당하고
		// 그 공간을 booleanData 라고 부르겠다.

		int number1;
		// 정수형 데이터를 저장할 공간
		// 4byte를 메모리에 할당하고
		// 그 공간을 number1이라고 부르겠다.

		double number2;
		// 실수형 데이터를 저장할 공간
		// 8byte를 메모리에 할당하고
		// 그 공간을 number2라고 부르겠다.

		char ch;
		// 문자형 데이터를 저장할 공간
		// 2byte를 메모리에 할당하고
		// 그 공간을 ch라고 부르겠다.

		/* 변수에 값 대입하기 */
		// -> 생성한 변수에 값을 저장(대입)하는 것

		// 변수명 = 값;
		// = 기호 : 대입 연산자(오른쪽 값을 왼쪽 변수에 저장)

		booleanData = true;

		// number1 = 123456789.123;
		// Type mismatch: cannot convert from double to int
		// int형 변수 number1에 실수를 저장할 수 없다.

		number1 = 123456789;

		number2 = 9.87654321;

		// ch = 'AA'; char 자료형은 ''안에 문자 하나만 작성 가능
		ch = 'A';

		System.out.println("[값 대입 결과 확인]");
		System.out.println(booleanData);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(ch);

		// 변수에 대입된 값 변경
		ch = '하';

		System.out.println("[ch 값 변경]");
		System.out.println(ch);

		/* 리터럴 */
		// -직접 작성한 값 또는 변수에 대입되는 값

		// ** 자료형별로 리터럴 표기하는 방법이 별도 존재

	    long number3 = 10000000000L; // 100억
	    // L을 붙이지 않으면 int 표기법으로 인식되어 
	    // 100억이 int로 해석되어짐
	    // -> int의 범위 약 21억을 초과하여 오류 발생

	    float number4 = 1.23f;
	    // 1.23은 double의 표기법으로 인식되어
	    // float형 변수에 저장할 수 없어서 오류 발생
	    // -> f를 붙여서 해결
	    
	    byte number5 = 100;
	    short number6 = 200;
	    //byte, short는 int 표기법 사용
	    
	    
	    System.out.println("[리터럴 확인]");
	    System.out.println(number3);
	    System.out.println(number4);
	    System.out.println(number5);
	    System.out.println(number6);
	    
	    // 출력 시 리터럴 표기법은 생략된다.
	    
	    // char 자료형의 특징 (p.52참고)
	    // - char 자료형은 정확히는 정수를 저장하는 정수형
	    // 다만, 정수를 저장하고 있다가
	    // 화면에 출력 시 문자표에 대응되는 문자가 출력(인코딩)
	    
	    //char 변수 선언과 동시에 초기화
	    //초기화 = 변수를 사용하기 전에 처음으로 값을 저장하는 것
	    char test1 = 'A';
	    	    
	    char test2 = 65;
	    
	    System.out.println("[char 특징 확인]");
	    System.out.println(test1);
	    System.out.println(test2);
	    
	    	

	    
	
	}

}
