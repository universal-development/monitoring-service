package com.unidev.app.servicemonitoring.service;

import com.unidev.app.servicemonitoring.model.HTTPMonitoring;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HTTPMonitoringRepository extends CrudRepository<HTTPMonitoring, Long> {
}
