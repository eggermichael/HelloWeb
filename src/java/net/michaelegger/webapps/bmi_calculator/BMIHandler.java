/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.michaelegger.webapps.bmi_calculator;

/**
 *
 * @author Mike
 */
public class BMIHandler {

    /**
     * @return the bmi (body mass index)
     */
    public Double getBmi() {
        bmi = weight / (height * height);
        return bmi;
    }

    /**
     * @return the height in [m] (meters)
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height in [m] (meters) to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the weight in [kg] (kilogram)
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight [kg] (kilogram) to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
 
    private Double height;
    private Double weight;
    private Double bmi;
    
    public BMIHandler() {
        height = null;
        weight = null;
        bmi = null;
    }
    
    
}
