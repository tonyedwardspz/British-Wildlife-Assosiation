/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * @author Anthony
 */
public class Observers {
    
    private String name;
    private String house;
    private String town;
    private String postcode;
    private String phoneNumber;
    private String email;
    private Integer id;

    public Observers(Integer id, String name, String house, String town, String postcode, String phoneNumber, String email) {
        this.name = name;
        this.house = house;
        this.town = town;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
    }

    public static Integer generateId(ArrayList<Observers> observers){
        Integer id = 0;
        
        for(Observers obs: observers){
            id++;
        }
        return id;
    }
    
    public Boolean getArea(String areaPostcode){
        // get the first two charachters of the input postcode
        String firstTwo = areaPostcode.substring(0, 2);        
        
        // get the postcode of the observer
        String post = this.postcode;
        return post.toLowerCase().contains(firstTwo.toLowerCase());
    }
    
    public void removeObserver(Observers oldObserver, 
            ArrayList<Observers> observers){
        
        for (Iterator<Observers> it = observers.iterator(); it.hasNext(); ) {

            Observers obs = it.next();
            if (obs.getName().equals(oldObserver.getName())) {
               it.remove();
            }
        } 
    }
    
    public static Observers findObserver(ArrayList<Observers> observers, String observerName){
        Observers theObserver = null;
        
        for (Observers obs: observers){
            if (obs.getName().equals(observerName)){
                theObserver = obs;
            }
        }
        return theObserver;
    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getHouse() {
        return house;
    }

    public String getTown() {
        return town;
    }

    public String getPostcode() {
        return postcode;
    }

    String getRegistrationDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Boolean getCurrentActivityStatus(Date lastActivity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    String getContractStart() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getContractEnd() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Integer getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
