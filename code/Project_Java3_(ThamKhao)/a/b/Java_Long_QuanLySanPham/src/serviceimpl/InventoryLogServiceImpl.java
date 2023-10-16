/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.InventoryLog;
import java.util.List;
import repository.InventoryLogRepository;
import response.InventoryLogResponse;
import service.IInventoryLogService;

/**
 *
 * @author ThinkPad
 */
public class InventoryLogServiceImpl implements IInventoryLogService {

    private InventoryLogRepository repo;

    public InventoryLogServiceImpl() {
        repo = new InventoryLogRepository();
    }

    @Override
    public List<InventoryLogResponse> getAllLogById(String id) {
        return repo.getAllLogById(id);
    }

    @Override
    public String insertLog(InventoryLog log) {
        return repo.insertLog(log);
    }

    @Override
    public boolean deleteLogByIdProDuct(String id) {
        return repo.deleteLogByIdProDuct(id);
    }

    @Override
    public List<InventoryLogResponse> getAllLog() {
        return repo.getAllLog();
    }

    @Override
    public List<InventoryLogResponse> getAllXuatDesc() {
        return repo.getAllXuatDesc();
    }

    @Override
    public List<InventoryLogResponse> findLogByMode(int mode, String key) {
        return repo.findLogByMode(mode, key);
    }

}
