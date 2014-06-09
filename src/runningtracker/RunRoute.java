/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runningtracker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class RunRoute {
    private List<Checkpoint> routeList = new ArrayList<>();
    private double paceGoal;
    private double paceActual;
    private double routeLength = 0;
    
    RunRoute() { }
    
    public void setStart(String intersection) {
        if (routeList.isEmpty()) {
            routeList.add(new Checkpoint(intersection, 0, 0));
        }
        else {
            //ERROR: can't set start if route isn't empty
        }
    }// setStart
    
    
    public void addCheckpoint(String intersection, double distanceFromStart) {
        if (routeList.isEmpty()) {
            //ERROR: need to add start point first
            System.out.println("ERROR: need to add start point first");
        }
        else if (routeList.get(routeList.size()-1).getDistanceFromStart() > distanceFromStart) {
            System.out.println("ERROR: distance must be larger than previous checkpoint");
            //ERROR: distance must be larger than previous checkpoint
        }
        else {
            routeList.add(new Checkpoint(intersection, distanceFromStart, 0));
            routeLength = distanceFromStart;
        }
    }// addCheckpoint
    
    
    public String toString() {
        String s = "";
        for (Checkpoint c : routeList) {
            s += c.toString() + "\n";
        }
        
        return s;
    }
}
