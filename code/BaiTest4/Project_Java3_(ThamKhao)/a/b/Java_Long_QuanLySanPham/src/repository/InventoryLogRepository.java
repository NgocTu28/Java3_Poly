/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.InventoryLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBConnect;
import response.InventoryLogResponse;

/**
 *
 * @author ThinkPad
 */
public class InventoryLogRepository {

    private Connection cn;

    public InventoryLogRepository() {
        cn = DBConnect.getConnection();
    }

    public List<InventoryLogResponse> getAllLog() {
        List<InventoryLogResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT i.Id, p.ProductName, CONVERT(VARCHAR, i.IEDate, 105), i.IoE, i.Quantity, i.Price "
                        + "FROM InventoryLog i "
                        + "JOIN Product p ON i.ProducId=p.Id";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new InventoryLogResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getFloat(6)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

    public List<InventoryLogResponse> getAllLogById(String id) {
        List<InventoryLogResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT i.Id, p.ProductName, CONVERT(VARCHAR, i.IEDate, 105), i.IoE, i.Quantity, i.Price "
                        + "FROM InventoryLog i "
                        + "JOIN Product p ON i.ProducId=p.Id "
                        + "WHERE i.ProducId = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setInt(1, Integer.valueOf(id));
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new InventoryLogResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getFloat(6)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

    public String insertLog(InventoryLog log) {
        if (cn != null) {
            try {
                String query = "INSERT INTO InventoryLog(ProducId,IoE,Quantity,Price) "
                        + "VALUES(?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setInt(1, log.getProductId());
                ps.setInt(2, log.getIoE());
                ps.setInt(3, log.getQuantity());
                ps.setFloat(4, log.getPrice());
                ps.execute();
                return "Thêm log thành công";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return "Thêm Log thất bại";
    }

    public boolean deleteLogByIdProDuct(String id) {
        if (cn != null) {
            try {
                String query = "DELETE FROM InventoryLog WHERE ProducId = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setInt(1, Integer.valueOf(id));
                ps.execute();
                return true;
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return false;
    }

    public List<InventoryLogResponse> getAllXuatDesc() {
        List<InventoryLogResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT i.Id, p.ProductName, CONVERT(VARCHAR, i.IEDate, 105), i.IoE, i.Quantity, i.Price "
                        + "FROM InventoryLog i "
                        + "JOIN Product p ON i.ProducId=p.Id "
                        + "WHERE i.IoE = 0 "
                        + "ORDER BY i.Quantity DESC";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new InventoryLogResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getFloat(6)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

    public List<InventoryLogResponse> findLogByMode(int mode, String key) {
        // 0: tìm theo tên | 1: nhập trên | 2: Nhập dưới | 3: Xuất trên | 4: Xuất dưới
        List<InventoryLogResponse> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT i.Id, p.ProductName, CONVERT(VARCHAR, i.IEDate, 105), i.IoE, i.Quantity, i.Price "
                        + "FROM InventoryLog i "
                        + "JOIN Product p ON i.ProducId=p.Id ";
                PreparedStatement ps = null;
                switch (mode) {
                    case 0:
                        query += "WHERE p.ProductName like ? OR p.ProductName like ? OR p.ProductName like ?";
                        ps = cn.prepareStatement(query);
                        ps.setString(1, "%" + key + "%");
                        ps.setString(2, key + "%");
                        ps.setString(3, "%" + key);
                        break;
                    case 1:
                        query += "WHERE  i.IoE = 1 AND i.Quantity > ?";
                        ps = cn.prepareStatement(query);
                        ps.setInt(1, Integer.valueOf(key));
                        break;
                    case 2:
                        query += "WHERE  i.IoE = 1 AND i.Quantity < ?";
                        ps = cn.prepareStatement(query);
                        ps.setInt(1, Integer.valueOf(key));
                        break;
                    case 3:
                        query += "WHERE  i.IoE = 0 AND i.Quantity > ?";
                        ps = cn.prepareStatement(query);
                        ps.setInt(1, Integer.valueOf(key));
                        break;
                    case 4:
                        query += "WHERE  i.IoE = 0 AND i.Quantity < ?";
                        ps = cn.prepareStatement(query);
                        ps.setInt(1, Integer.valueOf(key));
                        break;
                    default:
                        break;
                }

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new InventoryLogResponse(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getFloat(6)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;
    }

}
