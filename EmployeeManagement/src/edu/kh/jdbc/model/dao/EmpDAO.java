package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.common.JDBCTemplate;
import edu.kh.jdbc.model.dto.Emp;

public class EmpDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	/** 재직중인 사원 전체 조회
	 * @param conn
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectEntry(Connection conn) throws SQLException {

		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME , DEPT_TITLE,JOB_NAME,SALARY,PHONE ,EMAIL "
					+ "FROM EMPLOYEE E "
					+ "JOIN DEPARTMENT D ON(E.DEPT_CODE = D.DEPT_ID) "
					+ "NATURAL JOIN JOB "
					+ "WHERE ENT_YN = 'N' "
					+ "ORDER BY JOB_CODE";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int empId = rs.getInt("EMP_ID");
				String empName = rs.getString("EMP_NAME");
				String deptTitle = rs.getString("DEPT_TITLE");
				String jobName = rs.getString("JOB_NAME");
				int salary = rs.getInt("SALARY");
				String phone = rs.getString("PHONE");
				String email = rs.getString("EMAIL");
				
				
				
			empList.add(new Emp(empId,empName,deptTitle,jobName,salary,phone,email));
			
				
			}
			
			
		} finally {
			close(rs);
			close(stmt);

		}
		
		return empList;
	}


	/** 퇴직한 사원 전체 조회
	 * @param conn
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectOutEntry(Connection conn) throws SQLException{

		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, PHONE ,EMAIL ,ENT_DATE "
					+ "FROM EMPLOYEE E "
					+ "WHERE ENT_YN ='Y' "
					+ "ORDER BY ENT_DATE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String entDate = rs.getString(5);
				
				empList.add(new Emp(empId,empName,phone,email,entDate));
				
				
				
			}
			
			
		} finally {
			close(rs);
			close(stmt);
			
		}
		
		return empList;
	}


	/** 입력받은 사번으로 사원 조회 
	 * @param conn
	 * @param input
	 * @return emp
	 * @throws SQLException
	 */
	public Emp selectOne(Connection conn, int input)throws SQLException {

		Emp emp = null;
		
		try {
			String sql = "SELECT EMP_ID ,EMP_NAME ,DEPT_TITLE,JOB_NAME,SALARY ,PHONE ,EMAIL ,HIRE_DATE ,ENT_YN "
					+ "FROM EMPLOYEE E "
					+ "JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID) "
					+ "JOIN JOB USING(JOB_CODE) "
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String deptTitle = rs.getString(3);
				String jobName = rs.getString(4);
				int salary = rs.getInt(5);
				String phone = rs.getString(6);
				String email = rs.getString(7);
				Date hireDate = rs.getDate(8);
				String entYn = rs.getString(9);
				
			 emp = new Emp(empId,empName,deptTitle,jobName,salary,phone,email,hireDate,entYn);
			}
			
			
		} finally {
			close(rs);
			close(pstmt);

		}
		
		
		
		return emp;
	}


	/** 사원 정보 추가 
	 * @param conn
	 * @param emp
	 * @return int result
	 * @throws SQLException
	 */
	public int insert(Connection conn, Emp emp)throws SQLException {
		int result = 0;
		
		try {
		    String sql = "INSERT INTO EMPLOYEE"
		    		+ " VALUES(SEQ_EMP_ID.NEXTVAL,?, ?, ?, ?, ?, ?, ?, ?, ?, ? , SYSDATE , NULL , 'N')";
		    
		    pstmt = conn.prepareStatement(sql);
		    
		    pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getPhone());
			pstmt.setString(5, emp.getDeptCode());
			pstmt.setString(6, emp.getJobCode());
			pstmt.setString(7, emp.getSalLevel());
			
			pstmt.setInt(8,emp.getSalary());
			pstmt.setDouble(9, emp.getBonus());
			pstmt.setInt(10, emp.getManagerId());
			
			result = pstmt.executeUpdate();
			
			
		} finally {
               close(pstmt);
		}
		
		
		return result;
	}


	/** 사원 정보 수정 
	 * @param conn
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int update(Connection conn, Emp emp)throws SQLException {

		int result = 0;
		
		try { 
			String sql = "UPDATE EMPLOYEE "
					+ "SET EMAIL = ?, "
					+ "PHONE = ?, "
					+ "SALARY = ?, "
					+ "BONUS = ? "
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,emp.getEmail());
			pstmt.setString(2, emp.getPhone());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setDouble(4, emp.getBonus());
			pstmt.setInt(5, emp.getEmpId());
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);

		}
		return result;
	}


	/** 사번으로 사원 정보 삭제 
	 * @param conn
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int delete(Connection conn, int input)throws SQLException {

		int result = 0;
		
		try {
			String sql = "DELETE FROM EMPLOYEE "
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input);
			
			result = pstmt.executeUpdate();
			
		} finally {
             
			close(pstmt);
		}
		
		return result;
	}


	/** 사번으로 사원 퇴직처리 
	 * @param conn
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int updateEntry(Connection conn, int input) throws SQLException{
		
		int result = 0;
		
		try {
			String sql = "UPDATE EMPLOYEE "
					+ "SET ENT_YN = 'Y', "
					+ "ENT_DATE = SYSDATE "
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input);
			
			result = pstmt.executeUpdate();
			
		} finally {
             close(pstmt);
		}
		
		
		return result;
	}


	/** 존재하는 사원인지,퇴직한 사원인지 조회하는 SQL 수행 후 결과 반환
	 * @param conn
	 * @param input
	 * @return check
	 * @throws SQLException
	 */
	public int checkEmployee(Connection conn, int input) throws SQLException{

		int check = 0;
		
		try {
		 String sql = "SELECT CASE \r\n"
		 		+ "	WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = ?) = 0 "
		 		+ "	THEN  0 "
		 		+ "	WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = ? AND ENT_YN = 'Y') = 1 "
		 		+ "	THEN  1 "
		 		+ "	ELSE  2 "
		 		+ "END \"CHECK\" "
		 		+ "FROM DUAL";
		
		 pstmt = conn.prepareStatement(sql);
		 
		 pstmt.setInt(1, input);
		 pstmt.setInt(2, input);
		 
		 rs = pstmt.executeQuery();
		 
		 if(rs.next()) {
			check = rs.getInt("CHECK");
		 }
		 
		 
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return check;
	}


	/**  부서별 통계 조회 SQL 수행 후 결과 반환
	 *  @param conn
	 *  @return mapList
	 *  @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment(Connection conn) throws SQLException {

		List<Map<String,Object>> mapList = new ArrayList<>();
		
		try {
			String sql = "SELECT DEPT_CODE, NVL(DEPT_TITLE,'부서없음')DEPT_TITLE,COUNT(*)인원,FLOOR(AVG(SALARY)) 평균 "
					+ "FROM EMPLOYEE "
					+ "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID) "
					+ "GROUP BY DEPT_CODE ,DEPT_TITLE "
					+ "ORDER BY DEPT_CODE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String deptTitle = rs.getString("DEPT_TITLE");
				int count = rs.getInt("인원");
				int avg = rs.getInt("평균");
				
				Map<String,Object> map = new LinkedHashMap<>();
				
				map.put("deptTitle", deptTitle );
				map.put("count", count);
				map.put("avg", avg);
				
				//Map을 List에 추가
				mapList.add(map);
			}
			
		} finally {
			close(rs);
			close(stmt);

		}
		
		
		
		return mapList;
	}

}
