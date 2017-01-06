/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.Starship;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author robson.ssantos
 */
public class StarshipList implements Serializable {

    private static final long serialVersionUID = 40L;
    private Set<Starship> starships = new HashSet<>();

    private static StarshipList instance = null;

    private StarshipList() {
        // Exists only to defeat instantiation.
    }

    public static StarshipList getInstance() {
        if (instance == null) {
            instance = new StarshipList();
        }
        return instance;
    }
    
     public void add(Starship starship) {
        starships.add(starship);
    }

   public void remove(String name) {
        for (Starship p : starships) {
            if (p.getName().equals(name)) {
                starships.remove(p);
                break;
            }
        }
    }

    public void update(Starship starship) {
        remove(starship.getName());
        add(starship);
    }

    public Starship get(String name) {
        Starship s = null;
        for (Starship starship : starships) {
            if (starship.getName().equals(name)) {
                s = starship;
                break;
            }
        }
        return s;
    }

    public Set<Starship> getAll() {
        return starships;
    }

    public int size() {
        return starships.size();
    }
}
