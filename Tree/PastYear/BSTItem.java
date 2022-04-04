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
public class BSTItem {
    private TreeNodeIt root;
    
     // Construct an empty Tree of integers
     public BSTItem() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Item i ){

         if ( root == null )
             root = new TreeNodeIt( i );
         else
             root.insert( i );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeIt node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to calcTotalPrice
         public double calcTotalPrice(String dN){ 
            return cTotal ( root, dN ); 
         }
         
         // Recursive method to perform counting with condition
         private double cTotal ( TreeNodeIt node, String dN ){
             if ( node == null )
                 return 0;
             else if (node.data.getDistributorName().equals(dN))
                 return (node.data.getQuantity()* node.data.getPriceUnit()) + cTotal (node.left,dN) + cTotal (node.right,dN);
             else
                 return cTotal (node.left,dN) + cTotal (node.right,dN);
         }
         
         //to search item
         public void searchItem(String iN){ 
            sI ( root, iN );
         }
         
         // Recursive method to perform counting with condition
         private void sI ( TreeNodeIt node, String iN ){
             if ( node == null )
                 return;
             else if (node.data.getItemName().equalsIgnoreCase(iN))
                 System.out.println (node.data.toString());
             
             sI (node.left,iN);
             sI (node.right,iN);
         }
         
         
}
