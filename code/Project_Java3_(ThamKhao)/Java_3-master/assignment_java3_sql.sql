

CREATE DATABASE assignment_java3

USE assignment_java3

CREATE TABLE USERS(
username nvarchar(50) primary key,
password nvarchar(50),
role nvarchar(50)
)

CREATE TABLE STUDENTS(
MASV NVARCHAR(50) PRIMARY KEY,
Hoten nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(15),
Gioitinh bit,
Diachi nvarchar(50),
Hinh nvarchar(255)
)


CREATE TABLE GRADE(
ID int identity primary key,
MASV nvarchar(50),
Tienganh float,
Tinhoc float,
GDTC float
)
ALTER TABLE GRADE ADD CONSTRAINT FK_MASV FOREIGN KEY (MASV) REFERENCES STUDENTS(MASV)
select * from grade order by (Tienganh + Tinhoc + GDTC) / 3 desc

SELECT ROUND(14.55,1)

