package com.gs.insurance.accountservices.repository;

import com.gs.insurance.accountservices.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
