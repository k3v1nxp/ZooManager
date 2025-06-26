/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;

/**
 *
 * @author UTN
 */
public class EmployeesList implements List<Employee> {
     private Employee list[];

    public EmployeesList(Employee[] list) {
        this.list = new Employee[100];
    }

    @Override
    public boolean add(Employee t) {
       int max=list.length;
    for(int i = 0; i < max; i++){
       if (list[i]==null){
           list[i]=t;
           return true;
       }
}
       return false;            
    }
    

    @Override
    public boolean remove(Employee t) {
        int max=list.length;
    for(int i = 0; i < max; i++){
       if (list[i]==t){
           list[i]=null;
           return true;
       }
}
       return false;            
    }
    


    @Override
    public Employee find(Object id) {
        int idt=Integer.parseInt(id.toString());
        int max=list.length;
        for (int i = 0; i < max; i++){
            if(list[i].getId()==id){
                return list[i];
            }
        }
        return null;
    }

    
    @Override
    public void showAll() {
        int max=list.length;
        for (int i = 0; i < max; i++){
            if(list[i]!=null){
                System.out.println(list[i]);
            }
                
        }
    }
    
}
