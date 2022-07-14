package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.dto.EducationDTO;
import com.example.portfolio.mapper.EducationMapper;
import com.example.portfolio.entity.EducationEntity;
import com.example.portfolio.repository.EducationRepository;
import com.example.portfolio.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationMapper educationMapper;
    @Autowired
    private EducationRepository educationRepository;

    public List<EducationDTO> getAllEducation(){
        List<EducationEntity> entities = educationRepository.findAll();
        List<EducationDTO> dtos = educationMapper.educationEntityList2DTOList(entities);
        return dtos;
    }

    public EducationDTO saveEducation(EducationDTO dto){

        EducationEntity education = educationMapper.educationDTO2Entity(dto);
        EducationEntity educationSave = educationRepository.save(education);
        EducationDTO result  = educationMapper.educationEntity2DTO(educationSave);
        return result;
    }

    public void deleteEducation(Long id){
        educationRepository.deleteById(id);
    }
}
