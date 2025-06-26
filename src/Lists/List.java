/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lists;
// animales empleados, visitantes
/**
 *

 * @author Gloriana
 */
public interface List <T>{
    //cuatro metodos, uno por persona
    public boolean add(T t);
    
    public boolean remove(T t);
    
    public T find(Object id);
    
    public void showAll();
}
