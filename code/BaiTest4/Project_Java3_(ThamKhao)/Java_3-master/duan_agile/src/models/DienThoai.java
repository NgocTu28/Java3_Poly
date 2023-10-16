package models;

import java.math.BigDecimal;

public class DienThoai {

    private int id;
    private String tenDienThoai;
    private BigDecimal donGia;
    private String gioiThieu;
    private String hinhAnh;
    private int soLuong;
    private int idHang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public DienThoai(int id, String tenDienThoai, BigDecimal donGia, String gioiThieu, String hinhAnh, int soLuong, int idHang) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.donGia = donGia;
        this.gioiThieu = gioiThieu;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.idHang = idHang;
    }

    public DienThoai() {
    }

}
