package model;

public class SinhVien {

    private String masv, hoten, nganh;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, String nganh, int tuoi) {
        this.masv = masv;
        this.hoten = hoten;
        this.nganh = nganh;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return masv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
