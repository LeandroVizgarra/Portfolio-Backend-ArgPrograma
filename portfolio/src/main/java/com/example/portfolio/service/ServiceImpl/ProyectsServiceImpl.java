package com.example.portfolio.service.ServiceImpl;

import com.example.portfolio.mapper.ProyectsMapper;
import com.example.portfolio.repository.ProyectsRepository;
import com.example.portfolio.service.ProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectsServiceImpl implements ProyectsService {

    @Autowired
    private ProyectsMapper proyectsMapper;
    @Autowired
    private ProyectsRepository proyectsRepository;
    

}
