Create database sample_PE1_Q3B
use sample_PE1_Q3B

CREATE TABLE Employee
(id int PRIMARY KEY,
 name varchar(40),
 gender bit,
 dob Date,
 HOA int
)


INSERT INTO Employee (id, name, gender, dob,HOA) VALUES (111, 'Hoa', 1, '1997-03-17',5)
INSERT INTO Employee (id, name, gender, dob,HOA) VALUES (222, 'La', 0, '1997-03-17',2)
INSERT INTO Employee (id, name, gender, dob,HOA) VALUES (333, 'Canh', 1, '1995-04-20',10)
INSERT INTO Employee (id, name, gender, dob,HOA) VALUES (444, 'Cay', 1, '1996-03-18',3)

select * from 

CREATE TABLE Skill
 (id varchar (10) PRIMARY KEY,
  name nvarchar(30),
 )

INSERT INTO Skill VALUES (1,'Marketing')
INSERT INTO Skill VALUES (2, 'Sale')
INSERT INTO Skill VALUES (3, 'Accounting')
INSERT INTO Skill VALUES (4, 'Development')
INSERT INTO Skill VALUES (5, 'Coding')



GO

create table Employee_Skill(eid int , sid int)
INSERT INTO Employee_Skill (eid, sid) VALUES (111, 1)
INSERT INTO Employee_Skill VALUES (111, 2)
INSERT INTO Employee_Skill VALUES (111, 4)
INSERT INTO Employee_Skill VALUES (333, 3)
INSERT INTO Employee_Skill VALUES (222, 5)

select * from Employee_Skill
drop table Employee_Skill