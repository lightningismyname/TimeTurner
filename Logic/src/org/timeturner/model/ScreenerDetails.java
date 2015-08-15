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
public class ScreenerDetails {
    private boolean goodEnglish = false;
    private boolean experienced = false;
    private boolean needsTraining = true;

    public boolean isGoodEnglish() {
        return goodEnglish;
    }

    public void setGoodEnglish(boolean goodEnglish) {
        this.goodEnglish = goodEnglish;
    }

    public boolean isExperienced() {
        return experienced;
    }

    public void setExperienced(boolean experienced) {
        this.experienced = experienced;
    }

    public boolean isNeedsTraining() {
        return needsTraining;
    }

    public void setNeedsTraining(boolean needsTraining) {
        this.needsTraining = needsTraining;
    }
    
}
