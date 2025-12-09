package com.historychannel.history;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Repository 
public interface MithologyRepository extends MongoRepository<Mithology, String>{
    Optional<Mithology> findByDeityNameIgnoreCase(String deityName);
    List<Mithology> findByDeityNameContainingIgnoreCase(String deityName);
    boolean existsByDeityNameIgnoreCase(String deityName);
}