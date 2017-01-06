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
public class People implements Serializable {

    private static final long serialVersionUID = 3l;
    @NotNull(message = "Nome da Pessoa não pode ser vazio")
    private String name;
    private Double heigth;
    private Integer mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private Integer birthYear;
    @NotNull(message = "Genero não pode ser vazio")
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.heigth);
        hash = 17 * hash + Objects.hashCode(this.mass);
        hash = 17 * hash + Objects.hashCode(this.hairColor);
        hash = 17 * hash + Objects.hashCode(this.skinColor);
        hash = 17 * hash + Objects.hashCode(this.eyeColor);
        hash = 17 * hash + Objects.hashCode(this.birthYear);
        hash = 17 * hash + Objects.hashCode(this.gender);
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
        final People other = (People) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", heigth=" + heigth + ", mass=" + mass + ", hairColor=" + hairColor + ", skinColor=" + skinColor + ", eyeColor=" + eyeColor + ", birthYear=" + birthYear + ", gender=" + gender + '}';
    }

}
