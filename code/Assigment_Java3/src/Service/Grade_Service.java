package Service;

import java.util.List;
import Model.Grade;
import Repositories.GradeRepository;

public class Grade_Service {

    GradeRepository gradeRepo;

    public Grade_Service() {
        gradeRepo = new GradeRepository();
    }

    public List<Grade> getAll() {
        return gradeRepo.getAll();
    }

    public List<Grade> getTop3() {
        return gradeRepo.getTop3();
    }
    public String findNameByMaSV(String ma) {// lấy ra tên theo mã
        return gradeRepo.findNameByMaSV(ma);
    }

    public Grade findGradeByMaSV(String ma) {// lấy ra bảng điểm theo mã (check trùng)
        return gradeRepo.findGradeByMaSV(ma);
    }

    public void insert(Grade g) {
        gradeRepo.insert(g);
    }

    public void update(String ma, Grade g) {
        gradeRepo.update(ma, g);
    }

    public void delete(String ma) {
        gradeRepo.delete(ma);
    }

    public int findStudentByMaSV(String ma) {// check xem có tồn tại hay không
        return gradeRepo.findStudentByMaSV(ma);
    }
}
