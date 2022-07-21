package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.Locationdata;
import com.location.entites.Location;
import com.location.service.LocationService;
import com.location.utilites.EmailService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationservice;
	
	@Autowired
	private EmailService eservice;
	@RequestMapping("/location")
	public String location() {
		return"savelocation";
	}
	@RequestMapping("/savelocation")
	public String savelocation(@ModelAttribute("location") Location location,ModelMap map) {
		locationservice.savelocation(location);
		eservice.sendSimpleMessage("ajeethsekar77@gmail.com", "Welcome Email", "Location is saved! Thanks for adding a new location");
		map.addAttribute("msg", "Location is saved");
		return"savelocation";
	}
	@RequestMapping("/allLocations")
	public String allLocations(ModelMap map) {
		List<Location> location = locationservice.getlocations();
		map.addAttribute("location", location);
		return"searchresult";
	}   
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")long id,ModelMap map) {
		locationservice.delete(id);
		List<Location> location = locationservice.getlocations();
		map.addAttribute("location", location);
		return"searchresult";

}
	@RequestMapping("/update")
	public String update(@RequestParam("id")long id,ModelMap map) {
		Location locations = locationservice.update(id);
		map.addAttribute("location", locations);
		return"updatelocation";
	}
	@RequestMapping("/updatelocation")
	public String updatelocation(Locationdata data,ModelMap map) {
		Location location=new Location();
		location.setId(data.getId());
		location.setCode(data.getCode());
		location.setName(data.getName());
		location.setType(data.getType());
		locationservice.savelocation(location);
		List<Location> locations = locationservice.getlocations();
		map.addAttribute("location", locations);
		return"searchresult";
	}
}