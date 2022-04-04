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
public class BSTOrder {
    private TreeNodeOrd root;
    
     // Construct an empty Tree of integers
     public BSTOrder() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Order o ){

         if ( root == null )
             root = new TreeNodeOrd( o );
         else
             root.insert( o );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeOrd node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count total order
         public int totalOrder(String productCode){ 
             return tOrder( root, productCode ); 
         }
         
         // Recursive method to perform counting with condition
         private int tOrder( TreeNodeOrd node, String productCode){
             if ( node == null )
                 return 0;
             else if (node.data.getproductCode().equalsIgnoreCase(productCode))
                 return 1 + tOrder( node.left,productCode )+ tOrder( node.right,productCode );
             else
                 return tOrder (node.left,productCode) + tOrder(node.right,productCode);
         }
         
         //to total amount
         public void totalIncome(){ 
            totalRM ( root ); 
         }
         
         // Recursive method to perform counting with condition
         private double totalRM ( TreeNodeOrd node ){
             if ( node == null )
                 return 0;
             else if (node.data.getqtyOrder() > 50)
                 return (node.data.getqtyOrder() * node.data.getPriceUnit() * 100) + totalRM (node.left) + totalRM (node.right);
             else
                 return totalRM (node.left) + totalRM (node.right);
         }
}
