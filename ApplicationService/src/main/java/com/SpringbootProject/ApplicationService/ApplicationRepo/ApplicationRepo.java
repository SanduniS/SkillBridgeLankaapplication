package com.SpringbootProject.ApplicationService.ApplicationRepo;

import com.SpringbootProject.ApplicationService.ApplicationEntity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<ApplicationEntity,Long> {
}





