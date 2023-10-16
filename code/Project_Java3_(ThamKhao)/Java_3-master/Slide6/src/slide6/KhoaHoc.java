package slide6;

public class KhoaHoc {

    private String MaKH, TenKH;
    private float hocPhi;
    private int thoiLuong;

    public KhoaHoc() {
    }

    public KhoaHoc(String MaKH, String TenKH, float hocPhi, int thoiLuong) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        return MaKH;
    }

}
