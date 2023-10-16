package luyentap1;

public class TacGia {

    private int id;
    private String ten;
    private String SDT;
    private String email;

    public TacGia() {
    }

    public TacGia(int id, String ten, String SDT, String email) {
        this.id = id;
        this.ten = ten;
        this.SDT = SDT;
        this.email = email;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ten ;
    }
    
}
