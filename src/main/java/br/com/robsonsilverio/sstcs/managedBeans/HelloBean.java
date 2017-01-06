/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robsonsilverio.sstcs.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author robson.ssantos
 */

@ManagedBean
@RequestScoped
public class HelloBean {
    public String getMessage(){
        return "Hello JSF + Maven !!!";
    }
}
