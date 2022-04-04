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
public class TreeNodeIt {
    // package access members
     TreeNodeIt  left; //left node
     Item data; // data item
     TreeNodeIt  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeIt(  Item i ){
         data = i;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert(  Item i ){ 
         if ( i.getPriceUnit()< data.getPriceUnit()){ 
             if ( left == null )
                 left = new TreeNodeIt ( i );
             else
                 left.insert( i );
         }
         else if ( i.getPriceUnit()>= data.getPriceUnit()){
             if ( right == null )
                 right = new TreeNodeIt ( i );
             else
                 right.insert( i );
         }
     }
}
