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
public class TreeNodeOrd {
    // package access members
     TreeNodeOrd  left; //left node
     Order data; // data item
     TreeNodeOrd  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeOrd( Order o ){
         data = o;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert( Order o ){ 
         if ( o.getqtyOrder()< data.getqtyOrder()){ 
             if ( left == null )
                 left = new TreeNodeOrd ( o );
             else
                 left.insert( o );
         }
         else if ( o.getqtyOrder()>= data.getqtyOrder()){
             if ( right == null )
                 right = new TreeNodeOrd ( o );
             else
                 right.insert( o );
         }
     }
}
