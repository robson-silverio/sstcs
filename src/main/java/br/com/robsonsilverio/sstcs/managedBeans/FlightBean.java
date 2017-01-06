/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import br.com.robsonsilverio.sstcs.bean.Flight;
import br.com.robsonsilverio.sstcs.bean.People;
import br.com.robsonsilverio.sstcs.bean.Planet;
import br.com.robsonsilverio.sstcs.bean.Starship;
import br.com.robsonsilverio.sstcs.bean.list.FlightList;
import br.com.robsonsilverio.sstcs.bean.list.PeopleList;
import br.com.robsonsilverio.sstcs.bean.list.PlanetList;
import br.com.robsonsilverio.sstcs.bean.list.StarshipList;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author robson
 */
@ManagedBean
@RequestScoped
public class FlightBean {

    private Set<Planet> planets = new HashSet<>();
    private Set<People> listPeople = new HashSet<>();
    private Set<Starship> starships = new HashSet<>();
    private Flight flight = new Flight();
    private Flight selectFlight = new Flight();
    private People selectPeople = new People();
    private final PlanetList planetList = PlanetList.getInstance();
    private final PeopleList peopleList = PeopleList.getInstance();
    private final StarshipList starshipList = StarshipList.getInstance();
    private final FlightList flightList = FlightList.getInstance();

    @PostConstruct
    public void init() {
        flight = new Flight();
        planets = planetList.getAll();
        listPeople = peopleList.getAll();
        starships = starshipList.getAll();
    }

    public void addFlight() {
        String msg = flightList.add(flight);
        if (!msg.equals("success")) {
            FacesContext.getCurrentInstance().addMessage(":mainForm", new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, ""));
        } else {
            init();
        }
    }
    
    public void removeFlight(Flight flight){
        flightList.remove(flight.getFlightNumber());
    }
   
    public Set<Flight> getFlights() {
        return flightList.getAll();
    }
    
    public void selectFlightFromTable(Flight flight){
        this.selectFlight = flight;
        
    }

    public Set<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(Set<Planet> planets) {
        this.planets = planets;
    }

    public Set<People> getListPeople() {
        return listPeople;
    }

    public void setListPeople(Set<People> listPeople) {
        this.listPeople = listPeople;
    }

    public Set<Starship> getStarships() {
        return starships;
    }

    public void setStarships(Set<Starship> starships) {
        this.starships = starships;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public People getSelectPeople() {
        return selectPeople;
    }

    public void setSelectPeople(People selectPeople) {
        this.selectPeople = selectPeople;
    }

    public Flight getSelectFlight() {
        return selectFlight;
    }

    public void setSelectFlight(Flight selectFlight) {
        this.selectFlight = selectFlight;
    }

    
}
