/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraycbt;

/**
 *
 * @author ACER
 */

import java.util.Arrays;

public class ArrayCBT {
    
    private Integer[] tree;
    private int size;
    
    // Constructor to initialize the binary tree with a specific capacity
    
   public ArrayCBT(int capacity)
   {
       tree = new Integer[capacity];
       size = 0;
   }
   
   //Add a node to the binary tree
   public void insert(int value)
   {
       if(size == tree.lenght)
       {
           throw new IllegalStateException("Tree is full.");
       }
       tree[size] = value;
       size++;
   }
   
   //Get the value of the root node
   public int getRoot()
   {
       if(size == 0)
       {
           throw new IllegalStateException("Tree is empty.");
       }
       
       return tree[0];
   }
   
   //get the left child of a node at index i
   public int getLeftChild(int value)
   {
       int index = search(value);
       int leftIndex = 2 * index + 1;
       if(leftIndex >= size)
       {
           throw new IllegalStateException("No left child.");
       }
       
       return tree[leftIndex];
   }
   
   //get the right child of a node at index i
   public int getRightChild(int value)
   {
       int index = search(value);
       int rightIndex = 2 * index + 2;
       if(rightIndex >= size)
       {
           throw new IllegalStateException("No right child.");
       }
       
       return tree[rightIndex];
   }
    
   //get the parent of a node at index i
   
  public int getParent(int value)
  {
      int index = search(value);
      
      if(index == 0)
      {
          throw new IllegalStateException("Root node has no power");
      }
      
      int parentIndex = (index - 1) / 2;
      return tree[parentIndex];
  }
  
  //Display the binary tree as an array using deepToString
  @Override
  public String toString()
  {
      return Arrays.deepToString(tree);
  }
  
  //Delete a node from the binary tree
  public void delete(int value)
  {
      int index = search(value);
      
      if(index == -1)
      {
          throw new IllegalStateException("Value not found in the tree.");
      }
      
      // Replace the node to delete with the last node
      
      tree[index] = tree[size - 1];
      size--;
  }
  
  //Search for a specific node and return its index
  public int search(int value)
  {
      for(int i = 0; i < size; i++)
      {
          if(tree[i] == value)
          {
              return i;
          }
      }
      
      return -1; //Value not found
  }
  
  //Get the value of a specific node
  public int getNodeValue(int value)
  {
      int index = search(value);
      if(index == -1)
      {
          throw new IllegalStateException
      }
  }
}
