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
public class TreeNodeMov {
    // package access members
     TreeNodeMov  left; //left node
     Movie data; // data item
     TreeNodeMov  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeMov(  Movie m){
         data = m;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert(  Movie m ){ 
         if ( m.getTotalCollection()< data.getTotalCollection()){ 
             if ( left == null )
                 left = new TreeNodeMov ( m );
             else
                 left.insert( m );
         }
         else if ( m.getTotalCollection()>= data.getTotalCollection()){
             if ( right == null )
                 right = new TreeNodeMov ( m );
             else
                 right.insert( m );
         }
     }
}
