drop table army;
drop table sous;
drop table officer;
drop table unit;
drop table armyclass;
drop table vacation;
drop table salary;
drop table logininfo;
drop table vacation_view;
drop table vacation_view2;
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

drop table vacation_view2;
create table vacation_view2(
army_id varchar2(20) primary key,
armyClass varchar2(10) not null,
army_name varchar2(20) not null,
vacation varchar2(40),
vacationstart date,
vacationfinish date
);
alter table vacation_view2
add constraint fk_vacation2_vacation foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table vacation_view2
add constraint fk_vacation2_vacationv foreign key(vacation)
REFERENCES vacation(vacation);


create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex varchar2(10));




insert into officer values ('101111','중령','탄약','차준섭','600514','남자','광주광역시','O',null,'80.04.25',null,'중령');
insert into officer values ('110871','소령','탄약','김동원','710703','남자','광주광역시','B',null,'85.08.11',null,'소령');
insert into officer values ('111254','대위','탄약','황해도','910624','남자','광주광역시','A',null,'11.07.24',null,'대위');
insert into sous values ('12147412','상사','작전','박병관','900831','남자','인천광역시','B',null,'12.01.19',null,'상사');
insert into army values ('121712','소위','통신','장진','900422','남자','광주광역시','A',null,'12.05.03',null,'소위');
insert into sous values ('14760151','중사','수송','전준영','940314','남자','전남고흥군','O',null,'14.01.13',null,'중사');
insert into officer values ('151045','중위','의무','배민이','950123','여자','미국특별시','A',null,'15.07.01',null,'중위');
insert into army values ('1576009629','병장','수송','최태양','940528','남자','광주광역시','A',null,'15.02.07','16.11.08','병장');
insert into army values ('1373000824','병장','탄약','안인태','930110','남자','광주광역시','A',null,'13.01.02','14.10.06','병장');
insert into army values ('1472015549','병장','수송','곽창혁','940511','남자','광주광역시','O',null,'14.07.22','16.04.21','병장');
insert into army values ('1773060709','병장','작전','박석채','960215','남자','광주광역시','A',null,'17.12.26','19.08.30','병장');
insert into army values ('1571032399','병장','작전','천승현','950417','남자','광주광역시','O',null,'15.10.10','17.07.09','병장');
insert into army values ('2073010133','상병','탄약','오원일','980411','남자','광주광역시','AB',null,'20.01.20','22.01.19','상병');
insert into army values ('2076000706','이등병','의무','김민지','950706','여자','광주광역시','A',null,'20.01.18','22.01.17','이등병');
insert into army values ('2012345678','이등병','의무','김희조','930456','여자','광주광역시','A',null,'20.01.17','22.01.16','이등병');
insert into army values ('2012378678','일병','수송','김효진','951202','여자','광주광역시','A',null,'20.01.05','22.01.04','일병');
insert into army values ('1701234567','상병','통신','가나다','921213','남자','광주광역시','A',null,'17.02.03','19.02.02','상병');
insert into army values ('1701012345','일병','통신','마바사','920214','남자','서울특별시','B',null,'17.01.14','19.01.13','일병');
insert into army values ('1801012345','이등병','통신','아자차','960708','남자','부산광역시','A',null,'18.01.05','20.01.04','이등병');
commit;
