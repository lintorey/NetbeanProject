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
public class TreeNodeEmp {
    // package access members
     TreeNodeEmp  left; //left node
     Employee data; // data item
     TreeNodeEmp  right; // right node
     // Constructor: initialize data to d and make this a leaf node
     public TreeNodeEmp( Employee e ){
         data = e;
         left = right = null; // this node has no children
     }
     
     // Insert a TreeNode into a Tree that contains nodes based on power.
     // Ignore duplicate values.
     public void insert( Employee e ){ 
         if ( e.getSalary() < data.getSalary()){ 
             if ( left == null )
                 left = new TreeNodeEmp ( e );
             else
                 left.insert( e );
         }
         else if ( e.getSalary() >= data.getSalary()){
             if ( right == null )
                 right = new TreeNodeEmp ( e );
             else
                 right.insert( e );
         }
     }
}
