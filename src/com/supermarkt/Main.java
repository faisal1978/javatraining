package com.supermarkt;


public class Main {

    public static void main(String[] args) {
	// write your code
        Customer customer = new Customer ("Faisal");

            System.out.println(customer);

            //initialisatie
            ShoppingCart faisalsWinkelwagen = customer.winkelwagen;
            Basket faisalsMandje = customer.mandje;



    }
}
