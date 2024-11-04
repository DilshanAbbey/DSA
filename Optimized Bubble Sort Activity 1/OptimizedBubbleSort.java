/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optimizedbubblesortactivity1;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class OptimizedBubbleSort {
    
    public void swap(Integer[] arr, int i, int j) {
	
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
		
    }

    public void bubbleSort(Integer[] array) 
    {
	
        int n = array.length;
		
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
                
                System.out.println("i = " + (i + 1) + "; j = " + (j + 1) + "; " + Arrays.deepToString(array));
            }
            
            System.out.println();
            System.out.println("Sorting: " + Arrays.deepToString(array));
            
        }
    }
    
}
