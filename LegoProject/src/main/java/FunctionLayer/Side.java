/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author dmt1
 */
public class Side {
    private Integer toGangeFire;
    private Integer toGangeTo;
    private Integer enGangeTo;
    private String sideNavn;

    public Side(Integer toGangeFire, Integer toGangeTo, Integer enGangeTo, String sideNavn) {
        this.toGangeFire = toGangeFire;
        this.toGangeTo = toGangeTo;
        this.enGangeTo = enGangeTo;
        this.sideNavn = sideNavn;
    }
    
    public Integer getToGangeFire() {
        return toGangeFire;
    }

    public void setToGangeFire(Integer toGangeFire) {
        this.toGangeFire = toGangeFire;
    }

    public Integer getToGangeTo() {
        return toGangeTo;
    }

    public void setToGangeTo(Integer toGangeTo) {
        this.toGangeTo = toGangeTo;
    }

    public Integer getEnGangeTo() {
        return enGangeTo;
    }

    public void setEnGangeTo(Integer enGangeTo) {
        this.enGangeTo = enGangeTo;
    }

    public String getSideNavn() {
        return sideNavn;
    }

    public void setSideNavn(String sideNavn) {
        this.sideNavn = sideNavn;
    }
    
    
}
