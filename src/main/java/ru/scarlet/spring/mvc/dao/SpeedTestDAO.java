package ru.scarlet.spring.mvc.dao;

import ru.scarlet.spring.mvc.entity.SpeedTest;

import java.util.List;

public interface SpeedTestDAO {
    List<SpeedTest> getAllSpeedTests();

    public void saveSpeedTest(SpeedTest speedTest);

    public  SpeedTest getSpeedTest(int id);

    public void deleteSpeedTest(int id);
}
