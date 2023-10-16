package Service;

import Model.Students;
import Repositories.Students_Repositories;
import java.util.ArrayList;

public class Student_service {

    Students_Repositories studentsRepo = new Students_Repositories();

    public ArrayList<Students> getToAll() {
        return studentsRepo.getToAll();
    }

    public void addStudent(Students st) {
        studentsRepo.addStudent(st);
    }

    public void updateStudents(Students st, String masv) {
        studentsRepo.updateStudents(st, masv);
    }
    
    public void removeStudents(String masv){
        studentsRepo.removeStudents(masv);
    }
    
    public void searchStudents(String masv){
        studentsRepo.searchStudents(masv);
    }

}
