package com.example.demo.service;

import com.example.demo.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thangdt
 */

public interface SinhVienService {

    List<SinhVien> getList();

    SinhVien insert(SinhVien sinhVien);

    boolean delete(long id);

    SinhVien update( SinhVien sinhVien);

    SinhVien findById(long id);
}
