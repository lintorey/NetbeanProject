/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author user
 */
public class TreeNode {
    // package access members
     TreeNode left; //left node
     Student data; // data item
     TreeNode right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNode( Student d ){
         data = d;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on student id.
     // Ignore duplicate values.
     public void insert( Student d ){ 
         if ( d.getId() < data.getId()){ 
             if ( left == null )
                 left = new TreeNode( d );
             else
                 left.insert( d );
         }
         else if ( d.getId() >= data.getId()){
             if ( right == null )
                 right = new TreeNode( d );
             else
                 right.insert( d );
         }
     }
}
