package services;

import java.util.List;
import repositories.HangDienThoaiRepository;

public class HangDienThoaiService {
    HangDienThoaiRepository hangRepo;

    public HangDienThoaiService() {
        hangRepo = new HangDienThoaiRepository();
    }
    
    public List<String> getTenHang(){
        return hangRepo.getTenHang();
    }
    
    public String findNameById(int id){
        return hangRepo.findNameById(id);
    }
    
    public int findIdByName(String name){
        return hangRepo.findIdByName(name);
    }
    
}
