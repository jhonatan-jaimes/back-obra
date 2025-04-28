package com.jaimes.back_obra.tipo.controller;

import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/tipo3d")
    public ResponseEntity<?> findTipo3dById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.findTipoById(id));
    }
}
