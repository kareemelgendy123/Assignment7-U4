/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class Cookie extends DessertItem{
    
    // Instance variables
    private int number;
    private int pricePer12;
    private int cost;
    
    // Constructor
    public Cookie(String name, int number, int pricePer12){ 
        
        // Calling the name from the super class
        super(name);
        
        // Assigning values to the instance variables
        this.number = number;
        this.pricePer12 = pricePer12;       
    }
    
    // Getting the number of cookies
    public int getNumber(){  
        return this.number;
    }
    
    // Getting the price / dozen
    public int getPricePer12(){
        return this.pricePer12;
    }

    @Override
    // Getting the cost of the cookie
    public int getCost() {
        
        // Calculating the cost
        cost = (int) Math.round(number * pricePer12 / 12);
        return cost;
    }
    
    @Override
    public String toString(){  
        
        String output = "";
        
        // Converting the price from cents to dollars
        String costHolder = DessertShoppe.cents2dollarsAndCents(getCost());
         
        // Outputting the item amount
        output += this.getNumber() + " @ $" + DessertShoppe.cents2dollarsAndCents(getPricePer12()) + " /dz\n";
        
        // Ouputting the name of the cookie
        output += this.getName();
        
        // Formatting the lines to fit the receipt width
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costHolder.length(); i++){
            output += " ";
        }
        
        // Outputting the price of the cookies 
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return output;
    }
    
}
