package com.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entites.Location;
import com.location.repository.LocationRepository;
@Service
public class LocationServiceImp implements LocationService {
  
	@Autowired
	private LocationRepository locationrepo;
	@Override
	public void savelocation(Location location) {
		locationrepo.save(location);
		
	}
	@Override
	public List<Location> getlocations() {
		List<Location> location = locationrepo.findAll();
		return location;
	}
	@Override
	public void delete(long id) {
		locationrepo.deleteById(id);
		
	}
	@Override
	public Location update(long id) {
		Optional<Location> findById = locationrepo.findById(id);
		Location locations = findById.get();
		return locations;
	}

}
