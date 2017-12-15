/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class IceCream extends DessertItem{
    
    // Instance variables
    private int cost;

    // Constructor
    public IceCream(String name, int cost){  
        
        // Calling the name from the super class
        super(name);
        
        // Assigning a value to the cost instance variable
        this.cost = cost;
    }

    @Override
    // Getting the cost of the ice cream
    public int getCost() {    
        return cost;
    }

    @Override
    public String toString(){
        
        String output = "";
        
        // Converting the price from cents to dollars
        String costHolder = DessertShoppe.cents2dollarsAndCents(getCost());
                
        // Outputting the name of the ice cream
        output += getName();
        
        // Formatting the lines to fit the receipt width
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costHolder.length(); i++){
            output += " ";
        }
        
        // Outputting the price of the ice cream
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return output;
    }
}
