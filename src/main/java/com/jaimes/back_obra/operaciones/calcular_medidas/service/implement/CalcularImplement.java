package com.jaimes.back_obra.operaciones.calcular_medidas.service.implement;

import com.jaimes.back_obra.assets.areas.dto.AreasDTO;
import com.jaimes.back_obra.assets.areas.service.AreaService;
import com.jaimes.back_obra.assets.materiales.dto.ConcretoDTO;
import com.jaimes.back_obra.assets.materiales.dto.MorteroDTO;
import com.jaimes.back_obra.assets.materiales.service.MaterialService;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calcular2dOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calcular3dOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.service.CalcularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcularImplement implements CalcularService {

    private final AreaService areaService;
    private final MaterialService materialService;

    @Autowired
    public CalcularImplement(AreaService areaService, MaterialService materialService) {
        this.areaService = areaService;
        this.materialService = materialService;
    }

    @Override
    public Calcular3dOutDTO calcular(Calcular3dInDTO calcular3DInDTO) {
        AreasDTO areas = areaService.calcular(
                calcular3DInDTO.largo(), calcular3DInDTO.ancho(), calcular3DInDTO.alto(), calcular3DInDTO.cantidad());
        ConcretoDTO dConcreto = materialService.calcularConcreto(areas, calcular3DInDTO.psi());
        return new Calcular3dOutDTO(
                calcular3DInDTO.largo(),
                calcular3DInDTO.ancho(),
                calcular3DInDTO.alto(),
                calcular3DInDTO.cantidad(),
                areas.areaOne(),
                areas.areaAll(),
                calcular3DInDTO.psi(),
                dConcreto.cementoOne(),
                dConcreto.arenaOne(),
                dConcreto.gravaOne(),
                dConcreto.aguaOne(),
                dConcreto.cementoAll(),
                dConcreto.arenaAll(),
                dConcreto.gravaAll(),
                dConcreto.aguaAll()
        );
    }

    @Override
    public Calcular2dOutDTO calcular(Calcular2dInDTO calcular2DInDTO) {
        AreasDTO areas = areaService.calcular(
                calcular2DInDTO.largo(), calcular2DInDTO.ancho(), calcular2DInDTO.cantidad());
        MorteroDTO dMortero = materialService.calcularMortero(areas, calcular2DInDTO.psi());
        return new Calcular2dOutDTO(
                calcular2DInDTO.largo(),
                calcular2DInDTO.ancho(),
                calcular2DInDTO.cantidad(),
                areas.areaOne(),
                areas.areaAll(),
                calcular2DInDTO.psi(),
                dMortero.cementoOne(),
                dMortero.arenaOne(),
                dMortero.aguaOne(),
                dMortero.cementoAll(),
                dMortero.arenaAll(),
                dMortero.aguaAll()
        );
    }
}
