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
        super(name);
        this.cost = cost;
    }

    @Override
    // Getting the cost
    public int getCost() {
        return cost;
    }
    
    @Override
    public String toString(){
        
    }
}
