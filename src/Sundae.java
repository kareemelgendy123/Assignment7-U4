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
       super(icName, icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    // Getting the topping name
    public String getToppingName(){
        return toppingName;
    }
    
    // Getting the cost
    public int getCost(){
        cost = this.toppingCost + super.getCost();
        return cost;
    }

    @Override
    public String toString(){
        
    }
}
