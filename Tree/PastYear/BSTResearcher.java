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
public class BSTResearcher {
    private TreeNodeRes root;
    
     // Construct an empty Tree of integers
     public BSTResearcher() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Researcher r ){

         if ( root == null )
             root = new TreeNodeRes( r );
         else
             root.insert( r );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeRes node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count institution
         public int countInstitution(String ins){ 
             return countIns( root, ins ); 
         }
         
         // Recursive method to perform counting with condition
         private int countIns( TreeNodeRes node, String ins){
             if ( node == null )
                 return 0;
             else if (node.data.getIstitution().equalsIgnoreCase(ins))
                 return 1 + countIns( node.left,ins )+ countIns( node.right,ins );
             else
                 return countIns (node.left,ins) + countIns(node.right,ins);
         }
         
         //to display details
         public void displayDetails(){ 
            disDet( root ); 
         }
         
         // Recursive method to perform counting with condition
         private void disDet( TreeNodeRes node ){
             if ( node == null )
                 return;
             else if (node.data.getStatus().equalsIgnoreCase("Passed"))
                 disDet (node.left);
                 System.out.println(node.data.toString());
                 disDet (node.right);
         }
}
