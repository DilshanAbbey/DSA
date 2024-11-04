/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsortactivity1;

/**
 *
 * @author ACER
 */

import java.util.Arrays;

public class SelectionSortActivity1 {

    /**
     * @param args the command line arguments
     */
    
     Integer[] a;

    public SelectionSortActivity1(Integer[] a)
    {
        this.a = a;
    }
    
    public void SelectionSort(Integer[] a)
    {
        int n = a.length;
        
        for(int i = 0; i < n -1; i++)
        {
            int min_idx = i;
            for(int j = i + 1; j < n; j++)
            {
                if(a[j] < a[min_idx])
                {
                    min_idx = j;
                }
                
                System.out.println("i = "+
                                    (i)+
                                    "; j = "+
                                    (j)+
                                     "; min = "+
                                     a[min_idx]+
                                    "; "+
                                     Arrays.deepToString(a));
            }
            
            swap(i, min_idx);
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
        SelectionSortActivity1 sorter = new SelectionSortActivity1(a);
        
        System.out.println("Array before sorting: " + Arrays.deepToString(a));
        
        sorter.SelectionSort(a);
        
        System.out.println("Array after sorting: "+ Arrays.deepToString(a));
        
    }
    
}
