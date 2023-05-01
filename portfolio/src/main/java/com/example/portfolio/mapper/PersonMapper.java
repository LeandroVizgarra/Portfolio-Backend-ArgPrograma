package com.example.portfolio.mapper;

import com.example.portfolio.dto.PersonDTO;
import com.example.portfolio.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper {

    @Lazy
    private final EducationMapper educationMapper;
    @Lazy
    private final ExperienceMapper experienceMapper;
    @Lazy
    private final HardAndSoftSkillsMapper hardAndSoftSkillsMapper;
    @Lazy
    private final ProyectsMapper proyectsMapper;
    @Autowired
    public PersonMapper(EducationMapper educationMapper, ExperienceMapper experienceMapper, HardAndSoftSkillsMapper hardAndSoftSkillsMapper, ProyectsMapper proyectsMapper) {
        this.educationMapper = educationMapper;
        this.experienceMapper = experienceMapper;
        this.hardAndSoftSkillsMapper = hardAndSoftSkillsMapper;
        this.proyectsMapper = proyectsMapper;
    }

    public PersonEntity personDTO2Entity(PersonDTO dto){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setAbout_me(dto.getAboutMe());
        personEntity.setCountry(dto.getCountry());
        personEntity.setPersonId(dto.getId());
        personEntity.setImage(dto.getImage());
        personEntity.setName(dto.getName());
        return personEntity;
    }

    public PersonDTO personEntity2DTO(PersonEntity entity){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAboutMe(entity.getAbout_me());
        personDTO.setCountry((entity.getCountry()));
        personDTO.setId(entity.getPersonId());
        personDTO.setImage(entity.getImage());
        personDTO.setName(entity.getName());
        personDTO.setEducation(this.educationMapper.educationEntityList2DTOList(
                entity.getEducationEntities()));
        personDTO.setExperience(this.experienceMapper.experienceEntityList2DTOList(
                entity.getExperiences()));
        personDTO.setSkills(this.hardAndSoftSkillsMapper.hardAndSoftSkillsEntityList2DTOList(
                entity.getSkills()));
        personDTO.setProyects(this.proyectsMapper.proyectsEntityList2DTOList(
                entity.getProyects()
        ));
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
