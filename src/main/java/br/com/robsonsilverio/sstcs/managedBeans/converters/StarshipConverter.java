/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans.converters;

import br.com.robsonsilverio.sstcs.bean.Starship;
import br.com.robsonsilverio.sstcs.bean.list.StarshipList;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author robson
 */
@FacesConverter(forClass = Starship.class,value="starshipConverter")
public class StarshipConverter implements Converter{
    
    private final  StarshipList  starshipList = StarshipList.getInstance();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string == null || string.isEmpty()){
            return null;
        }else{
            Starship starship = starshipList.get(string);            
            return starship;
        }     
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Starship s = (Starship)o;
        if(s == null){
            return null;
        } else {
            return s.getName();
        }
    }

   
    
}
