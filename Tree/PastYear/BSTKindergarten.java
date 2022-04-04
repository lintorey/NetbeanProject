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
public class BSTKindergarten {
    private TreeNodeKind root;
    
     // Construct an empty Tree of integers
     public BSTKindergarten() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Kindergarten k ){

         if ( root == null )
             root = new TreeNodeKind( k );
         else
             root.insert( k );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeKind node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count gender
         public void countGender(char gender){ 
             System.out.println( cGender( root, gender )); 
         }
         
         // Recursive method to perform counting with condition
         private int cGender( TreeNodeKind node, char gender){
             if ( node == null )
                 return 0;
             else if (node.data.getGender()== gender)
                    return 1 + cGender ( node.left,gender) + cGender ( node.right,gender);
            return 0;
         }
         
         //to display children
         public void displayChildren(String classname){ 
            disChildren( root, classname ); 
         }
         
         // Recursive method to perform counting with condition
         private void disChildren( TreeNodeKind node, String classname ){
             if ( node == null )
                 return;
             else if (node.data.getName().equalsIgnoreCase(classname))
                 disChildren (node.left,classname);
                 System.out.println(node.data.toString());
                 disChildren (node.right,classname);
         }
}
