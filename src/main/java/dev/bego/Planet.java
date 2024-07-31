package dev.bego;

import dev.bego.enums.PlanetType;

public class Planet {
    private String name;
    private int numberOfSatellites;
    private double mass;
    private double volume;
    private int diameter;
    private int averageDistanceToSun;
    private PlanetType planetType;
    private boolean isVisibleToNakedEye;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter, int averageDistanceToSun, PlanetType planetType, boolean isVisibleToNakedEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.planetType = planetType;
        this.isVisibleToNakedEye = isVisibleToNakedEye;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAverageDistanceToSun() {
        return averageDistanceToSun;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public boolean isVisibleToNakedEye() {
        return isVisibleToNakedEye;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double asteroidBeltMin = 2.1 * 149597870;
        double asteroidBeltMax = 3.4 * 149597870;
        double distanceInKm = averageDistanceToSun * 1_000_000;

        return distanceInKm > asteroidBeltMax;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", numberOfSatellites=" + numberOfSatellites +
                ", mass=" + mass +
                ", volume=" + volume +
                ", diameter=" + diameter +
                ", averageDistanceToSun=" + averageDistanceToSun +
                ", planetType=" + planetType +
                ", isVisibleToNakedEye=" + isVisibleToNakedEye +
                '}';
    }
}
