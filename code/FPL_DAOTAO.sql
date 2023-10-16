create database PFL_DAOTAO
go
use PFL_DAOTAO
go

create table USERS (
	userName nvarchar(50) not null primary key,
	passWords nvarchar(50) ,
	roles nvarchar(50) 
)

create table STUDENTS(
	maSV nvarchar(50) primary key not null,
	hoTen nvarchar(50),
	email nvarchar(50),
	soDT nvarchar(15),
	gioiTinh nvarchar(10),
	diaChi nvarchar(50),
	hinh nvarchar(50)
)

create table GRADE(
	iD int primary key not null,
	maSV nvarchar(50) foreign key references STUDENTS(maSV),
	tiengAnh int,
	tinHoc int,
	GDTC int
)

INSERT INTO USERS (userName, passWords, roles)
VALUES (N'user1', N'password1', N'admin'),
(N'user2', N'password2', N'teacher'),
(N'user3', N'password3', N'admin'),
(N'user4', N'password4', N'teacher');


INSERT INTO GRADE (iD, maSV, tiengAnh, tinHoc, GDTC)
VALUES (1, N'SV001', 8, 9, 8),
(2, N'SV002', 7, 8, 7),
(3, N'SV003', 9, 8, 8),
(4, N'SV004', 7, 2, 8);

--SELECT * FROM STUDENTS

--SELECT * FROM USERS WHERE userName = ''