package question2;

import java.util.EmptyStackException;

/**
 * A class of stacks whose entries are stored in a singly linked list
 *
 * @author Jing Hua Ye
 * @date Oct 26 2021
 * @version 1.0
 */
 public class LinkedStack<T> implements StackInterface<T>
 {
/* =============================================================================
                        HELPER CLASSES
   =============================================================================
 */
    /**
     * A class represents a node, which contains two parts - data and pointer 
     * to the next node
     */
     private class Node
     {    //the data of a node
          private T data;
          //pointer to the next node
          private Node next;

          /**
           * To create a new node instance with a specific data and pointer of 
           * the next node
           * @param data the data of a specific node
           * @param next the pointer of a specific next node
           */
           public Node(T data, Node next)
           {  this.data = data;
              this.next = next;
           }

          /**
           * To get the data of this node 
           * @return the data of this Node
           */
           public T getData()
           {   return data;  
           }

          /**
           * To get the pointer of the next node 
           * @return the pointer of the next Node
           */
           public Node getNextNode()
           {  return next;
           }

          /**
           * To set the data of this node 
           * @param data the data of this node 
           */
           public void setData(T data)
           {  this.data = data;
           }   
          
          /**
           * To set the pointer of next node 
           * @param nextNode the pointer of the next node 
           */
           public void setNextNode(Node nextNode)
           {  next = nextNode;
           }
     }

/*==============================================================================
                        INSTANCE VARIABLES
  ==============================================================================
*/
    //Reference the first node in the chain
    private Node top;

    //the size of the stack
    private int numNodes;

/*==============================================================================
                      CONSTRUCTORS
  ==============================================================================
*/
   /**
    * To create a default stack implemented with a singly linked List
    */
    public LinkedStack()
    {  //to-complete
    	this.top = top;
    	this.numNodes = numNodes;
    }
/* =============================================================================
                     INSTANCE METHODS
   =============================================================================
 */
 /* ------------------- Getters -----------------------------------------------*/
  /**
   * Count the number of entries in this stack
   * @return the number of entries in this stack
   */
   public int size()
   {  //to-complete
	   Node tempNode = top;
	   int count = 0;
	   while (tempNode != null) {
		   tempNode = tempNode.next;
		   count++;
	   }
	   return count;
   } 
   
/* ------------------- Other methods -----------------------------------------*/
  
   /**
   * Detects whether this stack is empty by checking whether the first node is 
   * a null pointer or not
   * @return true if the stack is empty
   */
   public boolean isEmpty()
   { //to-complete
	   Node currentNode = top;
  	 if (currentNode.next == null){
  		 return true;
  	 }
  	 else return false;
   }

  /**
   * Retrieves this stack's top entry
   * @return the object at the top of the stack 
   * @throws EmptyStackException if the stack is empty before the operation
   */
   public T peek()
   { if (isEmpty()) 
         throw new EmptyStackException();
     else 
         //to-complete
    	 Node topNode = top;
   		 return top;
   } 
  
  /**
   * Removes and returns this stack's top entry
   * @return the object at the top of the stack
   */
   public T pop()
   {  //to-complete
	  Node res = top;
	  res
   }
  
  /**
    * Adds an entry to the top of this stack
    * @param newEntry an object to be added to the stack
    */
    public void push(T newEntry)
    {  //to-complete
    } 
  
  /**
   * Removes all entries from this stack
   */
   public void clear()
   {    //to-complete
   }

  /**
   * List out all entries in this stack
   */
   public void display()
   {  //to-complete
   }
@Override
public boolean isFull() {
	// TODO Auto-generated method stub
	return false;
} 
 }
