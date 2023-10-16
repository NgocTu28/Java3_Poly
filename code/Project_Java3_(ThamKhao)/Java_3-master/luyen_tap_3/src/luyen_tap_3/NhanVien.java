
package luyen_tap_3;

public class NhanVien {
    private int id;
    private String ten;
    private String maNV;
    private String sdt;
    private int tuoi;
    private int vaiTro;

    public NhanVien() {
    }

    public NhanVien(int id, String ten, String maNV, String sdt, int tuoi, int vaiTro) {
        this.id = id;
        this.ten = ten;
        this.maNV = maNV;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.vaiTro = vaiTro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }
    
}
