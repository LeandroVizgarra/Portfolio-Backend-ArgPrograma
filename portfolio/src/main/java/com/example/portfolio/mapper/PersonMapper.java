package com.example.portfolio.mapper;

import com.example.portfolio.dto.PersonDTO;
import com.example.portfolio.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper {

    public PersonEntity personDTO2Entity(PersonDTO dto){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setAbout_me(dto.getAbout_me());
        personEntity.setCountry(dto.getCountry());
        personEntity.setPersonId(dto.getId());
        personEntity.setImage(dto.getImage());
        personEntity.setName(dto.getName());
        return personEntity;
    }

    public PersonDTO personEntity2DTO(PersonEntity entity){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAbout_me(entity.getAbout_me());
        personDTO.setCountry((entity.getCountry()));
        personDTO.setId(entity.getPersonId());
        personDTO.setImage(entity.getImage());
        personDTO.setName(entity.getName());
        return personDTO;
    }

    public List<PersonDTO> personEntityList2DTOList(List<PersonEntity> entities){

        List<PersonDTO> dtos = new ArrayList<>();

        for(PersonEntity entity : entities){
            dtos.add(this.personEntity2DTO(entity));
        }
        return dtos;
    }

}
