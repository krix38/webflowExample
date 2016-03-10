package pl.krix.webflowtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by krix on 10.03.16.
 */
@Controller
public class mainController {

    @RequestMapping("/")
    String showFirstView(){
        return "firstView";
    }

    @RequestMapping("/secondflow")
    String showSecondView(){
        return "welcome";
    }
}
