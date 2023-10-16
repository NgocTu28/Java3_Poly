package services;

import java.util.List;
import models.MoiQuanHe;
import repositories.MoiQuanHeRepository;

public class MoiQuanHeService {
    
    MoiQuanHeRepository mqhRepo;

    public MoiQuanHeService() {
        mqhRepo = new MoiQuanHeRepository();     
    }
    
    public List<MoiQuanHe> getListMQH(){
        return mqhRepo.getAll();
    }
}
