package org.launchCode.codingevents.controllorers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping
    public String index(){
//model.addAttribute("title","Best Programming Language");
    return "index";
    }
}
