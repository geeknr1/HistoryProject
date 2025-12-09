package com.historychannel.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("@/api/mithology-figures")
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
    public ResponseEntity <?> getDeityById(String id){
        return service.getDeityById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Mithology>> searchByDeityName(@RequestParam String name){
        return ResponseEntity.ok(service.searchDeity(name));
    }

    @PostMapping
    public ResponseEntity<?> createDeity(@RequestBody Mithology mithology){
        Mithology created = service.createDeity(mithology);
        return ResponseEntity.status(201).body(created);
    }

    @DeleteMapping("/id")
    public ResponseEntity<?> deleteDeity(String id){
        service.deleteDeity(id);
        return ResponseEntity.noContent().build();
    }

}
