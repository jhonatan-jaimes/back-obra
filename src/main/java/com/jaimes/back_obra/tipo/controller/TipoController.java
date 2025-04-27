package com.jaimes.back_obra.tipo.controller;

import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipo")
public class TipoController {

    private final TipoService tipoService;

    @Autowired
    public TipoController(TipoService tipoService) {
        this.tipoService = tipoService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> saveTipo(@RequestBody TipoInDTO tipoInDTO){
        return ResponseEntity.ok(tipoService.saveTipo(tipoInDTO));
    }
}
