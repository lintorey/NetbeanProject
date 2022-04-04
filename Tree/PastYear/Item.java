/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

/**
 *
 * @author lintorey
 */
public class Item {
    public int serialNumber;
    public String itemName;
    public String distributorName;
    public double priceUnit;
    public int quantity;
     
     public Item(){
         serialNumber = -1;
         itemName = "";
         distributorName = "";
         priceUnit = 0.0;
         quantity = 0;
     }

     public Item(int serialNumber, String itemName, String distributorName, double priceUnit, int quantity){
         this.serialNumber = serialNumber;
         this.itemName = itemName;
         this.distributorName = distributorName;
         this.priceUnit = priceUnit;
         this.quantity = quantity;
     }

     public void setItem(int no, String it, String di, double rm, int qu){
         serialNumber = no;
         itemName = it;
         distributorName = di;
         priceUnit = rm;
         quantity = qu;
     }

     public int getSerialNumber(){ 
         return serialNumber; 
     }

     public String getItemName(){ 
         return itemName; 
     }
     
     public String getDistributorName(){ 
         return distributorName; 
     }
     
     public double getPriceUnit(){ 
         return priceUnit; 
     }
     
     public int getQuantity(){ 
         return quantity; 
     }

     public double calcTotalPrice(String dN){
         double totalprice = 0.0;
         
         totalprice = priceUnit * quantity;
         
         return totalprice;
     }

     public String toString(){ 
         return("\nSerial Number : " + serialNumber + "\nItem Name : " + itemName + "\nDistributor Name : " + distributorName + "\nPrice Unit : RM  " + priceUnit + "\nQuantity : " + quantity);
     }
}
