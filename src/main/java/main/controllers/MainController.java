package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by delf on 1/22/16.
 * Controller for index page
 */
@Controller
public class MainController {
    @RequestMapping("/")
    //Returns static html page
    public String index() {
        return "index.html";
    }

}
