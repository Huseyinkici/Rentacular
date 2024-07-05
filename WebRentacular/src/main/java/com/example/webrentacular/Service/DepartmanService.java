package com.example.webrentacular.Service;

import com.example.webrentacular.Entity.Departman;
import com.example.webrentacular.Repository.DepartmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmanService {
    private final DepartmanRepository departmanRepository;

    @Autowired
    public DepartmanService(DepartmanRepository departmanRepository) {
        this.departmanRepository = departmanRepository;
    }

    public Departman departmanEkle(Departman departman) {
        return departmanRepository.save(departman);
    }

    public Departman departmanGuncelle(Departman departman) {
        return departmanRepository.save(departman);
    }

    public void departmanSil(Long id) {
        departmanRepository.deleteById(id);
    }

    public List<Departman> tumDepartmanlariGetir() {

        return departmanRepository.findAll();
    }
}
