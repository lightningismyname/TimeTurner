/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timeturner.model;

import java.util.List;

/**
 *
 * @author Barak
 */
public interface Convention {
    
    List<Person> getPersons();
    
    List<Room> getRooms();
    
    List<Event> getEvents();
    
    List<EventAllocation> getEventAllocations();
}
