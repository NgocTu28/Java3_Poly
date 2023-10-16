package models;

import java.sql.Date;

public class Ban {
    
    private String id;
    private String ten;
    private Date ngaySinh;
    private String soThich;
    private int trangThai;
    private MoiQuanHe moiQuanHe;

    public Ban() {
    }

    public Ban(String id, String ten, Date ngaySinh, String soThich, int trangThai, MoiQuanHe moiQuanHe) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soThich = soThich;
        this.trangThai = trangThai;
        this.moiQuanHe = moiQuanHe;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public MoiQuanHe getMoiQuanHe() {
        return moiQuanHe;
    }

    public void setMoiQuanHe(MoiQuanHe moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }
    
}
