/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 *
 * @author robson.ssantos
 */
public class Planet implements Serializable {

    private static final long serialVersionUID = 1l; 
    @NotNull(message = "Nome do Planeta não pode ser vazio")
    private String name;
    private Integer rotationPeriod;
    private Integer orbitalPeriod;
    @NotNull(message = "Diametro do Planeta não pode ser vazio")
    private Integer diameter;
    @NotNull(message = "Clima do Planeta não pode ser vazio")
    private String climate;
    private String gravity;
    @NotNull(message = "Terreno do Planeta não pode ser vazio")
    private String terrain;
    private Integer surfaceWater;
    @NotNull(message = "População não pode ser vazio")
    private Integer population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(Integer rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public Integer getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(Integer orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(Integer surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.rotationPeriod);
        hash = 73 * hash + Objects.hashCode(this.orbitalPeriod);
        hash = 73 * hash + Objects.hashCode(this.diameter);
        hash = 73 * hash + Objects.hashCode(this.climate);
        hash = 73 * hash + Objects.hashCode(this.gravity);
        hash = 73 * hash + Objects.hashCode(this.terrain);
        hash = 73 * hash + Objects.hashCode(this.surfaceWater);
        hash = 73 * hash + Objects.hashCode(this.population);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planet other = (Planet) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Planet{" + "name=" + name + ", rotationPeriod=" + rotationPeriod + ", orbitalPeriod=" + orbitalPeriod + ", diameter=" + diameter + ", climate=" + climate + ", gravity=" + gravity + ", terrain=" + terrain + ", surfaceWater=" + surfaceWater + ", population=" + population + '}';
    }

    
    
}
