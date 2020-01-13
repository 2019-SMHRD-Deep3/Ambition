create table MemberInfo (
MEMBER_ID varchar2(20) not null,
MEMBER_NAME varchar2(40),
MEMBER_BIRTH number(20),
ARMYCLASS VARCHAR2(50),
POSTION varchar2(20),
ENLIST varchar2(40),
DISCHARGE varchar2(40)
);

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000001','전준영',200101,'이등병','수송','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000002','안인태',200102,'상병','탄약','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000003','김건목',200103,'상병','통신','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000004','최태양',200104,'일병','수송','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-11001','배민이',200105,'중위','의무','2020-01-13',null);

commit