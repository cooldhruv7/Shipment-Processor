package shipmentprocessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Programmer: Dhruv Patel
 * Program: Shipment.java
 * Date: 27 May 2020
 * @version 1.0 * 
 */
public class Shipment {
    
    /** ID number of the shipment **/
    private int shipmentID;
    
    /** The weight of the shipment **/
    private double weight;
    
    /** The shipping method being used **/
    private String method;
    
    /** The cost of the shipping **/
    private double cost;
    
    
    /**
     * Constructor to set the Shipment ID
     * @param shipmentID The id number of the shipment
     */
    public void Shipment(int shipmentID){
        
        this.shipmentID = shipmentID; // Use this shipment number
           
    }
    
    
    /**
     * Use the set the weight of the shipment
     * @param weight The weight of the shipment
     * @throws Exception If weight is not between 0 and 100, throw exception
     */
    public void setWeight(double weight) throws Exception{
        
        if(weight<0 && weight>100.0){
        
            throw new Exception("Weight is not between 0 and 100"); // If weight is not between 0 and 100, throw exception
        }
    
        this.weight = weight; // Use this weight
    }
    
    
    /**
     * Use to set the method being used for shipment
     * @param method The method of the shipment
     * @throws Exception If invalid method being requested, throw exception
     */
    public void setMethod(String method) throws Exception{
        
        if("Air".equals(method) || "Truck".equals(method) || "Mail".equals(method)){
        
            this.method = method; // Use this method of shipment
        }
        
        else{
            
        throw new Exception("Invalid Method Requested"); // If method being requested is not Air, Truck or Mail, throw exception
        }

    }
    
    /**
     * 
     * @return shipment cost
     */
    public double getCost(){
    
        calculateCost(); // Use to calculate cost based on the inputs
        
        return cost;
    
    }
    
    
    /**
     * Use to calculate cost based on the inputs of weight and method
     */
    private void calculateCost(){
        
        if(weight>=1.0 && weight<=10.0){
        
            if("Air".equals(method)){   
                cost = weight*4.00; 
            }
            
            else if("Truck".equals(method)){
                cost = weight*3.00;            
            }
            
            else if("Mail".equals(method)){
                cost = weight*2.00;            
            }
            
        }
        
        
        else if(weight>10.0 && weight<=20.0){
        
            if("Air".equals(method)){   
                cost = weight*3.00; 
            }
            
            else if("Truck".equals(method)){
                cost = weight*2.45;            
            }
            
            else if("Mail".equals(method)){
                cost = weight*1.75;            
            }
        
        }
        
        else if(weight>20.0){
            
            if("Air".equals(method)){   
                cost = weight*2.50; 
            }
            
            else if("Truck".equals(method)){
                cost = weight*1.95;            
            }
            
            else if("Mail".equals(method)){
                cost = weight*1.55;            
            }      
            
        
        }
    
    }
    
    
    
    
    
    
    
    
}
