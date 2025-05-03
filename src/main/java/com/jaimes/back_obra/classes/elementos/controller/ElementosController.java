package com.jaimes.back_obra.classes.elementos.controller;

import com.jaimes.back_obra.classes.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.classes.elementos.service.ElementosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elementos")
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

    @GetMapping("/{id}/elemento3d")
    public ResponseEntity<?> findElemento3d(@PathVariable Long id) {
        return ResponseEntity.ok(elementosService.findElemento3d(id));
    }

    @GetMapping("/{id}/elemento2d")
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

    @DeleteMapping("/{id}/eliminar-elemento")
    public ResponseEntity<?> deleteElemento (@PathVariable Long id){
        return ResponseEntity.ok(elementosService.deleteElemento(id));
    }

    @PutMapping("/actualizar-elemento")
    public ResponseEntity<?> updateElemento(@RequestBody ElementoInDTO elementoInDTO){
        return ResponseEntity.ok(elementosService.updateElemento(elementoInDTO));
    }

}
