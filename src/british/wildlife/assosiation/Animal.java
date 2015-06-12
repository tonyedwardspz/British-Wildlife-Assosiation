/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author Anthony
 */
public class Animal extends Observable{
    
    private Integer animalId;
    private String name;
    private Integer extinctionThreatLevel;
    private ArrayList<Observation> observations;

    public Animal(Integer animalID, String name, Integer extinctionThreatLevel) {
        
        this.animalId = animalID;
        this.name = name;
        this.extinctionThreatLevel = extinctionThreatLevel;
        
        // instantiate the observation ArrayList
        observations = new ArrayList();
        setChanged();
        notifyObservers();
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    public Integer getExtinctionThreatLevel() {
        return extinctionThreatLevel;
    }

    public ArrayList<Observation> getObservations() {
        return observations;
    }
    
    public void addobservation(Observation observation){
        observations.add(observation);
    }

    public void setExtinctionThreatLevel(Integer extinctionThreatLevel) {
        this.extinctionThreatLevel = extinctionThreatLevel;
    }
    
    public Integer getNumberObserved(Animal animal){
        
        Integer numObserved = 0;
        
        for (Observation obs: animal.observations){
            numObserved += obs.getNumberObserved();
        }
        
        return numObserved;
    }
    

    public static Animal findAnimal(ArrayList<Animal> animals, String anmlName){
        Animal theAnimal = null;
        
        for (Animal anml: animals){
            if (anml.getName().equals(anmlName)){
                theAnimal = anml;
            }
        }
        return theAnimal;
    }
    
    public static Animal findAnimalById(ArrayList<Animal> animals, Integer anmlID){
        Animal theAnimal = null;
        
        for (Animal anml: animals){
            if (anml.getAnimalId().equals(anmlID)){
                theAnimal = anml;
            }
        }
        return theAnimal;
    }
}
