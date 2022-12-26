package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author thangdt
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sinh_vien")
public class SinhVien {

    @Id
    @Column(name = "ma_sinh_vien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maSinhVien;

    @Column(name = "ten_sinh_vien", nullable = true)
    private String tenSinhVien;
}
