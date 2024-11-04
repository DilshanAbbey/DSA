/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayswapperactivity1;

/**
 *
 * @author ACER
 */

import java.util.Arrays;

public class ArraySwapperActivity1 {

    /**
     * @param args the command line arguments
     */
    
    static Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143}; //instancee varibles for all the class and can be call even outer the calss as well
    static int outerIndex; //instance variable
    
    public static void swap(int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void insert(int endIndex)
    {
        int i = endIndex;
        
        while(i > 0 && array[i] < array[i-1])
        {
            swap(i, i-1);
            System.out.println("i:"+
                                i+
                                ",j:"+
                                (i-1)+
                                ","+
                                "Array state: "+
                                Arrays.deepToString(array));
            
            i--;
        }
    }
    
    public static void insertionSort()
    {
        for(outerIndex = 1; outerIndex < array.length; outerIndex++)
        {
            insert(outerIndex);
        }
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        System.out.println("Array before sorting: " + Arrays.deepToString(array));
        
        insertionSort();
        
        System.out.println("Array after sorting: "+ Arrays.deepToString(array));
    }
    
}
