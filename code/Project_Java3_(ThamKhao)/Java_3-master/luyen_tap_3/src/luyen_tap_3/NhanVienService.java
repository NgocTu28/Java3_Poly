
package luyen_tap_3;

import java.util.List;

public class NhanVienService {
    
    NhanVienRepository nVRepo;

    public NhanVienService() {
        nVRepo = new NhanVienRepository();
    }
    
    public List<NhanVien> getAll(){
        return nVRepo.getAll();
    }
    
    public void insert(NhanVien n){
        nVRepo.insert(n);
    }
    
    public NhanVien findNhanVienByMaNV(String ma){
        return nVRepo.findNhanVienByMaNV(ma);
    }
    
    public void update(int id, NhanVien n){
        nVRepo.update(id, n);
    }
    
    public void delete(int id){
        nVRepo.delete(id);
    }
}
