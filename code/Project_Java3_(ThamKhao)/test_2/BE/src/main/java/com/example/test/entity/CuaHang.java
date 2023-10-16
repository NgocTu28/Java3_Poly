package com.example.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author SonPT
 */

@Table(name = "cuahang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CuaHang {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "thanhpho")
    private String thanhPho;

    @Column(name = "diachi")
    private String diaChi;

}
