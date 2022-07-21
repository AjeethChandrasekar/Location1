   package com.location.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entites.Location;
import com.location.repository.LocationRepository;
@RestController
public class RestControllerWeb {
	@Autowired
	private LocationRepository locationrepo;
	@RequestMapping("locations/{id}")
     public Location getLocation(@PathVariable("id")long id) {
		if(id<100) {
			 throw new LocationNotFound();
		}
    	 Optional<Location> findById = locationrepo.findById(id);
    	 Location loc = findById.get();
		return loc;
    	 
     }
}
