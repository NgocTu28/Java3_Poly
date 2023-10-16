package services;

import java.util.List;
import models.DienThoai;
import repositories.DienThoaiRepository;

public class DienThoaiService {

    DienThoaiRepository dienThoaiRepo;

    public DienThoaiService() {
        dienThoaiRepo = new DienThoaiRepository();
    }

    public List<DienThoai> getAll() {
        return dienThoaiRepo.getAll();
    }

    public void insert(DienThoai d) {
        dienThoaiRepo.insert(d);
    }

    public void update(int id, DienThoai d) {
        dienThoaiRepo.update(id, d);
    }

    public void delete(int id) {
        dienThoaiRepo.delete(id);
    }

    public List<DienThoai> findDienThoaiByName(String name){
        return dienThoaiRepo.finDienThoaiByName(name);
    }
    
    public List<DienThoai> sapXepTheoGiaTangDan(){
        return dienThoaiRepo.sapXepTheoGiaTangDan();
    }
    
    public List<DienThoai> sapXepTheoGiaGiamDan(){
        return dienThoaiRepo.sapXepTheoGiaGiamDan();
    }
    
    public List<DienThoai> sapXepTheoSoLuongTangDan(){
        return dienThoaiRepo.sapXepTheoSoLuongTangDan();
    }
    
    public List<DienThoai> sapXepTheoSoLuongGiamDan(){
        return dienThoaiRepo.sapXepTheoSoLuongGiamDan();
    }
    
}
