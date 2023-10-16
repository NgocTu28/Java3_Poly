/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vutu8
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String nxb;
    private Float giaTien;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nxb, Float giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.giaTien = giaTien;
    }

    public Float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Float giaTien) {
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", nxb=" + nxb + ", giaTien=" + giaTien + '}';
    }
    
    
}
