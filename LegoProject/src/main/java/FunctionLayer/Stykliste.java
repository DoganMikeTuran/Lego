/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmt1
 */
public class Stykliste {
    List<Side> sider = new ArrayList<Side>();
    int toGangeFireTotal = 0;
    int toGangeToTotal = 0;
    int toGangeEnTotal = 0;
    
    int toGangeFireTotalXHøjde = 0;
    int toGangeToTotalXHøjde = 0;
    int toGangeEnTotalXHøjde = 0;

    public int getToGangeFireTotal() {
        return toGangeFireTotal;
    }

    public void setToGangeFireTotal(int toGangeFireTotal) {
        this.toGangeFireTotal = toGangeFireTotal;
    }

    public int getToGangeToTotal() {
        return toGangeToTotal;
    }

    public void setToGangeToTotal(int toGangeToTotal) {
        this.toGangeToTotal = toGangeToTotal;
    }

    public int getToGangeEnTotal() {
        return toGangeEnTotal;
    }

    public void setToGangeEnTotal(int toGangeEnTotal) {
        this.toGangeEnTotal = toGangeEnTotal;
    }

    public int getToGangeFireTotalXHøjde() {
        return toGangeFireTotalXHøjde;
    }

    public void setToGangeFireTotalXHøjde(int toGangeFireTotalXHøjde) {
        this.toGangeFireTotalXHøjde = toGangeFireTotalXHøjde;
    }

    public int getToGangeToTotalXHøjde() {
        return toGangeToTotalXHøjde;
    }

    public void setToGangeToTotalXHøjde(int toGangeToTotalXHøjde) {
        this.toGangeToTotalXHøjde = toGangeToTotalXHøjde;
    }

    public int getToGangeEnTotalXHøjde() {
        return toGangeEnTotalXHøjde;
    }

    public void setToGangeEnTotalXHøjde(int toGangeEnTotalXHøjde) {
        this.toGangeEnTotalXHøjde = toGangeEnTotalXHøjde;
    }
    
    public Stykliste() {
    }

    public List<Side> getSider() {
        return sider;
    }

    public void setSider(List<Side> sider) {
        this.sider = sider;
    }
    
}

