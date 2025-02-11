/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbitfibonacci;

/**
 *
 * @author ACER
 */
public class RabbitFibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static int rabbitPairs (int months)
    {
        if(months == 0 || months == 1) //Base case - No of rabbits in month 0 or 1
        {
            return 1;
        }
        
        return rabbitPairs(months - 1) + rabbitPairs(months - 2);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int months = 14;
        
        System.out.println("Number of rabbit pairs after " + months + " months is "+ rabbitPairs(months));
        
    }
    
}
