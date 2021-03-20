package ru.scarlet.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.scarlet.spring.mvc.dao.LocationDAO;
import ru.scarlet.spring.mvc.entity.Location;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private LocationDAO locationDAO;

    @RequestMapping("/")
    public String showAllLocations(Model model){

        List<Location> allLocations = locationDAO.getAllLocations();
        model.addAttribute("allLocations", allLocations);
        return "all-locations";
    }
}
