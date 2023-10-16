package Repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Model.Grade;

public class GradeRepository {

    public List<Grade> getAll() {
        List<Grade> list = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnect();

            String query = "select  *, (Tienganh + Tinhoc + GDTC)/3 as'DTB' from GRADE"
                    + " order by DTB desc";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Grade(rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getFloat(4),
                        rs.getFloat(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Grade> getTop3() {
        List<Grade> list = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnect();

            String query = "select top 3 *, (Tienganh + Tinhoc + GDTC)/3 as'DTB' from GRADE"
                    + " order by DTB desc";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Grade(rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getFloat(4),
                        rs.getFloat(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public String findNameByMaSV(String ma) {
        String hoTen = "";
        try {
            Connection cn = DBConnection.getConnect();

            String query = "SELECT B.Hoten from GRADE A INNER JOIN STUDENTS B ON A.MASV = B.MASV WHERE A.MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                hoTen = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoTen;
    }

    public Grade findGradeByMaSV(String ma) {
        Grade g = null;
        try {
            Connection cn = DBConnection.getConnect();

            String query = "SELECT * FROM GRADE WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);//tạo đối tượng cbi thực thi câu sql

            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                g = new Grade(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }

    public int findStudentByMaSV(String ma) {
        try {
            Connection cn = DBConnection.getConnect();

            String query = "SELECT Hoten FROM STUDENTS WHERE MASV = ?";

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

    public void insert(Grade g) {
        try {
            Connection cn = DBConnection.getConnect();
            String query = "INSERT INTO GRADE (iD,MASV, Tienganh, Tinhoc, GDTC) VALUES (?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, g.getId());
            ps.setString(2, g.getMasv());
            ps.setFloat(3, g.getTiengAnh());
            ps.setFloat(4, g.getTinHoc());
            ps.setFloat(5, g.getGdtc());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, Grade g) {
        try {
            Connection cn = DBConnection.getConnect();

            String query = "UPDATE GRADE SET Tienganh = ?, Tinhoc = ?, GDTC = ? WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setFloat(1, g.getTiengAnh());
            ps.setFloat(2, g.getTinHoc());
            ps.setFloat(3, g.getGdtc());
            ps.setString(4, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection cn = DBConnection.getConnect();

            String query = "DELETE FROM GRADE WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
