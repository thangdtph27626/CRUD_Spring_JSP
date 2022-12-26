package com.example.demo.service.impl;

import com.example.demo.entity.SinhVien;
import com.example.demo.repository.SinhVienRepository;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author thangdt
 */
@Service
public class SinhVienServiceImpl  implements SinhVienService {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVien> getList() {
        return sinhVienRepository.findAll();
    }

    @Override
    public SinhVien insert(SinhVien sinhVien) {
        return sinhVienRepository.save(sinhVien);
    }

    @Override
    public boolean delete(long id) {
        Optional<SinhVien> sinhVien = sinhVienRepository.findById(id);
        if (sinhVien.isPresent()) {
            sinhVienRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public SinhVien update( SinhVien sinhVien) {
        SinhVien editSinhVien = sinhVienRepository.findById(sinhVien.getMaSinhVien()).orElse(null);
        sinhVien.setTenSinhVien(sinhVien.getTenSinhVien());
        return sinhVienRepository.save(sinhVien);
    }

    @Override
    public SinhVien findById(long id) {
        return sinhVienRepository.findById(id).orElse(null);
    }


}
