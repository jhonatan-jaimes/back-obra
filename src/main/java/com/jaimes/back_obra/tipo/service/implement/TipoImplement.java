package com.jaimes.back_obra.tipo.service.implement;

import com.jaimes.back_obra.tipo.repository.TipoRepository;
import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;
import com.jaimes.back_obra.tipo.service.TipoService;
import com.jaimes.back_obra.tipo.utilidad.TipoEntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoImplement implements TipoService {

    private final TipoRepository tipoRepository;

    @Autowired
    public TipoImplement(TipoRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    @Override
    public Tipo saveTipo(TipoInDTO tipoInDTO) {
        Tipo tipo = TipoEntityToDto.dtoToEntity(tipoInDTO);
        return tipoRepository.save(tipo);
    }
}
