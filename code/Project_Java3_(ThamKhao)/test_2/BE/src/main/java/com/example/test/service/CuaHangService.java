package com.example.test.service;

import com.example.test.entity.CuaHang;

import java.util.List;
import java.util.UUID;

/**
 * @author SonPT
 */
public interface CuaHangService {

    List<CuaHang> getAll();

    Boolean add(CuaHang cuaHangNew);

    Boolean delete(UUID id);

    CuaHang detail(UUID id);

    Boolean update(CuaHang cuaHang);

}
