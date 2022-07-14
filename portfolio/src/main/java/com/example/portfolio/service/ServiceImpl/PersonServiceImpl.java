package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.dto.PersonDTO;
import com.example.portfolio.entity.PersonEntity;
import com.example.portfolio.mapper.PersonMapper;
import com.example.portfolio.repository.PersonRepository;
import com.example.portfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonRepository personRepository;

    public PersonDTO savePerson(PersonDTO dto){

        PersonEntity entity = personMapper.personDTO2Entity(dto);
        PersonEntity personSave = personRepository.save(entity);
        PersonDTO result = personMapper.personEntity2DTO(personSave);
        return result;
    }

    public List<PersonDTO> getAllPerson(){
        List<PersonEntity> entities = this.personRepository.findAll();
        List<PersonDTO> result = this.personMapper.personEntityList2DTOList(entities);
        return result;
    }


}
