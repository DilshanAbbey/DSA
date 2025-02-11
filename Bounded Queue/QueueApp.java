/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundedqueue;

/**
 *
 * @author ACER
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueX theQueue = new QueueX(5); // Create a queue with max size 5

        // Enqueue elements
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);
        theQueue.enqueue(50);

        // Display the queue
        theQueue.display();

        // Peek the front element
        System.out.println("Front element is: " + theQueue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + theQueue.dequeue());

        // Display the queue after dequeue operations
        theQueue.display();
    }
    
}
