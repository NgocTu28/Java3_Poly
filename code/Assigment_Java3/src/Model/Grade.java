package Model;

public class Grade {

    private int id;
    private String masv;
    private float tiengAnh;
    private float tinHoc;
    private float gdtc;

    public Grade() {
    }

    public Grade(int id, String masv, float tiengAnh, float tinHoc, float gdtc) {
        this.id = id;
        this.masv = masv;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gdtc = gdtc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getGdtc() {
        return gdtc;
    }

    public void setGdtc(float gdtc) {
        this.gdtc = gdtc;
    }

    public float tinhDiemTB(float tiengAnh, float tinHoc, float gdtc) {
        return (float) Math.round(((tiengAnh + tinHoc + gdtc) / 3) * 10) / 10;
    }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", masv=" + masv + ", tiengAnh=" + tiengAnh + ", tinHoc=" + tinHoc + ", gdtc=" + gdtc + '}';
    }

}
