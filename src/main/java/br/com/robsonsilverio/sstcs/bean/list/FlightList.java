/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.Flight;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author robson.ssantos
 */
public final class FlightList implements Serializable {

    private static final long serialVersionUID = 50L;
    private TreeSet<Flight> flights = new TreeSet<>();

    private static FlightList instance = null;

    protected FlightList() {
        // Exists only to defeat instantiation.
    }

    public static FlightList getInstance() {
        if (instance == null) {
            instance = new FlightList();
        }
        return instance;
    }

    public String add(Flight flight) {
        if (flights.size() > 0) {
            Flight lastFlight = flights.last();
            if (lastFlight != null && lastFlight.getPlanetDestination().equals(flight.getPlanetDestination())) {
                return "Erro: O último voo partiu para o mesmo planeta destino selcionado .";
            }
        }
        if (flight.getPassengers().size() > flight.getStarship().getPassengers()) {
            return "Erro: Número de Pessageiros maior do que a nave comporta ";
        }
        flights.add(flight);
        return "success";
    }

    public void remove(Integer flightNumber) {
        for (Flight p : flights) {
            if (p.getFlightNumber().equals(flightNumber)) {
                flights.remove(p);
                break;
            }
        }
    }

    public void update(Flight starship) {
        remove(starship.getFlightNumber());
        add(starship);
    }

    public Flight get(Integer flightNumber) {
        Flight p = null;
        for (Flight starship : flights) {
            if (starship.getFlightNumber().equals(flightNumber)) {
                p = starship;
                break;
            }
        }
        return p;
    }

    public Set<Flight> getAll() {
        return flights;
    }

    public int size() {
        return flights.size();
    }
}
