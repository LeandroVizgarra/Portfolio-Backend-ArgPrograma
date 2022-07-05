package com.example.portfolio.mapper;

import com.example.portfolio.dto.ProyectsDTO;
import com.example.portfolio.mapper.entity.ProyectsEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProyectsMapper {

    public ProyectsEntity proyectsDTO2Entity(ProyectsDTO dto){
        ProyectsEntity proyectsEntity = new ProyectsEntity();
        proyectsEntity.setProyect_img(dto.getProyect_img());
        proyectsEntity.setProyect_url(dto.getProyect_url());
        proyectsEntity.setDate(dto.getDate());
        proyectsEntity.setDescription(dto.getDescription());
        proyectsEntity.setName(dto.getName());
        proyectsEntity.setId(dto.getId());
        return proyectsEntity;
    }

    public ProyectsDTO proyectsEntity2DTO(ProyectsEntity entity){
        ProyectsDTO proyectsDTO = new ProyectsDTO();
        proyectsDTO.setProyect_img(entity.getProyect_img());
        proyectsDTO.setProyect_url(entity.getProyect_url());
        proyectsDTO.setDate(entity.getDate());
        proyectsDTO.setDescription(entity.getDescription());
        proyectsDTO.setId(entity.getId());
        proyectsDTO.setName(entity.getName());
        return proyectsDTO;
    }

    public List<ProyectsDTO> proyectsEntityList2DTOList(List<ProyectsEntity> entities){

        List<ProyectsDTO> dtos = new ArrayList<>();

        for(ProyectsEntity entity : entities){
            dtos.add(this.proyectsEntity2DTO(entity));
        }
        return dtos;
    }

}
