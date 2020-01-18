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
insert into unit values('수송');
insert into unit values('작전');
insert into unit values('탄약');
insert into unit values('통신');
insert into unit values('의무');
commit;


create table armyClass(
armyClass varchar2(10) primary key);
insert into armyClass values('이등병');
insert into armyClass values('일병');
insert into armyClass values('상병');
insert into armyClass values('병장');
insert into armyClass values('하사');
insert into armyClass values('중사');
insert into armyClass values('상사');
insert into armyClass values('준위');
insert into armyClass values('원사');
insert into armyClass values('소위');
insert into armyClass values('중위');
insert into armyClass values('대위');
insert into armyClass values('소령');
insert into armyClass values('중령');
commit;


create table vacation (
vacation varchar2(40) primary key);
insert into vacation values('공식휴가');
insert into vacation values('비공식휴가');
insert into vacation values('병가');
insert into vacation values('외출');
insert into vacation values('외박');
commit;

create table salary(
armyClass varchar2(10),
salary varchar2(50),
rank varchar2(10) primary key
);
alter table salary
add constraint fk_armyClass foreign key(armyClass)
REFERENCES armyClass(armyClass);
insert into salary values('이등병','200000','이등병');
insert into salary values('일병','300000','일병');
insert into salary values('상병','400000','상병');
insert into salary values('병장','500000','병장');
insert into salary values('하사','1500000','하사');
insert into salary values('중사','2000000','중사');
insert into salary values('상사','2500000','상사');
insert into salary values('준위','3000000','준위');
insert into salary values('원사','3000000','원사');
insert into salary values('소위','1700000','소위');
insert into salary values('중위','2200000','중위');
insert into salary values('대위','2700000','대위');
insert into salary values('소령','3200000','소령');
insert into salary values('중령','3700000','중령');
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



insert into vacation_view values ('0000000000','일병','수송','전','공식휴가','2010.01.13','2010.01.15');
select * from vacation_view;

create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex varchar2(10));







insert into army values ('0000000000','일병','수송','전준영','1','남','1','A',null,'1','1','일병');


insert into ii values ('jsdifj','siofjsdf',14984198);

update army set vacation = '?' where army_id = '?';
commit;

delete from army where army_id = '?';
delete from sous where army_id = '?';
delete from officer where army_id = '?';

select * from army where armyClass = '일병';

update army set (armyClass,MOS,army_name,army_birth,sex,address,bloodtype,vacation,enlist,discharge,rank) = '상병','탄약','전지수','2','여','광주광역시','B','비공식휴가','12','34','상병') where army_id = '1111111111';

update army  set  armyClass='상병', MOS ='탄약' , army_name = '전준영', army_birth = '123', sex = '23', address = '123', bloodtype = '123', vacation = null where army_id = '1111111111';

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
