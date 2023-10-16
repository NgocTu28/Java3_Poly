/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.InventoryLog;
import java.util.List;
import response.InventoryLogResponse;

/**
 *
 * @author ThinkPad
 */
public interface IInventoryLogService {

    List<InventoryLogResponse> getAllLogById(String id);

    String insertLog(InventoryLog log);

    boolean deleteLogByIdProDuct(String id);
    
    List<InventoryLogResponse> getAllLog();
    
    List<InventoryLogResponse> getAllXuatDesc();
    
    List<InventoryLogResponse> findLogByMode(int mode, String key);

}
