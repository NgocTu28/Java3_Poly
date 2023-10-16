package com.example.test.service.impl;

import com.example.test.entity.CuaHang;
import com.example.test.repository.CuaHangRepository;
import com.example.test.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author SonPT
 */

@Service
public class CuaHangServiceImpl implements CuaHangService {

    @Autowired
    private CuaHangRepository repository;

    @Override
    public List<CuaHang> getAll() {
        return repository.findAll();
    }

    @Override
    public Boolean add(CuaHang cuaHangNew) {
        cuaHangNew = repository.save(cuaHangNew);
        if (cuaHangNew != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean delete(UUID id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CuaHang detail(UUID id) {
        return repository.findById(id).get();
    }

    @Override
    public Boolean update(CuaHang cuaHang) {
        if (repository.findById(cuaHang.getId()).isPresent()) {
            repository.save(cuaHang);
            return true;
        } else {
            return false;
        }
    }

}
