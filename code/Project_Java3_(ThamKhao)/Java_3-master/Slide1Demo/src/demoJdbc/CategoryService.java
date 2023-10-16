package demoJdbc;

import java.util.List;

public class CategoryService {

    CategoryRepository cateRepo;

    public CategoryService() {
        cateRepo = new CategoryRepository();
    }

    public List<Category> getListCategory() {
        return cateRepo.all();
    }
    
    public void insert(Category p) {
        cateRepo.insert(p);
    }

    public void update(int id, Category c) {
        cateRepo.update(id, c);
    }

    public void delete(int id) {
        cateRepo.delete(id);
    }

}
