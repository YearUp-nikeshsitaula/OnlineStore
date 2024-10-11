package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static String dataFileName = "Products.csv";

    public static void main(String[] args) throws IOException {

        while (true) {

            //PROMPT THAT ASKS YOU TO CHOOSE ONE OF THE OPTIONS
            System.out.println("Options to choose from: ");
            System.out.println("1. Display Products");
            System.out.println("2. Display Cart");
            System.out.println("X  To Exit");

            String options = Console.PromptForString();

            System.out.println("-------------------------------------------------------------------------------");

            //INPUT AN OPTION FROM THE PROMPT OR INVALID
            try {
                if (options.equalsIgnoreCase("products") || options.equals("1")) {
                    displayProducts();
                } else if (options.equalsIgnoreCase("cart") || options.equals("2")) {
                    displayCart();
                } else if (options.equalsIgnoreCase("x") || options.equalsIgnoreCase("exit")) {
                    return;
                } else {
                    System.out.println("Invalid Entry");
                }

            } catch (Exception e) {
                System.out.println("Invalid Entry");
            }
            System.out.println("-------------------------------------------------------------------------------");
        }

    }

    public static void displayProducts() {

        while (true) {

            //FOR DISPLAYING PRODUCT MENU
            System.out.println("Product options to choose from: ");
            System.out.println("1. Product Search");
            System.out.println("2. Product Add");
            System.out.println(("Press X to go back"));

            String product = Console.PromptForString();


            //INPUT AN OPTION SEARCH, ADD OR EXIT FROM THIS MENU TO GO BACK TO MAIN MENU
            try{
                if(product.equalsIgnoreCase("Search") || product.equals("1")){
                    System.out.println("Searched");
                    break;
                } else if (product.equalsIgnoreCase("Add") || product.equals("2")) {
                    System.out.println("Added");
                    break;
                } else if (product.equalsIgnoreCase("x") || product.equalsIgnoreCase("back")){
                    return;
                } else  {
                    System.out.println("Invalid Entry");

                }
            }catch (Exception e){
                System.out.println("Invalid Entry");
                e.printStackTrace();
            }
        }

    }

    public static void displayCart() {

        while (true) {

            //FOR DISPLAYING CART MENU
            System.out.println("Cart options to choose from: ");
            System.out.println("1. Check Out");
            System.out.println("2. Remove Product");
            System.out.println(("Press X to go back"));

            String cart = Console.PromptForString();


            //INPUT AN OPTION SEARCH, CHECK OUT OR REMOVE A PRODUCT FROM CART OR GO BACK TO MAIN MENU
            try{
                if(cart.equalsIgnoreCase("Check out") || cart.equals("1")){
                    System.out.println("Checked out");
                    break;
                } else if (cart.equalsIgnoreCase("Remove") || cart.equals("2")) {
                    System.out.println("Removed Product");
                    break;
                } else if (cart.equalsIgnoreCase("x") || cart.equalsIgnoreCase("back")){
                    return;
                } else  {
                    System.out.println("Invalid Entry");
                }
            }catch (Exception e){
                System.out.println("Invalid Entry");
                e.printStackTrace();
            }
        }
    }

    public static void displayProductSearch() {

    }

    public static void displayProductAdd() {

    }

    public static void displayCartCheckOut(){

    }

    public static void displayCartRemove(){

    }


}