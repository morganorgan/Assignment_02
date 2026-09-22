//Morgan Bragg
//9/21/26
//This work is my own.
//reads retail items from a file, updates and prints.

import java.io.*;
import java.util.Scanner;

public class Q3 {
    /**
     *
     */
    public static void main(String[] args) {
        // 1. Create an array of 10 RetailItems
        RetailItem[] items = new RetailItem[10];
        
        // Number of items read
        int count = 0;

        // 2. Populate the array by reading from the file retail.in
        
            Scanner fileScanner = new Scanner(new File("retail.in"));
            
            while (fileScanner.hasNext() && count < items.length) {
                // Read description 
                String desc = fileScanner.nextLine();
                
                // Read units 
                if (fileScanner.hasNextInt()) {
                    int units = fileScanner.nextInt();
                    
                    // Read price
                    if (fileScanner.hasNextDouble()) {
                        double price = fileScanner.nextDouble();
                        
                        // Consume the leftover newline after reading price
                        if (fileScanner.hasNextLine()) {
                            fileScanner.nextLine();
                        }
                        
                        // Create object and add to array
                        items[count] = new RetailItem(desc, units, price);
                        count++;
                    }
                }
            }
           
            
        catch (FileNotFoundException e) {
            System.err.println("File not found: retail.in");
            return; // if the file is missing
        }

        // 3. Loop and update prices
        for (int i = 0; i < count; i++) {
            // Get the current item
            RetailItem currentItem = items[i];
            
            // If an item's units on hand is less than 5
            if (currentItem.getUnitsOnHand() < 5) {
                // Increase the retail price by 10%
                double currentPrice = currentItem.getRetailPrice();
                double newPrice = currentPrice * 1.10;
                
                // Use the setter method
                currentItem.setRetailPrice(newPrice);
            }
        }

        // 4. Output each retail item
        for (int i = 0; i < count; i++) {
            // calls items
            System.out.println(items[i]);
        }
    }
}
