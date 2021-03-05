package com.bjhj.heat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bjhj.heat.model.Temp;

public interface TempRepository extends JpaRepository<Temp, String> {
    Temp findByDeviceId(String deviceId);
}