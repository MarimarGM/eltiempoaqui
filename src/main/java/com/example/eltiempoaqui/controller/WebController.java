package com.example.eltiempoaqui.controller;

import com.example.eltiempoaqui.dto.weather.WeatherResponseDto;
import com.example.eltiempoaqui.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    private final WeatherService weatherService;

    public WebController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/") //entra en la raiz
    public ModelAndView index(Model model) {
        //rellena la variable usuario con el objeto java de usuarios
        WeatherResponseDto weather = this.weatherService.getWeatherData("Badajoz", "es");

        //redirigen a la pagina de index
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        model.addAttribute("tiempo", weather);

        return modelAndView;
    }
}
