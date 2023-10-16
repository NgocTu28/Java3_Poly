
package luyen_tap_2;

import java.util.List;

public class KhachHangService {
    
    KhachHangRepository khachHangRepo;

    public KhachHangService() {
        khachHangRepo = new KhachHangRepository();
    }
    
    public List<KhachHang> getAll(){
        return khachHangRepo.getAll();
    }
    
    public void insert(KhachHang k){
        khachHangRepo.insert(k);
    }
    
    public void update(int id, KhachHang k){
        khachHangRepo.update(id, k);
    }
   
    public void delete(int id){
        khachHangRepo.delete(id);
    }
}
