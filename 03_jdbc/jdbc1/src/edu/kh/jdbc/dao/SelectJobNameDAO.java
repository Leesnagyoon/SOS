package edu.kh.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.dto.Employee2;

public class SelectJobNameDAO {
    //select() 메서드 작성
	public List<Employee2> select(String deptTitle) {
		
		List<Employee2> empList2 = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type = "jdbc:oracle:thin:@";
			String ip = "localhost";
			String port = ":1521";
			String dbName = ":ORCL";
			String user = "kh_lsyun";
			String pw = "oracle_lsyun0714";
			
			conn = DriverManager.getConnection(type+ip+port+dbName, user, pw);
			
			
			//SQL 작성
			String sql = "SELECT NVL(DEPT_TITLE,'부서없음'),JOB_NAME,EMP_NAME,EMAIL "
					+ "FROM EMPLOYEE E "
					+ "JOIN JOB J ON(J.JOB_CODE = E.JOB_CODE) "
					+ "LEFT JOIN DEPARTMENT D ON (E.DEPT_CODE=D.DEPT_ID) "
					+ "WHERE JOB_NAME = '"+deptTitle +"'"
					+ " ORDER BY EMP_NAME";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String title = rs.getString(1);
				String jobName = rs.getString(2);
				String empName = rs.getString(3);
				String email = rs.getString(4);
				
				Employee2 emp1 = new Employee2(title, jobName, empName, email);
				
				empList2.add(emp1);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close(); 
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return empList2;
	}
}
