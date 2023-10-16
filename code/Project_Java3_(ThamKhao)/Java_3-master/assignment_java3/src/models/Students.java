
package models;

public class Students {
    private String masv;
    private String hoTen;
    private String email;
    private String soDt;
    private boolean gioiTinh;
    private String diaChi;
    private String hinh;

    public Students() {
    }

    public Students(String masv, String hoTen, String email, String soDt, boolean gioiTinh, String diaChi, String hinh) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.email = email;
        this.soDt = soDt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return "Students{" + "masv=" + masv + ", hoTen=" + hoTen + ", email=" + email + ", soDt=" + soDt + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", hinh=" + hinh + '}';
    }
    
}
