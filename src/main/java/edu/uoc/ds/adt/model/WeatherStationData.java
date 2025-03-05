package edu.uoc.ds.adt.model;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class WeatherStationData {
    private final LocalDateTime lastUpdated;
    private final String stationName;
    private final String province;
    private final double coordinate1;
    private final double coordinate2;
    private final double avgAirTemperature;
    private final double precipitation;
    private final double minAirTemperature;
    private final double maxAirTemperature;

    public WeatherStationData(LocalDateTime lastUpdated, String stationName, String province,
                              double coordinate1, double coordinate2, double avgAirTemperature,
                              double precipitation, double minAirTemperature, double maxAirTemperature) {
        this.lastUpdated = lastUpdated;
        this.stationName = stationName;
        this.province = province;
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.avgAirTemperature = avgAirTemperature;
        this.precipitation = precipitation;
        this.minAirTemperature = minAirTemperature;
        this.maxAirTemperature = maxAirTemperature;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public String getStationName() {
        return stationName;
    }

    public String getProvince() {
        return province;
    }

    public double getCoordinate1() {
        return coordinate1;
    }

    public double getCoordinate2() {
        return coordinate2;
    }

    public double getAvgAirTemperature() {
        return avgAirTemperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public double getMinAirTemperature() {
        return minAirTemperature;
    }

    public double getMaxAirTemperature() {
        return maxAirTemperature;
    }
}
