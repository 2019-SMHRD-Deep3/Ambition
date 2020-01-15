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

create table salary(
armyClass varchar2(10),
salary number(100),
rank varchar2(10) primary key
);
alter table salary
add constraint fk_armyClass foreign key(armyClass)
REFERENCES armyClass(armyClass);
insert into salary values('�̵',200000,'a1');
insert into salary values('�Ϻ�',300000,'a2');
insert into salary values('��',400000,'a3');
insert into salary values('����',500000,'a4');
insert into salary values('�ϻ�',1500000,'b1');
insert into salary values('�߻�',2000000,'b2');
insert into salary values('���',2500000,'b3');
insert into salary values('����',3000000,'b4');
insert into salary values('����',3000000,'b5');
insert into salary values('����',1700000,'c1');
insert into salary values('����',2200000,'c2');
insert into salary values('����',2700000,'c3');
insert into salary values('�ҷ�',3200000,'d1');
insert into salary values('�߷�',3700000,'d2');
commit;



create table army(
army_id varchar2(20) primary key,
army_name varchar2(10) not null,
army_birth varchar2(10) not null,
bloodtype varchar2(5) not null,
address varchar2(50),
MOS varchar2(10)not null,
enlist varchar2(20) not null,
discharge varchar2(20),
armyClass varchar2(10) not null,
vacation varchar2(40));

alter table army
add constraint fk_armyClass_army foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table army
add constraint fk_vacation_army foreign key(vacation)
REFERENCES vacation(vacation);
alter table army
add constraint fk_unit_army foreign key(MOS)
REFERENCES unit(MOS);

create table sous(
army_id varchar2(20) primary key,
sous_name varchar2(10) not null,
sous_birth varchar2(10) not null,
bloodtype varchar2(5) not null,
address varchar2(50),
MOS varchar2(10),
enlist varchar2(20) not null,
armyClass varchar2(10) not null,
sex number(10),
vacation varchar2(40));

alter table sous
add constraint fk_sousClass_sous foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table sous
add constraint fk_vacation_sous foreign key(vacation)
REFERENCES vacation(vacation);
alter table sous
add constraint fk_unit_sous foreign key(MOS)
REFERENCES unit(MOS);

create table officer(
army_id varchar2(20) primary key,
officer_name varchar2(10) not null,
officer_birth varchar2(10) not null,
bloodtype varchar2(5) not null,
address varchar2(50),
MOS varchar2(10),
enlist varchar2(20) not null,
armyClass varchar2(10) not null,
sex number(10),
vacation varchar2(40)
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


create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex number(10));


create table vacation (
vacation varchar2(40) primary key);
insert into vacation values('�����ް�');
insert into vacation values('������ް�');
insert into vacation values('����');
insert into vacation values('����');
insert into vacation values('�ܹ�');
commit;

