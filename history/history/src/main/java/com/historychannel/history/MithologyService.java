package com.historychannel.history;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MithologyService{
    private final MithologyRepository repository;
    @Autowired
    public MithologyService(MithologyRepository rep){
        this.repository = rep;
    }

    public List<Mithology> getAllDeities(){
        return this.repository.findAll();
    }

    public Optional<Mithology> getDeityByID(int id){
        return this.repository.findByID(id);
    }

    public List<Mithology> searchDeity(String deity){
        return repository.findByDeityNameContainingIgnoreCase(deity);
    }

    public Mithology createDeity(Mithology mithology){
        if(repository.existsByDeityNameIgnoreCase(mithology.getAllDeities())){
            throw new IllegalArgumentException("mithology already added");
        }
        return repository.save(mithology);
    }

    public void deleteFigure(String id){
        if(! repository.existsByID(id)){
            throw new IllegalArgumentException("there's no mithology to delete");
        }
        else{
            repository.deleteByID(id);
        }
    }

    public boolean existsbyID(String id){
        return repository.existsByID(id);
    }

    public int getCount(){
        return repository.count();
    }
}