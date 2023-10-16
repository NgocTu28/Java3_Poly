package com.example.test.controller;

import com.example.test.entity.CuaHang;
import com.example.test.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author SonPT
 */

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    private CuaHangService service;

    @GetMapping("/hien-thi")
    private ResponseEntity getAll() {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @DeleteMapping("/remove")
    private ResponseEntity delete(@RequestParam String id) {
        return new ResponseEntity(service.delete(UUID.fromString(id)), HttpStatus.OK);
    }

    @GetMapping("/detail")
    private ResponseEntity detail(@RequestParam String id) {
        return new ResponseEntity(service.detail(UUID.fromString(id)), HttpStatus.OK);
    }

    @PostMapping("/add")
    private ResponseEntity add(@RequestBody CuaHang cuaHang) {
        return new ResponseEntity(service.add(cuaHang), HttpStatus.OK);
    }

    @PutMapping("/update")
    private ResponseEntity update(@RequestBody CuaHang cuaHang, @RequestParam String id) {
        cuaHang.setId(UUID.fromString(id));
        return new ResponseEntity(service.update(cuaHang), HttpStatus.OK);
    }

}
