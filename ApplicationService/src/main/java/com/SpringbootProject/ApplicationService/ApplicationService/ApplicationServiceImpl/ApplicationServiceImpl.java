package com.SpringbootProject.ApplicationService.ApplicationService.ApplicationServiceImpl;

import com.SpringbootProject.ApplicationService.ApplicationDTO.ApplicationDTO;
import com.SpringbootProject.ApplicationService.ApplicationEntity.ApplicationEntity;
import com.SpringbootProject.ApplicationService.ApplicationRepo.ApplicationRepo;
import com.SpringbootProject.ApplicationService.ApplicationService.ApplicationService;
import com.SpringbootProject.ApplicationService.ApplicationServiceMapper.ApplicationServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepo applicationRepo;

    @Override
    public ApplicationDTO applyjob(ApplicationDTO applicationdto) {
        ApplicationEntity entity = ApplicationServiceMapper.map(applicationdto);
        ApplicationEntity savedEntity = applicationRepo.save(entity);
        return ApplicationServiceMapper.map(savedEntity);
    }

}
