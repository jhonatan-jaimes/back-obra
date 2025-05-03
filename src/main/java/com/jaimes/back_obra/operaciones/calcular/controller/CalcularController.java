package com.jaimes.back_obra.operaciones.calcular;

import com.jaimes.back_obra.operaciones.calcular.controller.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.service.CalcularService;
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

    @PostMapping("/medidas-3d")
    public ResponseEntity<?> calcularMedidas3d(@RequestBody Medidas3dCantidadInDTO medidas3dCantidadInDTO){
        return ResponseEntity.ok(calcularService.calcularTipo3d(medidas3dCantidadInDTO));
    }
}
