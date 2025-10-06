package com.SpringbootProject.ApplicationService.ApplicationController;

import com.SpringbootProject.ApplicationService.ApplicationDTO.ApplicationDTO;
import com.SpringbootProject.ApplicationService.ApplicationService.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    private final RestTemplate restTemplate = new RestTemplate();
    private final String SEEKER_SERVICE_URL = "http://localhost:8084/seekers/";

    @PreAuthorize("hasRole('SEEKER')")
    @PostMapping("/apply")
    public ResponseEntity<ApplicationDTO> createJob(@RequestBody ApplicationDTO applicationdto) {
        ApplicationDTO dto = applicationService.applyjob(applicationdto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
