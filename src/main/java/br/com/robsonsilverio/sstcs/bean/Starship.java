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
public class Starship implements Serializable {
        private static final long serialVersionUID = 4l;
        @NotNull(message = "Nome da Espaçonave não pode ser vazio")
        private String name;
        @NotNull(message = "Nome da Espaçonave não pode ser vazio")
	private String model;
	private String manufacturer;
	private Long costInCredits;
	private Integer length;
	private Integer maxAtmospheringSpeed;
	private Integer crew;
        @NotNull(message = "Nome da Espaçonave não pode ser vazio")
	private Integer passengers;
	private Long cargoCapacity;
	private Integer hyperdriveRating;
	private Integer MGLT;
	private String starshipClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getCostInCredits() {
        return costInCredits;
    }

    public void setCostInCredits(Long costInCredits) {
        this.costInCredits = costInCredits;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public void setMaxAtmospheringSpeed(Integer maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Long getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Long cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Integer getHyperdriveRating() {
        return hyperdriveRating;
    }

    public void setHyperdriveRating(Integer hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public Integer getMGLT() {
        return MGLT;
    }

    public void setMGLT(Integer MGLT) {
        this.MGLT = MGLT;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.model);
        hash = 73 * hash + Objects.hashCode(this.manufacturer);
        hash = 73 * hash + Objects.hashCode(this.costInCredits);
        hash = 73 * hash + Objects.hashCode(this.length);
        hash = 73 * hash + Objects.hashCode(this.maxAtmospheringSpeed);
        hash = 73 * hash + Objects.hashCode(this.crew);
        hash = 73 * hash + Objects.hashCode(this.passengers);
        hash = 73 * hash + Objects.hashCode(this.cargoCapacity);
        hash = 73 * hash + Objects.hashCode(this.hyperdriveRating);
        hash = 73 * hash + Objects.hashCode(this.MGLT);
        hash = 73 * hash + Objects.hashCode(this.starshipClass);
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
        final Starship other = (Starship) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Starship{" + "name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits=" + costInCredits + ", length=" + length + ", maxAtmospheringSpeed=" + maxAtmospheringSpeed + ", crew=" + crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity +  ", hyperdriveRating=" + hyperdriveRating + ", MGLT=" + MGLT + ", starshipClass=" + starshipClass  + '}';
    }

   
    
}
