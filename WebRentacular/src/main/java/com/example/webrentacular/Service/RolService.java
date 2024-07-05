package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.Rol;
import com.example.webrentacular.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public Rol rolEkle(Rol rol) {
        return rolRepository.save(rol);
    }

    public Rol rolGuncelle(Rol rol) {
        return rolRepository.save(rol);
    }

    public void rolSil(Long id) {
        rolRepository.deleteById(id);
    }

    public List<Rol> tumRolleriGetir() {
        return rolRepository.findAll();
    }
}
