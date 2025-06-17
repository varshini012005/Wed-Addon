
C:\Program Files\MySQL\MySQL Server 8.0\bin>mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.37 MySQL Community Server - GPL

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.00 sec)

mysql> create database kgcas;
Query OK, 1 row affected (0.05 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kgcas              |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> use kgcas;
Database changed
mysql> create table student(
    -> sname varchar(60),
    -> sno int,
    -> sdept varchar(60)
    -> );
Query OK, 0 rows affected (0.07 sec)

mysql> insert into student values('sree',23434,'bsc');
Query OK, 1 row affected (0.01 sec)

mysql> select *from student;
+-------+-------+-------+
| sname | sno   | sdept |
+-------+-------+-------+
| sree  | 23434 | bsc   |
+-------+-------+-------+
1 row in set (0.04 sec)

mysql> CREATE TABLE emp (
    ->   empno decimal(4,0) NOT NULL,
    ->   ename varchar(10) default NULL,
    ->   job varchar(9) default NULL,
    ->   mgr decimal(4,0) default NULL,
    ->   hiredate date default NULL,
    ->   sal decimal(7,2) default NULL,
    ->   comm decimal(7,2) default NULL,
    ->   deptno decimal(2,0) default NULL
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql>
mysql> DROP TABLE IF EXISTS dept;
Query OK, 0 rows affected, 1 warning (0.00 sec)

mysql>
mysql> CREATE TABLE dept (
    ->   deptno decimal(2,0) default NULL,
    ->   dname varchar(14) default NULL,
    ->   loc varchar(13) default NULL
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql>
mysql> INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');
Query OK, 1 row affected (0.01 sec)

mysql>
mysql> INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('30','SALES','CHICAGO');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');
Query OK, 1 row affected (0.01 sec)

mysql> select *from emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
14 rows in set (0.00 sec)

mysql> create table employee(
    -> empid int primary key;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 2
mysql> create table employee(
    -> empid int primary key,
    -> name varchar(50),
    -> dept int,
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 4
mysql> CREATE TABLE emp (
    ->   empno decimal(4,0) NOT NULL,
    ->   ename varchar(10) default NULL,
    ->   job varchar(9) default NULL,
    ->   mgr decimal(4,0) default NULL,
    ->   hiredate date default NULL,
    ->   sal decimal(7,2) default NULL,
    ->   comm decimal(7,2) default NULL,
    ->   deptno decimal(2,0) default NULL
    -> );
ERROR 1050 (42S01): Table 'emp' already exists
mysql>
mysql> DROP TABLE IF EXISTS dept;
Query OK, 0 rows affected (0.03 sec)

mysql>
mysql> CREATE TABLE dept (
    ->   deptno decimal(2,0) default NULL,
    ->   dname varchar(14) default NULL,
    ->   loc varchar(13) default NULL
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql>
mysql> INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');
Query OK, 1 row affected (0.00 sec)

mysql>
mysql> INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('30','SALES','CHICAGO');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');
Query OK, 1 row affected (0.04 sec)

mysql> create table employees(
    -> empid int primary key,
    -> name varchar(60),
    -> dept varchar(70),
    -> salary int,
    -> joindate date
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> desc employees;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| empid    | int         | NO   | PRI | NULL    |       |
| name     | varchar(60) | YES  |     | NULL    |       |
| dept     | varchar(70) | YES  |     | NULL    |       |
| salary   | int         | YES  |     | NULL    |       |
| joindate | date        | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
5 rows in set (0.04 sec)

mysql> inser into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,2023-06-12),
    ->  (2,'varshini','marketing',80000,2023-06-12),
    ->  (3,'puni','finance',80000,2023-06-12),
    ->  (4,'tharu','marketing',80000,2025-04-12),
    -> (5,'suseela','finance',50000,2025-03-12);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'inser into employees(empid,name,dept,salary,joindate)values
(1,'sree','managaer'' at line 1
mysql>  inser into employees(empid,name,dept,salary,joindate)values
    ->  (1,'sree','managaer',30000,2023-06-12),
    -> (2,'varshini','marketing',80000,2023-06-12),
    -> (3,'puni','finance',80000,2023-06-12),
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'inser into employees(empid,name,dept,salary,joindate)values
 (1,'sree','managaer' at line 1
mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12'),
    -> (2,'varshini','marketing',80000,'2023-06-12'),
    -> (3,'puni','finance',80000,'2023-06-12'),
    ->  (4,'tharu','marketing',80000,'2025-04-12'),
    -> (5,'suseela','finance',50000,'2025-03-12')
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 7
mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12'),
    -> (2,'varshini','marketing',80000,2023-06-12),
    ->  (3,'puni','finance',80000,2023-06-12),
    ->  (4,'tharu','marketing',80000,'2025-04-12'),
    ->  (5,'suseela','finance',50000,'2025-03-12');
ERROR 1292 (22007): Incorrect date value: '2005' for column 'joindate' at row 2
mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12')
    ->  (2,'varshini','marketing',80000,2023-06-12);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(2,'varshini','marketing',80000,2023-06-12)' at line 3
mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12');
Query OK, 1 row affected (0.01 sec)

mysql> insert into employees(empid,name,dept,salary,joindate)values
    ->  (2,'varshini','marketing',80000,2023-06-12);
ERROR 1292 (22007): Incorrect date value: '2005' for column 'joindate' at row 1
mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (2,'varshini','marketing',80000,'2023-06-12');
Query OK, 1 row affected (0.05 sec)

mysql> insert into employees(empid,name,dept,salary,joindate)values
    ->  (3,'puni','finance',80000,'2023-06-12');
Query OK, 1 row affected (0.03 sec)

mysql>  insert into employees(empid,name,dept,salary,joindate)values
    -> (4,'tharu','marketing',80000,'2025-04-12');
Query OK, 1 row affected (0.04 sec)

mysql> insert into employees(empid,name,dept,salary,joindate)values
    -> (5,'suseela','finance',50000,'2025-03-12');
Query OK, 1 row affected (0.05 sec)

mysql> select *from employees;
+-------+----------+-----------+--------+------------+
| empid | name     | dept      | salary | joindate   |
+-------+----------+-----------+--------+------------+
|     1 | sree     | managaer  |  30000 | 2023-06-12 |
|     2 | varshini | marketing |  80000 | 2023-06-12 |
|     3 | puni     | finance   |  80000 | 2023-06-12 |
|     4 | tharu    | marketing |  80000 | 2025-04-12 |
|     5 | suseela  | finance   |  50000 | 2025-03-12 |
+-------+----------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql>  select*from table where
    -> dept=marketing;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table where
dept=marketing' at line 1
mysql> select *from table where
    -> dept=marketing;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table where
dept=marketing' at line 1
mysql> select * from employees
    -> where department='marketing';
ERROR 1054 (42S22): Unknown column 'department' in 'where clause'
mysql> select * from employees where
    -> dept='marketing';
+-------+----------+-----------+--------+------------+
| empid | name     | dept      | salary | joindate   |
+-------+----------+-----------+--------+------------+
|     2 | varshini | marketing |  80000 | 2023-06-12 |
|     4 | tharu    | marketing |  80000 | 2025-04-12 |
+-------+----------+-----------+--------+------------+
2 rows in set (0.00 sec)

mysql> update employees
    -> set dept='manager'
    -> where empid=2;
Query OK, 1 row affected (0.04 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employees
    -> ;
+-------+----------+-----------+--------+------------+
| empid | name     | dept      | salary | joindate   |
+-------+----------+-----------+--------+------------+
|     1 | sree     | managaer  |  30000 | 2023-06-12 |
|     2 | varshini | manager   |  80000 | 2023-06-12 |
|     3 | puni     | finance   |  80000 | 2023-06-12 |
|     4 | tharu    | marketing |  80000 | 2025-04-12 |
|     5 | suseela  | finance   |  50000 | 2025-03-12 |
+-------+----------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> update employees
    -> set salary=salary+50000
    -> where empid =2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employees
    -> ;
+-------+----------+-----------+--------+------------+
| empid | name     | dept      | salary | joindate   |
+-------+----------+-----------+--------+------------+
|     1 | sree     | managaer  |  30000 | 2023-06-12 |
|     2 | varshini | manager   | 130000 | 2023-06-12 |
|     3 | puni     | finance   |  80000 | 2023-06-12 |
|     4 | tharu    | marketing |  80000 | 2025-04-12 |
|     5 | suseela  | finance   |  50000 | 2025-03-12 |
+-------+----------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> update employees
    -> set name='varshini'
    -> where empid=2;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 1  Changed: 0  Warnings: 0

mysql> select * from employees
    -> ;
+-------+----------+-----------+--------+------------+
| empid | name     | dept      | salary | joindate   |
+-------+----------+-----------+--------+------------+
|     1 | sree     | managaer  |  30000 | 2023-06-12 |
|     2 | varshini | manager   | 130000 | 2023-06-12 |
|     3 | puni     | finance   |  80000 | 2023-06-12 |
|     4 | tharu    | marketing |  80000 | 2025-04-12 |
|     5 | suseela  | finance   |  50000 | 2025-03-12 |
+-------+----------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> update employees
    -> set name='sreevarshini'
    -> where empid =2;
Query OK, 1 row affected (0.04 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employees
    -> ;
+-------+--------------+-----------+--------+------------+
| empid | name         | dept      | salary | joindate   |
+-------+--------------+-----------+--------+------------+
|     1 | sree         | managaer  |  30000 | 2023-06-12 |
|     2 | sreevarshini | manager   | 130000 | 2023-06-12 |
|     3 | puni         | finance   |  80000 | 2023-06-12 |
|     4 | tharu        | marketing |  80000 | 2025-04-12 |
|     5 | suseela      | finance   |  50000 | 2025-03-12 |
+-------+--------------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> rename table employees to emp;
ERROR 1050 (42S01): Table 'emp' already exists
mysql> Rename table employees to emp;
ERROR 1050 (42S01): Table 'emp' already exists
mysql> Rename table employees to emp1;
Query OK, 0 rows affected (0.07 sec)

mysql> select * from emp1;
+-------+--------------+-----------+--------+------------+
| empid | name         | dept      | salary | joindate   |
+-------+--------------+-----------+--------+------------+
|     1 | sree         | managaer  |  30000 | 2023-06-12 |
|     2 | sreevarshini | manager   | 130000 | 2023-06-12 |
|     3 | puni         | finance   |  80000 | 2023-06-12 |
|     4 | tharu        | marketing |  80000 | 2025-04-12 |
|     5 | suseela      | finance   |  50000 | 2025-03-12 |
+-------+--------------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> alter table emp1
    -> rename column name to employeename;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from emp1;
+-------+--------------+-----------+--------+------------+
| empid | employeename | dept      | salary | joindate   |
+-------+--------------+-----------+--------+------------+
|     1 | sree         | managaer  |  30000 | 2023-06-12 |
|     2 | sreevarshini | manager   | 130000 | 2023-06-12 |
|     3 | puni         | finance   |  80000 | 2023-06-12 |
|     4 | tharu        | marketing |  80000 | 2025-04-12 |
|     5 | suseela      | finance   |  50000 | 2025-03-12 |
+-------+--------------+-----------+--------+------------+
5 rows in set (0.00 sec)

mysql> show database;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'database' at line 1
mysql> show databases
    -> ;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kgcas              |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> drop database sys;
Query OK, 101 rows affected (0.30 sec)

mysql> show databases
    -> ;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kgcas              |
| mysql              |
| performance_schema |
+--------------------+
4 rows in set (0.00 sec)

mysql>  delete from emp1 where empid=5;
Query OK, 1 row affected (0.04 sec)

mysql> select * from emp1;
+-------+--------------+-----------+--------+------------+
| empid | employeename | dept      | salary | joindate   |
+-------+--------------+-----------+--------+------------+
|     1 | sree         | managaer  |  30000 | 2023-06-12 |
|     2 | sreevarshini | manager   | 130000 | 2023-06-12 |
|     3 | puni         | finance   |  80000 | 2023-06-12 |
|     4 | tharu        | marketing |  80000 | 2025-04-12 |
+-------+--------------+-----------+--------+------------+
4 rows in set (0.00 sec)

mysql> delete from emp1 where salary>=5000;
Query OK, 4 rows affected (0.01 sec)

mysql> select *from emp1;
Empty set (0.00 sec)

mysql> select *from emp1;
Empty set (0.00 sec)

mysql>  insert into employees(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12');
ERROR 1146 (42S02): Table 'kgcas.employees' doesn't exist
mysql>  insert into emp1(empid,name,dept,salary,joindate)values
    -> (1,'sree','managaer',30000,'2023-06-12');
ERROR 1054 (42S22): Unknown column 'name' in 'field list'
mysql> select *from emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
28 rows in set (0.00 sec)

mysql> select *from emp where job='salesman' or job='manager';
+-------+--------+----------+------+------------+---------+---------+--------+
| empno | ename  | job      | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+
14 rows in set (0.00 sec)

mysql> select *from emp where job='salesman' and salary<1000;
ERROR 1054 (42S22): Unknown column 'salary' in 'where clause'
mysql> select *from emp where job='salesman' and sal <1000;
Empty set (0.00 sec)

mysql> select * from emp;
+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
28 rows in set (0.00 sec)

mysql> select * from emp where department ='salesman' and sal >1000;
ERROR 1054 (42S22): Unknown column 'department' in 'where clause'
mysql> select * from emp where job ='salesman' and sal >1000;
+-------+--------+----------+------+------------+---------+---------+--------+
| empno | ename  | job      | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+
8 rows in set (0.00 sec)

mysql>
