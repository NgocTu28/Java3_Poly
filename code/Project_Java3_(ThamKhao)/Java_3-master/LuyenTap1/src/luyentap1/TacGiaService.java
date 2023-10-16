
package luyentap1;

import java.util.List;

/**
 *
 * @author WIN
 */
public class TacGiaService {
    TacGiaRepository tacGiaRepo;

    public TacGiaService() {
        tacGiaRepo = new TacGiaRepository();
    }
    
    public List<TacGia> getAll(){
        return tacGiaRepo.getAll();
    }
    
    public String findNameById(int id){
        return tacGiaRepo.findNameById(id);
    }
    
    public int findIdByName(String text){
        return tacGiaRepo.findIdByName(text);
    }
    
    public void insert(TacGia t){
        tacGiaRepo.insert(t);
    }
    
    public void update(int id, TacGia t){
        tacGiaRepo.update(id, t);
    }
    
    public void delete(int id) {
        tacGiaRepo.delete(id);
    }
}
