package com.speedtest.api.model;

import javafx.application.Application;
import javafx.stage.Stage;

public class Server {
    private String host;
    private double lat;
    private double lon;
    private String country;
    private int distance;
    private int ping;
    private String id;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
