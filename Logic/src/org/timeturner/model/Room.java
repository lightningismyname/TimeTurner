/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timeturner.model;

/**
 *
 * @author Barak
 */
public class Room {
    
    private final String name;
    private final String area;
    
    private int maxScreenersPerDay;
    private Schedule availability;

    public Room(String name, String area) {
        this.name = name;
        this.area = area;
    }

}
