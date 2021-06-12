package ru.scarlet.spring.mvc.dao;

import ru.scarlet.spring.mvc.entity.Location;

import java.util.List;

public interface LocationDAO {
    public List<Location> getAllLocations();

   public void saveLocation(Location location);

  public  Location getLocation(int id);

   public void deleteLocation(int id);
}
