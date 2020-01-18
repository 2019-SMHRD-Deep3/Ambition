drop table army;
drop table sous;
drop table officer;
drop table unit;
drop table armyclass;
drop table vacation;
drop table salary;
drop table logininfo;
commit;

create table unit(
MOS varchar2(10) primary key
);
insert into unit values('����');
insert into unit values('����');
insert into unit values('ź��');
insert into unit values('���');
insert into unit values('�ǹ�');
commit;


create table armyClass(
armyClass varchar2(10) primary key);
insert into armyClass values('�̵');
insert into armyClass values('�Ϻ�');
insert into armyClass values('��');
insert into armyClass values('����');
insert into armyClass values('�ϻ�');
insert into armyClass values('�߻�');
insert into armyClass values('���');
insert into armyClass values('����');
insert into armyClass values('����');
insert into armyClass values('����');
insert into armyClass values('����');
insert into armyClass values('����');
insert into armyClass values('�ҷ�');
insert into armyClass values('�߷�');
commit;


create table vacation (
vacation varchar2(40) primary key);
insert into vacation values('�����ް�');
insert into vacation values('������ް�');
insert into vacation values('����');
insert into vacation values('����');
insert into vacation values('�ܹ�');
commit;

create table salary(
armyClass varchar2(10),
salary varchar2(50),
rank varchar2(10) primary key
);
alter table salary
add constraint fk_armyClass foreign key(armyClass)
REFERENCES armyClass(armyClass);
insert into salary values('�̵','200000','�̵');
insert into salary values('�Ϻ�','300000','�Ϻ�');
insert into salary values('��','400000','��');
insert into salary values('����','500000','����');
insert into salary values('�ϻ�','1500000','�ϻ�');
insert into salary values('�߻�','2000000','�߻�');
insert into salary values('���','2500000','���');
insert into salary values('����','3000000','����');
insert into salary values('����','3000000','����');
insert into salary values('����','1700000','����');
insert into salary values('����','2200000','����');
insert into salary values('����','2700000','����');
insert into salary values('�ҷ�','3200000','�ҷ�');
insert into salary values('�߷�','3700000','�߷�');
commit;



create table army(
army_id varchar2(20) primary key,
armyClass varchar2(10) not null,
MOS varchar2(10)not null,
army_name varchar2(20) not null,
army_birth varchar2(10) not null,
sex varchar2(10),
address varchar2(50),
bloodtype varchar2(5) not null,
vacation varchar2(40),
enlist varchar2(20) not null,
discharge varchar2(20),
rank varchar2(10));
alter table army
add constraint fk_armyClass_army foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table army
add constraint fk_vacation_army foreign key(vacation)
REFERENCES vacation(vacation);
alter table army
add constraint fk_unit_army foreign key(MOS)
REFERENCES unit(MOS);
alter table army
add constraint fk_salary_army foreign key(rank)
REFERENCES salary(rank);

create table sous(
army_id varchar2(20) primary key,
armyClass varchar2(10) not null,
MOS varchar2(10)not null,
army_name varchar2(20) not null,
army_birth varchar2(10) not null,
sex varchar2(10),
address varchar2(50),
bloodtype varchar2(5) not null,
vacation varchar2(40),
enlist varchar2(20) not null,
discharge varchar2(20),
rank varchar2(10)
);

alter table sous
add constraint fk_sousClass_sous foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table sous
add constraint fk_vacation_sous foreign key(vacation)
REFERENCES vacation(vacation);
alter table sous
add constraint fk_unit_sous foreign key(MOS)
REFERENCES unit(MOS);
alter table sous
add constraint fk_salary_sous foreign key(rank)
REFERENCES salary(rank);

create table officer(
army_id varchar2(20) primary key,
armyClass varchar2(10) not null,
MOS varchar2(10)not null,
army_name varchar2(20) not null,
army_birth varchar2(10) not null,
sex varchar2(10),
address varchar2(50),
bloodtype varchar2(5) not null,
vacation varchar2(40),
enlist varchar2(20) not null,
discharge varchar2(20),
rank varchar2(10)
);
alter table officer
add constraint fk_officerClass_officer foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table officer
add constraint fk_vacation_officer foreign key(vacation)
REFERENCES vacation(vacation);
alter table officer
add constraint fk_unit_officer foreign key(MOS)
REFERENCES unit(MOS);
alter table officer
add constraint fk_salary_officer foreign key(rank)
REFERENCES salary(rank);

drop table vacation_view;
create table vacation_view(
army_id varchar2(20) primary key,
armyClass varchar2(10) not null,
army_name varchar2(20) not null,
vacation varchar2(40),
vacationstart varchar2(20),
vacationfinish varchar2(20)
);
alter table vacation_view
add constraint fk_vacation_armyClass_vacation foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table vacation_view
add constraint fk_vacation_view_vacation foreign key(vacation)
REFERENCES vacation(vacation);



insert into vacation_view values ('0000000000','�Ϻ�','����','��','�����ް�','2010.01.13','2010.01.15');
select * from vacation_view;

create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex varchar2(10));







insert into army values ('0000000000','�Ϻ�','����','���ؿ�','1','��','1','A',null,'1','1','�Ϻ�');


insert into ii values ('jsdifj','siofjsdf',14984198);

update army set vacation = '?' where army_id = '?';
commit;

delete from army where army_id = '?';
delete from sous where army_id = '?';
delete from officer where army_id = '?';

select * from army where armyClass = '�Ϻ�';

update army set (armyClass,MOS,army_name,army_birth,sex,address,bloodtype,vacation,enlist,discharge,rank) = '��','ź��','������','2','��','���ֱ�����','B','������ް�','12','34','��') where army_id = '1111111111';

update army  set  armyClass='��', MOS ='ź��' , army_name = '���ؿ�', army_birth = '123', sex = '23', address = '123', bloodtype = '123', vacation = null where army_id = '1111111111';

select a.army_id, s.army_id from army a, sous s where a.army_id = s.army_id; 

select o.army_id,o.armyclass,o.MOS,o.army_name,o.army_birth,o.sex,o.address,o.bloodtype,o.vacation,o.enlist,o.discharge,s.salary from officer o, salary s where o.rank=s.rank
UNION all 
select a.army_id,a.armyclass,a.MOS,a.army_name,a.army_birth,a.sex,a.address,a.bloodtype,a.vacation,a.enlist,a.discharge,s.salary from army a, salary s where a.rank=s.rank
UNION all 
select so.army_id,so.armyclass,so.MOS,so.army_name,so.army_birth,so.sex,so.address,so.bloodtype,so.vacation,so.enlist,so.discharge,s.salary from sous so, salary s where so.rank=s.rank;










create table supply(
supply_id varchar2(20) primary key,
supply_goods varchar2(30));
insert into supply values ('01','k2');
insert into supply values ('02','combat');
insert into supply values ('03','boots');
insert into supply values ('04','socks');
insert into supply values ('05','underwear');
insert into supply values ('06','tshirt');
commit;
drop table vacation_view;
create table vacation_view(
army_id varchar2(20) primary key,
armyClass varchar2(10),
army_name varchar2(20) not null,
vacation varchar2(40)
);
alter table vacation_view
add constraint fk_vacation_armyClass_vacation foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table vacation_view
add constraint fk_vacation_view_vacation foreign key(vacation)
REFERENCES vacation(vacation);

select * from vacation_view;
