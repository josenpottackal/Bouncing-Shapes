/**
* File Name: Queue.java
* 
* <p> Purpose: A class that implements a queue
* 
* @date 2020-03-04 
* <p> Last modified: 2020-03-04
* @author Josen Pottackal
* - no copyright
* @version 1.0
*/

import java.util.NoSuchElementException;
import java.util.*;

public class Queue<T> {
		
	private QueueElement<T> head;
	private QueueElement<T> tail;
	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		head = null;
		tail = null;
	}
	
	/**
	 * @return Returns true if the queue is empty
	 */
	public boolean isEmpty () {
	    return ((head == null)) || ((tail == null));
	}
	
	/**
	 * @return Returns the element at the head of the queue
	 */
	public T peek() throws NoSuchElementException {
		if (isEmpty()) {
		    throw new NoSuchElementException("Queue is empty");
		} else {
			return head.getElement();
		}
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
		if (isEmpty()) {
		    throw new NoSuchElementException("Queue is empty");
		} else {
			head = head.getNext();
		}
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (T element) {
		if (isEmpty()) {
			QueueElement<T> newNode = new QueueElement<T>(element, null);
			head = newNode;
			tail = newNode;
		} else {
			QueueElement<T> newNode = new QueueElement<T>(element, null);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
		if (!isEmpty()) {
			System.out.println(head.getElement().toString());
			QueueElement<T> queue = head.getNext();
			
			while (queue != null) {
				System.out.println(queue.getElement().toString());
				queue = queue.getNext();
			} 
		} else {
			System.out.println("Queue is empty");
		}
	}
}	
		
