/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Category;
import java.util.List;
import repository.CategoryRepository;
import service.ICategoryService;

/**
 *
 * @author ThinkPad
 */
public class CategoryServiceImpl implements ICategoryService {

    private CategoryRepository repo;

    public CategoryServiceImpl() {
        repo = new CategoryRepository();
    }

    @Override
    public List<Category> getAllCategory() {
        return repo.getAllCategory();
    }

    @Override
    public String getIdCategoryByName(String name) {
        return repo.getIdCategoryByName(name);
    }

}
