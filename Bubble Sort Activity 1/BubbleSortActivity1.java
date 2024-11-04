/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesortactivity1;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class BubbleSortActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] array = new Integer[] {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};

        BubbleSort sorter = new BubbleSort();
        
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.deepToString(array));
        
        sorter.bubbleSort(array);
        System.out.println();
        System.out.println("After Sorting: ");
        System.out.println(Arrays.deepToString(array));
        System.out.println();
        
    }
    
}
