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
public class BSTWar {
    private TreeNode  root;
    
     // Construct an empty Tree of integers
     public BSTWar() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( War w ){

         if ( root == null )
             root = new TreeNode ( w );
         else
             root.insert( w );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNode  node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count war & display
         // countWarByKhalidAlWalid() and its recursive method to calculate and display the number of wars commanded by Khalid AlWalid.

         public void countWarByKhalidAlWalid(){ 
             countwar( root ); 
         }
         
         // Recursive method to perform counting with condition
         private int countwar( TreeNode  node ){
             if ( node == null )
                 return 0;
             else if (node.data.getCommander().equalsIgnoreCase("Khalid AlWalid"))
                 return 1 + countwar( node.left )+ countwar( node.right );
             else
                 return countwar (node.left) + countwar(node.right);
         }
         
         //to display war
         //displayWar() and its recursive method to display the names of all Wars that happened before the death of the Prophet Muhammad SAW in the year 632

         public void displayWar(){ 
            dwar (root); 
         }
         
         // Recursive method to perform counting with condition
         private void dwar( TreeNode node ){
             if ( node == null )
                 return ;
             
             War wa = (War)node.data;
             if (node.data.getYear() < 632){
                 dwar(node.left);
                 System.out.println("Name of all Wars : " + wa.getWarName());
                 dwar(node.right);
             }

         }
         
         //to display asc year
         //displayAsc() and its recursive method to display the war in order according to year.
         public void displayAsc(){ 
            dasc (root); 
         }
         
         // Recursive method to perform counting with condition
         private void dasc( TreeNode node ){
             if ( node == null )
                 return ;
             
             War wa = (War)node.data;
             if (node.data.getYear() > 600){
                 dasc(node.left);
                 System.out.println("War Name : " + wa.getWarName());
                 dasc(node.right);
             }

         }
         
         //to count & return total soldier
         //countTotalSoldiers()and its recursive method to count and return the total number of soldiers involved in all wars.

         public int countTotalSoldiers(){ 
             return counttotal( root ); 
         }
         
         // Recursive method to perform counting with condition
         private int counttotal( TreeNode  node ){
             if ( node == null )
                 return 0;
             else if (node.data.numberOfSoldiers > 100)
                 return 1 + counttotal( node.left )+ counttotal( node.right );
             else
                 return counttotal (node.left) + counttotal(node.right);
         }
}
