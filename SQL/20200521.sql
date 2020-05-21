--2020.05.21

-------------------------------
--JOIN
-------------------------------

select * from emp;
select * from dept;


--cross join
select * 
from emp, dept
;


-- 하나의 질의를 통해서 사원의 이름과 부서의 이름을 알 수 있게 되었다.
select ename, dname
from emp e, dept d
where e.deptno = d.deptno
;

select ename, dname
from emp em inner join dept de
on em.deptno = de. deptno
;

select ename, dname
from emp inner join dept
using(deptno)
;

--book, customer, orders
select * from orders;
select * from book;
select * from customer;

--cross join
select *
from emp,dept
;


select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and name = '박지성'
;


select * from emp;
select * from salgrade;

select ename, sal, grade
from emp e, salgrade s
--where e.sal >= s.losal and e.sal <= s.hisal
where sal between losal and hisal
;


-- 관리자의 이름을 알아보자
select * from emp;

select * --e.ename || '의 상사는 ' || m.ename || '입니다.' 
from emp e, emp m
where e.mgr = m.empno(+)
;

select e.ename, e.empno, e.sal, e.comm, nv1(m.ename, '관리자없음')
from emp e, emp m
where e.mgr = m.empno(+)
;

select *
from emp natural join dept
;

select *
from emp e left outer join emp m
on e.mgr=m.empno
;