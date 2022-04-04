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
public class TreeNodeKind {
    // package access members
     TreeNodeKind  left; //left node
     Kindergarten data; // data item
     TreeNodeKind  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeKind( Kindergarten k ){
         data = k;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert( Kindergarten k ){ 
         if ( k.getGender() < data.getGender()){ 
             if ( left == null )
                 left = new TreeNodeKind ( k );
             else
                 left.insert( k );
         }
         else if ( k.getGender() >= data.getGender()){
             if ( right == null )
                 right = new TreeNodeKind ( k );
             else
                 right.insert( k );
         }
     }
}
