/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.bean.list;

import br.com.robsonsilverio.sstcs.bean.People;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author robson.ssantos
 */
public class PeopleList implements Serializable {

    private static final long serialVersionUID = 30L;
    private Set<People> peopleList = new HashSet<>();

    private static PeopleList instance = null;

    private PeopleList() {
        // Exists only to defeat instantiation.
    }

    public static PeopleList getInstance() {
        if (instance == null) {
            instance = new PeopleList();
        }
        return instance;
    }

    public void add(People people) {
        peopleList.add(people);
    }

    public void remove(String name) {
        for (People p : peopleList) {
            if (p.getName().equals(name)) {
                peopleList.remove(p);
                break;
            }
        }
    }

    public void update(People people) {
        remove(people.getName());
        add(people);
    }

    public People get(String name) {
        People p = null;
        for (People people : peopleList) {
            if (people.getName().equals(name)) {
                p = people;
                break;
            }
        }
        return p;
    }

    public Set<People> getAll() {
        return peopleList;
    }

    public int size() {
        return peopleList.size();
    }

}
