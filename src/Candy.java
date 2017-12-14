/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class Candy extends DessertItem{
    
    // Instance variables
    private double weight;
    private int pricePerLbs;
    private int cost;
    
    // Constructor
    public Candy(String name, double weight, int pricePerLbs){
        
        // Calling the name from the super class
        super(name);    
        
        // Assigning values to the instance variables
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    // Getting the price per pound
    public int getPricePerLbs(){ 
        return this.pricePerLbs;
    }
    
    // Getting the price per weight
    public double getWeight(){
        return this.weight;
    }

    @Override
    // Getting the cost for the candy
    public int getCost() {
        // Calculating the cost
        cost = (int) Math.round(weight * pricePerLbs);
        return cost;
    }
    
    @Override
    public String toString(){
        
        String output = "";
        output += getWeight() + " @ " + DessertShoppe.cents2dollarsAndCents(getPricePerLbs()) + " / lbs\n";
        output += getName() + " " + DessertShoppe.cents2dollarsAndCents(getCost());
        
        return output;
    }
   
}
