/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.People;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author robson.ssantos
 */
public class PeopleListIT {
    
    public PeopleListIT() {
    }
    

    /**
     * Test of getInstance method, of class PeopleList.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        PeopleList result = PeopleList.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of add method, of class PeopleList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        People people = new People();
        people.setName("teste add");
        people.setBirthYear(Integer.BYTES);
        people.setEyeColor("azul");
        people.setGender("macho");
        people.setHairColor("red");
        people.setHeigth(Double.MIN_VALUE);
        people.setMass(Integer.SIZE);
        people.setSkinColor("azul");
        PeopleList instance = PeopleList.getInstance();
        instance.add(people);
        assertTrue(instance.size() > 0);
    }

    /**
     * Test of remove method, of class PeopleList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        People people = new People();
        people.setName("test remove");
        PeopleList instance = PeopleList.getInstance();
        instance.add(people);
        instance.remove(people.getName());
        assertNull(instance.get(people.getName()));
    }

    /**
     * Test of update method, of class PeopleList.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        People people = new People();
        people.setName("teste update");
        people.setBirthYear(Integer.BYTES);
        people.setEyeColor("azul");
        people.setGender("macho");
        people.setHairColor("red");
        people.setHeigth(Double.MIN_VALUE);
        people.setMass(Integer.SIZE);
        people.setSkinColor("azul");
        PeopleList instance = PeopleList.getInstance();
        instance.add(people);
        people.setEyeColor("verde");
        instance.update(people);
        People people2 = instance.get(people.getName());
        assertEquals(people, people2);
    }

    /**
     * Test of get method, of class PeopleList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        People people = new People();
        people.setName("teste get");
        people.setBirthYear(Integer.BYTES);
        people.setEyeColor("azul");
        people.setGender("macho");
        people.setHairColor("red");
        people.setHeigth(Double.MIN_VALUE);
        people.setMass(Integer.SIZE);
        people.setSkinColor("azul");
        PeopleList instance = PeopleList.getInstance();
        instance.add(people);
        People people2 = instance.get(people.getName());
        assertEquals(people, people2);
    }

    /**
     * Test of getAll method, of class PeopleList.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PeopleList instance = PeopleList.getInstance();
        Set<People> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of size method, of class PeopleList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PeopleList instance = PeopleList.getInstance();       
        int result = instance.size();
        assertTrue(result > 0);
    }
    
}
