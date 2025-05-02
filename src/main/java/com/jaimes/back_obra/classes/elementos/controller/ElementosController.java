package com.jaimes.back_obra.classes.elementos.controller;

import com.jaimes.back_obra.classes.elementos.service.ElementosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elementos")
public class ElementosController {

    private final ElementosService elementosService;

    @Autowired
    public ElementosController(ElementosService elementosService) {
        this.elementosService = elementosService;
    }

    @GetMapping("/{id}/todo")
    public ResponseEntity<?> findTodo(@PathVariable Long id){
        return ResponseEntity.ok(elementosService.findElemento(id));
    }
}
