create database QLSV_SU23
GO

use QLSV_SU23
go

Create table NGANH
(
	MaNganh nvarchar(15) not null,
	TenNganh nvarchar(50) not null,
	constraint PK_KhoaNganh primary key(MaNganh)
)
go

create table SINHVIEN
(
	Masv nvarchar(10) not null,
	Hoten nvarchar(35) not null,
	GioiTinh bit not null,
	MaNganh nvarchar(15) not null,
	DiemTB float not null,
	primary key(Masv),
	foreign key(MaNganh) references NGANH(MaNganh)
)
go

--Nhập liệu bảng Nganh
insert into Nganh(MaNganh,TenNganh) values('K12.3-MOB',N'K12.3 Ngành Mobile')
insert into Nganh(MaNganh,TenNganh) values('K12.3-MUL',N'K12.3 Ngành Thiết kế đồ họa')
insert into Nganh(MaNganh,TenNganh) values('K12.3-UD',N'K12.3 Ngành Ứng dụng phần mềm')
insert into Nganh(MaNganh,TenNganh) values('K12.3-MA',N'K12.3 Ngành Marketing')
insert into Nganh(MaNganh,TenNganh) values('K12.3-DIG',N'K12.3 Ngành Digital Marketing')
insert into Nganh(MaNganh,TenNganh) values('K13.1-MOB',N'K13.1 Ngành Mobile')
insert into Nganh(MaNganh,TenNganh) values('K13.1-MUL',N'K13.1 Ngành Thiết kế đồ họa')
insert into Nganh(MaNganh,TenNganh) values('K13.1-UD',N'K13.1 Ngành Ứng dụng phần mềm')
insert into Nganh(MaNganh,TenNganh) values('K13.1-MA',N'K13.1 Ngành Marketing')
insert into Nganh(MaNganh,TenNganh) values('K13.1-DIG',N'K13.1 Ngành Digital Marketing')
go

-- Nhap lieu bang SinhVien
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00123',N'Lê Xuân Lý',1,'K12.3-MOB',9.5)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00125',N'Lê Xuân Liên',1,'K12.3-MOB',8)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00127',N'Lê ThuLan',0,'K12.3-MOB',5)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00131',N'Trần Thu Hà',0,'K13.1-MUL',6.5)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00135',N'Nguyễn Minh Nghĩa',1,'K13.1-MUL',8)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00137',N'Nguyễn Minh Trung',1,'K13.1-MOB',9.5)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00138',N'Trần Bình Minh',1,'K13.1-UD',3)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00234',N'Lê Hương Lan',0,'K13.1-MA',4.5)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00235',N'Trần Thị Lương',0,'K13.1-DIG',7)
insert into SINHVIEN(Masv,Hoten,GioiTinh,maNganh,DiemTB)
values('PH00237',N'Đỗ Thị Mai',0,'K13.1-DIG',10)

select * from NGANH
select * from SINHVIEN