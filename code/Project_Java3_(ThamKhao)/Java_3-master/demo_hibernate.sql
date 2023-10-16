CREATE DATABASE SPDB
GO

USE SPDB
GO

CREATE TABLE hoc_sinh (
	hoc_sinh_id		BIGINT	IDENTITY(1,1)	PRIMARY KEY,
	ho_ten			NVARCHAR(50)	NOT NULL,
	ma_sinh_vien	VARCHAR(7)		NOT NULL UNIQUE,
	diem_tb			FLOAT			NOT NULL,
	so_tin_chi		SMALLINT		NOT NULL,
	tien_trong_tk	DECIMAL,
)

CREATE TABLE mon_hoc (
	mon_hoc_id		INT		IDENTITY(1,1)	PRIMARY KEY,
	ten_mon_hoc		NVARCHAR(40)	NOT NULL,
	so_tin_chi		TINYINT			NOT NULL,
	bat_buoc		BIT				NOT NULL,
	mo_ta			NVARCHAR(MAX),
	tien_hoc_lai	MONEY			NOT NULL,
)

CREATE TABLE giang_vien (
	giang_vien_id	BIGINT	IDENTITY(1,1)	PRIMARY KEY,
	ten_giang_vien	NVARCHAR(55)	NOT NULL,
	luong_thang		DECIMAL			NOT NULL,
	he_so_luong		REAL			NOT NULL,
	sinh_nhat		DATE,
	nam_kinh_nghiem	TINYINT			NOT NULL,
)

CREATE TABLE truong_hoc (
	truong_hoc_id	BIGINT	IDENTITY(1,1)	PRIMARY KEY,
	ten_truong_hoc	NVARCHAR(100)	NOT NULL,
	so_dien_thoai	VARCHAR(15),
	xep_hang		SMALLINT		NOT NULL,
	diem_xep_hang	FLOAT			NOT NULL,
	hoc_phi_ky		MONEY			NOT NULL
)

CREATE TABLE hoc_ky (
	hoc_ky_id		INT		IDENTITY(1,1)	PRIMARY KEY,
	ten_hoc_ky		NVARCHAR(20)	NOT NULL,
	bat_dau			DATE			NOT NULL,
	ket_thuc		DATETIME		NOT NULL,
	ti_le_dat		REAL,
	quy_thuong_ky	DECIMAL			NOT NULL
)