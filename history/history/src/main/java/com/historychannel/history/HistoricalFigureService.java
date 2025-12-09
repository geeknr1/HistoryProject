package com.historychannel.history;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricalFigureService{
    private final HistoricalFigureRepository repository;
    @Autowired
    public HistoricalFigureService(HistoricalFigureRepository rep){
        this.repository = rep;
    }

    public List<HistoricalFigure> getAllFigures(){
        return this.repository.findAll();
    }

    public Optional<HistoricalFigure> getFigureById(String id){
        return this.repository.findById(id);
    }

    public List<HistoricalFigure> searchFiguresByName(String name){
        return repository.findByFigureNameContainingIgnoreCase(name);
    }

    public HistoricalFigure createFigure(HistoricalFigure figure){
        if(repository.existsByFigureNameIgnoreCase(figure.getFigureName())){
            throw new IllegalArgumentException("historical figure already added");
        }
        return repository.save(figure);
    }

    public void deleteFigure(String id){
        if(! repository.existsById(id)){
            throw new IllegalArgumentException("there's no historical figure to delete");
        }
        else{
            repository.deleteById(id);
        }
    }

    public boolean existsbyID(String id){
        return repository.existsById(id);
    }

    public long getCount(){
        return repository.count();
    }
}