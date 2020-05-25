---2020.05.25

-----------------------------------------------
--DDL
-----------------------------------------------

--테이블 생성
--create table 테이블의 이름() <- 괄호 안에 칼럼을 정의
--(칼럼명 타입(사이즈) , 칼럼명2 타입(사이즈), ...)

--ddl_test 라는 이름의 테이블을 생성
--칼럼1 : no, 숫자타입, 사이즈는 3
--칼럼2 : name, 가변 문자열 저장, 사이즈 10
--칼럼3 : birth, 날짜 타입, 기본값은 현재 날짜 시간

create table ddl_test (
    no number(3),
    name varchar2(10),
    birth date default sysdate
);

desc ddl_test;
select * from tab;

insert into ddl_test (no, name) values(1,'scott');

--emp 테이블 참조
--사원번호, 사원이름, 급여 3개의 칼럼으로 구성된
--emp01테이블을 생성 해 봅시다.
desc emp;

create table emp01(
    empno number(4), --정수 4자리
    ename varchar2(10),
    sal number(7,2)
);
-- 테이블의 복사 : 서브 쿼리 이용 -> 스키마 복사, 행 복사, 제약조건의 복사는 되지 않는다.

create table emp02
as
select * from emp
;

select * from tab;
desc emp02;
select * from emp02;

--emp 테이블의 empno와 ename 컬러만 복사해서 
--새로운 테이블 emp03을 생성하자
create table emp03
as
select empno, ename from emp
;
select * from emp03;
desc emp03;

--emp 테이블의 10번 부서의 데이터만 복사해서
--새로운 테이블 emp04을 생성하자.
create table emp04
as
select * from emp where deptno =10
;
select * from emp04;

--emp 테이블의 스키마 구조만 복사해서 새로운 테이블 emp05 생성하자
create table emp05
as
select * from emp where 1<0
;

select * from emp05;

--테이블에 칼럼 추가
--alter table 테이블 이름 add(칼럼정의)

--emp01 테이블에 직급(job) 칼럼을 추가하자
desc emp01;

alter table emp01 add(job varchar2(10));

--칼럼의 변경
--alter table modify(칼럼 정의)
--직급(job) 칼럼을 최대 30글자까지 저장 할 수 있게 변경 해 보도록 하자.
alter table emp01 modify (job varchar(10) not null);
desc emp01;

--칼럼의 삭제
--alter table 테이블 이름 drop colum 칼럼이름
drop table emp01;

select * from tab;
desc emp01;

TRUNCATE table emp02;
select * from emp02;

--테이블 이름의 변경
--rename 현재 테이블 이름 to 새로운 테이블 이름

rename emp02 to test_emp;
select * from tab;



desc dept;
insert into dept values(10, 'test', 'seoul');


--칼럼의 제약 정의는 칼럼 정의를 하면서 칼럼 옆에 정의
--칼럼의 타입을 모두 정의하고, 아래에 제약을 정의하는 방법

--create table emp01 (
--empno number(4), not null,
--)
--create table emp01 (
--    empno number(4),
--    primary key(empno)
--)


-- not null 제약 : 칼럼의 값에 null값을 허용하지 않는다.
-- 칼럼 레벨에서만 정의가 가능

-- 사원 테이블(ENP02)을
-- 사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성하되
-- 이번에는 사원번호와 사원명에 NOT NULL조건을 지정하도록 합시다.
drop table emp02;

create table emp02(
    empno number(4) not null,
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2)
);
desc emp02;

insert into emp02 values (null, null, 'MANAGER', 10);
insert into emp02 values (1111, null, 'MANAGER', 10);
insert into emp02 values (1111, 'SON', 'MANAGER', 10);
select * from emp02;

drop table emp03;

create table emp03(
    empno number(4) unique,
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2)
);
desc dept03;
insert into emp03 values (1111, 'test', 'manager', 10);
insert into emp03 values (1111, 'test123', 'manager', 20);
insert into emp03 values (null, 'test123', 'manager', 20);
select * from emp03;IUH


