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
 *
 * @author Anthony
 */
public class CallForObservation {
    
    private Animal callAnimal;
    private String area;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date startDate;
    private Date endDate;
    private String reason;

    public CallForObservation(Animal anml, String area, String start, String end, String reason) {
        
        this.reason = reason;
        this.callAnimal = anml;
        this.area = area;
        
        try {
            this.startDate = sdf.parse(start);
            this.endDate = sdf.parse(end);
        } catch (ParseException ex) {
            Logger.getLogger(ProfessionalObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getReason() {
        return reason;
    }
    
    public Animal getCallAnimal() {
        return callAnimal;
    }

    public String getArea() {
        return area;
    }

    public String getStartDate() {
        String date = sdf.format(this.startDate);
        return date;
    }

    public String getEndDate() {
        String date = sdf.format(this.endDate);
        return date;
    }
    
    /*
    * Check to see if the observation date id within the call dates
    */
    public Boolean inThisCall(String date) throws ParseException{
        Date obsDate = sdf.parse(date);
        
        return this.endDate.compareTo(obsDate) * obsDate.compareTo(
                this.startDate) > 0;
        
    }
}
