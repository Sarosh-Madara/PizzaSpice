/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.spice;

/**
 *
 * @author Sarosh Madara
 */
public class Pizza {
    private int price;
    private int cookingTime;
    private String name;

    public Pizza( String name,int price, int cookingTime) {
        this.price = price;
        this.cookingTime = cookingTime;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
