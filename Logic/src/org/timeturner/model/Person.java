/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timeturner.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Barak
 */
public class Person {

    public enum Role {
        PRESENTER,
        STAFF,
        SCREENER,
        VOLUNTEER,
    }
    
    // The email should be unique for each person
    private final String email;
    
    private String cellphone;
    private String name;

    private Schedule availability;
    private final Set<Role> roles;
    
    private PresenterDetails presenterDetails;
    private PresenterDetails screenerDetails;

    public Person(String email, Set<Role> roles) {
        this.email = email;
        this.roles = new HashSet<>(roles);
    }

    public PresenterDetails getPresenterDetails() {
        return presenterDetails;
    }

    public void setPresenterDetails(PresenterDetails presenterDetails) {
        this.presenterDetails = presenterDetails;
    }

    public PresenterDetails getScreenerDetails() {
        return screenerDetails;
    }

    public void setScreenerDetails(PresenterDetails screenerDetails) {
        this.screenerDetails = screenerDetails;
    }
    
    
}
