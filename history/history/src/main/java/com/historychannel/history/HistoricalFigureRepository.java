package com.historychannel.history;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Repository 
public interface HistoricalFigureRepository extends MongoRepository<HistoricalFigure, String>{
    Optional<HistoricalFigure> findByFigureNameIgnoreCase(String figureName);
    List<HistoricalFigure> findByFigureNameContainingIgnoreCase(String figureName);
    boolean existsByFigureNameIgnoreCase(String figureName);
}