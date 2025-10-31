package com.jaimes.back_obra.operaciones.calcular_medidas.controller;

import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.service.CalcularService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcular")
public class CalcularController {

    private final CalcularService calcularService;

    @Autowired
    public CalcularController(CalcularService calcularService) {
        this.calcularService = calcularService;
    }

    @PostMapping("/3d")
    public ResponseEntity<?> calcularMedidas3d(@Valid @RequestBody Calcular3dInDTO calcular3DInDTO){
        return ResponseEntity.ok(calcularService.calcular(calcular3DInDTO));
    }

    @PostMapping("/2d")
    public ResponseEntity<?> calcularMedidas2d(@Valid @RequestBody Calcular2dInDTO calcular2DInDTO){
        return ResponseEntity.ok(calcularService.calcular(calcular2DInDTO));
    }
}
