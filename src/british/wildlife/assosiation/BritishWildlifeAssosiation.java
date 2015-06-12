/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Observable;

/**
 * @author Anthony
 */
public class BritishWildlifeAssosiation extends Observable{

    // System stuff
    String newLine = System.getProperty("line.separator");

    // Arraylists to store stuff
    ArrayList<Observers> observers;
    ArrayList<Animal> animals;
    ArrayList<Observation> observations;
    ArrayList<CallForObservation>callsForObservations;
    
    // reference to objects
    Observers observer;
    Animal animal;
    Observation observation;
    CallForObservation calls;

    public BritishWildlifeAssosiation() throws ParseException {
        observers = new ArrayList();
        animals = new ArrayList();
        observations = new ArrayList();
        callsForObservations = new ArrayList();
        
        addDummyData();
        addObservationsToAnimals();
    }

    private void addDummyData() throws ParseException {
        // Create animals
        Animal fox = new Animal(1, "Fox", 2);
        animals.add(fox);
        Animal robin = new Animal(2, "Robin", 1);
        animals.add(robin);
        Animal wolf = new Animal(3, "Wolf", 5);
        animals.add(wolf);
        Animal badger = new Animal(4, "Badger", 2);
        animals.add(badger);
        Animal deer = new Animal(5, "Deer", 3);
        animals.add(deer);
        Animal mole = new Animal(6, "Mole", 1);
        animals.add(mole);
        Animal wildboar = new Animal(7, "Wild Boar", 5);
        animals.add(wildboar);
        Animal greysquirrel = new Animal(8, "Grey Squirrel", 1);
        animals.add(greysquirrel);
        Animal weasel = new Animal(9, "Weasel", 3);
        animals.add(weasel);
        Animal hedgehog = new Animal(10, "Hedgehog", 2);
        animals.add(hedgehog);
        Animal otter = new Animal(11, "Otter", 4);
        animals.add(otter);
        Animal doormouse = new Animal(12, "Doormouse", 1);
        animals.add(doormouse);
        Animal shrew = new Animal(13, "Shrew", 1);
        animals.add(shrew);
        Animal littleegret = new Animal(14, "Little Egret", 3);
        animals.add(littleegret);
        Animal barnowl = new Animal(15, "Barn Owl", 3);
        animals.add(barnowl);

        
        // Create pro observers and assosiated observations
        Observers p1 = new ProfessionalObserver(1,"Mikayla Stacham",
                "30 Horn Lane", "Plymouth", "PL9 9BS", "01752 541236",
                "mikayla@gmail.com", "01/11/2014", "01/11/2015", 18000);
        observers.add(p1);
        observations.add(new Observation(0, "01/05/2014", "PL9 9DG", p1,
                1, false, "Walking around the park, sniffing bins", fox));
        
        Observers p2 = new ProfessionalObserver(2,"Jack Johnson",
                "14 Tavy House", "Plymouth", "PL9 4HG", "01752 756984", 
                "jackj@gmail.com", "01/04/2013", "01/01/2016", 26000);
        observers.add(p2);
        observations.add(new Observation(1, "18/11/2014", "TR18 4DG", p2,
                4, false, "Walking around the park, sniffing bins", robin));
        observations.add(new Observation(2, "18/04/2014", "EX3 4RT", p2,
                4, false, "Walking around the park, sniffing bins", wolf));
        
        Observers p3 = new ProfessionalObserver( 3, "Jennifer Lawry",
                "The Mannor House", "Somerset", "SM9 9BS", "01935 402886",
                "littlejen@gmail.com", "01/10/2014", "01/12/2015", 20000 );
        observers.add( p3 );
        observations.add(new Observation( 5, "23/09/2014", "TR26 9QB",
                p3, 3, true, "Young ones, playing in the marsh", otter ));
        observations.add(new Observation(6, "24/11/2014", "PL2 4AQ", 
                p3, 1, true, "Hunting in a field", barnowl ));

        Observers p4 = new ProfessionalObserver( 4,
                "Rosemary Edwards", "62 Boscathnoe Way", "Cornwall", "TR26 8FQ",
                "01736 363214", "rosie@tiscali.com", "01/09/2014",
                "01/09/2015", 13000 );
        observers.add( p4 );
        observations.add(new Observation( 7,  "13/03/2014",  "TR18 2NF",
                p4, 1, true, "Running accross the road", badger )); 
        observations.add(new Observation( 8, "25/02/2014", "PL13 8HG", p4,
                2, true, "Chasing each other around a tree trunk", greysquirrel ));
        observations.add(new Observation( 9, "18/05/2014", "TR17 8XU", p4,
                1, true, "Creating mole hills in my friends garden", mole ));
        
        Observers p5 = new ProfessionalObserver(5, "Glynis Clarke", 
                "26 Forest Crescent", "Dartmouth", "TQ7 8PS",
                "01803 879642", "glyn24@gmail.com", "13/04/2014", "13/04/2015",
                15000);
        observers.add(p5);
        observations.add(new Observation( 10, "16/10/2014", "PL4 9AS", p5,
                1, false, "Fishing at the lake", littleegret));
        observations.add(new Observation(11, "30/09/2014", "EX6 3SW", p5,
                1, true, "Sniffing around a lane", hedgehog ));

        Observers p6 = new ProfessionalObserver(6, "Mandy Holland",
                "Church Cottage", "Cornwall", "TR18 3JB", "01736 333069",
                "doglover@hotmail.com", "01/05/2013", "01/08/2014", 13000 );
        observers.add( p6 );
        observations.add(new Observation( 12, "18/02/2014", "TR18 3JB",  p6,
                1, true, "In the garden, on the wall", robin ));
        observations.add(new Observation( 13, "06/09/2013", "TR36 5SQ", p6,
                2, false, "Running through woodland", deer ));
        observations.add(new Observation(14, "15/10/2013", "PL4 6JN", p6,
                1, true, "Ran into a hedge", shrew ));

        Observers p7 = new ProfessionalObserver( 7, "Lee Carder",
                "Ashwells House", "Essex", "CM0 2WF", "01277 894084",
                "mmrg10@yahoo.com", "01/06/2014", "01/08/2014", 12000 );
        observers.add( p7 );
        observations.add(new Observation( 15, "23/06/2014", "EX4 8BN", p7,
                2, false, "On top of a hill in the distance", wolf ));
        observations.add(new Observation( 16, "01/07/2014", "PL2 7NF", p7,
                1, true, "Ran accross the path in a medow", doormouse ));
        observations.add(new Observation( 17, "19/07/2014", "TR14 6AX", p7,
                1, true, "In a carpark sniffing around", hedgehog ));

        Observers p8 = new ProfessionalObserver( 8, "Joe Beresford",
                "13 Reens Road", "Manchester", "M1 4WB", "0161 321656",
                "dumbdumb@hotmail.com", "23/01/2014", "02/04/2014", 10000 );
        observers.add( p8 );
        observations.add(new Observation( 18, "30/01/2014", "PL6 4QE", p8,
                2, true, "Scavaging in the bin, around the back of a shop", fox ));
        observations.add(new Observation( 19, "06/03/2014", "EX20 1HG", p8,
                1, true, "On the moors", badger ));
        
        Observers p9 = new ProfessionalObserver( 11, "Steven Dyer",
                "22 Londis close", "Devon", "PL4 9QE", "01752 659582",
                "stevo45@gmail.com", "01/03/2014", "01/03/2015",  17000 );
        observers.add( p9 );
        observations.add(new Observation( 20, "01/05/2014", "PL14 7AA", p9,
                1, false, "Saw from a distance, in the woods", wildboar ));
        observations.add(new Observation( 22, "18/11/2014", "TR15 8QA", 
                p9, 2, true, "Youngsters playfighting near their den ", weasel ));

        
        
        // Create volenteer observers and their observations
        Observers v1 = new VolenteerObserver(3, "Chris Packham",
                "76 Shaftsbury Ave", "Plymouth", "PL9 9DG", "01752 354523",
                "peckerpackham@gmail.com", "18/05/1990");
        observers.add(v1);
        observations.add(new Observation(3, "14/11/2014", "PL9 4FG", v1,
                4, false, "Flapping aroung a holly bush, chirping away", robin));
        
        Observers v2 = new VolenteerObserver(4, "Bill Oddey",
                "22 Finsbury Ave", "Plymouth", "PL9 9BS", "01752 351478",
                "billthebird@gmail.com", "18/05/2012");
        observers.add(v2);
        observations.add(new Observation(4, "15/11/2014", "PL9 9DG", v2,
                2, false, "Walking around the park, sniffing bins", fox));
        
        
        //add call for observation
        CallForObservation call = new CallForObservation(fox, "PL9 9DG", 
            "01/11/2014", "30/12/2014", "No foxes seen in this area for a while");
        callsForObservations.add(call);
        
        CallForObservation call2 = new CallForObservation(robin, "PL9 4FG", 
            "01/11/2014", "30/11/2014", "Robins are low in numbers in this area");
        callsForObservations.add(call2);
    }

    private void addObservationsToAnimals() {
        // add the obervations to the individual animals
        for (Observation observe: observations){
            // get the animal
            Animal obsAnml = observe.getAnimal();
            Integer ondAnmlId = obsAnml.getAnimalId();
            
            for(Animal anml: animals){
                Integer anmlId = anml.getAnimalId();
                if (Objects.equals(ondAnmlId, anmlId)){
                    anml.addobservation(observe);
                }
            }
        }
    }

    void run() {
        
        // print the observers
        System.out.println("Observers");
        for (Observers obs : this.observers) {
            if (obs instanceof VolenteerObserver) {
                System.out.println("Name: " + obs.getName() + newLine
                        + "Address: " + obs.getHouse() + newLine
                        + "Address: " + obs.getTown() + newLine
                        + "Address: " + obs.getPostcode() + newLine
                        + "Phone: " + obs.getPhoneNumber() + newLine
                        + "Email: " + obs.getEmail() + newLine
                        + "Registration Date: " + obs.getRegistrationDate() + newLine);
            } else if (obs instanceof ProfessionalObserver) {
                System.out.println("Name: " + obs.getName() + newLine
                        + "Address: " + obs.getHouse() + newLine
                        + "Address: " + obs.getTown() + newLine
                        + "Address: " + obs.getPostcode() + newLine
                        + "Phone: " + obs.getPhoneNumber() + newLine
                        + "Email: " + obs.getEmail() + newLine
                        + "Start Date: " + obs.getContractStart() + newLine
                        + "End Date: " + obs.getContractEnd() + newLine
                        + "Salary: " + obs.getSalary() + newLine);
            } else {
                System.out.println("Houston, we have a problem");
            }
        }
        
        // print the animals
        System.out.println("Animals");
        for (Animal anim: this.animals){
            System.out.println("Name: " + anim.getName() + newLine
                    + "Extinction threat level: " + anim.getExtinctionThreatLevel()
                    + newLine);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        BritishWildlifeAssosiation bwa = new BritishWildlifeAssosiation();
        
        bwa.run();
    }

}
