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
public class StyklisteEngine {

    public Stykliste CreateStykliste(Ordre o) {
        Stykliste sl = new Stykliste();

        int længde = o.getLængde();
        int bredde = o.getBredde();
        int højde = o.getHøjde();

        int toGangeFire = 0;
        int toGangeTo = 0;
        int toGangeEn = 0;
        
        // det skal være muligt at forskyde pr. højde
        boolean forskudtEnGang = false;
        
        
            // hvis vi har mere end 1 længde til rådighed, vil vi gerne forskyde
            if ((længde - 1) > 0 && forskudtEnGang == false) {
                længde -= 1;
                forskudtEnGang = true;
            } else {
                // reset forskudtEnGang så vi kan forskyde igen ved næste højde
                forskudtEnGang = false;
            }

            while (længde > 0) {

                if (længde - 4 >= 0) {
                    toGangeFire++;
                    længde -= 4;
                } else {
                    if (længde - 2 >= 0) {
                        toGangeTo++;
                        længde -= 2;
                    } else {
                        if (længde - 1 >= 0) {
                            toGangeEn++;
                            længde -= 1;
                        }
                    }
                }

            }
            
            // hvis vi har forskudt tidligere, og længde er 0, vil den reele længde være 1.
            // indsæt derfor 1x2 brik for at færddiggøre stykket på længden
            if (forskudtEnGang && længde == 0) {
                toGangeEn++;
            }
        
        
        Side side1 = new Side(toGangeFire, toGangeTo, toGangeEn, "1");
        Side side3 = new Side(toGangeFire, toGangeTo, toGangeEn, "3");
        
        sl.toGangeFireTotal += toGangeFire*2;
        sl.toGangeToTotal += toGangeTo*2;
        sl.toGangeEnTotal += toGangeEn*2;

        toGangeFire = 0;
        toGangeTo = 0;
        toGangeEn = 0;

        forskudtEnGang = false;
       
        
           
            if ((bredde - 1) > 0 && forskudtEnGang == false) {
                bredde -= 1;
                forskudtEnGang = true;
            } else {
                forskudtEnGang = false;
            }

            while (bredde > 0) {

                if (bredde - 4 >= 0) {
                    toGangeFire++;
                    bredde -= 4;
                } else {
                    if (bredde - 2 >= 0) {
                        toGangeTo++;
                        bredde -= 2;
                    } else {
                        if (bredde - 1 >= 0) {
                            toGangeEn++;
                            bredde -= 1;
                        }
                    }
                }

            }
            if (forskudtEnGang && bredde == 0) {
                toGangeEn++;
            }
        
        
        Side side2 = new Side(toGangeFire, toGangeTo, toGangeEn, "2");
        Side side4 = new Side(toGangeFire, toGangeTo, toGangeEn, "4");
        
        sl.toGangeFireTotal += toGangeFire*2;
        sl.toGangeToTotal += toGangeTo*2;
        sl.toGangeEnTotal += toGangeEn*2;
        
        
        sl.toGangeFireTotalXHøjde = sl.toGangeFireTotal*o.getHøjde();
        sl.toGangeToTotalXHøjde = sl.toGangeToTotal*o.getHøjde();
        sl.toGangeEnTotalXHøjde = sl.toGangeEnTotal*o.getHøjde();
        
        sl.getSider().add(side1);
        sl.getSider().add(side2);
        sl.getSider().add(side3);
        sl.getSider().add(side4);
               
        return sl;
        
    }

}
