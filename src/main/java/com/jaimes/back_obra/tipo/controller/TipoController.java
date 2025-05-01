package com.jaimes.back_obra.tipo.controller;

import com.jaimes.back_obra.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
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

    @PostMapping("/guardar-tipo-3d")
    public ResponseEntity<?> saveTipo3d(@RequestBody Tipo3dInDTO tipo3dInDTO){
        return ResponseEntity.ok(tipoService.saveTipo3d(tipo3dInDTO));
    }

    @GetMapping("/{id}/buscar-tipo-3d")
    public ResponseEntity<?> findTipo3dById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.findTipo3dById(id));
    }

    @PutMapping("/actualizar-tipo-3d")
    public ResponseEntity<?> updateTipo3d(@RequestBody Tipo3dInDTO tipo3dInDTO){
        return ResponseEntity.ok(tipoService.updateTipo3d(tipo3dInDTO));
    }

    @DeleteMapping("/{id}/borrar-tipo")
    public ResponseEntity<?> deleteTipoById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.deleteTipo(id));
    }

    @PostMapping("/guardar-tipo-2d")
    public ResponseEntity<?> saveTipo2d(@RequestBody Tipo2dInDTO tipo2dInDTO){
        return ResponseEntity.ok(tipoService.saveTipo2d(tipo2dInDTO));
    }

    @GetMapping("/{id}/buscar-tipo-2d")
    public ResponseEntity<?> findTipo2dById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.findTipo2dById(id));
    }

    @PutMapping("/actualizar-tipo-2d")
    public ResponseEntity<?> updateTipo2d(@RequestBody Tipo2dInDTO tipo2dInDTO){
        return ResponseEntity.ok(tipoService.updateTipo2d(tipo2dInDTO));
    }

}
