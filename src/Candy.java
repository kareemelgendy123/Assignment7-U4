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
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString(){
        
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
        cost = (int) Math.round(this.weight * this.pricePerLbs);
        return cost;
    }
}
