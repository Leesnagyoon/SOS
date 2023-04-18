package edu.kh.jdbc.main.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;

import edu.kh.jdbc.common.Session;
import edu.kh.jdbc.main.model.dao.MainDAO;
import edu.kh.jdbc.member.model.dto.Member;

public class MainService {
	
	private MainDAO dao= new MainDAO();

	/** 로그인 서비스
	 * @param memberId
	 * @param memberPw
	 * @return member
	 * @throws Exception
	 */
	public Member login(String memberId, String memberPw)throws Exception {

		Connection conn = getConnection();
		
		Member member = dao.login(conn, memberId , memberPw);
		
		close(conn);
				
				
		return member;
	}

	/** 아이디 중복 검사 서비스
	 * @param memberId
	 * @return result
	 * @throws Exception
	 */
	public int idDuplicationCHeck(String memberId)throws Exception {

		Connection conn = getConnection();
		
		int result = dao.idDuplicationCheck(conn,memberId);
		
		close(conn);
		
		return result;
	}

	/** 회원 가입 서비스
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Member member) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.signUp(conn,member); // -> INSERT 수행 = 트랜잭션 수행해야한다
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
		close(conn);
		
		
		
		return result;
	}

}
