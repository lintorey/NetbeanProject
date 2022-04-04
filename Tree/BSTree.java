/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author user
 */
public class BSTree {
    private TreeNode root;
    
     // Construct an empty Tree of integers
     public BSTree() { 
         root = null; 
     }
     
     // Insert a new node in the binary search tree.
     // If the root node is null, create the root node here.
     // Otherwise, call the insert method of class TreeNode.
     public void insertNode( Student d ){

         if ( root == null )
             root = new TreeNode( d );
         else
             root.insert( d );
         } 

         //to display all records
         public void display (){ 
             print (root);
         }

         private void print (TreeNode node){
             if (node == null)
                 return;
             else
                 System.out.println(node.data.toString());
                 print( node.left );
                 print( node.right);
         }

         //to count students from part 4
         public int countStudPart4(){ 
             return countSP4( root ); 
         }
         
         // Recursive method to perform counting with condition
         private int countSP4( TreeNode node ){
             if ( node == null )
                 return 0;
             else if (node.data.getPart()== 4)
                 return 1 + countSP4( node.left )+ countSP4( node.right );
             else
                 return countSP4 (node.left) + countSP4(node.right);
         }
         
         //to count student who got dean list
         public int countStudC3(){ 
            return countSCgpa3( root ); 
         }
         
         // Recursive method to perform counting with condition
         private int countSCgpa3( TreeNode node ){
             if ( node == null )
                 return 0;
             if (node.data.getCgpa() > 3.5)
                 return 1 + countSCgpa3( node.left )+ countSCgpa3( node.right );
             else
                 return countSCgpa3 (node.left) + countSCgpa3(node.right);
         }

        public void printcat(){
            System.out.println("\nNumber of students with cgpa >= 2 and < 3 :" +
            countcategory(root,2,3));
            System.out.println("\nNumber of students with cgpa >= 3 and < 4 :" +
            countcategory(root,3,4));
            System.out.println("\nNumber of students with cgpa >= 1 and < 2 :" +
            countcategory(root,1,2)); 
         } 

         // Recursive method to perform calcalution with condition
         private int countcategory( TreeNode node, int low, int high){ 
             if ( node == null )
                 return 0;
             if (node.data.getCgpa() >= low && node.data.getCgpa() < high)
                 return 1+countcategory( node.left,low, high ) +
                 countcategory( node.right,low,high );
             else
                 return countcategory (node.left,low,high) +
                 countcategory(node.right,low,high);
         }

         // Preorder Traversal
         public void preorderTraversal(){ 
             preorderHelper( root ); 
         }
         
         // Recursive method to perform preorder traversal
         private void preorderHelper( TreeNode node ){
             if ( node == null )
             return;
             System.out.println( node.data.toString());
             preorderHelper( node.left );
             preorderHelper( node.right );
         }
         
         // Inorder Traversal
         public void inorderTraversal(){ 
             inorderHelper( root ); 
         }
         
         // Recursive method to perform inorder traversal
         private void inorderHelper( TreeNode node ){
             if ( node == null )
                 return;
                 inorderHelper( node.left );
                 System.out.println( node.data.toString());
                 inorderHelper( node.right );
         }
         
         // Postorder Traversal
         public void postorderTraversal(){ 
             postorderHelper( root ); 
         }
         // Recursive method to perform postorder traversal
         private void postorderHelper( TreeNode node ){
             if ( node == null )
                 return;
                 postorderHelper( node.left );
                 postorderHelper( node.right );
                 System.out.println( node.data.toString());
         }

         // Descending order based on student id
         public void descending(){
             des(root);
         }
         private void des(TreeNode node){
             if ( node == null )
                 return;
             else
                 des(node.right);
                 System.out.println(node.data.toString());
                 des(node.left);
         } 
}
