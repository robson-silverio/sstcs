/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import br.com.robsonsilverio.sstcs.bean.Starship;
import br.com.robsonsilverio.sstcs.bean.list.StarshipList;
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
public class StarshipBean {
    private Starship starship;
    private Starship selectStarship;
    private StarshipList starshipList = StarshipList.getInstance();
    
    @PostConstruct
    public void init() {
        starship = new Starship();        
        selectStarship = new Starship();
    }
    
    public void addStarship() {
        Starship p = starshipList.get(starship.getName());
        if (p == null) {
            starshipList.add(starship);
        } else {
            starshipList.update(starship);
        }
        init();
    }
    
    public void removeStarship(Starship starship) {
        starshipList.remove(starship.getName());
        init();
    }
    
    public void updateStarship() {
        starshipList.update(starship);
        
    }
    
    public void getStarshipByName(String name) {
        starship = starshipList.get(name);
    }
    
    public Set<Starship> getListStarship() {
        return starshipList.getAll();
    }
    
    public Starship getStarship() {
        return starship;
    }
    
    public void setStarship(Starship starship) {
        this.starship = starship;
    }
    
    public Starship getSelectStarship() {
        return selectStarship;
    }
    
    public void setSelectStarship(Starship selectStarship) {
        this.selectStarship = selectStarship;
    }
    
}
