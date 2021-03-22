package ru.scarlet.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.scarlet.spring.mvc.dao.LocationDAO;
import ru.scarlet.spring.mvc.dao.ReviewsDAO;
import ru.scarlet.spring.mvc.entity.Location;
import ru.scarlet.spring.mvc.entity.Reviews;
import ru.scarlet.spring.mvc.service.LocationService;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private LocationService locationService;

    @Autowired
    private ReviewsDAO reviewsDAO;

    @RequestMapping("/reviews")
    public String showallReviews(Model model) {

        List<Reviews> allReviews = reviewsDAO.getAllReviews();
        model.addAttribute("allReviews", allReviews);
        return "all-reviews";
    }

    @RequestMapping("/locations")
    public String showAllLocations(Model model) {

        List<Location> allLocations = locationService.getAllLocations();
        model.addAttribute("allLocations", allLocations);
        return "all-locations";
    }

    @RequestMapping("/addNewLocation")
    public String addNewLocation(Model model) {
        Location location = new Location();
        model.addAttribute("location", location);
        return "location-info";
    }

    @RequestMapping("/saveLocation")
    public String saveLocation(@ModelAttribute("location") Location location) {

        locationService.saveLocation(location);

        return "redirect:/locations";
    }

    @RequestMapping("/updateInfo")
    public String updateLocation(@RequestParam("locId") int id, Model model) {
        Location location = locationService.getLocation(id);
        model.addAttribute("location", location);
        return "location-info";

    }
}
