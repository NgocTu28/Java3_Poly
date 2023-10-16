/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBConnect;
import response.ProductResponse;

/**
 *
 * @author ThinkPad
 */
public class ProductRepository {

    private Connection cn;

    public ProductRepository() {
        cn = DBConnect.getConnection();
    }

    public List<ProductResponse> getAllProduct() {
        List<ProductResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT p.Id, c.CategoryName, p.ProductName, p.CurrentPrice, p.Quantity "
                        + "FROM Product p "
                        + "JOIN Category c ON p.CategoryId=c.Id ";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new ProductResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

    public boolean isExist(String name) {

        boolean check = false;
        if (cn != null) {
            try {
                String query = "SELECT * FROM Product WHERE ProductName = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, name);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return check;
    }

    public int findIdByNameProduct(String name) {
        int id = 0;
        if (cn != null) {
            try {
                String query = "SELECT Id FROM Product WHERE ProductName = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, name);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    id = rs.getInt(1);
                    return id;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return id;
    }

    public List<ProductResponse> findProduct(int mode, String str) {
        List<ProductResponse> list = new ArrayList<>();
        String query = "SELECT p.Id, c.CategoryName, p.ProductName, p.CurrentPrice, p.Quantity "
                + "FROM Product p "
                + "JOIN Category c ON p.CategoryId=c.Id ";
        switch (mode) {
            case 0:
                query += "WHERE c.CategoryName like ? OR c.CategoryName like ? OR c.CategoryName like ?";
                break;
            case 1:
                query += "WHERE p.ProductName like ? OR p.ProductName like ? OR p.ProductName like ?";
                break;
            default:
                break;
        }
        try {
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, "%" + str);
            ps.setString(2, str + "%");
            ps.setString(3, "%" + str + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    public String insertProduct(Product product) {
        if (cn != null && product != null) {
            try {
                String query = "INSERT INTO Product(CategoryId,ProductName,CurrentPrice,Quantity) "
                        + "VALUES(?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setInt(1, product.getCategoryId());
                ps.setString(2, product.getProductName());
                ps.setFloat(3, product.getCurrentPrice());
                ps.setInt(4, product.getQuantity());
                ps.execute();
                return "Thêm thành công";
            } catch (Exception e) {
                e.printStackTrace(System.out);
                return "Xảy ra lỗi";
            }
        }
        return "Thêm thất bại";
    }

    public String updateProduct(Product product) {
        if (cn != null && product != null) {
            try {
                String query = "UPDATE Product SET "
                        + "CategoryId = ?, "
                        + "ProductName = ?, "
                        + "CurrentPrice = ?, "
                        + "Quantity = ? "
                        + "WHERE Id = ? ";
                PreparedStatement ps = cn.prepareStatement(query);

                ps.setInt(1, product.getCategoryId());
                ps.setString(2, product.getProductName());
                ps.setFloat(3, product.getCurrentPrice());
                ps.setInt(4, product.getQuantity());
                ps.setInt(5, product.getId());
                ps.execute();
                return "Sửa thành công";
            } catch (Exception e) {
                e.printStackTrace(System.out);
                return "Xảy ra lỗi";
            }
        }
        return "Sửa thất bại";
    }

    public String deleteProduct(String id) {
        if (cn != null) {
            try {
                int i = Integer.parseInt(id);
                String query = "DELETE FROM Product WHERE Id = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setInt(1, i);
                ps.execute();
                return "Xóa thành công";
            } catch (Exception e) {
                e.printStackTrace(System.out);
                return "Xảy ra lỗi";
            }
        }
        return "Xóa thất bại";
    }

    public List<ProductResponse> getAllProductByCategory(String nameCategory) {
        List<ProductResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT p.Id, c.CategoryName, p.ProductName, p.CurrentPrice, p.Quantity "
                        + "FROM Product p "
                        + "JOIN Category c ON p.CategoryId=c.Id "
                        + "WHERE c.CategoryName = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, nameCategory);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new ProductResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

    public String updateQuantityProductById(int id, int quantity) {
        if (cn != null) {
            try {
                String query = "UPDATE Product SET "
                        + "Quantity = ? "
                        + "WHERE Id = ? ";
                PreparedStatement ps = cn.prepareStatement(query);

                ps.setInt(1, quantity);
                ps.setInt(2, id);
                ps.execute();
                return "Thành công";
            } catch (Exception e) {
                e.printStackTrace(System.out);
                return "Lỗi";
            }
        }
        return "Thất bại";
    }
}
