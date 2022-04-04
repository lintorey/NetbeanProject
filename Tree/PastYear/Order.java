/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

/**
 *
 * @author user
 */
public class Order {
    String customerName;
    String productCode;
    int qtyOrder;
    double priceUnit;

     
     public Order(){
        customerName = " ";
        productCode = " ";
        qtyOrder = 0;
        priceUnit = 0.0;
     }

     public Order(String customerName, String productCode, int qtyOrder, double priceUnit){
        this.customerName = customerName;
        this.productCode = productCode;
        this.qtyOrder = qtyOrder;
        this.priceUnit = priceUnit;
     }

     public void setOrder(String nm, String code, int ord, double rm){
        customerName = nm;
        productCode = code;
        qtyOrder = ord;
        priceUnit = rm;
     }

     public String getcustomerName(){ 
         return customerName; 
     }

     public String getproductCode(){ 
         return productCode; 
     }
     
     public int getqtyOrder(){ 
         return qtyOrder; 
     }
     
     public double getPriceUnit(){ 
         return priceUnit; 
     }   

     public String toString(){ 
         return("\nCustomer Name : " + customerName + "\nProduct Code : " + productCode + "\nQuantity Order : " + qtyOrder + "\nPrice Unit : RM  " + priceUnit);
     }
}
