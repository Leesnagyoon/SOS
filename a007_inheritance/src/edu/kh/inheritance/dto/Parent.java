package edu.kh.inheritance.dto;

public class Parent {

	
	private int money = 500_000_000;//돈
	private String lastName = "박";//성 
	
	public Parent() {
		System.out.println("Parent() 기본생성자");
	}
	
	//매개 변수 생성자
	
	public Parent(int money,String lastName) {
		
		this.money = money;
		this.lastName = lastName;
		
		System.out.println("Parent(int,String ) 매개 변수 생성자");
	}
	
	
	
	
	public int getMoney() {
		return money;
	}
	public void set(int money) {
		this.money = money;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return money + " / "+ lastName;
	}
	
	
	
}
