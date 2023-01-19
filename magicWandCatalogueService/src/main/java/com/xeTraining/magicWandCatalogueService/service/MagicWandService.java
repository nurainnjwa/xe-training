package com.xeTraining.magicWandCatalogueService.service;

import com.xeTraining.magicWandCatalogueService.entity.MagicWand;
import com.xeTraining.magicWandCatalogueService.repository.MagicWandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagicWandService {

    @Autowired
    MagicWandRepository repository;

    public List<MagicWand> getMagicWandCatalogue(){
        return repository.findAll();
    }

    public MagicWand addMagicWandCatalogue(MagicWand magicWand){
        return repository.save(magicWand);
    }

    public void deleteMagicWand(Long id){
        repository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        repository.deleteById(id);
    }

    public MagicWand updateMagicWandCatalogue(MagicWand magicWand){
        repository.findById(magicWand.getId()).orElseThrow(
                () -> new RuntimeException("Not found")
        );
        return repository.save(magicWand);
    }
}
