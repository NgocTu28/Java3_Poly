/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [id]
      ,[ten]
      ,[so_luong]
      ,[mau_sac]
      ,[don_gia]
      ,[danh_muc_id]
  FROM [su22b2_sof203].[dbo].[san_pham]
  USE su22b2_sof203;
GO

CREATE TABLE khach_hang (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    dia_chi NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL,
    tuoi int NOT NULL,
    gioi_tinh int NOT NULL DEFAULT 1
);

GO

INSERT INTO khach_hang (ten, dia_chi, email, tuoi, gioi_tinh) VALUES
('Ng Van A', 'HN', 'dungna29@fpt.edu.vn', 20, 1),
('Tran Thi C', 'HN', 'minhdq8@fpt.edu.vn', 22, 0);
GO







