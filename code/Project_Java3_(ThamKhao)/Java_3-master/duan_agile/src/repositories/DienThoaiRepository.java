package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.DienThoai;
import utils.JdbcUtil;

public class DienThoaiRepository {
    
    public List<DienThoai> getAll(){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            if(cn != null){
                System.out.println("Thanh cong ket noi");
            }
            String query = "SELECT * FROM dien_thoai";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(DienThoai d){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "INSERT INTO dien_thoai (ten_dien_thoai, dongia, gioi_thieu, hinh_anh, so_luong, id_hang) values (?,?,?,?,?,?) ";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, d.getTenDienThoai());
            ps.setBigDecimal(2, d.getDonGia());
            ps.setString(3, d.getGioiThieu());
            ps.setString(4, d.getHinhAnh());
            ps.setInt(5, d.getSoLuong());
            ps.setInt(6, d.getIdHang());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, DienThoai d){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "UPDATE dien_thoai SET ten_dien_thoai = ?, dongia = ?, gioi_thieu = ?, hinh_anh = ?, "
                    + "so_luong = ?, id_hang = ? where id = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, d.getTenDienThoai());
            ps.setBigDecimal(2, d.getDonGia());
            ps.setString(3, d.getGioiThieu());
            ps.setString(4, d.getHinhAnh());
            ps.setInt(5, d.getSoLuong());
            ps.setInt(6, d.getIdHang());
            ps.setInt(7, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "DELETE FROM dien_thoai where id = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setInt(1, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<DienThoai> finDienThoaiByName(String name){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT * FROM dien_thoai WHERE ten_dien_thoai like '%' + ? + '%'";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<DienThoai> sapXepTheoGiaTangDan(){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT * FROM dien_thoai order by dongia";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<DienThoai> sapXepTheoGiaGiamDan(){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT * FROM dien_thoai order by dongia DESC";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<DienThoai> sapXepTheoSoLuongTangDan(){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT * FROM dien_thoai order by so_luong";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<DienThoai> sapXepTheoSoLuongGiamDan(){
        List<DienThoai> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT * FROM dien_thoai order by so_luong DESC";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DienThoai(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
