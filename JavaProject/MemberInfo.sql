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
values ('20-76000001','���ؿ�',200101,'�̵','����','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000002','������',200102,'��','ź��','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000003','��Ǹ�',200103,'��','���','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-76000004','���¾�',200104,'�Ϻ�','����','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,ARMYCLASS,postion,enlist,discharge)
values ('20-11001','�����',200105,'����','�ǹ�','2020-01-13',null);

commit