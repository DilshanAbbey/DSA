/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optimizedarrayswapperactivity1;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class OptimizedArraySwapperActivity1 {

    /**
     * @param args the command line arguments
     */
    
    static Integer[] array = {17, 23, 2 ,16, 9}; //instancee varibles for all the class and can be call even outer the calss as well
    static int outerIndex; //instance variable
    static int temp;
    
    public static int shift(int startIndex)
    {
        temp = array[startIndex];
        int i = startIndex;
        
        for(; i > 0 && array[i - 1] > temp; i--)
        {
            array[i] = array[i - 1];
            System.out.println("i= "+
                                outerIndex+
                                "; j="+
                                (outerIndex = i + 1)+
                                "; "+
                                Arrays.deepToString(array));
            
        }
        
        return i;
        
    }
    
    public static void insert(int endIndex)
    {
        int position = shift(endIndex);
        
        array[position] = temp;
        System.out.println("After i= "+
                            outerIndex+
                            ":"+
                            Arrays.deepToString(array));
        
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
