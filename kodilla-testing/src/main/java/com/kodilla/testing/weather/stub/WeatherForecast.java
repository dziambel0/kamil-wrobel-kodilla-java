package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        double sumeOfTemperatures = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
            sumeOfTemperatures += temperature.getValue();
        }
        return sumeOfTemperatures/resultMap.size();
    }

    public double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        double mediana = 0;
        List<Double> listaTemperatur = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
            listaTemperatur.add(temperature.getValue());

        }
        Collections.sort(listaTemperatur);

        return listaTemperatur.get(2);
    }
}
