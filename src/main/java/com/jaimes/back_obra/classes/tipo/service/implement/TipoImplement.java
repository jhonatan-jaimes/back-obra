package com.jaimes.back_obra.classes.tipo.service.implement;

import com.jaimes.back_obra.classes.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dMorteroInDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.TipoAllOutDTO;
import com.jaimes.back_obra.classes.tipo.repository.TipoRepository;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import com.jaimes.back_obra.classes.tipo.service.TipoService;
import com.jaimes.back_obra.classes.tipo.utilidad.TipoEntityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoImplement implements TipoService {

    private final TipoRepository tipoRepository;

    @Autowired
    public TipoImplement(TipoRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    @Override
    public String saveTipo3d(Object object) {
        if(object instanceof Tipo3dConcretoInDTO tipo3dConcretoInDTO){
            Tipo tipo = TipoEntityDto.dtoToEntity3d(tipo3dConcretoInDTO);
            tipoRepository.save(tipo);
        } else if (object instanceof Tipo3dMorteroInDTO tipo3dMorteroInDTO) {
            Tipo tipo = TipoEntityDto.dtoToEntity3d(tipo3dMorteroInDTO);
            tipoRepository.save(tipo);
        }
        return "Guardado";
    }



    @Override
    public Tipo3dOutDTO findTipo3dById(Long id) {
        Tipo tipo = tipoRepository.findById(id).orElseThrow();
        Tipo3dOutDTO tipo3DOneOutDTO = TipoEntityDto.entity3dToDto(tipo);
        return tipo3DOneOutDTO;
    }

    @Override
    public String updateTipo3d(Tipo3dConcretoInDTO tipo3DConcretoInDTO) {
        Tipo tipo = tipoRepository.findById(tipo3DConcretoInDTO.getId()).orElseThrow();
        TipoEntityDto.updateTipo3d(tipo, tipo3DConcretoInDTO);
        tipoRepository.save(tipo);
        return "Actualizado";
    }

    @Override
    public String deleteTipo(Long id) {
        tipoRepository.deleteById(id);
        return "Eliminado";
    }

    @Override
    public Tipo2dOutDTO findTipo2dById(Long id) {
        Tipo tipo = tipoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo no encontrado"));
        Tipo2dOutDTO tipo2DOutDTO = TipoEntityDto.entity2dToDto(tipo);
        return tipo2DOutDTO;
    }

    @Override
    public String updateTipo2d(Tipo2dInDTO tipo2dInDTO) {
        Tipo tipo = tipoRepository.findById(tipo2dInDTO.getId())
                .orElseThrow(() -> new RuntimeException("El tipo no fue encontrado"));
        TipoEntityDto.updateTipo2d(tipo, tipo2dInDTO);
        tipoRepository.save(tipo);
        return "Actualizado";
    }

    @Override
    public String saveTipo2d(Tipo2dInDTO tipo2dInDTO) {
        Tipo tipo = TipoEntityDto.dtoToEntity2d(tipo2dInDTO);
        tipoRepository.save(tipo);
        return "Guardado";
    }

    @Override
    public List<TipoAllOutDTO> findAllTipo() {
        List<Tipo> tipos = tipoRepository.findAll();
        return  TipoEntityDto.listAllTipos(tipos);
    }

    @Override
    public List<Tipo3dOutDTO> findAllTipo3d() {
        List<Tipo> tipos = tipoRepository.findAll();
        return TipoEntityDto.listTipo3d(tipos);
    }

    @Override
    public List<Tipo2dOutDTO> findAllTipo2d() {
        List<Tipo> tipos = tipoRepository.findAll();
        return TipoEntityDto.listTipo2d(tipos);
    }
}
