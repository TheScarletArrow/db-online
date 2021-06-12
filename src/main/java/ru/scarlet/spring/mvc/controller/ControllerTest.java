package ru.scarlet.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.scarlet.spring.mvc.dao.ReviewsDAO;
import ru.scarlet.spring.mvc.entity.Location;
import ru.scarlet.spring.mvc.entity.Reviews;
import ru.scarlet.spring.mvc.entity.SpeedTest;
import ru.scarlet.spring.mvc.service.LocationService;
import ru.scarlet.spring.mvc.service.SpeedTestService;

import java.util.List;

//@Controller
public class ControllerTest {

    @Autowired
    private LocationService locationService;

    @Autowired
    private ReviewsDAO reviewsDAO;

//    @RequestMapping("/reviews")
//    public String showAllReviews(Model model) {
//
//        List<Reviews> allReviews = reviewsDAO.getAllReviews();
//        model.addAttribute("allReviews", allReviews);
//        return "all-reviews";
//    }

    @RequestMapping("/locations")
    public String showAllLocations(Model model) {

        List<Location> allLocations = locationService.getAllLocations();
        model.addAttribute("allLocations", allLocations);
        return "all-locations";
    }

    @RequestMapping("/addNewLocation")
    public String addNewLocation(Model model
//            , @Valid @ModelAttribute("location") Location loc,
//                                 BindingResult result
    ) {

        Location location = new Location();
        model.addAttribute("location", location);

//        if (result.hasErrors())
            return "location-info";
//        else
//            return "all-locations";
    }
    @RequestMapping(path="/addNewReview")
    public String addNewReview(Model model) {
        Reviews reviews = new Reviews();
        model.addAttribute("reviews", reviews);
        return "all-reviews";
    }
    @RequestMapping(path="/saveLocation")
    public String saveLocation(@ModelAttribute("location") Location location) {

        locationService.saveLocation(location);

        return "redirect:/locations/";
    }

    @RequestMapping(path="/updateInfo")
    public String updateLocation(
            @RequestParam("locId") int id,
            Model model) {
        Location location = locationService.getLocation(id);
        model.addAttribute("location", location);
        return "location-info";

    }
    @RequestMapping(path="/deleteInfo")
    public String deleteLocation(@RequestParam("locId") int id){

        locationService.deleteLocation(id);
        return "redirect:/locations/";
    }
//TODO NOW LOOK AT ME/////////////
/////////////////////////////////////////////////////////////
    @Autowired
    private SpeedTestService speedTestService;

    @RequestMapping("/speedtests")
    public String showAllSpeedTests(Model model){
        List<SpeedTest> allSpeedTests = speedTestService.getAllSpeedTests();
        model.addAttribute("allSpeedTests", allSpeedTests);
        return "all-speedtests";
    }



    @RequestMapping("/addNewSpeedTest")
    public String addNewSpeedTest(Model model){
        SpeedTest speedTest = new SpeedTest();
        model.addAttribute("speedTest", speedTest);
        return "speedtest-info";
    }


}
