/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans.converters;

import br.com.robsonsilverio.sstcs.bean.Planet;
import br.com.robsonsilverio.sstcs.bean.list.PlanetList;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author robson
 */
@FacesConverter(forClass = Planet.class,value="planetConverter")
public class PlanetConverter implements Converter{
    
    private final  PlanetList  planetList = PlanetList.getInstance();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string == null || string.isEmpty()){
            return null;
        }else{
            Planet planet = planetList.get(string);            
            return planet;
        }     
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Planet p = (Planet)o;
        if(p == null){
            return null;
        } else {
            return p.getName();
        }
    }

   
    
}
