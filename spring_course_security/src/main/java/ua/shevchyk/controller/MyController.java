package ua.shevchyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view_for_HR";
    }

    @GetMapping("/manager_info")
    public String getInfoForManagers(){
        return "view_for_managers";
    }
}
