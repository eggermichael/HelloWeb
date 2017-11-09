/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.michaelegger.webapps.bmi_calculator;

/**
 * Class for calculating the BMI (body mass index) with high precision.
 * @author Mike
 */
public class BMIHandler {

    /** Calculates Body mass index
     * @return the bmi (body mass index) = weight [kg] / height^2 [m^2]
     */
    public Double getBmi() {
        if (heightm != null && heightm > 0.0) {
            bmi = weight / (Math.pow(getHeightM(), 2));
            return bmi;
        }
        else
            return 0.0;
    }

    /**
     * Getter for body height in m
     * @since  v0.2
     * @return the height in [m] (meters)
     */
    public Double getHeightM() {
        if (heightm == null && height != null) {

        }
        return heightm;
    }

    /**
     * Converts the height from cm to m
     * @since  v0.3
     */
    private void convertHeightCmToM() {
        heightm = height / 100.0;
    }
    
    /**
     * Getter for body height in cm
     * @since  v0.2
     * @return the height in [cm] (centimeters)
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Setter for body heigth in cm
     * @since  v0.2
     * @param height the height in [m] (meters) to set
     */
    public void setHeight(Double height) {
        this.height = height;
        convertHeightCmToM();
    }

    /**
     * Getter for body weight in kg
     * @return the weight in [kg] (kilogram)
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Setter for body weight in kg
     * @param weight the weight [kg] (kilogram) to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
 
    private Double heightm;
    private Double height;
    private Double weight;
    private Double bmi;
    
    /**
     * Initializes all heigth and weight to null. Set the values with the provided functions.
     */
    public BMIHandler() {
        height = null;
        heightm = null;
        weight = null;
        bmi = null;
    }
    
    
}
