package edu.kh.jdbc.member.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.member.model.dto.Member;

public class MemberDAO {

	// JDBC 객체 참조 변수
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//xml에 작성된 SQL을 읽어와 저장할 객체 참조 변수
	private Properties prop;
	
	public MemberDAO() { // 기본 생성자로 객체 생성 시 XML 읽어오기	
		try {
			prop = new Properties();
			
			prop.loadFromXML(new FileInputStream("member-sql.xml"));
			
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}

	/** xml에 작성된 SQL을 읽어와 memberList에 담아서 반환
	 * @param conn
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectMemberList(Connection conn) throws Exception{

		List<Member> memberList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectMemberList");
			
	        stmt = conn.createStatement();
	        rs = stmt.executeQuery(sql);
	        
	        while(rs.next()) {//아이디 ,이름 ,성별
	        	
	        	
	        	
	        	String memberId = rs.getString(1);
	        	String memberName = rs.getString(2);
	        	String memberGender = rs.getString(3);
	        	
	        	Member mem = new Member();
	        	
	        	mem.setMemberId(memberId);
	        	mem.setMemberName(memberName);
	        	mem.setMemberGender(memberGender);
	        	
	        	memberList.add(mem);
	        	
	        	
	        	
	        }
			
		} finally {
			close(rs);
			close(stmt);

		}
		
		return memberList;
	}

	/**
	 * @param conn
	 * @param memberName
	 * @param memberGender
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int updateMember(Connection conn, String memberName, String memberGender, int memberNo) throws Exception {
		
		int result = 0;
		
		try {
		
			String sql = prop.getProperty("updateMember");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberName);
			pstmt.setString(2, memberGender);
			pstmt.setInt(3, memberNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
 
			close(pstmt);
		}
		
		
		
		return result;
	}

	/**
	 * @param conn
	 * @param newPw
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int updatePassword(Connection conn,String pw, String newPw, int memberNo)throws Exception {

		int result = 0;
		
		try {
		
			String sql = prop.getProperty("updatePassword");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,newPw );
			pstmt.setInt(2,memberNo );
			pstmt.setString(3, pw);
			
			result = pstmt.executeUpdate();
			
		} finally {
          close(pstmt);
		}
		
		return result;
	}

	/** 회원 탈퇴 SQL 수행 후 결과 반환
	 * @param conn
	 * @param memberPw
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int unRegisterMember(Connection conn, String memberPw, int memberNo)throws Exception {
  
		int result = 0;
		
		try {
			String sql = prop.getProperty("deleteMember");
			//XML 의 SQL 구문이 DELETE가 아닌 이유는
			//로그인의 unregisterflag의 정보가 Y가 되면 표면적으로는 탈퇴가 된다
			//데이터는 가치가 있기때문에 삭제하지 않는다
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberPw);
			pstmt.setInt(2, memberNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			
			close(pstmt);

		}
		
		
		return result;
	}
}
