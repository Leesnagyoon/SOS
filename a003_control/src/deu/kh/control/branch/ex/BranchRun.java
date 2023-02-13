package deu.kh.control.branch.ex;

import java.util.Scanner;

public class BranchRun {
public static void main(String[] args) {
	
	BranchEx be = new BranchEx();
	
	Scanner sc = new Scanner(System.in);
	System.out.print("실행예문 :");
	int num = sc.nextInt();
	
	switch(num) {
	case 1 : be.ex1(); break;
	case 2 : be.ex2(); break;
	case 3 : be.ex3(); break;
	case 4 : be.ex4(); break;
	case 5 : be.ex5(); break;
	case 6 : be.upDownGame(); break;
	case 7 : be.ex6(); break;
	}
	 
}
}
