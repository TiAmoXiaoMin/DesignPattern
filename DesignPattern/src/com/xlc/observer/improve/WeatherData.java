package com.xlc.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

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

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }


    public void dataChange(){
        //调用 接入方的update
        notifyObserver();
    }

    //当时数据跟新时,就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        if(observerList.size() != 0){
            observerList.remove(observer);
        }
    }

    //跟新观察者
    @Override
    public void notifyObserver() {
        for (int i =0;i<observerList.size();i++){
            observerList.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}
