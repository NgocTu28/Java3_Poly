package luyentap1;

import java.util.List;

public class SachService {

    SachRepository sachRepo;

    public SachService() {
        sachRepo = new SachRepository();
    }

    public void insert(Sach s) {
        sachRepo.insert(s);
    }

    public void update(int id, Sach s) {
        sachRepo.update(id, s);
    }

    public void delete(int id) {
        sachRepo.delete(id);
    }

    public List<Sach> getAll() {
        return sachRepo.getAll();
    }

}
