package edu.kh.jdbc.run;

import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.dao.SelectJobNameDAO;
import edu.kh.jdbc.dto.Employee2;

public class JDBCExample4 {
  public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("직급명 입력 : ");
	String deptTitle = sc.nextLine();
	
	//DAO 생성 후 메서드 호출
	
	SelectJobNameDAO dao1 = new SelectJobNameDAO();
	
	List<Employee2> empList2 = dao1.select(deptTitle);
	
	if(empList2.isEmpty()) {
		System.out.println("일치하는 직급이 없습니다");
		return;
	}
	for(Employee2 emp2 : empList2) {
		System.out.printf("부서 : %s / 직급 : %s / 이름 : %s / 이메일 : %s \n",
				emp2.getDeptTitle(),
				emp2.getJobName(),
				emp2.getEmpName(),
				emp2.getEmail()
				);
	}
}
}
