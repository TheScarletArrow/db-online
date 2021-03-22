package ru.scarlet.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/location")
public class MyController {

    @RequestMapping("/")
    public String ShowMyView() {
        return "myview";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

        model.addAttribute("location", new Location_old());
        return "ask-emp-details-view";
    }


//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return "show-emp-details-view";
//    }

    //    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("location") Location_old loc,
                                      BindingResult result) {

        if (result.hasErrors()) {
            return "ask-emp-details-view";
        } else
            return "show-emp-details-view";
    }



}
