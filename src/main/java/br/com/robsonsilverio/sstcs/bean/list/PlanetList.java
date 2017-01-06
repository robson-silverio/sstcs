/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.Planet;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author robson.ssantos
 */
public class PlanetList implements Serializable {

    private static final long serialVersionUID = 10l;
    private Set<Planet> planets = new HashSet<>();

    private static PlanetList instance = null;

    private PlanetList() {
        // Exists only to defeat instantiation.
    }

    public static PlanetList getInstance() {
        if (instance == null) {
            instance = new PlanetList();
        }
        return instance;
    }

    public void add(Planet planet) {
        planets.add(planet);
    }

     public void remove(String name) {
        for (Planet p : planets) {
            if (p.getName().equals(name)) {
                planets.remove(p);
                break;
            }
        }
    }

    public void update(Planet starship) {
        remove(starship.getName());
        add(starship);
    }

    public Planet get(String name) {
        Planet p = null;
        for (Planet starship : planets) {
            if (starship.getName().equals(name)) {
                p = starship;
                break;
            }
        }
        return p;
    }

    public Set<Planet> getAll() {
        return planets;
    }

    public int size() {
        return planets.size();
    }

}
