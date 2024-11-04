/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsortactivitydescending1;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class SelectionSortActivityDescending1 {

    /**
     * @param args the command line arguments
     */
    
     Integer[] a;

    public SelectionSortActivityDescending1(Integer[] a)
    {
        this.a = a;
    }
    
    public void SelectionSort(Integer[] a)
    {
        int n = a.length;
        
        for(int i = 0; i < n -1; i++)
        {
            int max_idx = i;
            for(int j = i + 1; j < n; j++)
            {
                if(a[j] > a[max_idx]) // Here, it determines whether the selected value is greater than current maximum value. If it is so, then the maimum value changes to the selected value
                {
                    max_idx = j;
                }
                
                System.out.println("i = "+
                                    (i)+
                                    "; j = "+
                                    (j)+
                                     "; max = "+
                                     a[max_idx]+
                                    "; "+
                                     Arrays.deepToString(a));
            }
            
            swap(i, max_idx);
        }
    }
    
    public void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] a = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        
        SelectionSortActivityDescending1 sorter = new SelectionSortActivityDescending1(a);
        
        System.out.println("Array before sorting: " + Arrays.deepToString(a));
        
        sorter.SelectionSort(a);
        
        System.out.println("Array after sorting: "+ Arrays.deepToString(a));
        
    }
    
}
