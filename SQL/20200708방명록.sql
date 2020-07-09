create table guestbook_message(
    message_id number(4) PRIMARY KEY,
    guest_name VARCHAR2(50)not null,
    password varchar(10) not null,
    message VARCHAR2(2000) not null
);


CREATE SEQUENCE message_id_seq INCREMENT by 1 START WITH 1;


INSERT into guestbook_message VALUES(message_id_seq.nextVal,'테스터10','1111','글쓰기 테스트');


select * from guestbook_message; 

COMMIT; 