package com.example.portfolio.mapper;

import com.example.portfolio.dto.EducationDTO;
import com.example.portfolio.entity.EducationEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EducationMapper {

    public EducationEntity educationDTO2Entity(EducationDTO dto){

        EducationEntity educationEntity = new EducationEntity();

        educationEntity.setDate(dto.getDate());
        educationEntity.setEducationType(dto.getEducation_type());
        educationEntity.setId(dto.getId());
        educationEntity.setName(dto.getName());
        educationEntity.setPlaceLogo(dto.getLogo());
        educationEntity.setPlaceName(dto.getPlaceName());
        educationEntity.setStatus(dto.getStatus());
        return educationEntity;
    }

    public EducationDTO educationEntity2DTO(EducationEntity entity){
        EducationDTO educationDTO = new EducationDTO();

        educationDTO.setEducation_type(entity.getEducationType());
        educationDTO.setDate(entity.getDate());
        educationDTO.setId(entity.getId());
        educationDTO.setName(entity.getName());
        educationDTO.setLogo(entity.getPlaceLogo());
        educationDTO.setPlaceName(entity.getPlaceName());
        educationDTO.setStatus(entity.getStatus());
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
