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
    String intersection;
    double distanceFromStart;
    double time;
    
    Checkpoint(String intersection, double distanceFromStart, double time) {
        this.intersection = intersection;
        this.distanceFromStart = distanceFromStart;
    }
    
    String getIntersection() { return this.intersection; }
    double getDistanceFromStart() { return this.distanceFromStart; }
}