package com.xlc.observer.improve;

public class CurrentCondition implements Observer {


    //天气,气压,湿度,
    private float temperature;
    private float pressure;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    //跟新 天气,气压,湿度,是由WeatherData 来调用,我使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("Today temperature" + this.temperature);
        System.out.println("Today pressure" + this.pressure);
        System.out.println("Today humidity" + this.humidity);
    }


}
