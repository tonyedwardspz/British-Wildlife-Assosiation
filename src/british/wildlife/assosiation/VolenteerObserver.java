/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Anthony
 */
public class VolenteerObserver extends Observers{

    // System stuff
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar oneYearAgo = Calendar.getInstance();
    
    // instance variables
    private String registrationDate;
    
    public VolenteerObserver(Integer id, String name, String house, String town, 
            String postcode, String phoneNumber, String email, String regDate) {
        
        super(id, name, house, town, postcode, phoneNumber, email);
        
        this.registrationDate = regDate;
    }

    @Override
    public String getRegistrationDate() {
        return registrationDate;
    }
    
    /**
     * Check to see if the last observation was made within the last year
     * @param lastActivity is the last observation made
     * @return Boolean value if the observer is active
     */
    @Override
    public Boolean getCurrentActivityStatus(Date lastActivity){
        
        //subtract one year from today
        oneYearAgo.add(Calendar.YEAR, -1);
        
        return lastActivity.before(oneYearAgo.getTime());
    }
}
