package com.example.eltiempoaqui.dto.weather;

import java.util.List;

public class WeatherResponseDto {

    private CoordResponseDto coord;
    private List<com.example.eltiempoaqui.dto.weather.WeatherDescriptionResponseDto> weather;
    private String base;
    private com.example.eltiempoaqui.dto.weather.MainResponseDto main;
    private int visibility;
    private com.example.eltiempoaqui.dto.weather.WindResponseDto wind;
    private com.example.eltiempoaqui.dto.weather.CloudsResponseDto clouds;
    private int dt;
    private SysResponseDto sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    public WeatherResponseDto() {
    }

    public CoordResponseDto getCoord() {
        return coord;
    }

    public void setCoord(CoordResponseDto coord) {
        this.coord = coord;
    }

    public List<com.example.eltiempoaqui.dto.weather.WeatherDescriptionResponseDto> getWeather() {
        return weather;
    }

    public void setWeather(List<com.example.eltiempoaqui.dto.weather.WeatherDescriptionResponseDto> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public com.example.eltiempoaqui.dto.weather.MainResponseDto getMain() {
        return main;
    }

    public void setMain(com.example.eltiempoaqui.dto.weather.MainResponseDto main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public com.example.eltiempoaqui.dto.weather.WindResponseDto getWind() {
        return wind;
    }

    public void setWind(com.example.eltiempoaqui.dto.weather.WindResponseDto wind) {
        this.wind = wind;
    }

    public com.example.eltiempoaqui.dto.weather.CloudsResponseDto getClouds() {
        return clouds;
    }

    public void setClouds(com.example.eltiempoaqui.dto.weather.CloudsResponseDto clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SysResponseDto getSys() {
        return sys;
    }

    public void setSys(SysResponseDto sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
