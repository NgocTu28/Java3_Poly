package models;

public class HangDienThoai {

    private int id;
    private String tenHang;
    private String moTa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public HangDienThoai(int id, String tenHang, String moTa) {
        this.id = id;
        this.tenHang = tenHang;
        this.moTa = moTa;
    }

    public HangDienThoai() {
    }

}
