package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlanetTest {

    @Test
    public void testCalculateDensity() {
        Planet planet = new Planet();
        planet.setMass(5.972e24);
        planet.setVolume(1.08321e12);

        assertEquals((5.972e24 / 1.08321e12), planet.calculateDensity(), 0.001);
    }

    @Test
    public void testIsOuterPlanet() {
        Planet planet = new Planet();
        planet.setAverageDistanceToSun(5);

        assertTrue(planet.isOuterPlanet());
    }

    @Test
    public void testIsInnerPlanet() {
        Planet planet = new Planet();
        planet.setAverageDistanceToSun(1);

        assertTrue(planet.isInnerPlanet());
    }

    @Test
    public void testIsInAsteroidBelt() {
        Planet planet = new Planet();
        planet.setAverageDistanceToSun(2.5);

        assertTrue(planet.isInAsteroidBelt());
    }
}
