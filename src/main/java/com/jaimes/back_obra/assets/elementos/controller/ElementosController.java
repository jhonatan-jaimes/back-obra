package com.jaimes.back_obra.assets.elementos.controller;

import com.jaimes.back_obra.assets.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.assets.elementos.repository.ConcretoPsi;
import com.jaimes.back_obra.assets.elementos.repository.MorteroPsi;
import com.jaimes.back_obra.assets.elementos.service.ElementosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elementos")
@CrossOrigin(origins = "http://localhost:5173/")
public class ElementosController {

    private final ElementosService elementosService;

    @Autowired
    public ElementosController(ElementosService elementosService) {
        this.elementosService = elementosService;
    }

    @GetMapping("/todos-elementos")
    public ResponseEntity<?> allElementos(){
        return ResponseEntity.ok(elementosService.allElemetnos());
    }

    @GetMapping("/elemento/{id}")
    public ResponseEntity<?> findElemento3d(@PathVariable Long id) {
        return ResponseEntity.ok(elementosService.findElemento(id));
    }

    @GetMapping("/elemento2d/{id}")
    public ResponseEntity<?> findElemento2d(@PathVariable Long id){
        return ResponseEntity.ok(elementosService.findElemento2d(id));
    }

    @PostMapping("/guardar-elemento")
    public ResponseEntity<?> saveElemento(@RequestBody ElementoInDTO elementoInDTO){
        return ResponseEntity.ok(elementosService.saveElemento(elementoInDTO));
    }

    @PostMapping("/guardar-elementos")
    public ResponseEntity<?> saveAllElemetnos(@RequestBody List<ElementoInDTO> elementoInDTOS){
        return ResponseEntity.ok(elementosService.saveAllElementos(elementoInDTOS));
    }

    @DeleteMapping("/eliminar-elemento/{id}")
    public ResponseEntity<?> deleteElemento (@PathVariable Long id){
        return ResponseEntity.ok(elementosService.deleteElemento(id));
    }

    @PutMapping("/actualizar-elemento")
    public ResponseEntity<?> updateElemento(@RequestBody ElementoInDTO elementoInDTO){
        return ResponseEntity.ok(elementosService.updateElemento(elementoInDTO));
    }

    @GetMapping("/mortero-psi")
    public ResponseEntity<List<MorteroPsi>> morteroPsi(){
        return ResponseEntity.ok(elementosService.materialPsiMortero());
    }

    @GetMapping("/concreto-psi")
    public ResponseEntity<List<ConcretoPsi>> concretoPsi(){
        return ResponseEntity.ok(elementosService.materialPsiConcreto());
    }

}
