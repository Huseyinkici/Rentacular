package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.Rol;
import com.example.webrentacular.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rol")
public class RolController {

    private final RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping("/ekle")
    public Rol rolEkle(@RequestBody Rol rol) {
        return rolService.rolEkle(rol);
    }

    @PutMapping("/guncelle")
    public Rol rolGuncelle(@RequestBody Rol rol) {
        return rolService.rolGuncelle(rol);
    }

    @DeleteMapping("/sil/{id}")
    public void rolSil(@PathVariable Long id) {
        rolService.rolSil(id);
    }

    @GetMapping("/tumunu-getir")
    public List<Rol> tumRolleriGetir() {

        return rolService.tumRolleriGetir();
    }
}
