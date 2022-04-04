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
public class BSTBowling {
    private TreeNodeBow root;
    
     // Construct an empty Tree of integers
     public BSTBowling() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Bowling b ){

         if ( root == null )
             root = new TreeNodeBow( b );
         else
             root.insert( b );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeBow node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left );
                 print( node.right);
         }

         //to count students from part 4
         public void qualifiedFinal(){ 
             qFinal (root ); 
         }
         
         // Recursive method to perform counting with condition
         private int qFinal( TreeNodeBow node ){
             if ( node == null )
                 return 0;
             else if (node.data.getStatus().equalsIgnoreCase("Qualified"))
                 return 1 + qFinal( node.left )+ qFinal( node.right );
             else
                 return qFinal (node.left) + qFinal(node.right);
         }
         
         //to count student who got dean list
         public void sortPlayer(){ 
            sPlay( root ); 
         }
         
         // Recursive method to perform counting with condition
         private void sPlay( TreeNodeBow node ){
             if ( node == null )
                 return;
             Bowling b = (Bowling) node.data;
             sPlay(node.left);
             System.out.println(b.toString());
             sPlay(node.right);
         }

         
         // Postorder Traversal
         public void postorderTraversal(){ 
             postorderHelper( root ); 
         }
         // Recursive method to perform postorder traversal
         private void postorderHelper( TreeNodeBow node ){
             if ( node == null )
                 return;
                 postorderHelper( node.left );
                 postorderHelper( node.right );
                 System.out.println( node.data.toString());
         }

}
