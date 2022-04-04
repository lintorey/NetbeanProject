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
public class TreeNodeMem {
    // package access members
     TreeNodeMem  left; //left node
     Membership data; // data item
     TreeNodeMem  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeMem( Membership m ){
         data = m;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert( Membership m ){ 
         if ( m.getAge() < data.getAge()){ 
             if ( left == null )
                 left = new TreeNodeMem ( m );
             else
                 left.insert( m );
         }
         else if ( m.getAge() >= data.getAge()){
             if ( right == null )
                 right = new TreeNodeMem ( m );
             else
                 right.insert( m );
         }
     }
}
