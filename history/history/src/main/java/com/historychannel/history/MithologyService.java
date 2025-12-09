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

    public Optional<Mithology> getDeityById(String id){
        return this.repository.findById(id);
    }

    public List<Mithology> searchDeity(String deity){
        return repository.findByDeityNameContainingIgnoreCase(deity);
    }

    public Mithology createDeity(Mithology mithology){
        if(repository.existsByDeityNameIgnoreCase(mithology.getDeityName())){
            throw new IllegalArgumentException("mithology already added");
        }
        return repository.save(mithology);
    }

    public void deleteDeity(String id){
        if(! repository.existsById(id)){
            throw new IllegalArgumentException("there's no mithology to delete");
        }
        else{
            repository.deleteById(id);
        }
    }

    public boolean existsbyId(String id){
        return repository.existsById(id);
    }

    public long getCount(){
        return repository.count();
    }
}