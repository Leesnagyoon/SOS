package edu.kh.jdbc.view;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.jdbc.model.dto.Emp;
import edu.kh.jdbc.model.service.EmpService;

public class EmpView {

	private Scanner sc = new Scanner(System.in);

	private EmpService service = new EmpService();

	// ** 모든 기능에는 예외상황에 따른 출력 구문 필수 작성 **
	// ** 필요에 따라 DTO에 생성자 추가 **
	// ** 메서드명, 출력 화면은 자유롭게 작성 **

	public void displayMenu() {

		int input = 0;

		do {

			try {
				System.out.println("\n*****************************\n");
				System.out.println("***** 사원 관리 프로그램*****");

				System.out.println("1. 재직중인 사원 전체 조회");
				// 현재 재직중인 사원의
				// 사번, 이름, 부서명, 직급명, 급여, 전화번호, 이메일
				// 직급코드 오름차순으로 조회

				System.out.println("2. 퇴직한 사원 전체 조회");
				// 현재 퇴직한 사원의
				// 사번, 이름, 전화번호, 이메일, 퇴사일을
				// 퇴사일 오름차순으로 조회

				System.out.println("3. 사번이 일치하는 사원 조회");
				// 사번을 입력 받아 일치하는 사원의
				// 사번, 이름, 부서명, 직급명, 급여, 전화번호, 이메일, 입사일, 퇴직여부 조회
				// 단, 사번이 일치하는 사원이 없으면
				// "사번이 일치하는 사원이 없습니다" 출력

				System.out.println("4. 사원 정보 추가(INSERT)");
				// 사번(EMP_ID) -> SEQ_EMP_ID SEQUENCE 사용

				System.out.println("5. 사번으로 사원 정보 수정(UPDATE)");
				// 이메일, 전화번호, 급여, 보너스 수정
				// 단, 사번이 일치하는 사원이 없으면
				// "사번이 일치하는 사원이 없습니다" 출력

				System.out.println("6. 사번으로 사원 정보 삭제(DELETE)");
				// 사번을 입력 받아 일치하는 사원 삭제
				// - 사번을 입력 받은 후 정말 삭제할 것인지 Y/N을 입력 받아
				// Y인 경우에만 삭제, N인 경우 취소
				// - 사번이 일치하는 사원이 없으면
				// "사번이 일치하는 사원이 없습니다" 출력

				System.out.println("7. 사번이 일치하는 사원 퇴직 처리");
				// - ENT_YN -> 'Y' , ENT_DATE -> SYSDATE로 수정

				// - 사번을 입력 받은 후 정말 퇴직 처리할 것인지 Y/N을 입력 받아
				// Y인 경우에만 퇴직 처리, N인 경우 취소

				// - 사번이 일치하지 않거나 이미 퇴직 처리된 사원이면
				// "사번이 일치하는 않거나, 이미 퇴직된 사원입니다." 출력

				System.out.println("8. 가장 최근 입사한 사원 5명 조회");

				// 가장 최근(입사일이 늦은) 사원 5명의
				// 사번, 이름, 부서명, 입사일을
				// 입사일 내림차순으로 조회

				System.out.println("9. 부서별 통계 조회");
				// 각 부서별
				// 부서명, 인원 수, 급여 평균
				// 부서코드 오름차순 조회

				// HINT.
				// - 별도의 DTO 작성 또는
				// Map(LinkedHashMap : key 순서가 유지되는 Map) 이용

				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					selectEntry();
					break;
				case 2:
					selectOutEntry();
					break;
				case 3:
					selectOne();
					break;
				case 4:
					insert();
					break;
				case 5:
					update();
					break;
				case 6:delete();
					break;
				case 7: updateEntry();
					break;
				case 8:
					break;
				case 9: selectDepartment();
					break;
				case 0:
					System.out.println("\n[프로그램을 종료합니다...]\n");
					break;

				default:
					System.out.println("\n[메뉴에 존재하는 번호를 입력하세요.]\n");
				}

			} catch (InputMismatchException e) {
				System.out.println("\n[잘못된 입력입니다.]\n");
				sc.nextLine(); // 입력 버퍼에 남아있는 문자열 제거
				input = -1; // while문이 종료되지 않게하기 위한 값 대입
			}

		} while (input != 0);

	}

	/**
	 * 재직중인 사원 전체 조회
	 * 
	 */
	private void selectEntry() {

		System.out.println("\n----------------[재직중인 사원 전체 조회]-----------------\n");

		try {
			List<Emp> empList = service.selectEntry();

			if (empList.isEmpty()) {
				System.out.println("-----[사원이 존재하지 않습니다]------");
				return;
			}
			for (Emp e : empList) {
				System.out.printf("%d / %s / %s / %s / %d / %s / %s \n",

						e.getEmpId(), 
						e.getEmpName(),
						e.getDepartmentTitle(),
						e.getJobName(),
						e.getSalary(),
						e.getPhone(), 
						e.getEmail());

			}
		} catch (SQLException e) {
			System.out.println("[재직중인 사원 전체 조회 중 예외 발생]");
			e.printStackTrace();
		}

	}

	/**
	 * 퇴사한 사원 전체 조회
	 * 
	 */
	private void selectOutEntry() {
		System.out.println("----------[퇴사한 사원 전체 조회]------------");

		try {
			List<Emp> empList = service.selectOutEntry();
			if (empList.isEmpty()) {
				System.out.println("[조회 실패]");
				return;
			}
			for (Emp e : empList) {
				System.out.printf("%d / %s /%s /%s /%s \n", e.getEmpId(), e.getEmpName(), e.getPhone(), e.getEmail(),
						e.getEntDate());

			}

		} catch (SQLException e) {
			System.out.println("[퇴사한 사원 전체 조회 중 예외 발생]");
			e.printStackTrace();
		}
	}

	/**
	 * 사번을 입력 받아 사번이 일치하는 사원 정보 조회
	 * 
	 */
	private void selectOne() {
		System.out.println("\n---------[사번이 일치하는 사원 조회] --------------\n");
		System.out.printf("조회할 사번 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();

		try {
			Emp emp = service.selectOne(input);

			if (emp == null) {
				System.out.println("[사번이 일치하는 사원이 없습니다]");
				return;
			}
			System.out.printf("%d / %s / %s / %s / %d / %s / %s / %s / %s \n", emp.getEmpId(), emp.getEmpName(),
					emp.getDepartmentTitle(), emp.getJobName(), emp.getSalary(), emp.getPhone(), emp.getEmail(),
					emp.getHireDate(), emp.getEntYN());

		} catch (SQLException e) {
			System.out.println("[사번이 일치하는 사원 조회 중 예외 발생]");
			e.printStackTrace();
		}

	}

	/**
	 * 사원 정보 추가(insert)
	 * 
	 */
	private void insert() {
		System.out.println("---------[사원 정보 추가]----------");

		System.out.print("이름 : ");
		String empName = sc.next();

		System.out.print("주민등록번호 : ");
		String empNo = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.print("전화번호(-제외) : ");
		String phone = sc.next();

		System.out.print("부서코드(D1~D9) : ");
		String deptCode = sc.next();

		System.out.print("직급코드(J1~J7) : ");
		String jobCode = sc.next();

		System.out.print("급여등급(S1~S6) : ");
		String salLevel = sc.next();

		System.out.print("급여 : ");
		int salary = sc.nextInt();

		System.out.print("보너스 : ");
		double bonus = sc.nextDouble();

		System.out.print("사수번호 : ");
		int managerId = sc.nextInt();

		sc.nextLine();

		Emp emp = new Emp(empName, empNo, email, phone, deptCode, jobCode, salLevel, salary, bonus, managerId);

		try {
			int result = service.insert(emp);

			if (result > 0) {
				System.out.println("[삽입 성공]");
			} else {
				System.out.println("[삽입 실패]");
			}

		} catch (SQLException e) {
			System.out.println("[사원 정보 추가 중 예외 발생]");
			e.printStackTrace();
		}

	}

	/** 사번으로 사원 정보 수정
	* 
	*/
	private void update() {
		System.out.println("-------[사번으로 사원 정보 수정]---------");
		
		
		
		
		System.out.print("사번 입력 : ");
		int empId = sc.nextInt();
        
		System.out.print("이메일 : ");
        String email = sc.next();
        
        System.out.print("핸드폰 번호 : ");
        String phone = sc.next();
        
        System.out.print("급여 : ");
        int salary = sc.nextInt();
        
        System.out.print("보너스 : ");
        double bonus = sc.nextDouble();
        sc.nextLine();
        
        Emp emp = new Emp(empId,email,phone,salary,bonus);
        
		try {
		int result = service.update(emp);
		
		if(result > 0 ) {System.out.println("[수정 성공]");}
		else {System.out.println("[수정 실패]");}
		
		} catch (SQLException e) {
       System.out.println("[사번으로 사원 정보 수정 중 예외 발생]");
			e.printStackTrace();
		}
		
	}
	
     /** 사번으로 사원 삭제
     * 
     */
    private void delete() {
    	 System.out.println("------[사번으로 사원 삭제]---------");
    	 
    	 System.out.print("사번 입력 : ");
    	 int input = sc.nextInt();
    	 sc.nextLine();
    	 
    	 try {
			int result = service.delete(input);
			
			if(result > 0 ) System.out.println("[삭제 성공]");
			else System.out.println("[삭제 실패]");
			
			
		} catch (SQLException e) {
            System.out.println("[사번으로 사원 삭제 중 예외 발생]");
			e.printStackTrace();
		}
    	 
     }
    /** 사번이 일치하는 사원 퇴직 처리
     * 
     */
    private void updateEntry() {
    	System.out.println("-----------[사번이 일치하는 사원 퇴직 처리]-------------");
    	
    	System.out.print("퇴직처리 할 사원 사번 입력 : ");
    	int input = sc.nextInt();
    	
    	
    	try {
    		int check1 = service.checkEmployee(input);
    		
    		if(check1 == 0 ) {System.out.println(" [사번이 일치하는 사원이 존재하지 않습니다]");
    		                return;
    		} 
    		
    		if(check1 == 1) {
    			System.out.println("[이미 퇴직 처리된 사원입니다]");
    			return;
    		}
    		
    		System.out.print("정말 퇴직처리 하시겠습니까? (Y/N) : ");
    		char check = sc.next().toLowerCase().charAt(0);
    		
    		if(check == 'n') {
    			System.out.println("[취소되었습니다]");
    		}
    		if(check != 'y') {
    			System.out.println("[잘못 입력하셨습니다]");
    			return;
    		}
            // 'y'인 경우 서비스 호출
    		int result = service.updateEntry(input);
			// -> 앞서서 사번에 대한 검증이 끝난 상황
    		// -> 사번이 없어서 수정이 실패하는 경우는 생각할 필요 없음
    		
    		// -> 퇴직 서비스는 성공 또는 예외만 존재
    		// -> 반환 값이 따로 필요 없음
    		
    		
			if(result > 0) System.out.println("[퇴직 처리가 완료되었습니다]");
			
		} catch (SQLException e) {
               System.out.println("[사번이 일치하는 사원 퇴직 처리 중 예외발생]");
			e.printStackTrace();
		}
    	
    }
    /** 부서별 통계 조회
     * 
     */
    private void selectDepartment() {
    	System.out.println("\n-----------[부서별 통계 조회]------------\n");
    	
    	// DTO가 없을 때 Map을 사용하는 이유
    	// 1. DTO를 작성하는게 코드 낭비인 경우 
    	// 2. DTO와 Map의 구조가 유사하기 때문에
    	
    	// tip : DTO의 필드를 Map의 Key 라고 생각
    	
//    	Map<String, Object> map = new HashMap<>();
//    	map.put("empId", 200);
//    	map.put("empName", "고길동");
//    	
//    	map.get("empId");
//    	map.get("empName");
//    	
//    	
//    	//다량의 객체 저장
//    	List<Emp> empList;
//    	
//    	List<Map<String, Object>> mapList;
    	
    	//서비스 호출
       try {
		List<Map<String,Object>> mapList = service.selectDepartment();
		
		for(Map<String, Object> map : mapList) {
			
//			System.out.printf("%s / %d / %d \n",
//					map.get("deptTitle"),
//					map.get("count"),
//					map.get("avg")); 
			
			Set<String> set = map.keySet(); // Map에서 key만 얻어와 반환
			
			for(String key : set) {
				System.out.print(map.get(key)+"  ");
				
			}
			System.out.println();// 줄바꿈
			
			
		}
		
	} catch (SQLException e) {
        System.out.println("[부서별 통계 조회 중 예외 발생]");
		e.printStackTrace();
	}
       
    	
    	
    }
}
