package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java. util.Collections;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperatures() {
        Map<String, Double> average = new HashMap<>();
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average.put(temperature.getKey(), temperature.getValue());
            sum += temperature.getValue();
        }
        return sum / average.size();
    }

    public double medianTemperatures() {
        Map<String, Double> list = new HashMap<>();
        List<Double> median = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            list.put(temperature.getKey(), temperature.getValue());
            median.add(temperature.getValue());
        }
        double med;
        double average;
        Collections.sort(median);
        if(median.size() % 2 == 0){
            average = median.get(median.size()/2 + median.size()/2-1);
            med = average/2.0;
        }else {
            med = median.get(median.size()/2);
        }
        return med;
    }
}