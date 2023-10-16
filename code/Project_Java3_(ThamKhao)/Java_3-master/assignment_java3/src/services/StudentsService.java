
package services;

import java.util.List;
import models.Students;
import repositories.StudentsRepository;

public class StudentsService {
    
    StudentsRepository stuRepo;

    public StudentsService() {
        stuRepo = new StudentsRepository();
    }
    
    public List<Students> getALl(){
        return stuRepo.getAll();
    }
    
    public void insert(Students s){
        stuRepo.insert(s);
    }
    
    public void update(String ma, Students s){
        stuRepo.update(ma, s);
    }
    
    public void delete(String ma){
        stuRepo.delete(ma);
    }
    
    public int searchByMaSV(String ma){
        return stuRepo.searchByMaSV(ma);
    }
}
