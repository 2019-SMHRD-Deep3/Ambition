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
values ('20-76000001','���ؿ�',27,'�̵','����','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000002','������',28,'��','ź��','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000003','��Ǹ�',28,'��','���','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-76000004','���¾�',27,'�Ϻ�','����','2020-01-13','2020-04-29');

insert into MemberInfo (member_id,member_name,member_birth,class,postion,enlist,discharge)
values ('20-11001','�����',26,'����','�ǹ�','2020-01-13',null);

