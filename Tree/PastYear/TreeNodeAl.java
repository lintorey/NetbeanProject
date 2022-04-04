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
public class TreeNodeAl {
    // package access members
     TreeNodeAl left; //left node
     Alumni data; // data item
     TreeNodeAl right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeAl( Alumni a ){
         data = a;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on student id.
     // Ignore duplicate values.
     public void insert( Alumni a ){ 
         if ( a.getAmtDonation()< data.getAmtDonation()){ 
             if ( left == null )
                 left = new TreeNodeAl( a );
             else
                 left.insert( a );
         }
         else if ( a.getAmtDonation() >= data.getAmtDonation()){
             if ( right == null )
                 right = new TreeNodeAl( a );
             else
                 right.insert( a );
         }
     }
}
