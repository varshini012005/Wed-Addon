show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.02 sec)

mysql> create database Student;
Query OK, 1 row affected (0.02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| student            |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> use student;
Database changed
mysql> create table Student (
    -> sname varchar(50),
    -> sroll int,
    -> sgmail varchar(50),
    -> phnum int
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> insert into Student values('Keerthana',232622,'keerthana@gmail.com',21346587);
Query OK, 1 row affected (0.03 sec)

mysql> select*
    -> from Student;
+-----------+--------+---------------------+----------+
| sname     | sroll  | sgmail              | phnum    |
+-----------+--------+---------------------+----------+
| sreevarshi| 232622 | varshi@gmail.com    | 21346587 |
+-----------+--------+---------------------+----------+
1 row in set (0.00 sec)

mysql> insert into student values('varshini',232614,'varsini@gmail.com',21345687);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values('vaishu',232656,'Vaishu00@gmail.com',987654332);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values('Rubi',232642,'Rubi@gmail.com',987676547);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values('seema',232642,'seema@gmail.com',965390636);
Query OK, 1 row affected (0.01 sec)

mysql> select*
    -> from Student;
+-----------+--------+---------------------+-----------+
| sname     | sroll  | sgmail                | phnum     |
+-----------+--------+---------------------+-----------+
| sreevarsh | 232622 | varshisreee@gmail.com |  21346587 |
| varshini  | 232614 | varshini@gmail.com    |  21345687 |
| vaishu    | 232656 | Vaishu00@gmail.com    | 987654332 |
| Rubi      | 232642 | Rubi@gmail.com        | 987676547 |
| seema     | 232642 | seema@gmail.com       | 965390636 |
+-----------+--------+---------------------+-----------+
5 rows in set (0.00 sec)

mysql> create table Course(
    -> Coursefee int
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> insert into course values(10000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into course values(20000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into course values(30000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into course values(40000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into course values(50000);
Query OK, 1 row affected (0.01 sec)

mysql> select*
    -> from course;
+-----------+
| Coursefee |
+-----------+
|     10000 |
|     20000 |
|     30000 |
|     40000 |
|     50000 |
+-----------+
5 rows in set (0.00 sec)

mysql> update course
    -> set coursefee=60000
    -> where coursefee=50000;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from course
    -> ;
+-----------+
| Coursefee |
+-----------+
|     10000 |
|     20000 |
|     30000 |
|     40000 |
|     60000 |
+-----------+
5 rows in set (0.00 sec)

mysql> select*from student;
+-----------+--------+---------------------+-----------+
| sname     | sroll  | sgmail                 | phnum     |
+-----------+--------+---------------------+-----------+
| sreevarshini| 232622 | varshisree@gmail.com |  21346587 |
| varshini    | 232614 | varshini@gmail.com   |  21345687 |
| vaishu      | 232656 | Vaishu00@gmail.com   | 987654332 |
| Rubi        | 232642 | Rubi@gmail.com       | 987676547 |
| seema       | 232642 | seema@gmail.com      | 965390636 |
+-----------+--------+---------------------+-----------+
5 rows in set (0.00 sec)
