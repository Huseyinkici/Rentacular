package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.Departman;
import com.example.webrentacular.Service.DepartmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departman")
public class DepartmanController {
    private final DepartmanService departmanService;

    @Autowired
    public DepartmanController(DepartmanService departmanService) {
        this.departmanService = departmanService;
    }

    @PostMapping("/ekle")
    public Departman departmanEkle(@RequestBody Departman departman) {
        return departmanService.departmanEkle(departman);
    }

    @PutMapping("/guncelle")
    public Departman departmanGuncelle(@RequestBody Departman departman) {
        return departmanService.departmanGuncelle(departman);
    }

    @DeleteMapping("/sil/{id}")
    public void departmanSil(@PathVariable Long id) {
        departmanService.departmanSil(id);
    }

    @GetMapping("/tumunu-getir")
    public List<Departman> tumDepartmanlariGetir() {
        return departmanService.tumDepartmanlariGetir();
    }
}
