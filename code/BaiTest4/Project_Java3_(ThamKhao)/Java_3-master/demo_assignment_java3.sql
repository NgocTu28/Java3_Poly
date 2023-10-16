CREATE DATABASE demo_assignment_java3

USE demo_assignment_java3

CREATE TABLE USERS(
username nvarchar(50) primary key,
password nvarchar(50),
role nvarchar(50)
)
INSERT INTO USERS values ('thangnc','123',N'Cán bộ')
INSERT INTO USERS values ('giangvien','123',N'Giảng viên')

CREATE TABLE STUDENTS(
MASV NVARCHAR(50) PRIMARY KEY,
Hoten nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(15),
Gioitinh bit,
Diachi nvarchar(50),
Hinh nvarchar(255)
)

delete from STUDENTS
select * from grade 
order by (Tienganh + Tinhoc + GDTC) / 3 desc
INSERT INTO STUDENTS VALUES ('PH26123',N'Nguyễn Công Thắng','thangncph26123@fpt.edu.vn','0971089763',1,N'Thái Bình','D:\Learning\SOF203(Java3)\images\thang.jpg')
INSERT INTO STUDENTS VALUES ('PH26192',N'Mai Đình Huy','huymdph26192@fpt.edu.vn','0358974973',1,N'Hải Dương','D:\Learning\SOF203(Java3)\images\huy.jpg')
INSERT INTO STUDENTS VALUES ('PH26000',N'Lê Quang Trị','trilqph26000@fpt.edu.vn','0384758934',1,N'Hải Phòng','D:\Learning\SOF203(Java3)\images\tri.jpg')
INSERT INTO STUDENTS VALUES ('PH23445',N'Trần Trường Giang','giangttph23445@fpt.edu.vn','0395857456',0,N'Thái Bình','D:\Learning\SOF203(Java3)\images\giang.jpg')
INSERT INTO STUDENTS VALUES ('PH21232',N'Đỗ Việt Trường','truongdvph21232@fpt.edu.vn','0454556756',0,N'Thái Bình','D:\Learning\SOF203(Java3)\images\truong.jpg')
select * from grade where MASV = 'ph26000'
CREATE TABLE GRADE(
ID int identity primary key,
MASV nvarchar(50),
Tienganh float,
Tinhoc float,
GDTC float
)
delete from GRADE
select * from grade
--ALTER TABLE GRADE ADD CONSTRAINT FK_MASV FOREIGN KEY (MASV) REFERENCES STUDENTS(MASV)
INSERT INTO GRADE VALUES ('PH26123',8,9,9)
INSERT INTO GRADE VALUES ('PH26192',6,7,7)
INSERT INTO GRADE VALUES ('PH26000',8,8,8)
INSERT INTO GRADE VALUES ('PH23445',6.5,5,7.5)
INSERT INTO GRADE VALUES ('PH21232',8.5,7,9)