package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String listCarController(ModelMap model){
        List<String> messages = new ArrayList<>();
        messages.add("BMV");
        messages.add("Seria1");
        model.addAttribute("messages", messages);
        return "index";
    }

}
