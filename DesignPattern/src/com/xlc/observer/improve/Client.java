package com.xlc.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition();
        BaiDuSite baiDuSite = new BaiDuSite();

        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(baiDuSite);

        weatherData.setData(11f,22f,33f);
        System.out.println("=======================");
        weatherData.removeObserver(baiDuSite);
        weatherData.setData(55f,66f,77f);
    }
}
