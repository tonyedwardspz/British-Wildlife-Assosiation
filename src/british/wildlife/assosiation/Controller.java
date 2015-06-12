/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class Controller {
    
    BritishWildlifeAssosiation bwa;
    GUI gui;
    Validation validation;
    
    public Controller(BritishWildlifeAssosiation bwa, GUI gui) {
        this.bwa = bwa;
        this.gui = gui;
        this.validation = new Validation();
    }
    
    /** 
    * Get the list of observations for the selected animal
    */ 
    protected void tblObservationsMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // get list of observations
        ArrayList<Observation> observations = getAnimalObservations();
        
        Integer ID = gui.selectedAnimalForObservations();
        
        // populate the information boxes
        for (Observation obs: observations){
            Integer obsID = obs.getObservationId();
            if (Objects.equals(obsID, ID)){
                gui.populateAnimalsObservations(obs, ID);
            }
        }
    }
    
    /** 
    * Populate the observations table when an animal is selected in from the cbo
    * on the observations font
    */ 
    protected void cboAnimalNameObservationsActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        ArrayList<Observation> observations = getAnimalObservations();
        gui.populateObservationTable(observations);
    }   
    
    /** 
    * Get the list of observations.
    * Called from the cboAnimalNameObservationsActionPerformed method
    */ 
    private ArrayList<Observation> getAnimalObservations(){
        Animal anml;
        ArrayList<Observation> observations = new ArrayList();
        
        try{
            String value = gui.getSelectedAnimalCBO();
            anml = Animal.findAnimal(bwa.animals, value);
            observations = anml.getObservations();
        } catch (Exception ex){
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return observations;
    }
    
    /** 
    * Add new professional or volunteer observer
    */ 
    protected Boolean btnAddNewObserverActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        // get the details for both types of observers
        String name = gui.newObserverName();
        String house = gui.newObserverHouse();
        String town = gui.newObserverTown();
        String postcode = gui.newObserverPostcode();
        String phoneNumber = gui.newObserverPhoneNumber();
        String email = gui.newObserverEmail();
        
        // prepare the validation array
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(name);
        inputs.add(house);
        inputs.add(town);
        inputs.add(postcode);
        inputs.add(phoneNumber);
        inputs.add(email);

        //generate an id
        Integer id = Observers.generateId(bwa.observers);

        if(gui.btnVolenteerObserver.isSelected()){
            String volenteerDate = gui.newObserverVolDate();
            inputs.add(volenteerDate);

            if (validation.checkNullString(inputs)){
                addVolObserver(id, name, house, town, postcode, phoneNumber, 
                        email, volenteerDate);
                return true;
            } else {
                return false;
            }
        } else {
            String conStartDate = gui.newObserverStartDate();
            String conEndDate = gui.newObserverEndDate();
            Integer salary;
            try {
                salary = Integer.parseInt(gui.newObserverSalary());
            } catch (NumberFormatException nfe){
                return false;
            }
            
            inputs.add(conStartDate);
            inputs.add(conEndDate);

            if (validation.checkNullString(inputs)){
                addProObserver(id, name, house, town, postcode, phoneNumber, 
                        email, conStartDate, conEndDate, salary);
                return true;
            } else{
                return false;
            }
        }
    }     
    
    /** 
    * Change volunteer to professional observer
    */ 
    protected Boolean btnChangeVolToProActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // get the selected professional observer and their details
        Observers obs = Observers.findObserver(bwa.observers,
            gui.getChangeObserverToPro());
        String name = obs.getName();
        String house = obs.getHouse();
        String town = obs.getTown();
        String postcode = obs.getPostcode();
        String phoneNumber = obs.getPhoneNumber();
        String email = obs.getEmail();
        Integer id = obs.getId();
        String contractStart = gui.getChangeContractStart();
        String contractEnd = gui.getChangeContractEnd();
        Integer salary;
        try {
            salary = Integer.parseInt(gui.getChangeSalary());
        } catch (NumberFormatException nfe){
            return false;
        }

        // check for null
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(contractStart);
        inputs.add(contractEnd);

        if(validation.checkNullString(inputs)){
            // remove from observers
            obs.removeObserver(obs, bwa.observers);

            addProObserver(id, name, house, town, postcode, phoneNumber, email, contractStart,
                contractEnd, salary);
            return true;
        }
        return false;
        
    }  
    
    /** 
    * add a new professional observer
    * Called from btnChangeVolToProActionPerformed and 
    *             btnAddNewObserverActionPerformed
    */ 
    private void addProObserver(Integer id, String name, String house, String town, String postcode, 
            String phoneNumber, String email, String contractStart,
                    String contractEnd, Integer salary){
        
        // create new professional observer
        Observers newPro;
        newPro = new ProfessionalObserver(id, name, house, town, postcode, phoneNumber, email, 
                contractStart, contractEnd, salary);
        bwa.observers.add(newPro);
    }
    
    /** 
    * Change professional to volunteer observer
    */ 
    protected Boolean btnChangeProToVolActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // get the selected professional observer
        Observers obs = Observers.findObserver(bwa.observers,
            gui.getChangeObserverToVol());
        // get the details
        String name = obs.getName();
        String house = obs.getHouse();
        String town = obs.getTown();
        String postcode = obs.getPostcode();
        String phoneNumber = obs.getPhoneNumber();
        String email = obs.getEmail();
        Integer id = obs.getId();
        String volenteerDate = gui.getChangeProToVolObserverDate();

        // check for null
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(volenteerDate);

        if (validation.checkNullString(inputs)){
            // remove from observers
            obs.removeObserver(obs, bwa.observers);
            // add new volenteer observer
            addVolObserver(id, name, house, town, postcode, phoneNumber, email, volenteerDate);
            return true;
        } else {
            return false;
        }
    }
    
    /** 
    * add a new volunteer observer
    * Called from btnChangeProToVolActionPerformed and 
    *             btnAddNewObserverActionPerformed
    */ 
    private void addVolObserver(Integer id, String name, String house, String town, String postcode, 
            String phoneNumber, String email, String volenteerDate){
        
        // create new volenteer observer
        Observers newVol;
        newVol = new VolenteerObserver(id, name, house, town, postcode, phoneNumber, email, 
                volenteerDate);
        bwa.observers.add(newVol);
    }
    
    /** 
    * Save new animal
    */ 
    protected boolean btnSaveNewAnimalActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Get animal information
        String newAnimalName = gui.getNewAnimalName();
        int newAnimalThreatLevel = gui.getNewAnimalThreatLevel();
        int newAnimalId = bwa.animals.size()+1;

        // add new animal object
        if (!(newAnimalName.equals(""))){
            bwa.animals.add(new Animal(newAnimalId, newAnimalName, 
                    newAnimalThreatLevel));
            return true;
        } else {
            return false;
        }
    }
    
    /** 
    * Modify the threat level of an existing animal
    */ 
    protected void btnModifyThreatLevelActionPerformed(java.awt.event.ActionEvent evt) {
        Animal anml = Animal.findAnimalById(bwa.animals, 
                gui.tblAnimals.getSelectedRow() + 1);
        anml.setExtinctionThreatLevel((Integer) gui.spnChangeThreatLevel.getValue());
    }
    
    /** 
    * Create a new observation
     * @param evt
     * @return boolean dependant on success of adding observation
    */ 
    protected Boolean btnAddObservationActionPerformed(java.awt.event.ActionEvent evt) { 
        if (newObservation()){
            return true;
        } else {
            return false;
        }
    }
    
    /** 
    * Create a new observation
    */ 
    private Boolean newObservation(){
        Animal thisAnimal = Animal.findAnimal(bwa.animals, 
                gui.getNewObservationAnimal());        
        Observers thisObserver = Observers.findObserver(bwa.observers,
                gui.getNewObservationObserver());
        Boolean confidence = gui.getNewConfidence();
        Integer id = bwa.observations.size();
        String dateObserved = gui.getNewDateObserverd();
        String location = gui.getNewLocationObserverd();
        String animalActivityDescription = gui.getNewActivityDescription();
        Integer numObserved;
        try {
            numObserved = Integer.parseInt(gui.getNewNumberObserved());
        } catch (NumberFormatException nfe){
            return false;
        }
        
        // check for null strings
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(dateObserved);
        inputs.add(location);
        inputs.add(animalActivityDescription);
        
        if(validation.checkNullString(inputs)){
            return addNewObservation(id, dateObserved, location, thisObserver, 
                    numObserved, confidence, animalActivityDescription, thisAnimal);
        } else {
            return false;
        }
    }

    /** 
    * Add new observation
    * called from newObservation
    */ 
    private Boolean addNewObservation(Integer id, String dateObserved, 
            String location, Observers thisObserver, Integer numObserved, 
            Boolean confidence, String animalActivityDescription, Animal thisAnimal) {
        try {
            // try to add new observation
            Observation newObservation;
            newObservation = new Observation(id, dateObserved, location,
                    thisObserver, numObserved, confidence, animalActivityDescription,
                    thisAnimal);
            bwa.observations.add(newObservation);
            thisAnimal.addobservation(newObservation);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /** 
    * Create a new call for observation
     * @param evt
     * @return boolean dependant on the success of adding new call for observation
    */ 
    protected Boolean btnIssueCallActionPerformed(java.awt.event.ActionEvent evt) {                                         
        return newCallForObservation();
    } 
    
    /** 
    * Create new observation and call the add method
    * 
    */ 
    private Boolean newCallForObservation() throws HeadlessException {
        Animal callAnimal = Animal.findAnimal(bwa.animals,
                gui.getCallAnimal());
        String callPostcode = gui.getCallPostcode();
        String callStartDate = gui.getCallStartDate();
        String callEndDate = gui.getCallEndDate();
        String callDescription = gui.getCallDescription();
        
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(callPostcode);
        inputs.add(callStartDate);
        inputs.add(callEndDate);
        inputs.add(callDescription);
        
        if (validation.checkNullString(inputs)){
            addCallForObservation(callAnimal, callPostcode, callStartDate, 
                    callEndDate, callDescription); 
            
            gui.populateCallsTable(bwa.callsForObservations);
            return true;
        } else {
            return false;
        }
    }

    /** 
    * Add new observation
    */ 
    private void addCallForObservation(Animal callAnimal, String callPostcode, 
            String callStartDate, String callEndDate, String callDescription) {
        CallForObservation newCall;
        newCall = new CallForObservation(callAnimal, callPostcode,
                callStartDate, callEndDate, callDescription);
        bwa.callsForObservations.add(newCall);
    }
    
    /** 
    * Add observation information when a past call for action is selected
    * Checks to see if the observation of the animal was between the call dates.
    */ 
    protected void tblPastCallsMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // get the call
        CallForObservation call = bwa.callsForObservations.get(
                gui.tblPastCalls.getSelectedRow());

        // get the call for observation animal
        String animalName = gui.selectedCallAnimal();
        Animal anml = Animal.findAnimal(bwa.animals, animalName);
        
        // get the observation for that animal
        ArrayList<Observation> observations;
        observations = anml.getObservations();
        
        // loop, checking if the observation was between the two dates
        gui.callDetails.setRowCount(0);
        for(Observation obs: observations){
            try {
                // check if the date is between the two.
                if(call.inThisCall(obs.getDateObserved())){
                    if (obs.getLocationObserved().equals(call.getArea())) {
                        gui.populateCallDetails(obs, call);
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // date input validation
    protected void txtNewDateObservedFocusLost(java.awt.event.FocusEvent evt) {                                             
        checkDate(gui.getNewDateObserverd());
    }                                            

    protected void txtProToVolDateFocusLost(java.awt.event.FocusEvent evt) {                                          
        checkDate(gui.getChangeProToVolObserverDate());
    }                                         

    protected void txtVolToProContractStartFocusLost(java.awt.event.FocusEvent evt) {                                                   
        checkDate(gui.getChangeContractStart());
    }                                                  

    protected void txtVolToProContractEndDateFocusLost(java.awt.event.FocusEvent evt) {                                                     
        checkDate(gui.getChangeContractEnd());
    }                                                    

    protected void txtVolenteerDateFocusLost(java.awt.event.FocusEvent evt) {                                           
        checkDate(gui.newObserverVolDate());
    }                                          

    protected void txtProConStartDateFocusLost(java.awt.event.FocusEvent evt) {                                             
        checkDate(gui.newObserverStartDate());
    }                                            

    protected void txtProConEndDateFocusLost(java.awt.event.FocusEvent evt) {                                           
        checkDate(gui.newObserverEndDate());
    }                                          

    protected void txtCallStartFocusLost(java.awt.event.FocusEvent evt) {                                       
        checkDate(gui.getCallStartDate());
    }                                      

    protected void txtCallEndFocusLost(java.awt.event.FocusEvent evt) {                                     
        checkDate(gui.getCallEndDate());
    }  

    // check the date for format
    private void checkDate(String dateToCheck) {
        if (!(validation.checkDateFormat(dateToCheck))){
            gui.dateError();
        }
    }
}