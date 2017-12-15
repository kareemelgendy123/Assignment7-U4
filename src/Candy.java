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
    private double weight; // Stores the weight of the candy
    private int pricePerLbs; // Stores the price per pound
    private int cost; // Stores the cost of the candy
    
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
    
    // Getting the weight
    public double getWeight(){
        return this.weight;
    }

    @Override
    // Getting the cost of the candy
    public int getCost() {
        
        // Calculating the cost of the candy
        cost = (int) Math.round(weight * pricePerLbs);
        return cost;
    }
    
    @Override
    public String toString(){
        
        String output = "";
        
        // Converting the cost from cents to dollars
        String costHolder = DessertShoppe.cents2dollarsAndCents(getCost());
       
        // Outputting the item amount
        output += getWeight() + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(getPricePerLbs()) + " /lb.\n";
        
        // Outputting the item name
        output += getName();
        
        // Formatting the lines to fit the receipt width 
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costHolder.length(); i++){
            output += " ";
        }
        
        // Ouputting the price of the candy
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return output;
    }
   
}
