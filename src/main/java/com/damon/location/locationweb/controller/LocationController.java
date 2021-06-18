package com.damon.location.locationweb.controller;

import com.damon.location.locationweb.model.Location;
import com.damon.location.locationweb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    private LocationService service;

    @RequestMapping("/create")
    public String create(){
        return "createLocation";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedlocation = service.saveLocation(location);
        String msg = "Location saved id:" + savedlocation.getId();
        modelMap.addAttribute("msg",msg);
        return "createLocation";
    }

    @RequestMapping("/display")
    public String displayLocation(ModelMap modelMap){
        List<Location> locationList = service.getAllLocations();
        modelMap.addAttribute("locations",locationList);
        return "displayLocation";
    }

    @RequestMapping("/delete")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        Location location = service.getLocationById(id);
        service.deleteLocation(location);
        List<Location> locationList = service.getAllLocations();
        modelMap.addAttribute("locations",locationList);
        return "displayLocation";
    }

    @RequestMapping("update")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
        Location location = service.getLocationById(id);
        modelMap.addAttribute("locations", location);
        return "editLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        service.updateLocation(location);
        List<Location> locationList = service.getAllLocations();
        modelMap.addAttribute("locations", locationList);
        return "displayLocation";
    }
}
