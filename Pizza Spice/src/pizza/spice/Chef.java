/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.spice;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sarosh Madara
 */
public class Chef extends Thread{

    private Pizza pizza;
    private ChefListener listener;

    public Chef(Pizza pizza, ChefListener listener) {
        this.pizza = pizza;
        this.listener = listener;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(pizza.getCookingTime() * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Chef.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listener.cookingPizza(pizza);
    }
}
