/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runningtracker;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class RunningTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RunRoute route = RunRoute.loadFromCSV("/home/daniel/Documents/test.csv");// = createRoute();
            
            System.out.println(route.toString());
            /*
            try {
            route.saveToCSV("/home/daniel/Documents/test.csv");
            } catch (FileNotFoundException ex) {
            Logger.getLogger(RunningTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RunningTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static RunRoute createRoute() {
        RunRoute route = new RunRoute();
        
        route.setGoalPace(6);
        route.setStart("Minor and Spottswood");
        route.addCheckpoint("Park and Highland", 0.49);
        route.addCheckpoint("Park and Goodman", 1.1);
        route.addCheckpoint("Park and Goodlett", 1.61);
        route.addCheckpoint("Goodlett and Spottswood", 2);
        route.addCheckpoint("Spottswood and Buck", 2.37);
        route.addCheckpoint("Spottswood and Goodman", 2.51);
        route.addCheckpoint("Spottswood and Houston", 2.77);
        route.addCheckpoint("Patterson and Southern", 3.05);
        
        //System.out.println(route.toString() + "\n\n");
        
        route.setGoalPace(7);
        
        //System.out.println(route.toString());
        
        return route;
    }
    
}
