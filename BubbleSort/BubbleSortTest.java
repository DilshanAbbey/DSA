
import java.util.Arrays;

public class BubbleSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] array = new Integer[] {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(array);

        System.out.println("Sorted Numbers: ");

        System.out.println(Arrays.deepToString(array));
        System.out.println();
        
    }
    
}
