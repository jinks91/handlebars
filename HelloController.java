package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("hello", "Hello world!");
        mav.addObject("footer_color", "blue");
        return mav;
    }
}