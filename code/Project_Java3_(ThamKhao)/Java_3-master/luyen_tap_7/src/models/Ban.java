package models;

public class Ban {
    
    private String ma;
    private String ten;
    private String soThich;
    private int gioiTinh;

    public Ban() {
    }

    public Ban(String ma, String ten, String soThich, int gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

    
}
