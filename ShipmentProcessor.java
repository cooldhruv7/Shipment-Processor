/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipmentprocessor;

/**
 * Programmer: Dhruv Patel
 * Program: ShipmentProcessor.java
 * Date: 27 May 2020
 * @version 1.0 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ShipmentProcessor {

    /**A method to test the object
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /** The first command line argument **/
        int customerID = Integer.parseInt(args[0]);
        
        /** The second command line argument **/
        int totalShipment = Integer.parseInt(args[1]);
        
        /** Array to store all shipment IDs **/
        int shipmentID[] = new int[totalShipment];
        
        /** Array to store all shipment methods being used for each shipment ID **/
        String shipmentMethod[] = new String[totalShipment];
        
        /** Array to store all shipment weights being used for each shipment ID **/
        double shipmentWeight[] = new double[totalShipment];
        
        /** Array to store all shipment costs for each shipment ID **/
        double shipmentCost[] = new double[totalShipment];
        
        Scanner input = new Scanner(System.in); // Scanner object to input shipment data
        
        Shipment shipmentOne = new Shipment(); // Shipment object
        Customer customerOne = new Customer(); // Customer object
        

        customerOne.setcustomerID(customerID); // Using Customer object to set the customerID      
        
        
        /** Try the following code and finally print a final statement when program ends **/
        try{
        
        for(int counter=0;counter<totalShipment;counter++){
            
        System.out.println("Please enter Shipment ID");
        
        shipmentID[counter] = input.nextInt(); // User inputfor shipment ID
        
        System.out.println("Please enter Shipment method");
        
        shipmentMethod[counter] = input.next(); // User input for shipment method
        
        System.out.println("Please enter Shipment weight"); 
        
        shipmentWeight[counter] = input.nextDouble(); // User input for shipment weight
               
        }
             
        
        for(int counter=0;counter<totalShipment;counter++){
            
        shipmentOne.setWeight(shipmentWeight[counter]); // Use Shipment object to set weight of the shipment
        shipmentOne.setMethod(shipmentMethod[counter]); // Use Shipment object to set method of the shipment
        
        shipmentCost[counter] = shipmentOne.getCost(); // Use Shipment object to get cost of shipment and store in the array
                
        }

               
        
        System.out.println("Customer " + customerID + " name is " + customerOne.getName()); //  Print out customerID based on command line arg and the corresponding Customer name
        
        System.out.println("Shipment ID");
        
        for(int element1 : shipmentID){
            
            System.out.print(element1 + " "); // Print out each element of the shipmentID array
               
        }
        
        System.out.println();
        
        System.out.println("Shipment Method"); 
        
               
        for(String element2 : shipmentMethod){
            
            System.out.print(element2 + " "); // Print out each element of the shipmentMethod array
               
        }
        
        System.out.println();
        
        System.out.print("Shipment Weight");

        System.out.println();
                

        for(double element3 : shipmentWeight){
            
            System.out.print(element3 + " "); // Print out each element of the shipmentWeight array
               
        }
        
        System.out.println();
        
        System.out.println("Shipment Cost");
        
        for(double element4 : shipmentCost){
            
        System.out.print("$" + element4 + " "); // Print out each element of the shipmentCost array
 
        }
        
        
        System.out.println();
        
        }
        
        finally{
        System.out.println("Program written by: Dhruv Patel - 991585284"); // The program ends with this final statement
        }
        
        
        
        
        }
        
        
        
        
        
        
    }
    

