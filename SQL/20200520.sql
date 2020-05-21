--2020.05.20

--------------------------------------------------
--함수
--------------------------------------------------
--숫자함수

select mod(10,2)
from dual;

--샐러리의 절대값 / 특정 칼럼에 있는 데이터를 절대값으로 표현 
select abs(sal)
from emp;

--소수점 몇 째자리까지 표현
select trunc(1282.238273, -2)
from dual;

select round(1987463.141592, -2)
from dual;

select sysdate
from dual;

--TO CHAR
--date -> varchar2
select sysdate, to_char(sysdate, 'YYYY.MM.DD')
from dual;

select ename, hiredate, to_char(hiredate, 'YYYY.MM.DD') as hiredate
from emp;

--2020.05.20. 11:26
--2020.05.20. 11:39
select to_char(sysdate, 'YYYY.MM.DD. HH24:MI')
from dual;

--숫자 자리수 만들어주기
--to_char
--number -> varchar2
select to_char(12500, '999,999')
from dual;

select to_char(12500, '9,999')
from dual; --오류

select to_char(12500, 'L999,999')
from dual; --원화표시

select to_char(12500, '0,000,000')
from dual; --자리 수 맞춰주기

select to_char(3.14, '000,000.000')
from dual;

select sal, to_char(sal*1000, 'L999,999,999'),
to_char(sal*1000*12+nvl(comm,0),'L999,999,999') as Income
from emp
order by income desc;

--TO_DATE
--TO_DATE(원본, 패턴)
--str -> date

select to_date('19810220', 'YYYYMMDD')
from dual;

select ename, hiredate
from emp
where hiredate = TO_DATE('1981/02/20', 'YYYY/MM/DD')
;

select sysdate, to_DATE('20201225', 'YYYYMMDD'),
trunc(to_date('20201225', 'YYYYMMDD')-sysdate)
from dual;

select sysdate, trunc(sysdate-to_date('19980127', 'YYYYMMDD'))
from dual;

--TO_NUMBER
--TO_NUMBER(원본, '패턴')
--str -> number : 산술, 관계 연산을 목적으로 변환

select to_number('20,000', '999,999,999')-to_number('9,000', '999,999')
from dual;

--DECODE 함수 : if switch 구문과 유사
select ename, deptno, 
decode(deptno, 
            10, 'ACCOUNTING',
            20, 'RESEARCH',
            30, 'SALES',
            40, 'OPERATING'
)AS deptName
from emp;

--직급에 따라 급여를 인상하도록 하자. 
--직급이 'ANAlYST'인 사원은 5%,
--'SALESMAN'인 사원은 10%, '
--'MANAGER'인 사원은 15%, 
--'CLERK'인사원은 20%인 인상한다.

select ename, sal, 
decode(job,
        'ANAlYST', sal+sal*0.05, --sal*1.05 = 5%인상
        'SALESMAN', sal+sal*0.1, --sal*1.1 = 10%인상
        'MANAGER', sal+sal*0.15, --sal*1.15 = 15%인상
        'CLERK', sal+sal*0.2 --sal*1.2= 20%인상
)AS UPSAL
from emp;

select ename, deptno,
case
    when deptno=10 then 'ACCOUNTING'
    when deptno=20 then 'RESEARCH'
    when deptno=30 then 'SALES'
    when deptno=40 then 'OPERATING'
    else 'no name'
end as deptName

from emp;

----------------------------------------------
--그룹함수 (집합함수)
----------------------------------------------
--sum,avg,count,max,min

--sum(칼럼이름) : 해당 칼럼의 데이터들의 합 반환
-- 매원 지급되는 급여의 총 합
select to_char (sum(sal),  '999,999') as totalSal
from emp; 

select sum(comm)
from emp;

-- avg(칼럼명) : 해당 칼럼의 데이터들의 평균값을 반환
select avg(sal) 
from emp;

select 29025/14 from dual;

select sum(comm) from emp;

select avg(comm)
from emp;

select * from emp order by comm;



--MAX, MIN : 해당 칼럼의 데이터 중에서 최대값, 최소값을 반환
select max(sal), min(sal), max(comm), min(comm)
from emp;


--count(칼럼명 or *) : 행(row)의 개수를 반환
select count(*)
from emp;

select count (comm) --null을 포함하는 행은 개수로 포함하지 않는다.
from emp;

select count(job)
from emp;

select job from emp order by job;

select count(distinct job) from emp order 

-- group by : select 컬럼명, 그룹함수 from 테이블명 where 조건 group by 컬럼명
select job, count(job) from emp group by job order by count(job) desc;

-- group by 절 : 특정 칼럼으로 그룹핑을 해 준다.

select deptno
from emp
group by deptno
;

select job
from emp
group by job
;

--소속 부서별
-- 평균 급여 구하는 예제입니다.
select deptno, round(avg(sal), 2)
from emp
group by deptno
;

--소속부서별
--최대 급여와 최소 급여를 구하자
select deptno, max(sal), min(sal)
from emp
group by deptno
;

--부서별로
--사원 수와 커미션을 받는 사원들의 수를 계산하자
select deptno, count(*), count(comm)
from emp
where comm <> 0
group by deptno
;

--부서별
--평균급여가 2000 이상인 (HAVING)
--부서번호와 부서별 평균 급여를 풀력
select deptno, avg(sal), count(*), count(comm), sum(comm)
from emp
group by deptno
having avg(sal)<=2000
;


-- 직급별, 지표 출력      -- 한글로 표현하는건 큰 따옴표
select job, count(*) as "직급별 인원",
            sum(sal) as "직급별 월 총 급여",
            trunc(avg(sal)) as "직급별 월 평균 급여",
            nvl(sum(comm), 0) as "부서별 수령 커미션의 총 합",
            max(sal) as "직급별 최고 급여 금액"
from emp
group by job
--having count(*)>=2     -- 직급의 인원이 2명 이상인 직급
having avg(sal)>=2000 and count(*)>1
;

select deptno--, job
from emp
group by deptno--, job
order by deptno
;