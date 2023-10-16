package services;

import java.util.List;
import models.Ban;
import repositories.BanRepository;

public class BanService {
    
    BanRepository banRepo;

    public BanService() {
        banRepo = new BanRepository();
    }
    
    public List<Ban> getAll(){
        return banRepo.getAll();
    } 
    
    public void update(String ma, Ban b){
        banRepo.update(ma, b);
    }
    
    public void delete(String ma){
        banRepo.delete(ma);
    }
    
}
