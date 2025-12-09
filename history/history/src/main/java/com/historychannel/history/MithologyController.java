package com.historychannel.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("@/api/historical-figures")
@CrossOrigin(origins=("*"))
public class MithologyController{
    private final MithologyService service;
    @Autowired
    public MithologyController(MithologyService ser){
        this.service = ser;
    }

    @GetMapping
    public ResponseEntity<List<Mithology>> getAllDeities(){
        List<Mithology> mith = service.getAllDeities();
        return ResponseEntity.ok(mith);
    }

    @GetMapping("/{id}")
    public ResponseEntity <?> getDeityByID(String id){
        return service.getDeityByID(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Mithology>> searchByDeityName(@RequestParam String name){
        return ResponseEntity.ok(service.searchDeitiesByName(name));
    }

    @PostMapping
    public ResponseEntity<?> createDeity(@RequestBody Mithology mithology){
        Mithology created = service.createDeity(mithology);
        return ResponseEntity.status(201).body(created);
    }

    @DeleteMapping("/id")
    public ResponseEntity<?> deleteDeity(String id){
        service.deleteDeity(id);
        return ResponseEntity.noReturnContent().build();
    }

}
