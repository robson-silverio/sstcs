/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import br.com.robsonsilverio.sstcs.bean.Planet;
import br.com.robsonsilverio.sstcs.bean.list.PlanetList;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author robson
 */
@ManagedBean
@RequestScoped
public class PlanetBean {
    private Planet planet;
    private Planet selectPlanet;
    private PlanetList planetList = PlanetList.getInstance();
    
    @PostConstruct
    public void init() {
        planet = new Planet();        
        selectPlanet = new Planet();
    }
    
    public void addPlanet() {
        Planet p = planetList.get(planet.getName());
        if (p == null) {
            planetList.add(planet);
        } else {
            planetList.update(planet);
        }
        init();
    }
    
    public void removePlanet(Planet planet) {
        planetList.remove(planet.getName());
        init();
    }
    
    public void updatePlanet() {
        planetList.update(planet);
        
    }
    
    public void getPlanetByName(String name) {
        planet = planetList.get(name);
    }
    
    public Set<Planet> getListPlanet() {
        return planetList.getAll();
    }
    
    public Planet getPlanet() {
        return planet;
    }
    
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
    
    public Planet getSelectPlanet() {
        return selectPlanet;
    }
    
    public void setSelectPlanet(Planet selectPlanet) {
        this.selectPlanet = selectPlanet;
    }
}
