package com.historychannel.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
// import springframework.add.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
//import java.util.List.HashMap;

@RestController
@RequestMapping("@/api/historical-figures")
@CrossOrigin(origins=("*"))
public class HistoricalFigureController{
    private final HistoricalFigureService service;
    @Autowired
    public HistoricalFigureController(HistoricalFigureService ser){
        this.service = ser;
    }

    @GetMapping
    public ResponseEntity<List<HistoricalFigure>> getAllFigures(){
        List<HistoricalFigure> fig = service.getAllFigures();
        return ResponseEntity.ok(fig);
    }

    @GetMapping("/{id}")
    public ResponseEntity <?> getFigureByID(String id){
        return service.getFigureByID(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound());
    }

    @GetMapping("/search")
    public ResponseEntity<List<HistoricalFigure>> searchByName(@RequestParam String name){
        return ResponseEntity.ok(service.searchFiguresByName(name));
    }

    @PostMapping
    public ResponseEntity<?> createFigure(@RequestBody HistoricalFigure figure){
        HistoricalFigure created = service.createFigure(figure);
        return ResponseEntity.status(201).body(created);
    }

    @DeleteMapping("/id")
    public ResponseEntity<?> deleteFigure(String id){
        service.deleteFigure(id);
        return ResponseEntity.noReturnContent().build();
    }

}
