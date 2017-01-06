/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.Planet;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author robson
 */
public class PlanetListIT {

    public PlanetListIT() {
    }

    /**
     * Test of getInstance method, of class PlanetList.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        PlanetList result = PlanetList.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of add method, of class PlanetList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Planet planet = new Planet();
        planet.setName("teste add");
        planet.setClimate("clima");
        planet.setTerrain("terreno");
        planet.setDiameter(Integer.SIZE);
        planet.setGravity("gravity");
        planet.setOrbitalPeriod(Integer.MIN_VALUE);
        planet.setPopulation(Integer.MIN_VALUE);
        planet.setRotationPeriod(Integer.MIN_VALUE);
        planet.setSurfaceWater(Integer.MAX_VALUE);
        PlanetList instance = PlanetList.getInstance();
        instance.add(planet);
        assertTrue(instance.size() > 0);
    }

    /**
     * Test of remove method, of class PlanetList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Planet planet = new Planet();
        planet.setName("test remove");
        PlanetList instance = PlanetList.getInstance();
        instance.add(planet);
        instance.remove(planet.getName());
        assertNull(instance.get(planet.getName()));
    }

    /**
     * Test of update method, of class PlanetList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Planet planet = new Planet();
        planet.setName("teste add");
        planet.setClimate("clima");
        planet.setTerrain("terreno");
        planet.setDiameter(Integer.SIZE);
        planet.setGravity("gravity");
        planet.setOrbitalPeriod(Integer.MIN_VALUE);
        planet.setPopulation(Integer.MIN_VALUE);
        planet.setRotationPeriod(Integer.MIN_VALUE);
        planet.setSurfaceWater(Integer.MAX_VALUE);
        PlanetList instance = PlanetList.getInstance();
        instance.add(planet);
        planet.setGravity("gravity2");
        instance.update(planet);
        Planet planet2 = instance.get(planet.getName());
        assertEquals(planet, planet2);
    }

    /**
     * Test of get method, of class PlanetList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Planet planet = new Planet();
        planet.setName("teste add");
        planet.setClimate("clima");
        planet.setTerrain("terreno");
        planet.setDiameter(Integer.SIZE);
        planet.setGravity("gravity");
        planet.setOrbitalPeriod(Integer.MIN_VALUE);
        planet.setPopulation(Integer.MIN_VALUE);
        planet.setRotationPeriod(Integer.MIN_VALUE);
        planet.setSurfaceWater(Integer.MAX_VALUE);
        PlanetList instance = PlanetList.getInstance();        
        instance.add(planet);
        Planet planet2 = instance.get(planet.getName());
        assertEquals(planet, planet2);
    }

    /**
     * Test of getAll method, of class PlanetList.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PlanetList instance = PlanetList.getInstance();
        Set<Planet> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of size method, of class PlanetList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PlanetList instance = PlanetList.getInstance();
        int result = instance.size();
        assertTrue(result > 0);
    }

}
