package ru.scarlet.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.scarlet.spring.mvc.dao.SpeedTestDAO;
import ru.scarlet.spring.mvc.entity.SpeedTest;
import ru.scarlet.spring.mvc.service.SpeedTestService;

import java.util.List;

@Service
public class SpeedTestServiceImpl implements SpeedTestService {

    @Autowired
    private SpeedTestDAO speedTestDAO;

    @Override
    @Transactional
    public List<SpeedTest> getAllSpeedTests() {
        return speedTestDAO.getAllSpeedTests();
    }

    @Override
    @Transactional
    public void saveSpeedTest(SpeedTest speedTest) {
        speedTestDAO.saveSpeedTest(speedTest);
    }

    @Override
    @Transactional
    public SpeedTest getSpeedTest(int id) {
        return speedTestDAO.getSpeedTest(id);
    }

    @Override
    @Transactional
    public void deleteSpeedTest(int id) {
        speedTestDAO.deleteSpeedTest(id);
    }
}
