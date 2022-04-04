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
public class BSTMembership {
    private TreeNodeMem root;
    
     // Construct an empty Tree of integers
     public BSTMembership() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Membership m ){

         if ( root == null )
             root = new TreeNodeMem( m );
         else
             root.insert( m );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeMem node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }
         
         //to display details
         public void displayDetail(String drivingL){ 
            disDetail( root, drivingL ); 
         }
         
         // Recursive method to perform counting with condition
         private void disDetail( TreeNodeMem node, String drivingL ){
             if ( node == null )
                 return;
             if (node.data.getMembershipType().equalsIgnoreCase(drivingL));
                 disDetail (node.left,drivingL);
                 System.out.println(node.data.toString());
                 disDetail (node.right,drivingL);
         }
         
         //to count fit member
         public void countFitMembers(double lower, double upper){ 
             countFit( root, lower, upper ); 
         }
         
         // Recursive method to perform calcalution with condition
         private int countFit( TreeNodeMem node, double lower, double upper){ 
             if ( node == null )
                 return 0;
             if (node.data.caculateBMI() >= lower && node.data.caculateBMI() < upper)
                 return 1+countFit( node.left,lower, upper ) + countFit( node.right,lower,upper );
             else
                 return countFit (node.left,lower,upper) + countFit(node.right,lower,upper);
         }
}
