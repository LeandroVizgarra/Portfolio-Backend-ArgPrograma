package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.dto.ExperienceDTO;
import com.example.portfolio.entity.ExperienceEntity;
import com.example.portfolio.mapper.ExperienceMapper;
import com.example.portfolio.repository.ExperienceRepository;
import com.example.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceMapper experienceMapper;

    @Autowired
    private ExperienceRepository experienceRepository;

    public List<ExperienceDTO> getAllExperience(){

        List<ExperienceEntity> entities = experienceRepository.findAll();
        List<ExperienceDTO> result = experienceMapper.experienceEntityList2DTOList(entities);
        return result;

    }

    public ExperienceDTO saveExperience(ExperienceDTO dto){

        ExperienceEntity experience = experienceMapper.experienceDTO2Entity(dto);
        ExperienceEntity experienceSave = experienceRepository.save(experience);
        ExperienceDTO result  = experienceMapper.experienceEntity2DTO(experienceSave);
        return result;
    }

    public void deleteExperience(Long id){
        experienceRepository.deleteById(id);
    }
}
