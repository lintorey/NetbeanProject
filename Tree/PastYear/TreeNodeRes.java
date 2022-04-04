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
public class TreeNodeRes {
    // package access members
     TreeNodeRes  left; //left node
     Researcher data; // data item
     TreeNodeRes  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeRes(  Researcher r ){
         data = r;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert(  Researcher r ){ 
         if ( r.getId()< data.getId()){ 
             if ( left == null )
                 left = new TreeNodeRes ( r );
             else
                 left.insert( r );
         }
         else if ( r.getId()>= data.getId()){
             if ( right == null )
                 right = new TreeNodeRes ( r );
             else
                 right.insert( r );
         }
     }
}
