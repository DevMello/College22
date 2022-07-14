/* Type of SQL : SQL Server */
CREATE TABLE ASSIGNMENT (
                            ASSIGN_NUM int,
                            ASSIGN_DATE datetime,
                            PROJ_NUM varchar(3),
                            EMP_NUM varchar(3),
                            ASSIGN_JOB varchar(3),
                            ASSIGN_CHG_HR float(8),
                            ASSIGN_HOURS float(8),
                            ASSIGN_CHARGE float(8)
);
INSERT INTO ASSIGNMENT
VALUES('1001','3/22/2014','18','103','503','84.5','3.5','295.75');
INSERT INTO ASSIGNMENT
VALUES('1002','3/22/2014','22','117','509','34.55','4.2','145.11');
INSERT INTO ASSIGNMENT
VALUES('1003','3/22/2014','18','117','509','34.55','2','69.10');
INSERT INTO ASSIGNMENT
VALUES('1004','3/22/2014','18','103','503','84.5','5.9','498.55');
INSERT INTO ASSIGNMENT
VALUES('1005','3/22/2014','25','108','501','96.75','2.2','212.85');
INSERT INTO ASSIGNMENT
VALUES('1006','3/22/2014','22','104','501','96.75','4.2','406.35');
INSERT INTO ASSIGNMENT
VALUES('1007','3/22/2014','25','113','508','50.75','3.8','192.85');
INSERT INTO ASSIGNMENT
VALUES('1008','3/22/2014','18','103','503','84.5','0.9','76.05');
INSERT INTO ASSIGNMENT
VALUES('1009','3/23/2014','15','115','501','96.75','5.6','541.80');
INSERT INTO ASSIGNMENT
VALUES('1010','3/23/2014','15','117','509','34.55','2.4','82.92');
INSERT INTO ASSIGNMENT
VALUES('1011','3/23/2014','25','105','502','105','4.3','451.5');
INSERT INTO ASSIGNMENT
VALUES('1012','3/23/2014','18','108','501','96.75','3.4','328.95');
INSERT INTO ASSIGNMENT
VALUES('1013','3/23/2014','25','115','501','96.75','2','193.5');
INSERT INTO ASSIGNMENT
VALUES('1014','3/23/2014','22','104','501','96.75','2.8','270.9');
INSERT INTO ASSIGNMENT
VALUES('1015','3/23/2014','15','103','503','84.5','6.1','515.45');
INSERT INTO ASSIGNMENT
VALUES('1016','3/23/2014','22','105','502','105','4.7','493.5');
INSERT INTO ASSIGNMENT
VALUES('1017','3/23/2014','18','117','509','34.55','3.8','131.29');
INSERT INTO ASSIGNMENT
VALUES('1018','3/23/2014','25','117','509','34.55','2.2','76.01');
INSERT INTO ASSIGNMENT
VALUES('1019','3/24/2014','25','104','501','110.5','4.9','541.45');
INSERT INTO ASSIGNMENT
VALUES('1020','3/24/2014','15','101','502','125','3.1','387.5');
INSERT INTO ASSIGNMENT
VALUES('1021','3/24/2014','22','108','501','110.5','2.7','298.35');
INSERT INTO ASSIGNMENT
VALUES('1022','3/24/2014','22','115','501','110.5','4.9','541.45');
INSERT INTO ASSIGNMENT
VALUES('1023','3/24/2014','22','105','502','125','3.5','437.5');
INSERT INTO ASSIGNMENT
VALUES('1024','3/24/2014','15','103','503','84.5','3.3','278.85');
INSERT INTO ASSIGNMENT
VALUES('1025','3/24/2014','18','117','509','34.55','4.2','145.11');
/* -- */
CREATE TABLE EMP_1 (
                       EMP_NUM varchar(3),
                       EMP_LNAME varchar(15),
                       EMP_FNAME varchar(15),
                       EMP_INITIAL varchar(1),
                       EMP_HIREDATE datetime,
                       JOB_CODE varchar(3)
);
INSERT INTO EMP_1 VALUES('101','News','John','G','11/8/2000','502');
INSERT INTO EMP_1 VALUES('102','Senior','David','H','7/12/1989','501');
INSERT INTO EMP_1 VALUES('103','Arbough','June','E','12/1/1996','500');
INSERT INTO EMP_1 VALUES('104','Ramoras','Anne','K','11/15/1987','501');
INSERT INTO EMP_1 VALUES('105','Johnson','Alice','K','2/1/1993','502');
INSERT INTO EMP_1 VALUES('106','Smithfield','William','','6/22/2004','500');
INSERT INTO EMP_1 VALUES('107','Alonzo','Maria','D','10/10/1993','500');
INSERT INTO EMP_1 VALUES('108','Washington','Ralph','B','8/22/1991','501');
INSERT INTO EMP_1 VALUES('109','Smith','Larry','W','7/18/1997','501');
/* -- */
CREATE TABLE EMP_2 (
                       EMP_NUM varchar(3),
                       EMP_LNAME varchar(15),
                       EMP_FNAME varchar(15),
                       EMP_INITIAL varchar(1),
                       EMP_HIREDATE datetime,
                       JOB_CODE varchar(3),
                       EMP_PCT float(8),
                       PROJ_NUM varchar(2)
);
INSERT INTO EMP_2 VALUES('101','News','John','G','11/8/2000','502','5','');
INSERT INTO EMP_2 VALUES('102','Senior','David','H','7/12/1989','501','8','');
INSERT INTO EMP_2 VALUES('103','Arbough','June','E','12/1/1996','500','3.85','');
INSERT INTO EMP_2 VALUES('104','Ramoras','Anne','K','11/15/1987','501','10','');
INSERT INTO EMP_2 VALUES('105','Johnson','Alice','K','2/1/1993','502','5','');
INSERT INTO EMP_2
VALUES('106','Smithfield','William','','6/22/2004','500','6.2','');
INSERT INTO EMP_2 VALUES('107','Alonzo','Maria','D','10/10/1993','500','5.15','');
INSERT INTO EMP_2 VALUES('108','Washington','Ralph','B','8/22/1991','501','10','');
INSERT INTO EMP_2 VALUES('109','Smith','Larry','W','7/18/1997','501','2','');
/* -- */
CREATE TABLE EMP_2_MOD (
                           EMP_NUM varchar(3),
                           EMP_LNAME varchar(15),
                           EMP_FNAME varchar(15),
                           EMP_INITIAL varchar(1),
                           EMP_HIREDATE datetime,
                           JOB_CODE varchar(3),
                           EMP_PCT float(8),
                           PROJ_NUM varchar(2)
);
INSERT INTO EMP_2_MOD VALUES('101','News','John','G','11/8/2000','502','5','25');
INSERT INTO EMP_2_MOD VALUES('102','Senior','David','H','7/12/1989','501','8','');
INSERT INTO EMP_2_MOD
VALUES('103','Arbough','June','E','12/1/1996','500','3.85','18');
INSERT INTO EMP_2_MOD
VALUES('104','Ramoras','Anne','K','11/15/1987','501','10','');
INSERT INTO EMP_2_MOD
VALUES('105','Johnson','Alice','K','2/1/1993','502','5','25');
INSERT INTO EMP_2_MOD
VALUES('106','Smithfield','William','','6/22/2004','500','6.2','18');
INSERT INTO EMP_2_MOD
VALUES('107','Alonzo','Maria','D','10/10/1993','500','5.15','18');
INSERT INTO EMP_2_MOD
VALUES('108','Washington','Ralph','B','8/22/1991','501','10','');
INSERT INTO EMP_2_MOD VALUES('109','Smith','Larry','W','7/18/1997','501','2','');
/* -- */
CREATE TABLE EMPLOYEE (
                          EMP_NUM varchar(3),
                          EMP_LNAME varchar(15),
                          EMP_FNAME varchar(15),
                          EMP_INITIAL varchar(1),
                          EMP_HIREDATE datetime,
                          JOB_CODE varchar(3),
                          EMP_YEARS int
);
INSERT INTO EMPLOYEE VALUES('101','News','John','G','11/8/2000','502','4');
INSERT INTO EMPLOYEE VALUES('102','Senior','David','H','7/12/1989','501','15');
INSERT INTO EMPLOYEE VALUES('103','Arbough','June','E','12/1/1996','503','8');
INSERT INTO EMPLOYEE VALUES('104','Ramoras','Anne','K','11/15/1987','501','17');
INSERT INTO EMPLOYEE VALUES('105','Johnson','Alice','K','2/1/1993','502','12');
INSERT INTO EMPLOYEE VALUES('106','Smithfield','William','','6/22/2004','500','0');
INSERT INTO EMPLOYEE VALUES('107','Alonzo','Maria','D','10/10/1993','500','11');
INSERT INTO EMPLOYEE VALUES('108','Washington','Ralph','B','8/22/1991','501','13');
INSERT INTO EMPLOYEE VALUES('109','Smith','Larry','W','7/18/1997','501','7');
INSERT INTO EMPLOYEE VALUES('110','Olenko','Gerald','A','12/11/1995','505','9');
INSERT INTO EMPLOYEE VALUES('111','Wabash','Geoff','B','4/4/1991','506','14');
INSERT INTO EMPLOYEE
VALUES('112','Smithson','Darlene','M','10/23/1994','507','10');
INSERT INTO EMPLOYEE
VALUES('113','Joenbrood','Delbert','K','11/15/1996','508','8');
INSERT INTO EMPLOYEE VALUES('114','Jones','Annelise','','8/20/1993','508','11');
INSERT INTO EMPLOYEE VALUES('115','Bawangi','Travis','B','1/25/1992','501','13');
INSERT INTO EMPLOYEE VALUES('116','Pratt','Gerald','L','3/5/1997','510','8');
INSERT INTO EMPLOYEE VALUES('117','Williamson','Angie','H','6/19/1996','509','8');
INSERT INTO EMPLOYEE VALUES('118','Frommer','James','J','1/4/2005','510','0');
/* -- */
CREATE TABLE JOB (
                     JOB_CODE varchar(3),
                     JOB_DESCRIPTION varchar(25),
                     JOB_CHG_HOUR float(8),
                     JOB_LAST_UPDATE datetime
);
INSERT INTO JOB VALUES('500','Programmer','35.75','11/20/2013');
INSERT INTO JOB VALUES('501','Systems Analyst','96.75','11/20/2013');
INSERT INTO JOB VALUES('502','Database Designer','125','3/24/2014');
INSERT INTO JOB VALUES('503','Electrical Engineer','84.5','11/20/2013');
INSERT INTO JOB VALUES('504','Mechanical Engineer','67.9','11/20/2013');
INSERT INTO JOB VALUES('505','Civil Engineer','55.78','11/20/2013');
INSERT INTO JOB VALUES('506','Clerical Support','26.87','11/20/2013');
INSERT INTO JOB VALUES('507','DSS Analyst','45.95','11/20/2013');
INSERT INTO JOB VALUES('508','Applications Designer','48.1','3/24/2014');
INSERT INTO JOB VALUES('509','Bio Technician','34.55','11/20/2013');
INSERT INTO JOB VALUES('510','General Support','18.36','11/20/2013');
/* -- */
CREATE TABLE PROJECT (
                         PROJ_NUM varchar(3),
                         PROJ_NAME varchar(25),
                         PROJ_VALUE float(8),
                         PROJ_BALANCE float(8),
                         EMP_NUM varchar(3)
);
INSERT INTO PROJECT VALUES('15','Evergreen','1453500','1002350','103');
INSERT INTO PROJECT VALUES('18','Amber Wave','3500500','2110346','108');
INSERT INTO PROJECT VALUES('22','Rolling Tide','805000','500345.2','102');
INSERT INTO PROJECT VALUES('25','Starflight','2650500','2309880','107');