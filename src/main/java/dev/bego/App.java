package dev.bego;

import dev.bego.enums.PlanetType;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setNumberOfSatellites(1);
        earth.setMass(5.972E24);
        earth.setVolume(1.08321E21);
        earth.setDiameter(12742);
        earth.setAverageDistanceToSun(150);
        earth.setPlanetType(PlanetType.TERRESTRIAL);
        earth.setVisibleToNakedEye(true);
        earth.setOrbitalPeriod(1);
        earth.setRotationPeriod(1);

        Planet jupiter = new Planet();
        jupiter.setName("Jupiter");
        jupiter.setNumberOfSatellites(79);
        jupiter.setMass(1.898E27);
        jupiter.setVolume(1.43128E24);
        jupiter.setDiameter(139820);
        jupiter.setAverageDistanceToSun(778);
        jupiter.setPlanetType(PlanetType.GASEOUS);
        jupiter.setVisibleToNakedEye(true);
        jupiter.setOrbitalPeriod(12);
        jupiter.setRotationPeriod(0.41);

        earth.displayInfo();
        System.out.println();
        jupiter.displayInfo();
    }
}
