

/*
 * SELECT (조회, DQL 또는 DML)
 * 
 * - 데이터를 조회하면 조건에 맞는 행들이 조회됨
 *  -> 조회된 행들의 집합을 "RESULT SET" 이라고 한다.
 * 
 * - RESULT SET은 0개 이상의 행이 포함 될 수 있다.
 *   -> 0개이상?? -> 조건에 맞는 행이 없을 수도 있기 때문에
 * 
 * 
 * [작성법]
 * 
 * SELECT 컬럼명 | * (모든 컬럼)
 * 
 * FROM 테이블명
 * WHERE 조건식; -- 조건에 맞는 행만 조회
 * 
 * 
 * */

-- EMPLOYEE 테이블에서 모든 행, 모든 컬럼을 조회
-- (WHERE 절 없음 == 모든 행을 의미)
-- '*' : ALL , 모두 , 전부 를 의미

SELECT * FROM EMPLOYEE;


SELECT EMP_NAME FROM EMPLOYEE;

SELECT EMP_ID , EMP_NAME, PHONE FROM EMPLOYEE;

--DEPARTMENT 테이블의 모든 행 , 열 조회

SELECT * FROM DEPARTMENT;

-- DEPARTMENT 테이블에서 부서명만 조회
--> 테이블 정보에서 컬럼명, COMMENT 확인
SELECT DEPT_TITLE FROM DEPARTMENT;

