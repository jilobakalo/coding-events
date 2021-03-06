package org.launchCode.codingevents.controllorers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String getRequestHandler(Model model){
        List<String> events=new ArrayList<>();
        events.add("Java");
        events.add("JavaScript");
        events.add("Python");
        events.add("C#");
        events.add("CC+");
        model.addAttribute("events",events);
        return "events/index";
    }

}
