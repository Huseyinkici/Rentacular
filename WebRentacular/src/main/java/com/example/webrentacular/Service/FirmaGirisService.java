package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.FirmaGiris;
import com.example.webrentacular.Repository.FirmaGirisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmaGirisService {
    private final FirmaGirisRepository firmaGirisRepository;

    @Autowired
    public FirmaGirisService(FirmaGirisRepository firmaGirisRepository) {
        this.firmaGirisRepository = firmaGirisRepository;
    }

    public FirmaGiris firmaGirisEkle(FirmaGiris firmaGiris) {
        return firmaGirisRepository.save(firmaGiris);
    }

    public FirmaGiris firmaGirisGuncelle(FirmaGiris firmaGiris) {
        return firmaGirisRepository.save(firmaGiris);
    }

    public void firmaGirisSil(Long id) {
        firmaGirisRepository.deleteById(id);
    }

    public List<FirmaGiris> tumFirmaGirisleriGetir() {
        return firmaGirisRepository.findAll();
    }
}
