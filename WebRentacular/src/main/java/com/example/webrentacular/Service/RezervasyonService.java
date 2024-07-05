package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.Rezervasyon;
import com.example.webrentacular.Repository.RezervasyonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervasyonService {
    private final RezervasyonRepository rezervasyonRepository;

    @Autowired
    public RezervasyonService(RezervasyonRepository rezervasyonRepository) {
        this.rezervasyonRepository = rezervasyonRepository;
    }

    public Rezervasyon rezervasyonEkle(Rezervasyon rezervasyon) {
        return rezervasyonRepository.save(rezervasyon);
    }

    public Rezervasyon rezervasyonGuncelle(Rezervasyon rezervasyon) {
        return rezervasyonRepository.save(rezervasyon);
    }

    public void rezervasyonSil(Long id) {
        rezervasyonRepository.deleteById(id);
    }

    public List<Rezervasyon> tumRezervasyonlariGetir() {
        return rezervasyonRepository.findAll();
    }
}
