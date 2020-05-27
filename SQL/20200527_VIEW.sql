--2020.05.27

-----------------------
--VIEW
-----------------------
-- 논리적인 가상 테이블이다. : 테이블과 같이 사용 가능하다. 약간의 제약은 있다.
-- 물리적인 테이블 기반으로 만든다. : select 서브쿼리를 이용해서 만든다.

--기본적인 문법 사항 : create (or replace) view view이름 as 서브쿼리
--자주 사용되는 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를
--출력하기 위한 SELECT문을 하나의 뷰로 정의해 봅시다. 

create view emp_view_deptno30
as
select empno, enam, deptno from emp where depotno = 30
;

select * from emp_view_deptno30;

desc user_views;
select view_name, text from user_views;

--인라인 뷰를 사용해서 입사일이 빠른 사람 5명만을 얻어오기로 합시다.
--1.view객체 생성
create or replace view emp_hir_view
as
select empno, ename, hiredate
from emp
order by hiredate asc
;
select * from emp_hir_view;
select rownum, empno, ename, hiredate from emp_hir_view;
select rownum, empno, ename, hiredate from emp order by hiredate;

--아래 문장을 보면 FROM 절 다음인 VIEW_HIRE 위치에 VIEW_HIRE를
--정의할 때 사용한 서브 쿼리문을 기술한 것뿐입니다.

-------------------------------------
--seqoence : 번호 자동 생성기
-------------------------------------

--create sequence 시퀀스이름
--start with 시작값 0 시작
--increment by 증가값 1
--maxvalue 최대값
--minvalue 최소값
--cycle | nonctcle 반복여부
--cache | noncache

--부서번호 deptno 의 sequence 생성
create sequence dept_deptno_seq01;

--next value 
select dept_deptno_seq01.nextval
from dual;

--current value
select dept_deptno_seq01.currval
from dual;

-------------------------------------
--sequance 생성
-------------------------------------
--1.basic 테이블 seq
create sequance pb_basic_idx_seq
start with 0
MINVALUE 0
;
--2.com 테이블 seq
create sequance pb_com_idx_seq
start with 0
MINVALUE 0
;
--3.univ 테이블 seq
create sequance pb_univ_idx_seq
start with 0
MINVALUE 0
;