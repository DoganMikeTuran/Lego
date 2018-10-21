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
public class Wall {

    int brick1;
    int brick2;
    int brick4;

    public Wall(int brick1, int brick2, int brick4) {
        this.brick1 = brick1;
        this.brick2 = brick2;
        this.brick4 = brick4;
    }

    public Wall() {
        this.brick1 = 0;
        this.brick2 = 0;
        this.brick4 = 0;

    }

    public int getBrick1() {
        return brick1;
    }

    public void setBrick1(int brick1) {
        this.brick1 = brick1;
    }

    public int getBrick2() {
        return brick2;
    }

    public void setBrick2(int brick2) {
        this.brick2 = brick2;
    }

    public int getBrick4() {
        return brick4;
    }

    public void setBrick4(int brick4) {
        this.brick4 = brick4;
    }

}
