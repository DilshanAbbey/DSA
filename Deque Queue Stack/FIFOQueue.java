/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dequequeuestack;

/**
 *
 * @author ACER
 */

import java.util.Deque;
import java.util.LinkedList;

public class FIFOQueue<T> {
    
    /* 
     * Creation of FIFO queue using deque
    */
    
    private Deque<T> deque;
    
    //constructor
    public FIFOQueue()
    {
        deque = new LinkedList<>(); //Using LinkedLIst as the underlying implementation
    }
    
    //Add an element to the queue(enqueue)
    public void enqueue(T element)
    {
        deque.addLast(element); //Add to the end of the deque
    }
    
    //REmove and return the front element from the queue (dequeue)
    public T dequeue()
    {
        if(deque.isEmpty())
        {
            throw new IllegalStateException("Queue is empty");
        }
        
        return deque.removeFirst(); //Remove from the front of the deque
    }
    
    //Peek at the front element without removing it
    public T peek()
    {
        if(deque.isEmpty())
        {
            throw new IllegalStateException("Queue is empty");
        }
        
        return deque.getFirst(); // GEt the front element
    }
    
    //Check if the queue is empty
    public boolean isEmpty()
    {
        return deque.isEmpty();
    }
    
    //Override toString() to display the elements in the queue
    @Override
    public String toString()
    {
        return deque.toString();
    }
}
