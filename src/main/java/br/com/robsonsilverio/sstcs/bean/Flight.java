/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean;

import br.com.robsonsilverio.sstcs.bean.list.FlightList;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.validation.constraints.NotNull;

/**
 *
 * @author robson.ssantos
 */
public class Flight implements Serializable, Comparable<Flight> {

    private static final long serialVersionUID = 5l;
    private FlightList flightList = FlightList.getInstance();

    public Flight() {
        this.flightNumber = flightList.size() + 1;
    }

    private Integer flightNumber;
    @NotNull(message = "Planeta de Destino deve ser informado")
    private Planet planetDestination;
    @NotNull(message = "Espaçonave deve ser informado")
    private Starship starship;
    private Set<People> passengers = new HashSet<>();

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public Planet getPlanetDestination() {
        return planetDestination;
    }

    public void setPlanetDestination(Planet planetDestination) {
        this.planetDestination = planetDestination;
    }

    public Starship getStarship() {
        return starship;
    }

    public void setStarship(Starship starship) {
        this.starship = starship;
    }

    public Set<People> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<People> passengers) {
        this.passengers = passengers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.flightList);
        hash = 11 * hash + Objects.hashCode(this.flightNumber);
        hash = 11 * hash + Objects.hashCode(this.planetDestination);
        hash = 11 * hash + Objects.hashCode(this.starship);
        hash = 11 * hash + Objects.hashCode(this.passengers);
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
        final Flight other = (Flight) obj;
        if (!Objects.equals(this.flightNumber, other.flightNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Flight o) {
        return this.flightNumber - o.flightNumber;
    }

}
