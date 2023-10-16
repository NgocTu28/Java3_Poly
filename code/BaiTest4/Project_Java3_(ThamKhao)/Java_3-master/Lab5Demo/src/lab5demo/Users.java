
package lab5demo;

public class Users {
    private String Masv;
    private String hoTen;
    private String Email;
    private String Sdt;
    private boolean gioiTinh;
    private String diaChi;

    public Users() {
    }

    public Users(String Masv, String hoTen, String Email, String Sdt, boolean gioiTinh, String diaChi) {
        this.Masv = Masv;
        this.hoTen = hoTen;
        this.Email = Email;
        this.Sdt = Sdt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
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
    
}
