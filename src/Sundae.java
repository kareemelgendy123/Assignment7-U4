/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class Sundae extends IceCream{
    
    // Instance variables
    private String toppingName;
    private int toppingCost;
    private int cost;

    // Constructor
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       
       // Calling the ice cream name and cost from super class
       super(icName, icCost);
       
       // Assigning values to the instance variables
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    // Getting the name of the topping
    public String getToppingName(){
        return toppingName;
    }
    
    // Getting the cost of the sundae
    public int getCost(){
        
        // Calculating the cost
        cost = this.toppingCost + super.getCost();
        return cost;
    }

    @Override
    public String toString(){
        
        String output = "";
        
        // Converting the price from cents to dollars
        String costHolder = DessertShoppe.cents2dollarsAndCents(getCost());

        // Outputting the topping name and sundae with..
        output += getToppingName() + " Sundae with\n";
        
        // Outputting the name of the sundae
        output += getName();
        
        // Formatting the lines to 30 characters
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costHolder.length(); i++){
            output += " ";
        }
        
        // Price of item
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return output;
    }
}
