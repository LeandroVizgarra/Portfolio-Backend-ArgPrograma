package com.example.portfolio.mapper;

import com.example.portfolio.dto.ExperienceDTO;
import com.example.portfolio.mapper.entity.ExperienceEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExperienceMapper {

    public ExperienceEntity experienceDTO2Entity(ExperienceDTO dto){

        ExperienceEntity experienceEntity = new ExperienceEntity();
        experienceEntity.setId(dto.getId());
        experienceEntity.setImage(dto.getImage());
        experienceEntity.setJob_name(dto.getJob_name());
        experienceEntity.setTasks(dto.getTasks());
        experienceEntity.setJob_tittle(dto.getJob_tittle());
        return experienceEntity;
    }

    public ExperienceDTO experienceEntity2DTO(ExperienceEntity entity){
        ExperienceDTO experienceDTO = new ExperienceDTO();
        experienceDTO.setId(entity.getId());
        experienceDTO.setImage(entity.getImage());
        experienceDTO.setJob_name(entity.getJob_name());
        experienceDTO.setTasks(entity.getTasks());
        experienceDTO.setJob_tittle(entity.getJob_tittle());
        return experienceDTO;
    }

    public List<ExperienceDTO> experienceEntityList2DTOList(List<ExperienceEntity> entities){
        List<ExperienceDTO> dtos = new ArrayList<>();

        for(ExperienceEntity entity : entities){
            dtos.add(this.experienceEntity2DTO(entity));
        }
        return dtos;
    }
}
