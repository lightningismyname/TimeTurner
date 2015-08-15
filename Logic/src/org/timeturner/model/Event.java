/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timeturner.model;

import java.time.Duration;
import java.util.List;

/**
 *
 * @author Barak
 */
public class Event {
    
    private final String name;

    private List<Person> presenters;
    
    private Duration duration;
    private Duration prepTime;
    
    private List<Room> relevantRooms;
    private boolean isComplex;
    
    private Schedule relevantTimes;

    public Event(String name) {
        this.name = name;
    }
}
