package com.example.test.repository;

import com.example.test.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author SonPT
 */

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
}
