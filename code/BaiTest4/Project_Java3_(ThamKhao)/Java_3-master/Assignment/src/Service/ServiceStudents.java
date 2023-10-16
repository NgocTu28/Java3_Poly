package Service;

import Entity.Students;
import java.util.ArrayList;
import java.util.List;

public class ServiceStudents {
    private List<Students> listStudents = new ArrayList<>();
    
    public List<Students> listStudents(){
        return listStudents;
    }

    public void setListStudents(List<Students> listStudents) {
        this.listStudents = listStudents;
    }
    
    public int find(String ma){
        for (int i = 0; i < listStudents.size(); i++) {
            if(ma.equals(listStudents.get(i).getMaSV())){
                return i;
            }
        }
        return -1;
    }
    
    public int delete(String ma){
        if(find(ma) >= 0){
            listStudents.remove(find(ma));
            return 1;
        }else{
            return -1;
        }
    }
    
    public void insert(Students s){
        if(find(s.getMaSV()) < 0){
            listStudents.add(s);
        }
    }
    
    public void update(int id,Students s){
            listStudents.set(id, s);
    }
    
}
