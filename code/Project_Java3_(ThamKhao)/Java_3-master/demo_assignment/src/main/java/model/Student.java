
package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student {
    
    @Id
    @Column(name = "MASV")
    private String maSV;

    @Column(name = "Hoten")
    private String hoTen;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "SoDT")
    private String sdt;
    
    @Column(name = "Gioitinh")
    private boolean gioiTinh;
    
    @Column(name = "Diachi")
    private String diaChi;
    
    @Column(name = "Hinh")
    private String hinh;
    
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Grade> listGrade;

    public Student() {
    }

    public Student(String maSV, String hoTen, String email, String sdt, boolean gioiTinh, String diaChi, String hinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public List<Grade> getListGrade() {
        return listGrade;
    }

    public void setListGrade(List<Grade> listGrade) {
        this.listGrade = listGrade;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", hinh=" + hinh + '}';
    }
    
}
