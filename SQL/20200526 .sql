--새로운 부서 정보를 입력: 행단위 입력
--insert into 테이블이름(입력하고자 하는 컬럼들) values
--입력 컬럼의 순서와 입력데이터의 순서는 같아야 한다. 
INSERT INTO dept01 (deptno , dname ,loc ) values (10, 'MARKETING', 'SEOUL');
insert into dept01 values (20 , 'DESIGN' , 'PUSAN');
desc dept01;

create table dept02 (
deptno number (2) not null,
dname varchar2(20) noT null,
loc varchar2(20) default 'SEOUL'
);

INSERT INTO dept02 (deptno , dname ,loc ) values (10, 'MARKETING', 'SEOUL')
INSERT INTO dept02 (deptno , dname ) values (40,'DEV');

--NULL 값의 입력
INSERT INTO dept02 (deptno , dname ,loc ) values (20, 'MARKETING', NULL);
INSERT INTO dept02 (deptno , dname ,loc ) values (20, 'MARKETING', '');


SELECT * FROM dept02;   

desc dept02;

insert into dept02 (deptno, dname, loc) VALUES (60, 'test', 'locTest');