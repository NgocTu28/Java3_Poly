/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vutu8
 */
public class Ban {
    private String ma;
    private String tenBan;
    private String ngaySinh;
    private String soThich;
    private int trangThai;
    private MoiQuanHe mqh;

    public Ban() {
    }

    public Ban(String ma, String tenBan, String ngaySinh, String soThich, int trangThai, MoiQuanHe mqh) {
        this.ma = ma;
        this.tenBan = tenBan;
        this.ngaySinh = ngaySinh;
        this.soThich = soThich;
        this.trangThai = trangThai;
        this.mqh = mqh;
    }

    public MoiQuanHe getMqh() {
        return mqh;
    }

    public void setMqh(MoiQuanHe mqh) {
        this.mqh = mqh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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
    
    
}
