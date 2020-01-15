create table MemberInfo (
MEMBER_ID varchar2(20) PRIMARY KEY,
MEMBER_NAME varchar2(40),
MEMBER_BIRTH number(20),
ARMYCLASS VARCHAR2(50),
POSTION varchar2(20),
ENLIST varchar2(40),
DISCHARGE varchar2(40),
PASSWORD varchar2(40),
PASSWORD2 varchar2(40)
);
INSERT into MEMBERINFO values('20-76000001','천승현',950101,'병장','수송','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000002','오원일',950102,'이등병','수송','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000003','김상민',950103,'상병','수송','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000004','이진표',950104,'일병','수송','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000005','김찬우',950105,'병장','통신','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000006','김성순',950106,'상병','통신','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000007','곽창혁',950107,'일병','통신','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000008','김준형',950108,'이등병','통신','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000009','노동경',950109,'병장','탄약','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000010','박석채',950110,'상병','탄약','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000011','박병관',950111,'일병','탄약','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000012','황해도',950112,'이등병','탄약','2019-12-02','2020-04-29','12345','12345');

INSERT into MEMBERINFO values('20-76000013','이보람',950113,'병장','의무','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000014','이윤준',950114,'상병','의무','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000015','김건목',950115,'일병','의무','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000016','안인태',950116,'이등병','의무','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000017','전준영',950117,'병장','작전','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000018','최태양',950118,'상병','작전','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000019','김희조',950119,'일병','작전','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000020','김민지',950117,'이등병','작전','2019-12-02','2020-04-29','12345','12345');

INSERT into MEMBERINFO values('20-7600001','배민이',950120,'중사','수송','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600002','방세미',950121,'중사','통신','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600003','김효진',950122,'중사','탄약','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600004','임소정',950123,'중사','의무','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600005','임수현',950124,'중사','작전','2018-12-02',NULL,'12345','12345');

INSERT into MEMBERINFO values('20-760001','ㅇㅇㅇㅇ',850101,'중위',NULL,'2008-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-76001','00000',750101,'ㅐㅐ',NULL,'2018-12-02',NULL,'12345','12345');




create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex number(10));


commit;
