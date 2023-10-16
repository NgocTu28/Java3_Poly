CREATE DATABASE QUANLYSANPHAM_JAVA3
USE QUANLYSANPHAM_JAVA3
GO

-- Nguyễn Vĩnh Long PH31848


CREATE TABLE Category(
	Id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	CategoryName VARCHAR(100) not null,
)

CREATE TABLE Product(
	Id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	CategoryId INT NOT NULL FOREIGN KEY REFERENCES Category(Id),
	ProductName VARCHAR(100) not null,
	CurrentPrice MONEY not null,
	Quantity INT NOT NULL
)

CREATE TABLE Account(
	UserName VARCHAR(20) NOT NULL PRIMARY KEY,
	Pass VARCHAR(20) NOT NULL,
	Role VARCHAR(20) NOT NULL
)

CREATE TABLE InventoryLog(
	Id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	ProducId INT NOT NULL FOREIGN KEY REFERENCES Product(Id),
	IEDate DATE DEFAULT GETDATE(),
	IoE BIT NOT NULL,
	Quantity INT NOT NULL,
	Price MONEY NOT NULL,
)

INSERT INTO Category VALUES('Giay Dep')
INSERT INTO Category VALUES('Quan Ao')
INSERT INTO Category VALUES('Phu kien')
SELECT * FROM Category

INSERT INTO Product VALUES(1, 'Giay Sneaker', 230.34, 48)
INSERT INTO Product VALUES(1, 'Giay Da', 556.23, 176)
INSERT INTO Product VALUES(2, 'Quan bo', 170.22, 13)
INSERT INTO Product VALUES(2, 'Ao so mi', 304.45, 56)
INSERT INTO Product VALUES(3, 'That lung da', 657.12, 112)
INSERT INTO Product VALUES(3, 'Vong co', 56.33, 167)
INSERT INTO Product VALUES(3, 'Khuyen tai', 98.32, 1004)
SELECT * FROM Product

INSERT INTO Account VALUES('admin', 'admin', 'Quan Ly')
INSERT INTO Account VALUES('kho', 'kho', 'Thu Kho')
SELECT * FROM Account

INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES (2, 1, 20, 34.56)
SELECT * FROM InventoryLog
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(1, 0, 12, 650.36)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(2, 1, 76, 456.98)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(2, 0, 45, 780.23)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(3, 1, 113, 114.34)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(3, 0, 12, 230.33)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(4, 1, 78, 260.36)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(4, 0, 6, 370.78)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(5, 1, 45, 750.45)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(5, 0, 15, 890.36)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(6, 1, 89, 43.36)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(6, 0, 34, 59.12)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(13, 1, 67, 548.76)
INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) VALUES(13, 0, 43, 762.11)
SELECT CONVERT(VARCHAR, IEDate, 105) FROM InventoryLog
SELECT CONVERT(VARCHAR, GETDATE(), 105)


SELECT * FROM Product
SELECT * FROM Category
SELECT * FROM InventoryLog
SELECT * FROM Account

SELECT p.Id, c.CategoryName, p.ProductName, p.CurrentPrice, p.Quantity
FROM Product p
JOIN Category c ON p.CategoryId=c.Id




-- test
DELETE FROM InventoryLog WHERE ProducId = 8

SELECT i.Id, p.ProductName, CONVERT(VARCHAR, i.IEDate, 105), i.IoE, i.Quantity, i.Price
FROM InventoryLog i
JOIN Product p ON i.ProducId=p.Id
WHERE i.IoE = 0
ORDER BY i.Quantity DESC