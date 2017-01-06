/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.Starship;
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
public class StartshipListIT {

    /**
     * Test of getInstance method, of class StarshipList.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        StarshipList result = StarshipList.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of add method, of class StarshipList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Starship starship = new Starship();
        starship.setName("teste add");
        starship.setCargoCapacity(Long.MAX_VALUE);
        starship.setCostInCredits(Long.MIN_VALUE);
        starship.setCrew(Integer.SIZE);
        starship.setHyperdriveRating(Integer.MIN_VALUE);
        starship.setLength(Integer.SIZE);
        starship.setMGLT(Integer.SIZE);
        starship.setManufacturer("manufacturer");
        starship.setMaxAtmospheringSpeed(Integer.MAX_VALUE);
        starship.setModel("model");
        starship.setPassengers(Integer.SIZE);
        starship.setStarshipClass("starshipClass");
        StarshipList instance = StarshipList.getInstance();
        instance.add(starship);
        assertTrue(instance.size() > 0);
    }

    /**
     * Test of remove method, of class StarshipList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Starship starship = new Starship();
        starship.setName("test remove");
        StarshipList instance = StarshipList.getInstance();
        instance.add(starship);
        instance.remove(starship.getName());
        assertNull(instance.get(starship.getName()));
    }

    /**
     * Test of update method, of class StarshipList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Starship starship = new Starship();
        starship.setName("teste update");
        starship.setCargoCapacity(Long.MAX_VALUE);
        starship.setCostInCredits(Long.MIN_VALUE);
        starship.setCrew(Integer.SIZE);
        starship.setHyperdriveRating(Integer.MIN_VALUE);
        starship.setLength(Integer.SIZE);
        starship.setMGLT(Integer.SIZE);
        starship.setManufacturer("manufacturer");
        starship.setMaxAtmospheringSpeed(Integer.MAX_VALUE);
        starship.setModel("model");
        starship.setPassengers(Integer.SIZE);
        starship.setStarshipClass("starshipClass");
        StarshipList instance = StarshipList.getInstance();
        instance.add(starship);
        starship.setModel("model");
        instance.update(starship);
        Starship starship2 = instance.get(starship.getName());
        assertEquals(starship, starship2);
    }

    /**
     * Test of get method, of class StarshipList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Starship starship = new Starship();
        starship.setName("teste get");
        starship.setCargoCapacity(Long.MAX_VALUE);
        starship.setCostInCredits(Long.MIN_VALUE);
        starship.setCrew(Integer.SIZE);
        starship.setHyperdriveRating(Integer.MIN_VALUE);
        starship.setLength(Integer.SIZE);
        starship.setMGLT(Integer.SIZE);
        starship.setManufacturer("manufacturer");
        starship.setMaxAtmospheringSpeed(Integer.MAX_VALUE);
        starship.setModel("model");
        starship.setPassengers(Integer.SIZE);
        starship.setStarshipClass("starshipClass");
        StarshipList instance = StarshipList.getInstance();
        instance.add(starship);
        Starship starship2 = instance.get(starship.getName());
        assertEquals(starship, starship2);
    }

    /**
     * Test of getAll method, of class StarshipList.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StarshipList instance = StarshipList.getInstance();
        Set<Starship> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of size method, of class StarshipList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StarshipList instance = StarshipList.getInstance();
        int result = instance.size();
        assertTrue(result > 0);
    }
}
