package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.CalisanGiris;
import com.example.webrentacular.Repository.CalisanGirisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalisanGirisService {
    private final CalisanGirisRepository calisanGirisRepository;

    @Autowired
    public CalisanGirisService(CalisanGirisRepository calisanGirisRepository) {
        this.calisanGirisRepository = calisanGirisRepository;
    }

    public CalisanGiris calisanGirisEkle(CalisanGiris calisanGiris) {
        return calisanGirisRepository.save(calisanGiris);
    }

    public CalisanGiris calisanGirisGuncelle(CalisanGiris calisanGiris) {
        return calisanGirisRepository.save(calisanGiris);
    }

    public void calisanGirisSil(Long id) {

        calisanGirisRepository.deleteById(id);
    }

    public List<CalisanGiris> tumCalisanGirisleriGetir() {

        return calisanGirisRepository.findAll();
    }
}
