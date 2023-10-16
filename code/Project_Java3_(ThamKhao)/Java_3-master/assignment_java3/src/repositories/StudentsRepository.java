package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Students;
import utils.JdbcUtil;

public class StudentsRepository {

    public List<Students> getAll() {
        List<Students> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM STUDENTS";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Students(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(Students s) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "INSERT INTO STUDENTS (MASV, Hoten, Email, SoDT, Gioitinh, Diachi, Hinh) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, s.getMasv());
            ps.setString(2, s.getHoTen());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getSoDt());
            ps.setBoolean(5, s.isGioiTinh());
            ps.setString(6, s.getDiaChi());
            ps.setString(7, s.getHinh());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, Students s) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "UPDATE STUDENTS SET Hoten = ?, Email = ?, SoDT = ?, Gioitinh = ?, Diachi = ?, Hinh = ? where MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, s.getHoTen());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getSoDt());
            ps.setBoolean(4, s.isGioiTinh());
            ps.setString(5, s.getDiaChi());
            ps.setString(6, s.getHinh());
            ps.setString(7, ma);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM STUDENTS WHERE MASV = ?";
            
            String queryGrade = "DELETE FROM GRADE WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            PreparedStatement ps1 = cn.prepareStatement(queryGrade);
            
            ps.setString(1, ma);
            ps1.setString(1, ma);
            
            ps1.execute();
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int searchByMaSV(String ma) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM STUDENTS WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
