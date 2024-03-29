package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    private int cheese;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price += toppings;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: " +this.cheese+ "\n";
            }
            if (isExtraToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: " +"20"+ "\n";
            }
            this.bill += "Total Price: " + this.price +"\n";
            isBillCreated = true;

        }
        return this.bill;
    }
}
