package com.example.eltiempoaqui.dto.weather;

import java.util.List;

public class TemperatureResponseDto {

    private String dt;
    private com.example.eltiempoaqui.dto.weather.TemperatureDescriptionResponseDto temp;
    private double preasure;
    private int humidity;

    private List<com.example.eltiempoaqui.dto.weather.WeatherDescriptionResponseDto> weather;

    private double speed;
    private int deg;
    private int clouds;
}
