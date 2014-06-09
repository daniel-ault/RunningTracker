/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runningtracker;

/**
 *
 * @author Daniel
 */
public class Checkpoint {
    private String intersection;
    private double distanceFromStart;
    private double time;
    
    Checkpoint(String intersection, double distanceFromStart, double time) {
        this.intersection = intersection;
        this.distanceFromStart = distanceFromStart;
    }
    
    public String getIntersection() { return this.intersection; }
    public double getDistanceFromStart() { return this.distanceFromStart; }
}
