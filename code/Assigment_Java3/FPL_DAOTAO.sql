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
	iD int ,
	maSV nvarchar(50) foreign key references STUDENTS(maSV),
	tiengAnh float,
	tinHoc float,
	GDTC float
)

-- Insert data into USERS table
INSERT INTO USERS (userName, passWords, roles)
VALUES
    ('user1', 'password1', 'teacher'),
    ('user2', 'password2', 'admin'),
    ('user3', 'password3', 'teacher');

-- Insert data into STUDENTS table
INSERT INTO STUDENTS (maSV, hoTen, email, soDT, gioiTinh, diaChi, hinh)
VALUES
    ('SV001', 'John Doe', 'john.doe@example.com', '123456789', 'Male', '123 Main St', 'john.jpg'),
    ('SV002', 'Jane Smith', 'jane.smith@example.com', '987654321', 'Female', '456 Park Ave', 'jane.jpg'),
    ('SV003', 'Bob Johnson', 'bob.johnson@example.com', '567891234', 'Male', '789 Broadway', 'bob.jpg');

-- Insert data into GRADE table
INSERT INTO GRADE (iD, maSV, tiengAnh, tinHoc, GDTC)
VALUES
    (1, 'SV001', 8.5, 7.0, 9.0),
    (2, 'SV002', 7.0, 9.0, 8.5),
    (3, 'SV003', 6.5, 8.0, 7.5);


