package com.example.webrentacular.Controller;

import com.example.webrentacular.Entity.FirmaGiris;
import com.example.webrentacular.Service.FirmaGirisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/firmaGiris")
public class FirmaGirisController {

    private final FirmaGirisService firmaGirisService;

    @Autowired
    public FirmaGirisController(FirmaGirisService firmaGirisService) {
        this.firmaGirisService = firmaGirisService;
    }

    @PostMapping("/ekle")
    public FirmaGiris firmaGirisEkle(@RequestBody FirmaGiris firmaGiris) {
        return firmaGirisService.firmaGirisEkle(firmaGiris);
    }

    @PutMapping("/guncelle")
    public FirmaGiris firmaGirisGuncelle(@RequestBody FirmaGiris firmaGiris) {
        return firmaGirisService.firmaGirisGuncelle(firmaGiris);
    }

    @DeleteMapping("/sil/{id}")
    public void firmaGirisSil(@PathVariable Long id) {
        firmaGirisService.firmaGirisSil(id);
    }

    @GetMapping("/tumunu-getir")
    public List<FirmaGiris> tumFirmaGirisleriGetir() {
        return firmaGirisService.tumFirmaGirisleriGetir();
    }
}
