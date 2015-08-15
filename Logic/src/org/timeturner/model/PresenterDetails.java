package org.timeturner.model;

/**
 *
 * @author Barak
 */
public class PresenterDetails {
    private boolean vipOrComplex = true;
    private boolean englishOnly = true;

    public boolean isVipOrComplex() {
        return vipOrComplex;
    }

    public void setVipOrComplex(boolean vipOrComplex) {
        this.vipOrComplex = vipOrComplex;
    }

    public boolean isEnglishOnly() {
        return englishOnly;
    }

    public void setEnglishOnly(boolean englishOnly) {
        this.englishOnly = englishOnly;
    }
}
