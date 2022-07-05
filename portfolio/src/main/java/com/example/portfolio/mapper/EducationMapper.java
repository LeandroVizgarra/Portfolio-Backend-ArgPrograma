package com.example.portfolio.mapper;

import com.example.portfolio.dto.EducationDTO;
import com.example.portfolio.mapper.entity.EducationEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EducationMapper {

    public EducationEntity educationDTO2Entity(EducationDTO dto){

        EducationEntity educationEntity = new EducationEntity();

        educationEntity.setCurrent_year(dto.getCurrent_year());
        educationEntity.setEducation_type(dto.getEducation_type());
        educationEntity.setId(dto.getId());
        educationEntity.setName(dto.getName());
        educationEntity.setPlace_logo(dto.getPlace_logo());
        educationEntity.setPlace_name(dto.getPlace_name());
        return educationEntity;
    }

    public EducationDTO educationEntity2DTO(EducationEntity entity){
        EducationDTO educationDTO = new EducationDTO();

        educationDTO.setEducation_type(entity.getEducation_type());
        educationDTO.setCurrent_year(entity.getCurrent_year());
        educationDTO.setId(entity.getId());
        educationDTO.setName(entity.getName());
        educationDTO.setPlace_logo(entity.getPlace_logo());
        educationDTO.setPlace_name(entity.getPlace_name());
        return educationDTO;
    }

    public List<EducationDTO> educationEntityList2DTOList(List<EducationEntity> entities){
        List<EducationDTO> dtos = new ArrayList<>();

        for(EducationEntity entity : entities){
            dtos.add(this.educationEntity2DTO(entity));
        }
        return dtos;
    }

}
