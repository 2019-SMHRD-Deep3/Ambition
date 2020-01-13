create table MemberInfo (
MEMBER_ID varchar2(20) not null,
MEMBER_NAME varchar2(40),
MEMBER_BIRTH number(20),
CLASS VARCHAR2(50),
POSTION varchar2(20),
ENLIST varchar2(40),
DISCHARGE varchar2(40)
);

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000001','전준영',27,'이등병','수송','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000002','안인태',28,'상병','탄약','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000003','김건목',28,'상병','통신','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000004','최태양',27,'일병','수송','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-11001','배민이',26,'중위','의무','2020-01-13',null);

