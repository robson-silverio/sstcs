/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author robson
 */
@ManagedBean
public class MenuBean {
    
    public void redirectPeople() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("faces/people.xhtml");
    }
    
    public void redirectPlanet() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("faces/planet.xhtml");
    }
    
    public void redirectStarship() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("faces/starship.xhtml");
    }
    
    public void redirectFlight() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("faces/flight.xhtml");
    }
    
}
