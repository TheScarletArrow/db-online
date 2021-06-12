package ru.scarlet.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.scarlet.spring.mvc.entity.Location;
import ru.scarlet.spring.mvc.dao.*;
import ru.scarlet.spring.mvc.service.LocationService;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDAO locationDAO;



    @Override
    @Transactional
    public List<Location> getAllLocations() {
        return locationDAO.getAllLocations();
    }

    @Override
    @Transactional
    public void saveLocation(Location location) {
        locationDAO.saveLocation(location);
    }

    @Override
    @Transactional
    public Location getLocation(int id) {
        return locationDAO.getLocation(id);
    }

    @Override
    @Transactional
    public void deleteLocation(int id) {
        locationDAO.deleteLocation(id);
    }
}
