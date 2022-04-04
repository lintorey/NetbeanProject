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
public class TreeNodeBow {
    // package access members
     TreeNodeBow left; //left node
     Bowling data; // data item
     TreeNodeBow right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeBow( Bowling b ){
         data = b;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on student id.
     // Ignore duplicate values.
     public void insert( Bowling b ){ 
         if ( b.getPlayerID()< data.getPlayerID()){ 
             if ( left == null )
                 left = new TreeNodeBow( b );
             else
                 left.insert( b );
         }
         else if ( b.getPlayerID()>= data.getPlayerID()){
             if ( right == null )
                 right = new TreeNodeBow( b );
             else
                 right.insert( b );
         }
     }
}
