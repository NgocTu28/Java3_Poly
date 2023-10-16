USE su22b2_sof203;
GO

CREATE TABLE nhan_vien (
    id INT IDENTITY PRIMARY KEY,
    ten NVARCHAR (255) NOT NULL,
    ma_nv NVARCHAR (255) NOT NULL,
    sdt NVARCHAR(255) NOT NULL UNIQUE,
    tuoi int NOT NULL,
    vai_tro int NOT NULL DEFAULT 1
);

GO

INSERT INTO nhan_vien (ten, ma_nv, sdt, tuoi, vai_tro) VALUES
('Ng Van A', 'PH09125', '097321123', 25, 1),
('Tran Thi C', 'PH07098', '098123456', 26, 0);
GO