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
public class BSTMovie {
    private TreeNodeMov root;
    
     // Construct an empty Tree of integers
     public BSTMovie() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Movie m ){

         if ( root == null )
             root = new TreeNodeMov( m );
         else
             root.insert( m );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeMov node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count director
         public int countByDirector(String director){ 
             return countIns( root, director ); 
         }
         
         // Recursive method to perform counting with condition
         private int countIns( TreeNodeMov node, String director){
             if ( node == null )
                 return 0;
             else if (node.data.getDirector().equalsIgnoreCase(director))
                 return 1 + countIns( node.left,director )+ countIns( node.right,director );
             else
                 return countIns (node.left,director) + countIns(node.right,director);
         }
         
         //to sort asc
         public void sortByCollection(){ 
            sortasc( root ); 
         }
         
         // Recursive method to perform counting with condition
         private void sortasc( TreeNodeMov node ){
             if ( node == null )
                 return;
             else if (node.data.getTotalCollection() > 0)
                 sortasc (node.left);
                 System.out.println(node.data.toString());
                 sortasc (node.right);
         }
         
         //to count & display
         public void calculateCollection(String genre){ 
            System.out.println (calcRM ( root, genre )); 
         }
         
         // Recursive method to perform calcalution with condition
         private double calcRM( TreeNodeMov node, String genre){ 
             if ( node == null )
                 return 0;
             Movie m = node.data;
             if (node.data.getGenre().equalsIgnoreCase(genre))
                 return m.getTotalCollection() + calcRM( node.left,genre ) + calcRM( node.right,genre );
             else
                 return calcRM (node.left,genre) + calcRM(node.right,genre);
         }
}
