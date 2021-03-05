package com.bjhj.heat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.bjhj.heat.model.Temp;
import com.bjhj.heat.service.TempService;
import com.bjhj.heat.repository.TempRepository;

@Service
public class TempServiceImpl implements TempService{
    @Autowired
    private TempRepository tempRepository;

    @Override
    public List<Temp> getTempList() {
        return tempRepository.findAll();
    }

    @Override
    public Temp getTemp(String deviceId) {
        return tempRepository.findByDeviceId(deviceId);
    }

    @Override
    public void save(Temp temp) {
        tempRepository.save(temp);
    }
}
