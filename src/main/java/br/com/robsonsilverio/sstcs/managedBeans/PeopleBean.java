/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import br.com.robsonsilverio.sstcs.bean.People;
import br.com.robsonsilverio.sstcs.bean.list.PeopleList;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author robson.ssantos
 */
@ManagedBean
@RequestScoped
public class PeopleBean {

    private People people;
    private People selectPeople;
    private PeopleList peopleList = PeopleList.getInstance();
    
    @PostConstruct
    public void init() {
        people = new People();        
        selectPeople = new People();
    }
    
    public void addPeople() {
        People p = peopleList.get(people.getName());
        if (p == null) {
            peopleList.add(people);
        } else {
            peopleList.update(people);
        }
        init();
    }
    
    public void removePeople(People people) {
        peopleList.remove(people.getName());
        init();
    }
    
    public void updatePeople() {
        peopleList.update(people);
        
    }
    
    public void getPeopleByName(String name) {
        people = peopleList.get(name);
    }
    
    public Set<People> getListPeople() {
        return peopleList.getAll();
    }
    
    public People getPeople() {
        return people;
    }
    
    public void setPeople(People people) {
        this.people = people;
    }
    
    public People getSelectPeople() {
        return selectPeople;
    }
    
    public void setSelectPeople(People selectPeople) {
        this.selectPeople = selectPeople;
    }
    
}
