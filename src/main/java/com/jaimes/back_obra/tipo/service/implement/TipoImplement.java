package com.jaimes.back_obra.tipo.service.implement;

import com.jaimes.back_obra.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.TipoAllOutDTO;
import com.jaimes.back_obra.tipo.repository.TipoRepository;
import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;
import com.jaimes.back_obra.tipo.service.TipoService;
import com.jaimes.back_obra.tipo.utilidad.TipoEntityDto;
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
    public Tipo saveTipo3d(Tipo3dInDTO tipo3dInDTO) {
        Tipo tipo = TipoEntityDto.dtoToEntity3d(tipo3dInDTO);
        return tipoRepository.save(tipo);
    }

    @Override
    public Tipo3dOutDTO findTipo3dById(Long id) {
        Tipo tipo = tipoRepository.findById(id).orElseThrow();
        Tipo3dOutDTO tipo3DOneOutDTO = TipoEntityDto.entity3dToDto(tipo);
        return tipo3DOneOutDTO;
    }

    @Override
    public Tipo updateTipo3d(Tipo3dInDTO tipo3dInDTO) {
        Tipo tipo = tipoRepository.findById(tipo3dInDTO.getId()).orElseThrow();
        TipoEntityDto.updateTipo3d(tipo, tipo3dInDTO);
        return tipoRepository.save(tipo);
    }

    @Override
    public String deleteTipo(Long id) {
        tipoRepository.deleteById(id);
        return "Tipo eliminado";
    }

    @Override
    public Tipo2dOutDTO findTipo2dById(Long id) {
        Tipo tipo = tipoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo no encontrado"));
        Tipo2dOutDTO tipo2DOutDTO = TipoEntityDto.entity2dToDto(tipo);
        return tipo2DOutDTO;
    }

    @Override
    public Tipo updateTipo2d(Tipo2dInDTO tipo2dInDTO) {
        Tipo tipo = tipoRepository.findById(tipo2dInDTO.getId()).orElseThrow();
        TipoEntityDto.updateTipo2d(tipo, tipo2dInDTO);
        return tipoRepository.save(tipo);
    }

    @Override
    public Tipo saveTipo2d(Tipo2dInDTO tipo2dInDTO) {
        Tipo tipo = TipoEntityDto.dtoToEntity2d(tipo2dInDTO);
        return tipoRepository.save(tipo);
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
