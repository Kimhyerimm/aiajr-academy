SELECT * FROM project.member;


SELECT `member`.`idx`,
    `member`.`uid`,
     `member`.`upw`,
     `member`.`uname`,
     `member`.`uphoto`,
     `member`.`regdate`
FROM `project`.`member`;
INSERT INTO project.member
(
uid,
upw,
uname,
uphoto
)
VALUES
(
'cool',
'1111',
'COOL',
null
);



UPDATE `project`.`member`
SET
`idx` = 1,
`uid` = 'james123',
`upw` = '123123',
`uname` = 'james',
`uphoto` = <{uphoto: }>,
`regdate` = <{regdate: CURRENT_TIMESTAMP}>
WHERE `idx` = <{expr}>;
