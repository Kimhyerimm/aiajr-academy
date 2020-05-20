--2020.05.20 : 마당서적 추가문제

desc book;
desc customer;
desc orders;

-- 1.마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
--(1) 도서번호가 1인 도서의 이름
select bookname 
from Book
where bookid = 1
;

--(2) 가격이 20,000원 이상인 도서의 이름
select bookname
from book
where price>=20000
;

--(3) 박지성의  총구매액(박지성의 고객번호는 1번으로 놓고 작성)


--(4) 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)





--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
--(2) 마당서점에도서를출고하는출판사의총개수
--(3) 모든고객의이름, 주소
select name, address
from customer
;

--(4) 2014년7월4일~7월7일사이에주문받은도서의주문번호
select orderid
from Orders
where orderdate between '2014-07-04' and '2014-07-07'
;

--(5) 2014년7월4일~7월7일사이에주문받은도서를제외한도서의주문번호
select orderid
from orders
where orderdate not between '2014-07-04' and '2014-07-07'
;

--(6) 성이‘김’씨인고객의이름과주소
select name, address
from customer
where name like '김%'
;

--(7) 성이‘김’씨이고이름이‘아’로끝나는고객의이름과주소
select name, address
from customer
where name like '김%아'
;