package com.historychannel.history;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

@Repository 
public interface HistoricalFigureRepository extends MongoRepository<HistoricalFigure, String>{
    Optional<HistoricalFigure> findByFigureNameIgnoreCase(String figureName);
    List<HistoricalFigure> findByFigureNameContainingIgnoreCase(String figureName);
    boolean existsByFigureNameIgnoreCase(String figureName);
}