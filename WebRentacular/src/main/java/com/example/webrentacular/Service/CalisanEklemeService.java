package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.CalisanEkleme;
import com.example.webrentacular.Repository.CalisanEklemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalisanEklemeService {

    private final CalisanEklemeRepository calisanEklemeRepository;

    @Autowired
    public CalisanEklemeService(CalisanEklemeRepository calisanEklemeRepository){
        this.calisanEklemeRepository = calisanEklemeRepository;
    }
    public CalisanEkleme ekleCalisan(CalisanEkleme calisan){
        return calisanEklemeRepository.save(calisan);
    }
    public CalisanEkleme guncelleCalisan(CalisanEkleme calisan) {
        return calisanEklemeRepository.save(calisan);
    }

    public void silCalisan(Long id) {
        calisanEklemeRepository.deleteById(id);
    }

    public List<CalisanEkleme> tumCalisanlariGetir() {
        return calisanEklemeRepository.findAll();
    }
}
