
package model;


public class HocSinhCB {
    private String maHs, tenHS;

    public HocSinhCB() {
    }

    public HocSinhCB(String maHs, String tenHS) {
        this.maHs = maHs;
        this.tenHS = tenHS;
    }

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    @Override
    public String toString() {
        return maHs;
    }
    
}
