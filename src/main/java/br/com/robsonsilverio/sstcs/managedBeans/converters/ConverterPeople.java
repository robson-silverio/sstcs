/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans.converters;

import br.com.robsonsilverio.sstcs.bean.People;
import br.com.robsonsilverio.sstcs.bean.list.PeopleList;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author robson
 */
@FacesConverter(forClass = People.class,value="peopleConverter")
public class ConverterPeople implements Converter{
    
    private final  PeopleList  peopleList = PeopleList.getInstance();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string == null || string.isEmpty()){
            return null;
        }else{
            People people = peopleList.get(string);            
            return people;
        }     
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        People p = (People)o;
        if(p == null){
            return null;
        } else {
            return p.getName();
        }
    }

   
    
}
