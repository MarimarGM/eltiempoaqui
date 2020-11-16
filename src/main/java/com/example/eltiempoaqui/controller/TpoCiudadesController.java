package com.example.eltiempoaqui.controller;

import com.example.eltiempoaqui.dto.weather.WeatherResponseDto;
import com.example.eltiempoaqui.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TpoCiudadesController {

    private final WeatherService weatherService;

    public TpoCiudadesController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/tpociudades.html") //entra en pag
    public ModelAndView tpoCiudades(Model model, HttpServletRequest request) {
        String q = request.getParameter("search");
        String c = request.getParameter("country");
        WeatherResponseDto weather = null;
        if (q != null) {
            weather = this.weatherService.getWeatherData(q, c);
        }

        //redirigen a la pagina
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tpoCiudades");
        model.addAttribute("tiempo", weather);
        model.addAttribute("q", q);
        model.addAttribute("c", c);

        return modelAndView;
    }
}
