package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entites.Location;
import com.location.repository.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
	@Autowired
	private LocationRepository locationrepo;
    @GetMapping
	public List<Location> getlocations() {
		List<Location> loc = locationrepo.findAll();
		return loc;

	}
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")long id) {
    	locationrepo.deleteById(id);
    }
    @PostMapping
    public void save(@RequestBody Location location) {
    	locationrepo.save(location);
    }
    @PutMapping
    public void update(@RequestBody Location location) {
    	locationrepo.save(location);
    }
}
