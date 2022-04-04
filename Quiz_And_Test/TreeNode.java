/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class TreeNode {
    // package access members
     TreeNode left; //left node
     War data; // data item
     TreeNode right; // right node
     
     public TreeNode( War w ){
         data = w;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on student id.
     // Ignore duplicate values.
     public void insert( War w ){ 
         if ( w.getNumberOfSoldiers()< data.getNumberOfSoldiers()){ 
             if ( left == null )
                 left = new TreeNode( w );
             else
                 left.insert(w );
         }
         else if ( w.getNumberOfSoldiers()>= data.getNumberOfSoldiers()){
             if ( right == null )
                 right = new TreeNode( w );
             else
                 right.insert( w );
         }
     }
}
