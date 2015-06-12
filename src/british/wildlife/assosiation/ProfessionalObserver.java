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
public class ProfessionalObserver extends Observers{

    
    // Instance variables
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date contractStart;
    private Date contractEnd;
    private Integer salary;
    
    
    public ProfessionalObserver(Integer id, String name, String house, 
            String town, String postcode, String phoneNumber, 
            String email, String contStart, String contEnd, Integer sal) {
        
        super(id, name, house, town, postcode, phoneNumber, email);
        
        // parse the date
        try {
            this.contractStart = sdf.parse(contStart);
            this.contractEnd = sdf.parse(contEnd);
        } catch (ParseException ex) {
            Logger.getLogger(ProfessionalObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.salary = sal;
    }

    @Override
    public String getContractStart() {
        
        String conStart = sdf.format(contractStart);
        return conStart;
    }

    @Override
    public String getContractEnd() {
        
        String conEnd = sdf.format(contractEnd);
        return conEnd;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }
}
