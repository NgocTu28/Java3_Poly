package demoJdbc;

import java.util.List;

public class ProductService {

    ProductRepository prodRepo;

    public ProductService() {
        prodRepo = new ProductRepository();
    }

    public List<Product> getListProduct() {
        return prodRepo.all();
    }

//    public Product findProduct(int id){
//        for (int i = 0; i < listProduct.size(); i++) {
//            if(id == listProduct.get(i).getId()){
//                return listProduct.get(i);
//            }
//        }
//        return null;
//    }
    
    public void insert(Product p) {
        prodRepo.insert(p);
    }

    public void update(int id, Product p) {
        prodRepo.update(id, p);
    }

    public void delete(int id) {
        prodRepo.delete(id);
    }

}
