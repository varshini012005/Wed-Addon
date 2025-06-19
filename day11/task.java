mysql> create database kgisl;
Query OK, 1 row affected (0.01 sec)

mysql> use kgisl;
Database changed
mysql> create table student(
    -> sroll int,
    -> sname varchar(50),
    -> smark int
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into student values(01,'sree',99);
Query OK, 1 row affected (0.01 sec)

mysql> drop database kgisl;
Query OK, 1 row affected (0.07 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| school             |
| student            |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> create database bsc;
Query OK, 1 row affected (0.01 sec)

mysql> create table student(
    -> sroll int,
    -> sname varchar(50)
    -> );

mysql> use bsc;
Database changed

mysql> create table student(
    -> sroll int,
    -> sname varchar(50)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into student values(01,'sree');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(02,'vaishu');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(03,'vikas');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(04,'tharu');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(05,'sheela');
Query OK, 1 row affected (0.01 sec)

mysql> select*from student;
+-------+-----------+
| sroll | sname     |
+-------+-----------+
|     1 | sree      |
|     2 | vaishu    |
|     3 | vikas     |
|     4 | tharu     |
|     5 | sheela    |
+-------+-----------+
5 rows in set (0.00 sec)

mysql> create table mark(
    -> studentmark int
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into mark values (99)
    -> ;
Query OK, 1 row affected (0.01 sec)

mysql> insert into mark values (88);
Query OK, 1 row affected (0.01 sec)

mysql> insert into mark values (98);
Query OK, 1 row affected (0.01 sec)

mysql> insert into mark values (78);
Query OK, 1 row affected (0.01 sec)

mysql> insert into mark values (93);
Query OK, 1 row affected (0.01 sec)

mysql> select*from mark;
+-------------+
| studentmark |
+-------------+
|          99 |
|          88 |
|          98 |
|          78 |
|          93 |
+-------------+
5 rows in set (0.00 sec)

mysql> select*
    -> from student cross join mark;
+-------+-----------+-------------+
| sroll | sname     | studentmark |
+-------+-----------+-------------+
|     5 | sheela    |          99 |
|     4 | vikas     |          99 |
|     3 | tharu     |          99 |
|     2 | vaishu    |          99 |
|     1 | sree      |          99 |
|     5 | sheela    |          88 |
|     4 | vikas     |          88 |
|     3 | tharu     |          88 |
|     2 | vaishu    |          88 |
|     1 | sree      |          88 |
|     5 | sheela    |          98 |
|     4 | vikas     |          98 |
|     3 | tharu     |          98 |
|     2 | vaishu    |          98 |
|     1 | sree      |          98 |
|     5 | sheela    |          78 |
|     4 | vikas     |          78 |
|     3 | tharu     |          78 |
|     2 | vaishu    |          78 |
|     1 | sree      |          78 |
|     5 | sheela    |          93 |
|     4 | vikas     |          93 |
|     3 | tharu     |          93 |
|     2 | vaishu    |          93 |
|     1 | sree      |          93 |
+-------+-----------+-------------+
25 rows in set (0.00 sec)

mysql> select*
    -> from mark
    -> where studentmark=(select max(studentmark)
    -> from mark);
+-------------+
| studentmark |
+-------------+
|          99 |
+-------------+
1 row in set (0.01 sec)

mysql> create table orders(
    -> orderid int,
    -> customername varchar(50),
    -> amount int
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into orders values(201,'sree',500);
Query OK, 1 row affected (0.01 sec)

mysql> insert into orders values(202,'varshi',700);
Query OK, 1 row affected (0.01 sec)

mysql> insert into orders values(203,'vaishu',900);
Query OK, 1 row affected (0.01 sec)

mysql> select* from orders;
+---------+--------------+--------+
| orderid | customername | amount |
+---------+--------------+--------+
|     201 | sree         |    500 |
|     202 | varshi       |    700 |
|     203 | vaishu       |    900 |
+---------+--------------+--------+
3 rows in set (0.00 sec)

mysql> create table customers(
    -> sno int,
    -> customerplace varchar(50)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into customers values(01,'India');
Query OK, 1 row affected (0.01 sec)

mysql> insert into customers values(02,'Canada');
Query OK, 1 row affected (0.01 sec)

mysql> insert into customers values(03,'Delhi');
Query OK, 1 row affected (0.01 sec)

mysql> select*from customers;
+------+---------------+
| sno  | customerplace |
+------+---------------+
|    1 | India         |
|    2 | Canada        |
|    3 | Delhi         |
+------+---------------+
3 rows in set (0.00 sec)

mysql> select *
    -> from orders,customers;
+---------+--------------+--------+------+---------------+
| orderid | customername | amount | sno  | customerplace |
+---------+--------------+--------+------+---------------+
|     203 | vaishu       |    900 |    1 | India         |
|     202 | varshi       |    700 |    1 | India         |
|     201 | sree         |    500 |    1 | India         |
|     203 | vaishu       |    900 |    2 | Canada        |
|     202 | varshi       |    700 |    2 | Canada        |
|     201 | sree         |    500 |    2 | Canada        |
|     203 | vaishu       |    900 |    3 | Delhi         |
|     202 | varshi       |    700 |    3 | Delhi         |
|     201 | sree         |    500 |    3 | Delhi         |
+---------+--------------+--------+------+---------------+
9 rows in set (0.00 sec)

mysql> select *
    -> from orders cross join customers;
+---------+--------------+--------+------+---------------+
| orderid | customername | amount | sno  | customerplace |
+---------+--------------+--------+------+---------------+
|     203 | vaishu       |    900 |    1 | India         |
|     202 | varshi       |    700 |    1 | India         |
|     201 | sree         |    500 |    1 | India         |
|     203 | vaishu       |    900 |    2 | Canada        |
|     202 | varshi       |    700 |    2 | Canada        |
|     201 | sree         |    500 |    2 | Canada        |
|     203 | vaishu       |    900 |    3 | Delhi         |
|     202 | varshi       |    700 |    3 | Delhi         |
|     201 | sree         |    500 |    3 | Delhi         |
+---------+--------------+--------+------+---------------+
9 rows in set (0.00 sec)

mysql>
