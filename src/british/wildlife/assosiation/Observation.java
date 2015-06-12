/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Anthony
 */
public class Observation{
    
    private Integer observationId;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dateObserved;
    private String locationObserved;
    private Observers observer;
    private Integer numberObserved;
    private Boolean confidence;
    private String animalActivityDescription;
    private Animal animal;
    

    public Observation(Integer obsID, String dateObserved, String locationObserved, Observers observer, 
            Integer numberObserved, Boolean confidence, String animalActivityDescription, Animal animal) throws ParseException {
        
        this.observationId = obsID;
        this.locationObserved = locationObserved;
        this.observer = observer;
        this.numberObserved = numberObserved;
        this.confidence = confidence;
        this.animalActivityDescription = animalActivityDescription;
        this.animal = animal;
        
        // parse the date
        try {
            this.dateObserved = sdf.parse(dateObserved);
        } catch (ParseException ex) {
            Logger.getLogger(ProfessionalObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public int getObservationId() {
        return observationId;
    }

    public String getDateObserved() {
        String date = sdf.format(dateObserved);
        return date;
    }

    public Observers getObserver() {
        return observer;
    }

    public String getLocationObserved() {
        return locationObserved;
    }

    public Integer getNumberObserved() {
        return numberObserved;
    }

    public String getConfidence() {
        String conf;
        
        if (confidence == true){
            conf = "Confident";
        } else {
            conf = "Not Confident";
        }
        return conf;
    }

    public String getAnimalActivityDescription() {
        return animalActivityDescription;
    }

    public Animal getAnimal() {
        return animal;
    }
    
    public Boolean professionalObservation(Observation obs){
        if (obs.observer instanceof ProfessionalObserver){
           return true; 
        } else {
            return false;
        }
    }
}
