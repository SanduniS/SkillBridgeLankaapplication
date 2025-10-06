package com.SpringbootProject.ApplicationService.ApplicationServiceMapper;

import com.SpringbootProject.ApplicationService.ApplicationDTO.ApplicationDTO;
import com.SpringbootProject.ApplicationService.ApplicationEntity.ApplicationEntity;

public class ApplicationServiceMapper {

    // DTO → Entity
    public static ApplicationEntity map(ApplicationDTO dto) {
        ApplicationEntity entity = new ApplicationEntity();
        entity.setId(dto.getId());
        entity.setJobId(dto.getJobId());
        entity.setSeekerUsername(dto.getSeekerUsername());
        return entity;
    }

    // Entity → DTO
    public static ApplicationDTO map(ApplicationEntity entity) {
        ApplicationDTO dto = new ApplicationDTO();
        dto.setId(entity.getId());
        dto.setJobId(entity.getJobId());
        dto.setSeekerUsername(entity.getSeekerUsername());
        return dto;
    }


}
