package com.example.portfolio.mapper;

import com.example.portfolio.dto.HardAndSoftSkillsDTO;
import com.example.portfolio.mapper.entity.HardAndSoftSkillsEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class HardAndSoftSkillsMapper {

    public HardAndSoftSkillsEntity hardAndSoftSkillsDTO2Entity(HardAndSoftSkillsDTO dto){

        HardAndSoftSkillsEntity hardAndSoftSkillsEntity = new HardAndSoftSkillsEntity();

        hardAndSoftSkillsEntity.setId(dto.getId());
        hardAndSoftSkillsEntity.setName(dto.getName());
        hardAndSoftSkillsEntity.setProgress(dto.getProgress());

        return hardAndSoftSkillsEntity;
    }

    public HardAndSoftSkillsDTO hardAndSoftSkillsEntity2DTO(HardAndSoftSkillsEntity entity){

        HardAndSoftSkillsDTO hardAndSoftSkillsDTO = new HardAndSoftSkillsDTO();

        hardAndSoftSkillsDTO.setId(entity.getId());
        hardAndSoftSkillsDTO.setName(entity.getName());
        hardAndSoftSkillsDTO.setProgress(entity.getProgress());

        return hardAndSoftSkillsDTO;
    }

    public List<HardAndSoftSkillsDTO> hardAndSoftSkillsEntityList2DTOList(List<HardAndSoftSkillsEntity> entities){

        List<HardAndSoftSkillsDTO> dtos = new ArrayList<>();

        for(HardAndSoftSkillsEntity entity : entities){
            dtos.add(this.hardAndSoftSkillsEntity2DTO(entity));
        }
        return dtos;
    }

}
