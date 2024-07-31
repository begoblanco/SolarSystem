package dev.bego;

import dev.bego.enums.PlanetType;

public class Planet {
    private String name;
    private int numberOfSatellites;
    private double mass; // kg
    private double volume; // m3
    private double diameter; // km
    private double averageDistanceToSun; // millions of km
    private PlanetType planetType;
    private boolean isVisibleToNakedEye;

    private double orbitalPeriod; // years
    private double rotationPeriod; // days

    public Planet() {
        this.name = null;
        this.numberOfSatellites = 0;
        this.mass = 0;
        this.volume = 0;
        this.diameter = 0;
        this.averageDistanceToSun = 0;
        this.planetType = null;
        this.isVisibleToNakedEye = false;
        this.orbitalPeriod = 0;
        this.rotationPeriod = 0;
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

    public double getDiameter() {
        return diameter;
    }

    public double getAverageDistanceToSun() {
        return averageDistanceToSun;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public boolean getIsVisibleToNakedEye() {
        return isVisibleToNakedEye;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setAverageDistanceToSun(double averageDistanceToSun) {
        this.averageDistanceToSun = averageDistanceToSun;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public void setVisibleToNakedEye(boolean isVisibleToNakedEye) {
        this.isVisibleToNakedEye = isVisibleToNakedEye;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double asteroidBeltMax = 3.4; // millones de km

        return averageDistanceToSun > asteroidBeltMax;
    }

    public boolean isInnerPlanet() {
        double asteroidBeltMin = 2.1;

        return averageDistanceToSun < asteroidBeltMin;
    }

    public boolean isInAsteroidBelt() {
        double asteroidBeltMin = 2.1;
        double asteroidBeltMax = 3.4;

        return (averageDistanceToSun > asteroidBeltMin && averageDistanceToSun < asteroidBeltMax);
    }

    public void displayInfo() {
        System.out.println("Planet Information:");
        System.out.println("Name: " + name);
        System.out.println("Number of Satellites: " + numberOfSatellites);
        System.out.println("Mass (kg): " + mass);
        System.out.println("Volume (m³): " + volume);
        System.out.println("Diameter (km): " + diameter);
        System.out.println("Average Distance to Sun (million km): " + averageDistanceToSun);
        System.out.println("Planet Type: " + planetType);
        System.out.println("Visible to Naked Eye: " + isVisibleToNakedEye);
        System.out.println("Orbital Period (years): " + orbitalPeriod);
        System.out.println("Rotation Period (days): " + rotationPeriod);
        System.out.println("Density (kg/m³): " + calculateDensity());
        System.out.println("Is Outer Planet: " + isOuterPlanet());
        System.out.println("Is Inner Planet: " + isInnerPlanet());
        System.out.println("Is in Asteroid Belt: " + isInAsteroidBelt());
    }
}
