/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;
import Lists.List;
import java.util.Arrays;
/**
 *
 * @author Gloriana
 */
public class AnimalList implements List <Animal> {
    private Animal animalvec[];
    
    @Override
    public boolean add(Animal t) {
        int tam = animalvec.length;
        for (int i = 0; i < tam; i++) {
            if(animalvec[i]== null){
                animalvec[i]= t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Animal t) {
        int tam = animalvec.length;
        for (int i = 0; i < tam; i++) {
            if(animalvec[i]== t){
                animalvec[i]= null;
                return true;
            }   
        }
        return false;    
    }

    @Override
    public Animal find(Object id) {
        int tam = animalvec.length;
        for (int i = 0; i < tam; i++) {
            if (animalvec[i]== id ) {
                return animalvec[i];
                
            }
            
        }
        return null;
    }
    
    @Override
    public void showAll() {
        Arrays.toString(animalvec);
    }
    
    
}
