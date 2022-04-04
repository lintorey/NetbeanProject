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
public class BSTAlumni {
        
    private TreeNodeAl root;
    
     // Construct an empty Tree of integers
     public BSTAlumni() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Alumni a ){

         if ( root == null )
             root = new TreeNodeAl( a );
         else
             root.insert( a );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeAl node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left );
                 print( node.right);
         }

         //to display name n amount
         public void printInOrder(){ 
             pio( root ); 
         }
         
         // Recursive method to perform counting with condition
         private void pio( TreeNodeAl node ){
             if ( node == null )
                 return;
             pio( node.left );
             System.out.println( node.data.toString());
             pio( node.right );
         }
         
         // Inorder Traversal
         public void inorderTraversal(){ 
             inorderHelper( root ); 
         }
         
         // Recursive method to perform inorder traversal
         private void inorderHelper( TreeNodeAl node ){
             if ( node == null )
                 return;
                 inorderHelper( node.left );
                 System.out.println( node.data.toString());
                 inorderHelper( node.right );
         }
         
         //to count num alumni
         public int countNumber(String occupation){ 
            return cNo ( root, occupation ); 
         }
         
         // Recursive method to perform counting with condition
         private int cNo( TreeNodeAl node, String occupation ){
             if ( node == null )
                 return 0;
             if (node.data.getOccupation().equals(occupation))
                 return 1 + cNo( node.left,occupation )+ cNo( node.right,occupation );
             else
                 return cNo (node.left,occupation) + cNo(node.right,occupation);
         }

         //to count & display
         public void totalDonation(){ 
            tRM ( root ); 
         }
         
         // Recursive method to perform calcalution with condition
         private int tRM( TreeNodeAl node){ 
             if ( node == null )
                 return 0;
             if (node.data.getAmtDonation() > 0)
                 return 1 + tRM( node.left ) + tRM( node.right );
             else
                 return tRM (node.left) + tRM(node.right);
         }
}
