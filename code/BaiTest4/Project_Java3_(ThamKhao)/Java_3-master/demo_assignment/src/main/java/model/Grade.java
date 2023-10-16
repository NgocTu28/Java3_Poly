
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GRADE")
public class Grade {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "MASV")
    private String maSV;
    
    @Column(name = "Tienganh")
    private float tiengAnh;
    
    @Column(name = "Tinhoc")
    private float tinHoc;
    
    @Column(name = "GDTC")
    private float gdtc;
    
    @ManyToOne
    @JoinColumn(name = "MASV", nullable = false)
    private Student student;
    
    
}
