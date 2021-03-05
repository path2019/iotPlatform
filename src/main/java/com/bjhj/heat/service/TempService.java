package com.bjhj.heat.service;

import java.util.List;

import com.bjhj.heat.model.Temp;

public interface TempService {
    public List<Temp> getTempList();

    public Temp getTemp(String deviceId);

    public void save(Temp temp);
}
