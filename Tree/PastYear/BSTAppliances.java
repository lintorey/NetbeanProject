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
public class BSTAppliances {
    private TreeNodeApp  root;
    
     // Construct an empty Tree of integers
     public BSTAppliances() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Appliances a ){

         if ( root == null )
             root = new TreeNodeApp  ( a );
         else
             root.insert( a );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNodeApp  node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left);
                 print( node.right);
         }

         //to count hipower
         public int countHiPowerApp(){ 
             return countHiPowerApp( root ); 
         }
         
         // Recursive method to perform counting with condition
         private int countHiPowerApp( TreeNodeApp  node ){
             if ( node == null )
                 return 0;
             else if (node.data.getWatt()> 1000)
                 return 1 + countHiPowerApp( node.left )+ countHiPowerApp( node.right );
             else
                 return countHiPowerApp (node.left) + countHiPowerApp(node.right);
         }
         
         //to show watt
         public void showWatt(String name){ 
            sWatt (root,name); 
         }
         
         // Recursive method to perform counting with condition
         private void sWatt( TreeNodeApp node, String name ){
             if ( node == null )
                 return ;
             
             Appliances app = (Appliances)node.data;
             if (node.data.getName().equalsIgnoreCase(name)){
                 System.out.println("Power Consumption : " + app.getWatt());
                 sWatt(node.left,name);
                 sWatt(node.left,name);
             }

         }
}
