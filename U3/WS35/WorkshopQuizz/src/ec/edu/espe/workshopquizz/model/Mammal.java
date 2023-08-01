/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.workshopquizz.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public abstract class Mammal extends Animal{

    private ArrayList<Tooth> teeth = new ArrayList<>();

    public Mammal(Date bornOn, Claw[] claw) {
        super(bornOn, claw);
    }
    
    
    
    public abstract void feed();

    /**
     * @return the teeth
     */
    public ArrayList<Tooth> getTeeth() {
        return teeth;
    }

    /**
     * @param teeth the teeth to set
     */
    public void setTeeth(ArrayList<Tooth> teeth) {
        this.teeth = teeth;
    }
    
    
    
}
