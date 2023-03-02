package edu.kh.exception.dto;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent{

	@Override
	public void test() throws EOFException{
		//오버라아딩 시 예외처리는 같거나 좁은 범위 
		//EOFException => IOException 의 후손 
		System.out.println("자식 test()");
	}
	
}
