package com.example.demo.controller;

import com.example.demo.entity.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author thangdt
 */
@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/view")
    public String home(Model model) {
        List<SinhVien> sinhViens = sinhVienService.getList();
        System.out.println(sinhViens);
        model.addAttribute("data", sinhViens);
        return "index";
    }

    @GetMapping("/addSinhVien")
    public String viewAddSinhVien() {
        return "addSinhVien";

    }

    @GetMapping("/editSinhVien/{id}")
    public String viewUpdateSinhVien(@PathVariable("id") Long id, Model model) {
        model.addAttribute("sinhVien", sinhVienService.findById(id));
        return "updateSinhVien";

    }

    @PostMapping("/insertSinhVien")
    public String insertSinhVien(@ModelAttribute("insertSinhVien") SinhVien sinhVien) {
        sinhVienService.insert(sinhVien);
        return "redirect:/view";
    }

    @PostMapping("/editSinhVien/updateSinhVien")
    public String updateSinhVien(@ModelAttribute("sinhVien") SinhVien sinhVien) {
        sinhVienService.update(sinhVien);
        return "redirect:/view";
    }

    @GetMapping("/deleteSinhVien/{id}")
    public String deleteSinhVien(@PathVariable("id") Long id) {
        sinhVienService.delete(id);
        return "redirect:/view";
    }


}
