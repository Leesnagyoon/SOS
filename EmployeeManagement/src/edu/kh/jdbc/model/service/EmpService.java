package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

public class EmpService {

	private EmpDAO dao = new EmpDAO();

	/** 재직중인 사원 전체정보 조회 서비스
	 * @return empLIst
	 * @throws SQLException
	 */
	public List<Emp> selectEntry() throws SQLException {

		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectEntry(conn);
		
		close(conn);
		
		
		return empList;
	}

	/** 퇴사한 사원 전체정보 조회 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectOutEntry() throws SQLException{
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectOutEntry(conn);
		
		close(conn);

		
		return empList;
	}

	/** 입력 받은 사번으로 사원 조회 서비스
	 * @param input
	 * @return emp
	 * @throws SQLException
	 */
	public Emp selectOne(int input) throws SQLException{

		Connection conn = getConnection();
		
		Emp emp = dao.selectOne(conn,input);
		
		close(conn);
		 
		return emp;
	}

	/** 사원 추가 서비스
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int insert(Emp emp) throws SQLException {

		Connection conn = getConnection();
		
		int result = dao.insert(conn,emp);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 사번으로 사원 정부 수정 서비스
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int update(Emp emp)throws SQLException {
		
		Connection conn = getConnection();
		
		int result = dao.update(conn,emp);
		
		close(conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
		
	}

	/** 사번으로 사원 삭제 서비스
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int delete(int input)throws SQLException {
          
		Connection conn = getConnection();
		
		int result = dao.delete(conn,input);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/** 존재하는 사원인지 , 퇴직한 사원인지 결과를 반환하는 서비스
	 * @param input
	 * @return check ( 0 : 없는 사원 ,1 : 퇴직한 사원 , 2 : 재직중인 사원)
	 * @throws SQLException
	 */
	public int checkEmployee(int input) throws SQLException{
           
		Connection conn = getConnection();
		
		int check = dao.checkEmployee(conn,input);
		
		close(conn);
		
		return check;
	}

	/** 사번으로 사원 퇴직처리 서비스
	 * @param input
	 * @return result
	 * @throws SQLException
	 */
	public int updateEntry(int input)throws SQLException {
		
		Connection conn = getConnection();
		
		int result = dao.updateEntry(conn, input);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		
		return result;
	}

	/** 부서별 통계 조회 서비스
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Map<String,Object>> mapList = dao.selectDepartment(conn);
		
		close(conn);
		
		return mapList;
	}
}
