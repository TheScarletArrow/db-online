package ru.scarlet.spring.mvc.service;

import ru.scarlet.spring.mvc.entity.SpeedTest;

import java.util.List;

public interface SpeedTestService {
    List<SpeedTest> getAllSpeedTests();

    public void saveSpeedTest(SpeedTest speedTest);

    public  SpeedTest getSpeedTest(int id);

    public void deleteSpeedTest(int id);
}
