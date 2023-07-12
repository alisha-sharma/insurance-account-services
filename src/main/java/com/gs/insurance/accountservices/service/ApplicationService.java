package com.gs.insurance.accountservices.service;

import com.gs.insurance.accountservices.dto.ApplicationDto;
import com.gs.insurance.accountservices.model.Application;
import com.gs.insurance.accountservices.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public Application createApplication(ApplicationDto applicationDto){
        Application application = Application.builder()
                .status(applicationDto.getStatus()).build();
        applicationRepository.save(application);
        return application;
    }
}
