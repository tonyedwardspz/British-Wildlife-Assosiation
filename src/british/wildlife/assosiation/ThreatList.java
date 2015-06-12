/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class is not used in the implementation following requirements 
 * clarification. 
 * It remains because it is a good example of a singleton pattern. 
 * Long live the singleton!
 * @author Anthony
 */
public class ThreatList {
    
    // create new instance of singleton here to prevent multithreading problems
    private static ThreatList uniqueInstance  = new ThreatList();;
    
    private static ArrayList<Animal> theThreatList = new ArrayList();;
    
    // private singleton constructor
    private ThreatList() {}
    
    public static ThreatList getInstance(){
         return uniqueInstance;
    }
    
    public void addAnimalToThreatList(Animal anml) {
        theThreatList.add(anml); 
    }

    public ArrayList<Animal> getTheThreatList() {
        return theThreatList;
    }
    
    public void removeAnimalFromThreatList(String anml){
        
        // remove from the threat list
        List<Animal> threats = theThreatList;
        
        for (Iterator<Animal> it = threats.iterator(); it.hasNext(); ) {

            Animal animal = it.next();
            if (animal.getName().equals(anml)) {
               it.remove();
            }
        }
        
    }
    
}
