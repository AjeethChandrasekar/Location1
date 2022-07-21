package com.location.service;

import java.util.List;

import com.location.entites.Location;

public interface LocationService {
   public void savelocation(Location location);

public List<Location> getlocations();

public void delete(long id);

public Location update(long id);
}
