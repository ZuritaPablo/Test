/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.workshopquizz.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public abstract class Animal {
    private Date bornOn;
    private Claw claw[];

    public Animal(Date bornOn, Claw[] claw) {
        this.bornOn = bornOn;
        this.claw = claw;
    }

    public void getAge(){
        //TODO get age
    }
    
    public abstract void feed();
    public abstract void born();
    
    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the claw
     */
    public Claw[] getClaw() {
        return claw;
    }

    /**
     * @param claw the claw to set
     */
    public void setClaw(Claw[] claw) {
        this.claw = claw;
    }
    
    
}
