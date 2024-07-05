package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.CalisanGiris;
import com.example.webrentacular.Service.CalisanGirisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calisanGiris")
public class CalisanGirisController {
    private final CalisanGirisService calisanGirisService;

    @Autowired
    public CalisanGirisController(CalisanGirisService calisanGirisService) {
        this.calisanGirisService = calisanGirisService;
    }

    @PostMapping("/ekle")
    public CalisanGiris calisanGirisEkle(@RequestBody CalisanGiris calisanGiris) {
        return calisanGirisService.calisanGirisEkle(calisanGiris);
    }

    @PutMapping("/guncelle")
    public CalisanGiris calisanGirisGuncelle(@RequestBody CalisanGiris calisanGiris) {
        return calisanGirisService.calisanGirisGuncelle(calisanGiris);
    }

    @DeleteMapping("/sil/{id}")
    public void calisanGirisSil(@PathVariable Long id) {
        calisanGirisService.calisanGirisSil(id);
    }

    @GetMapping("/tumunu-getir")
    public List<CalisanGiris> tumCalisanGirisleriGetir() {

        return calisanGirisService.tumCalisanGirisleriGetir();
    }
}
