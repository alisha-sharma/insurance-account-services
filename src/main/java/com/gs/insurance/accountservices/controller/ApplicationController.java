package com.gs.insurance.accountservices.controller;

import com.gs.insurance.accountservices.dto.ApplicationDto;
import com.gs.insurance.accountservices.model.Application;
import com.gs.insurance.accountservices.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @PostMapping("/createApplication")
    public Application createApplication(@RequestBody ApplicationDto applicationDto){
        return applicationService.createApplication(applicationDto);
    }

}
