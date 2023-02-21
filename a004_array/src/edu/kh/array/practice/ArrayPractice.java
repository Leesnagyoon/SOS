package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.CSS;

public class ArrayPractice {
	public void ex1() {
		// 길이가 9인 배열을 선언 및 할당하고,1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 짝수번째 인덱스 값의 합을 출력하세요.(0번째 인덱스는 짝수로 취급)

		// 실행 화면
		// 1 2 3 4 5 6 7 8 9
		// 짝수 번째 인덱스 합 : 25

		int[] arr = new int[9];
		int sum = 0;
		for (int col = 0; col < arr.length; col++) {
			arr[col] = col + 1;
			System.out.print(arr[col] + " ");
			if (col % 2 == 0) {
				sum += col + 1;
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);

	}

	public void ex2() {
		// 길이가 9인 배열을 선언 및 할당하고 , 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 홀수 번째 인덱스 값의 합을 출력하세요.(0번째 인덱스는 짝수로 취급)

		// 실행화면
		// 9 8 7 6 5 4 3 2 1
		// 홀수 번째 인덱스 합 : 20

		int[] arr = new int[9];
		int sum = 0;
		for (int col = arr.length - 1; col >= 0; col--) {
			arr[col] = col + 1;
			System.out.print(arr[col] + " ");
			if (col % 2 != 0) {
				sum += col + 1;
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);

	}

	public void ex3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		// 실행화면
		// 양의 정수 : 5
		// 1 2 3 4 5

		// 실행화면
		// 양의 정수 : 5
		// 1 2 3 4 5 6 7 8
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int row = 0; row < arr.length; row++) {
			arr[row] = row + 1;
			System.out.print(arr[row] + " ");
		}

	}

	public void ex4() {
		// 정수 5개를 입력 받아 배열을 초기화 하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력
		// 배열에 같은 수가 없을경우 " 일치하는 값이 존재하지 않습니다"출력

		// 실행화면
		// 입력 0 : 5
		// 입력 1 : 8
		// 입력 2 : 9
		// 입력 3 : 10
		// 입력 4 : 4
		// 검색할 값 : 8
		// 인덱스 : 1
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력" + i + " :");
			arr[i] = sc.nextInt();

		}
		System.out.print("검색할 값: ");
		int input = sc.nextInt();

		int index = 0;
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			if (input == arr[i]) {
				index = i;
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		} else {
			System.out.println("인덱스 : " + index);
		}

	}

	public void ex5() {
		// 문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		// 실행화면
		// 문자열 : application
		// 문자 : i
		// application에 i가 존재하는 위치(인덱스) : 4 8
		// i 개수 : 2

		// *문자열의 길이
		// ex String str = "abcd"
		// System.out.println(str.length()); // 4 출력

		// 문자열 .charAt(인덱스 번호) :
		// 문자열에서 해당 인덱스 번째 문자 하나를 얻어옴(char 자료형)
		// ex) String str = "abcd";
		// char ch = str.charAt(3); // 'd'
		// System.out.println(ch); // 'd' 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = new char[str.length()];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char st = sc.next().charAt(0);
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, st);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == st) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n %s 개수 : %d", st, count);
	}

	public void ex6() {

		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		// 실행화면
		// 정수 : 5
		// 배열 0번째 인덱스에 넣을 값 : 4
		// 배열 1번째 인덱스에 넣을 값 : -4
		// 배열 2번째 인덱스에 넣을 값 : 3
		// 배열 3번째 인덱스에 넣을 값 : -3
		// 배열 4번째 인덱스에 넣을 값 : 2
		// 4 -4 3 -3 2
		// 총 합 : 2

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int input1 = sc.nextInt();
			arr[i] = input1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총합 :" + sum);

	}

	public void ex7() {
		// 주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		// 단,char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.

		// 실행화면
		// 주민등록번호(-포함) : 123456-1234567
		// 123456-1******
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (i > 7) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}

	public void ex8() {
		// 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 " 다시 입력하세요"를 출력하고
		// 다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		while (input % 2 == 0 || input < 3) {

			System.out.println("다시 입력하세요.");
			System.out.print("정수 입력: ");
			input = sc.nextInt();
		}
		int[] arr = new int[input];

		int result = 0;

		for (int i = 0; i < arr.length / 2 + 1; i++) {
			arr[result] = i + 1;

			System.out.print(arr[result] + ", ");
			result++;
		}
		for (int i = arr.length / 2; i > 0; i--) {
			arr[result] = i;

			if (i == 1) {
				System.out.println(arr[result]);
			} else {
				System.out.print(arr[result] + ", ");

			}
			result++;

		}
	}

	public void ex9() {

		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

		// 실행화면
		// 발생한 난수 : 9 7 6 2 5 10 7 2 9 6

		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10) + 1);
			System.out.print(arr[i] + " ");

		}

	}

	public void ex10() {

		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10) + 1);
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		System.out.println("\n최대값 : " + max);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);

	}

	public void ex11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

		// 실행화면
		// 4 1 3 6 9 5 8 10 7 2

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					i--;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void ex12() {
		// 로또 번호 자동 생성기 프로그램을 만들기.
		// (중복 값 없이 오름차순으로 정렬하여 출력하세요.

		// 실행화면
		// 3 4 15 17 28 40

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10) + 1);

			for (int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					i--;
				}
			}
		}

		for (int x = 0; x < arr.length - 1; x++) {
			int result = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					result = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = result;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void ex13() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요.(중복 제거)
		// 실행 화면
		// 문자열 : application
		// 문자열에 있는 문자 : a , p, l, i, c, t, o, n
		// 문자 개수 : 8

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();

		char[] arr = new char[str.length()];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
        System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;

			for (int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					flag = true;
				}
			}
			if (flag == false) {
				count++;
				if (i == arr.length - 1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
			}

		}  
		System.out.println("\n문자 개수 :"+count);

	}
   public void ex14() {
	   //사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
	   //배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	   //단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	   //늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	   //사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	 Scanner sc = new Scanner(System.in);
	 //1. 첫 배열 크기 지정
	 System.out.print("배열의 크기를 입력하시오 : ");
	 int size = sc.nextInt(); // 입력 버퍼에 개행문자가 남음
	 sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
	 
	 //2. 첫 배열 생성
	 String[] books = new String[size];
	 //3. 첫 배열에 저장할 문자열 입력 받기
	 for(int i = 0; i<books.length;i++) {
		 System.out.print((i+1)+"번째 문자열 : ");
		 books[i] = sc.nextLine(); // 입력 버퍼에서 다음 엔터까지 읽어옴
		 
	 }
	 //4. n이 입력될 때 까지 무한 반복 -> n입력시 break;
	 while(true) {
		 System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		 char ch = sc.nextLine().charAt(0);
		 
		 if(ch=='N') {
			 break;
		 }
		 //5. 더 입력 받을 개수 입력
		 System.out.println("더 입력하고 싶은 개수 : ");
		 int addSize = sc.nextInt();
		 sc.nextLine(); // 입력 버퍼에 남은 개행문자(엔터) 제거
		 // 6. 기존 배열보다 늘어난 개수만큼 큰 새 배열 생성
		 String newBooks[] = new String[books.length+addSize];
		 // 7. 깊은 복사를 통해 기존 배열 내용을 새 배열로 복사
		 System.arraycopy(books, 0, newBooks, 0, books.length);
		 // 8. 새 배열의 빈칸 부터 새로운 입력을 받아서 저장
		 for(int i=books.length ; i<newBooks.length ; i++) {
			 System.out.print((i+1)+ "번째 문자열 : ");
			 newBooks[i] = sc.nextLine();
			 
		 }
		 // 9. 기존 참조배열 books에 newBooks의 주소를 얕은 복사 
		 books = newBooks;
		 
	 } // while 종료
	 
	 //10. 배열에 저장된 모든 값을 출력
	 System.out.println(Arrays.toString(books));
	   
	   
	   
	   
   }
}
