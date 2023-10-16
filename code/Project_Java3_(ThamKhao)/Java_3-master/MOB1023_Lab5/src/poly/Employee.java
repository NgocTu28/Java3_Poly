
package poly;

import java.io.Serializable;

public class Employee implements Serializable{
   // -	manv, hoten, tuoi, ngoaingu
    private String maNV,hoTen,ngoaiNgu;
    private int tuoi;

    public Employee() {
    }

    public Employee(String maNV, String hoTen, String ngoaiNgu, int tuoi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngoaiNgu = ngoaiNgu;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Employee{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", ngoaiNgu=" + ngoaiNgu + ", tuoi=" + tuoi + '}';
    }
    
    public String getTuoiLaoDong(int tuoi){
        if(tuoi<18){
            return "Chưa trưởng thành";
        }else if(tuoi<40){
            return "Tuổi trẻ";
        }else if( tuoi<60){
            return "Tuổi sắp về hưu";
        }else{
            return "Tuổi già";
        }
    }


}
