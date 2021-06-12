//package ru.scarlet.spring.mvc.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import ru.scarlet.spring.mvc.entity.SpeedTest;
//import ru.scarlet.spring.mvc.service.SpeedTestService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/test")
//public class SpeedTestController {
//
//    @Autowired
//    private SpeedTestService speedTestService;
//
//    @RequestMapping(path="/speedtests")
//    public String showAllSpeedTests(Model model){
//        List<SpeedTest> allSpeedTests = speedTestService.getAllSpeedTests();
//        model.addAttribute("allSpeedTests", allSpeedTests);
//        return "all-speedtests";
//    }
//
//    @RequestMapping(path="/addNewSpeedTest")
//    public String addNewSpeedTest(Model model){
//        SpeedTest speedTest = new SpeedTest();
//        model.addAttribute("speedTest", speedTest);
//        return "speedtest-info";
//    }
//
//}
