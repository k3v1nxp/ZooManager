package Persons.Visitors;

import Lists.List;
import Persons.Visitors.Visitor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevin
 */
public class VisitorList implements List <Visitor> {
    
    private final Visitor[]visitors;
    int contador;
    public VisitorList(){
    this.visitors=new Visitor [50];
    this.contador=0;
    }
    
    @Override
    public boolean add(Visitor t) {
     if (contador < visitors.length){
         visitors[contador++]=t;
         return true;
     }
     return false;
    }

    @Override
    public boolean remove(Visitor t) {
         for (int i = 0; i < contador; i++) {
            if (visitors[i] != null && visitors[i].getId().equals(t.getId())) {
                visitors[i] = null;
                return true;
            }
            
            }
    return false;
    }

    @Override
    public Visitor find(Object id) {  
        for (int i = 0; i < contador; i++) {
            if (visitors[i] != null && visitors[i].getId().equals(id.toString())) {
                return visitors[i];
            }
        }
        return null;
    }



    @Override
    public void showAll() {
         for (int i = 0; i < contador; i++) {
            if (visitors[i] != null) {
              
            
            }
        }
    }
}