create table MemberInfo (
MEMBER_ID varchar2(20) PRIMARY KEY,
MEMBER_NAME varchar2(40),
MEMBER_BIRTH number(20),
ARMYCLASS VARCHAR2(50),
POSTION varchar2(20),
ENLIST varchar2(40),
DISCHARGE varchar2(40),
PASSWORD varchar2(40),
PASSWORD2 varchar2(40)
);
INSERT into MEMBERINFO values('20-76000001','õ����',950101,'����','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000002','������',950102,'�̵','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000003','����',950103,'��','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000004','����ǥ',950104,'�Ϻ�','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000005','������',950105,'����','���','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000006','�輺��',950106,'��','���','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000007','��â��',950107,'�Ϻ�','���','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000008','������',950108,'�̵','���','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000009','�뵿��',950109,'����','ź��','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000010','�ڼ�ä',950110,'��','ź��','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000011','�ں���',950111,'�Ϻ�','ź��','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000012','Ȳ�ص�',950112,'�̵','ź��','2019-12-02','2020-04-29','12345','12345');

INSERT into MEMBERINFO values('20-76000013','�̺���',950113,'����','�ǹ�','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000014','������',950114,'��','�ǹ�','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000015','��Ǹ�',950115,'�Ϻ�','�ǹ�','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000016','������',950116,'�̵','�ǹ�','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000017','���ؿ�',950117,'����','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000018','���¾�',950118,'��','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000019','������',950119,'�Ϻ�','����','2019-12-02','2020-04-29','12345','12345');
INSERT into MEMBERINFO values('20-76000020','�����',950117,'�̵','����','2019-12-02','2020-04-29','12345','12345');

INSERT into MEMBERINFO values('20-7600001','�����',950120,'�߻�','����','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600002','�漼��',950121,'�߻�','���','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600003','��ȿ��',950122,'�߻�','ź��','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600004','�Ӽ���',950123,'�߻�','�ǹ�','2018-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-7600005','�Ӽ���',950124,'�߻�','����','2018-12-02',NULL,'12345','12345');

INSERT into MEMBERINFO values('20-760001','��������',850101,'����',NULL,'2008-12-02',NULL,'12345','12345');
INSERT into MEMBERINFO values('20-76001','00000',750101,'����',NULL,'2018-12-02',NULL,'12345','12345');




create table logininfo (
army_id varchar2(10) PRIMARY KEY,
Password varchar2(10),
PasswordCheck varchar2(10),
Phonenumber number(10),
sex number(10));


commit;
