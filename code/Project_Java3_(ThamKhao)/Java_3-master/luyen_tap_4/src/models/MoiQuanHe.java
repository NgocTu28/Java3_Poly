package models;

public class MoiQuanHe {
    private String id;
    private String ma;
    private String ten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

   

    public MoiQuanHe() {
    }

    public MoiQuanHe(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }

   

    @Override
    public String toString() {
        return ten;
    }
    
    

    
}
