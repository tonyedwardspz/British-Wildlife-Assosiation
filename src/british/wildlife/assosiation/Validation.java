/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class Validation {
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    protected Boolean checkNullString(ArrayList<String> inputs){
        Boolean notEmpty = true;

        for (String input: inputs){
            if(input.equals("")){
                notEmpty = false;
            }
        }
        return notEmpty;
    }
    
    protected Boolean checkDateFormat(String date){
        try {
            Date theDate = sdf.parse(date);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(ProfessionalObserver.class.getName()).log(
                    Level.SEVERE, null, ex);
            return false;
        }
    }
    
    protected Boolean checkValidInteger(String possibleInt){
        try {
            Integer theInt = Integer.parseInt(possibleInt);;
            return true;
        } catch (NumberFormatException ex) {
            Logger.getLogger(ProfessionalObserver.class.getName()).log(
                    Level.SEVERE, null, ex);
            return false;
        }
    }
    
    protected Boolean checkNullInt(Integer possibleNull){
        return possibleNull > 0;
    }
    
    
}
