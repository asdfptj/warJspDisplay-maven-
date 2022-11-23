package com.example.mavenjsp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BoardController {

    static final String VIEW_MAIN = "/main"; // 메인화면

    @GetMapping("/")
    public ModelAndView getBoard(ModelAndView mav) {
        mav.addObject("value","Hello Spring And gradle");

        mav.setViewName(VIEW_MAIN);

        return mav;
    }
}