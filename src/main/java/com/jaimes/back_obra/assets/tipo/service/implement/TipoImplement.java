package com.jaimes.back_obra.assets.tipo.service.implement;

import com.jaimes.back_obra.assets.message.MessageStatus;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo2dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.dto.output.TipoListOutDTO;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import com.jaimes.back_obra.assets.tipo.repository.TipoRepository;
import com.jaimes.back_obra.assets.tipo.service.TipoService;
import com.jaimes.back_obra.assets.tipo.utilidad.DtoToTipo;
import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;
import com.jaimes.back_obra.assets.tipo.utilidad.TipoToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class TipoImplement implements TipoService {

    private final TipoRepository tipoRepository;

    @Autowired
    public TipoImplement(TipoRepository tipoRepository){
        this.tipoRepository = tipoRepository;
    }

    @Override
    public MessageStatus deleteTipo(Long id) {
        if(tipoRepository.existsById(id)){
            tipoRepository.deleteById(id);
            return new MessageStatus("Elemento eliminado " + id);
        } else {
            throw new RuntimeException("Id del elemento no encontrado: " + id);
        }
    }

    @Override
    public List<TipoListOutDTO> findAllTipo() {
        List<Tipo> tipos = tipoRepository.findAll();
        return TipoToDto.allTipoOutListDTO(tipos);
    }

    @Override
    public List<TipoOutDTO> findAllTipoModel() {
        return List.of();
    }

    @Override
    public TipoOutDTO findTipo3dById(Long id) {
        Tipo tipo = tipoRepository.findById(id)
                .orElseThrow(() -> new  RuntimeException("Elemento no encontrado " + id));
        return TipoToDto.tipoOutModelDto(tipo);
    }

    @Override
    public MessageStatus updateTipo3d(Tipo3dConcretoInDTO tipo3DConcretoInDTO) {
        return null;
    }

    @Override
    public MessageStatus saveTipo3d(Object object) {
        return null;
    }

    @Override
    public TipoOutDTO findTipo2dById(Long id) {
        Tipo tipo = tipoRepository.findById(id)
                .orElseThrow(() -> new  RuntimeException("Elemento no encontrado " + id));
        return TipoToDto.tipoOutModelDto(tipo);
    }

    @Override
    public MessageStatus updateTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO) {
        return null;
    }

    @Override
    public MessageStatus saveTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO) {
        tipoRepository.save(DtoToTipo.dtoToTipo(tipo2DConcretoInDTO));
        return new MessageStatus("Guardado");
    }

    @Override
    public List<TipoOutDTO> findAllTipo2d() {
        return List.of();
    }
}