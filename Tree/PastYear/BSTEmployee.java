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
public class BSTEmployee {
    private TreeNodeEmp root;
    
     // Construct an empty Tree of integers
     public BSTEmployee() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Employee e ){

         if ( root == null )
             root = new TreeNodeEmp( e );
         else
             root.insert( e );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeEmp node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count maritial status
         public void countMStatus(String status){ 
             System.out.println ( countM( root, status )); 
         }
         
         // Recursive method to perform counting with condition
         private int countM( TreeNodeEmp node, String status){
             if ( node == null )
                 return 0;
             else if (node.data.getStatus().equalsIgnoreCase(status))
                 return 1 + countM( node.left,status )+ countM( node.right,status );
             else
                 return countM (node.left,status) + countM(node.right,status);
         }
         
         //to display children
         public void calcAveSalary(){ 
            System.out.println ( calcRM( root )); 
         }
         
         // Recursive method to perform counting with condition
         private int calcRM( TreeNodeEmp node ){
             if ( node == null )
                 return 0;
             else
                 return calcRM (node.left) + calcRM(node.right);
         }
 
}
