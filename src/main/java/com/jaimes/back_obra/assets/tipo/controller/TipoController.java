package com.jaimes.back_obra.assets.tipo.controller;

import com.jaimes.back_obra.assets.tipo.dto.input.Tipo2dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.service.TipoService;
import jakarta.validation.Valid;
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
    public ResponseEntity<?> saveTipo3d(@Valid @RequestBody Tipo3dConcretoInDTO tipo3DConcretoInDTO){
        return ResponseEntity.ok(tipoService.saveTipo3d(tipo3DConcretoInDTO));
    }

    @GetMapping("/buscar-tipo-3d/{id}")
    public ResponseEntity<?> findTipo3dById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.findTipo3dById(id));
    }

    @PutMapping("/actualizar-tipo-3d")
    public ResponseEntity<?> updateTipo3d(@Valid @RequestBody Tipo3dConcretoInDTO tipo3DConcretoInDTO){
        return ResponseEntity.ok(tipoService.updateTipo3d(tipo3DConcretoInDTO));
    }

    @DeleteMapping("/borrar-tipo/{id}")
    public ResponseEntity<?> deleteTipoById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.deleteTipo(id));
    }

    @PostMapping("/guardar-tipo-2d")
    public ResponseEntity<?> saveTipo2d(@Valid @RequestBody Tipo2dConcretoInDTO tipo2DConcretoInDTO){
        return ResponseEntity.ok(tipoService.saveTipo2d(tipo2DConcretoInDTO));
    }

    @GetMapping("/buscar-tipo-2d/{id}")
    public ResponseEntity<?> findTipo2dById(@PathVariable Long id){
        return ResponseEntity.ok(tipoService.findTipo2dById(id));
    }

    @PutMapping("/actualizar-tipo-2d")
    public ResponseEntity<?> updateTipo2d(@Valid @RequestBody Tipo2dConcretoInDTO tipo2DConcretoInDTO){
        return ResponseEntity.ok(tipoService.updateTipo2d(tipo2DConcretoInDTO));
    }

    @GetMapping("/buscar-tipos")
    public ResponseEntity<?> allTipos(){
        return ResponseEntity.ok(tipoService.findAllTipo());
    }

    @GetMapping("/buscar-tipos3d")
    public ResponseEntity<?> allTipos3d(){
        return ResponseEntity.ok(tipoService.findAllTipo());
    }

    @GetMapping("/buscar-tipos2d")
    public ResponseEntity<?> allTipo2d(){
        return ResponseEntity.ok(tipoService.findAllTipo2d());
    }

}
