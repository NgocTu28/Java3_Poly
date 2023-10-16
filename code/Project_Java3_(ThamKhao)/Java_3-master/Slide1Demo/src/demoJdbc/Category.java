package demoJdbc;

public class Category {
    private int id;
    private String ten;
    private String mota;
    private boolean trangThai;

    public Category() {
    }

    public Category(int id, String ten, String mota, boolean trangThai) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.trangThai = trangThai;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", ten=" + ten + ", mota=" + mota + ", trangThai=" + trangThai + '}';
    }
    
}
