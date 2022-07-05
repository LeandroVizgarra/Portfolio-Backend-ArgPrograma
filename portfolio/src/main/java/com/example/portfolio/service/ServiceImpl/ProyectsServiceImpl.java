package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.dto.ProyectsDTO;
import com.example.portfolio.mapper.entity.ProyectsEntity;
import com.example.portfolio.mapper.ProyectsMapper;
import com.example.portfolio.repository.ProyectsRepository;
import com.example.portfolio.service.ProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectsServiceImpl implements ProyectsService {

    @Autowired
    private ProyectsMapper proyectsMapper;
    @Autowired
    private ProyectsRepository proyectsRepository;


    public List<ProyectsDTO> getAllProyects() {

        List<ProyectsEntity> entities = this.proyectsRepository.findAll();
        List<ProyectsDTO> result = this.proyectsMapper.proyectsEntityList2DTOList(entities);
        return result;
    }

    public ProyectsDTO saveProyects(ProyectsDTO dto){

        ProyectsEntity entity = proyectsMapper.proyectsDTO2Entity(dto);
        ProyectsEntity personSave = proyectsRepository.save(entity);
        ProyectsDTO result = proyectsMapper.proyectsEntity2DTO(personSave);
        return result;
    }

    public void deleteProyect(Long id){
        proyectsRepository.deleteById(id);
    }

}
