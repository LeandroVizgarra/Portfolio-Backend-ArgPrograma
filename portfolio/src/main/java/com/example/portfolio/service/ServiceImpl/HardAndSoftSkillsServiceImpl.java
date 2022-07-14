package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.dto.HardAndSoftSkillsDTO;
import com.example.portfolio.entity.HardAndSoftSkillsEntity;
import com.example.portfolio.mapper.HardAndSoftSkillsMapper;
import com.example.portfolio.repository.HardAndSoftSkillsRepository;
import com.example.portfolio.service.HardAndSoftSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardAndSoftSkillsServiceImpl implements HardAndSoftSkillsService {

    @Autowired
    private HardAndSoftSkillsMapper hardAndSoftSkillsMapper;
    @Autowired
    private HardAndSoftSkillsRepository hardAndSoftSkillsRepository;


    public List<HardAndSoftSkillsDTO> getAllHass() {

        List<HardAndSoftSkillsEntity> entities = this.hardAndSoftSkillsRepository.findAll();
        List<HardAndSoftSkillsDTO> result = this.hardAndSoftSkillsMapper.hardAndSoftSkillsEntityList2DTOList(entities);
        return result;
    }

    public HardAndSoftSkillsDTO saveHass(HardAndSoftSkillsDTO dto){

        HardAndSoftSkillsEntity entity = hardAndSoftSkillsMapper.hardAndSoftSkillsDTO2Entity(dto);
        HardAndSoftSkillsEntity hassSave = hardAndSoftSkillsRepository.save(entity);
        HardAndSoftSkillsDTO result = hardAndSoftSkillsMapper.hardAndSoftSkillsEntity2DTO(hassSave);
        return result;
    }

    public void deleteHass(Long id){
        hardAndSoftSkillsRepository.deleteById(id);
    }

}
