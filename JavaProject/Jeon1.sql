create table unit(
MOS varchar2(10));

alter table unit add unit_id varchar2(10);
ALTER TABLE unit
ADD CONSTRAINT PK_unit_id PRIMARY KEY(unit_id);




create table armyClass(
armyClass varchar2(10) primary key);

create table salary(
armyClass varchar2(10),
salary number(20));
alter table salary
add constraint fk_armyClass foreign key(armyClass)
REFERENCES armyClass(armyClass);
ALTER TABLE salary
ADD CONSTRAINT PK_salary PRIMARY KEY(rank);
alter table salary add(rank varchar2(10));



create table army(
army_id varchar2(20) primary key,
army_name varchar2(10) not null,
army_birth varchar2(10) not null,
bloodtype varchar2(5) not null,
address varchar2(50),
MOS varchar2(10),
salary number(20)not null,
enlist varchar2(20) not null,
discharge varchar2(20),
armyClass varchar2(10) not null);
alter table army
add constraint fk_armyClass_army foreign key(armyClass)
REFERENCES armyClass(armyClass);
alter table army add(sex varchar2(10));
commit;

create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex number(10));


commit;




