package com.example.portfolio.mapper;

import com.example.portfolio.dto.ExperienceDTO;
import com.example.portfolio.entity.ExperienceEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExperienceMapper {

    public ExperienceEntity experienceDTO2Entity(ExperienceDTO dto){

        ExperienceEntity experienceEntity = new ExperienceEntity();
        experienceEntity.setId(dto.getId());
        experienceEntity.setImage(dto.getJobLogo());
        experienceEntity.setJob_name(dto.getCompany());
        experienceEntity.setTasks(dto.getDescription());
        experienceEntity.setJob_tittle(dto.getJobTittle());
        return experienceEntity;
    }

    public ExperienceDTO experienceEntity2DTO(ExperienceEntity entity){
        ExperienceDTO experienceDTO = new ExperienceDTO();
        experienceDTO.setId(entity.getId());
        experienceDTO.setJobLogo(entity.getImage());
        experienceDTO.setCompany(entity.getJob_name());
        experienceDTO.setDescription(entity.getTasks());
        experienceDTO.setJobTittle(entity.getJob_tittle());
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
