package ru.scarlet.spring.mvc.service;

import ru.scarlet.spring.mvc.entity.Location;

import java.util.List;

public interface LocationService {
    public List<Location> getAllLocations();

    public void saveLocation(Location location);

    public Location getLocation(int id);

    public void deleteLocation(int id);


}
