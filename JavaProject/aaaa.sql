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




insert into officer values ('101111','�߷�','ź��','���ؼ�','600514','����','���ֱ�����','O',null,'80.04.25',null,'�߷�');
insert into officer values ('110871','�ҷ�','ź��','�赿��','710703','����','���ֱ�����','B',null,'85.08.11',null,'�ҷ�');
insert into officer values ('111254','����','ź��','Ȳ�ص�','910624','����','���ֱ�����','A',null,'11.07.24',null,'����');
insert into sous values ('12147412','���','����','�ں���','900831','����','��õ������','B',null,'12.01.19',null,'���');
insert into army values ('121712','����','���','����','900422','����','���ֱ�����','A',null,'12.05.03',null,'����');
insert into sous values ('14760151','�߻�','����','���ؿ�','940314','����','�������ﱺ','O',null,'14.01.13',null,'�߻�');
insert into officer values ('151045','����','�ǹ�','�����','950123','����','�̱�Ư����','A',null,'15.07.01',null,'����');
insert into army values ('1576009629','����','����','���¾�','940528','����','���ֱ�����','A',null,'15.02.07','16.11.08','����');
insert into army values ('1373000824','����','ź��','������','930110','����','���ֱ�����','A',null,'13.01.02','14.10.06','����');
insert into army values ('1472015549','����','����','��â��','940511','����','���ֱ�����','O',null,'14.07.22','16.04.21','����');
insert into army values ('1773060709','����','����','�ڼ�ä','960215','����','���ֱ�����','A',null,'17.12.26','19.08.30','����');
insert into army values ('1571032399','����','����','õ����','950417','����','���ֱ�����','O',null,'15.10.10','17.07.09','����');
insert into army values ('2073010133','��','ź��','������','980411','����','���ֱ�����','AB',null,'20.01.20','22.01.19','��');
insert into army values ('2076000706','�̵','�ǹ�','�����','950706','����','���ֱ�����','A',null,'20.01.18','22.01.17','�̵');
insert into army values ('2012345678','�̵','�ǹ�','������','930456','����','���ֱ�����','A',null,'20.01.17','22.01.16','�̵');
insert into army values ('2012378678','�Ϻ�','����','��ȿ��','951202','����','���ֱ�����','A',null,'20.01.05','22.01.04','�Ϻ�');
insert into army values ('1701234567','��','���','������','921213','����','���ֱ�����','A',null,'17.02.03','19.02.02','��');
insert into army values ('1701012345','�Ϻ�','���','���ٻ�','920214','����','����Ư����','B',null,'17.01.14','19.01.13','�Ϻ�');
insert into army values ('1801012345','�̵','���','������','960708','����','�λ걤����','A',null,'18.01.05','20.01.04','�̵');
commit;
