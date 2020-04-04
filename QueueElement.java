/**
* File Name: QueueElement.java
* 
* <p> Purpose: A class that implements a queue
* 
* @date 2020-03-04 
* <p> Last modified: 2020-03-04
* @author Josen Pottackal
* - no copyright
* @version 1.0
*/

public class QueueElement<E> {
	private E e; 
	private QueueElement<E> next; 
	
	public QueueElement (E e, QueueElement<E> n) {
		this.e = e;
		this.next = n;
	}
	
	/**
	 * Method to set the element
	 */
	public void setElement (E e) {
		this.e = e;
	}
	
	/**
	 * Method to set the next linked list element
	 */
	public void setNext (QueueElement<E> e) {
		this.next = e;
	}
	
	/**
	 * Method to get the element.
	 */
	public E getElement () {
		return this.e;
	}
	
	/**
	 * Method to get the next linked list element
	 */
	public QueueElement<E> getNext () {
		return this.next;
	}    	
}
