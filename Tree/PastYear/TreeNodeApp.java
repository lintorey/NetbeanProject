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
public class TreeNodeApp {
    // package access members
     TreeNodeApp  left; //left node
     Appliances data; // data item
     TreeNodeApp  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeApp( Appliances a ){
         data = a;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert( Appliances a ){ 
         if ( a.getWatt() < data.getWatt()){ 
             if ( left == null )
                 left = new TreeNodeApp ( a );
             else
                 left.insert( a );
         }
         else if ( a.getWatt() >= data.getWatt()){
             if ( right == null )
                 right = new TreeNodeApp ( a );
             else
                 right.insert( a );
         }
     }
}
