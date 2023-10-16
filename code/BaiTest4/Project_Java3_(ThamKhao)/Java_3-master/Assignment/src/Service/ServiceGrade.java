package Service;

import Entity.Grade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceGrade {

    List<Grade> listGrade = new ArrayList<>();

    public List<Grade> getListGrade() {
        return listGrade;
    }

    public void setListGrade(List<Grade> listGrade) {
        this.listGrade = listGrade;
    }

    public int find(String ma) {
        for (int i = 0; i < listGrade.size(); i++) {
            if (listGrade.get(i).getMaSV().equals(ma)) {
                return i;
            }
        }
        return -1;
    }

    public void insert(Grade g) {
        if (find(g.getMaSV()) < 0) {
            listGrade.add(g);
        }
    }

    public void update(int id, Grade g) {
        if (find(g.getMaSV()) >= 0) {
            listGrade.set(id, g);
        }
    }

    public int delete(String ma) {
        if (find(ma) >= 0) {
            listGrade.remove(find(ma));
            return 1;
        } else {
            return -1;
        }
    }

    public double TinhDiemTB(double a, double b, double c) {
        double tb = 0;
        tb = (double) Math.round(((a + b + c) / 3) * 10) / 10;
        return tb;
    }
    
    public List<Grade> sapXep(){
        Collections.sort(listGrade, (o1,o2) -> Double.compare(TinhDiemTB(o2.getTiengAnh(), o2.getTinHoc(), o2.getGDTC()), TinhDiemTB(o1.getTiengAnh(), o1.getTinHoc(), o1.getGDTC())));
        return listGrade;
    }
}
