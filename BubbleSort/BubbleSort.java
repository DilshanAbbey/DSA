/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author ACER
 */

import java.util.Arrays;

public class BubbleSort {
    
    public void swap(Integer[] arr, int i, int j) {
	
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
		
    }

    public void bubbleSort(Integer[] array) {
	
        int n = array.length;
		
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
    
}

