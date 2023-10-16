/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicer;

import Model.Ban;
import Model.MoiQuanHe;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import javax.xml.transform.Result;

/**
 *
 * @author vutu8
 */
public class Ban_Service {

    Connection con = DBConnection.getConnect();

    public ArrayList<Ban> getToAll() {
        String sql = "Select a.Ma , a.ten , a.NgaySinh , a.SoThich, a.TrangThai,b.Id,b.Ten\n"
                + "From Ban a join MoiQuanHe b on a.idMQH = b.id ";
        ArrayList<Ban> list = new ArrayList<>();

        try {
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                MoiQuanHe mqh = new MoiQuanHe();
                mqh.setId(rs.getString(6));
                mqh.setTen(rs.getString(7));

                Ban b = new Ban();
                b.setMa(rs.getString(1));
                b.setTenBan(rs.getString(2));
                b.setNgaySinh(rs.getString(3));
                b.setSoThich(rs.getString(4));
                b.setTrangThai(rs.getInt(5));
                b.setMqh(mqh);
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e + "1");
        }
        return list;
    }

    public void add(Ban b) {
        String sql = "insert into Ban(Ma , ten ,NgaySinh , SoThich, TrangThai, idMQH) values (?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, b.getMa());
            pstm.setString(2, b.getTenBan());
            pstm.setString(3, b.getNgaySinh());
            pstm.setString(4, b.getSoThich());
            pstm.setInt(5, b.getTrangThai());
            pstm.setString(6, b.getMqh().getId());

            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e + "2");
        }
    }

    public void update(Ban b) {
        String sql = "Update Ban set ten = ?,NgaySinh  = ?, SoThich = ?, TrangThai = ?, idMQH = ? Where Ma = ?";

        try {
            PreparedStatement pstm = con.prepareCall(sql);

            pstm.setString(1, b.getTenBan());
            pstm.setString(2, b.getNgaySinh());
            pstm.setString(3, b.getSoThich());
            pstm.setInt(4, b.getTrangThai());
            pstm.setString(5, b.getMqh().getId());
            pstm.setString(6, b.getMa());
            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e + "3");
        }
    }

    public void remove(String ma) {
        String sql = "Delete from Ban where ";

        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, ma);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Ban getKey(Ban b) {
        String sql = "select Ma , ten ,NgaySinh , SoThich, TrangThai, idMQH from Ban where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, b.getMa());
            pstm.setString(2, b.getTenBan());
            pstm.setString(3, b.getNgaySinh());
            pstm.setString(4, b.getSoThich());
            pstm.setInt(5, b.getTrangThai());
            pstm.setString(6, b.getMqh().getId());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "4");
        }
        return b;
    }

}
