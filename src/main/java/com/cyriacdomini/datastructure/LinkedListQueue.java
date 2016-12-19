package com.cyriacdomini.datastructure;
import java.util.Iterator;

/**
 * LinkedList implementation of the Queue interface.
 * @param <T> generic type T
 */
public class LinkedListQueue<T> implements Queue<T> {
  /**
   * head of this.
   */
  private LinkedListQueueNode<T> head;
  /**
   * Variable storing the size of this.
   */
  private int size;
  /**
   * LinkedListQueue constructor with no input args.
   */
  public LinkedListQueue() {
    this.head = null;
    this.size = 0;
  }
  /**
   * Get the value of item in the given index.
   * @param  index         index of item to be fetched
   * @return     Item at index index
   */
  public final T get(final int index) {
    LinkedListQueueNode<T> temp = head;
    for (int i = 0; i < index; i++) {
      //TODO create custom exception
      temp = temp.getNext();
    }
    return temp.getValue();
  }
  /**
   * Adds data to end of Queue.
   * @param  data          value to enqueue to the end of the Queue
   * @return   true is successfully enqueued
   */
  public final boolean enqueue(final T data) {
    if (head == null) {
      head = new LinkedListQueueNode<T>(data);
    } else {
      getLastNode().setNext(new LinkedListQueueNode<T>(data));
    }
    size++;
    return true;
  }
  /**
   * Removes element given number od positions from head.
   * @param  index           index position of element to be removed
   * @return       value of node removed
   */
  public final T removeNode(final int index) {
    LinkedListQueueNode<T> prev = null;
    LinkedListQueueNode<T> current = head;
    int i = 0;
    if (index > size) {
      return null;
    }
    while (current != null) {
      if (i == index) {
        if (prev == null) {
          head = head.getNext();
        } else {
          prev = prev.getNext();
        }
        size--;
        return current.getValue();
      }
      prev = current;
      current = current.getNext();
    }
    return null;
  }

  /**
   * Removes item from the head of the queue and returns it.
   * @return value of data at the head of the queue
   */
  public final T dequeue() {
    LinkedListQueueNode<T> temp = head;
    head = head.getNext();
    if (temp == null) {
      return null;
    } else {
      return temp.getValue();
    }
  }

  /**
   * Returns the size of the queue.
   * @return the length of the queue
   */
  public final int size() {
    return this.size;
  }
 /**
  * Gets last node in the queue.
  * @return Data of node at the end of this.
  */
  private LinkedListQueueNode<T> getLastNode() {
    LinkedListQueueNode<T> temp = head;
    LinkedListQueueNode<T> prev = temp;
    while (temp != null) {
      prev = temp;
      temp = temp.getNext();
    }
    return prev;
  }
  /**
   * returns iterator for this.
   * @return returns a new Iterator for this.
   */
  public final Iterator<T> iterator() {
      return new LinkedListQueueIterator<T>();
  }
  /**
   * LinkedListQueueIterator Iterator for LinkedListQueue.
   * @param <T> generic type T
   */
  class LinkedListQueueIterator<T> implements Iterator<T> {
      /**
       * index of current node.
       */
      private int index = 0;
      /**
       * Tells is there is a next node.
       * @return true if iterator has another node false otherwise.
       */
      public boolean hasNext() {
          return index < size();
      }
      /**
       * Gives next node in the iterator.
       * @return next node in the iterator.
       */
      public T next() {
          return (T) get(index++);
      }
      /**
       * Removes current node from LinkedListQueue.
       */
      public void remove() {
        removeNode(index);
      }
  }
  /**
   * LinkedListQueueNode nodes used in LinkedListQueue.
   * @param <T> generic type T
   */
  private class LinkedListQueueNode<T> {
    /**
     * data in node.
     */
    private T data;
    /**
     * reference to next node in the queue.
     */
    private LinkedListQueueNode<T> next;
    /**
     * LinkedListQueueNode constructor with data.
     * @param  value          data of current node.
     */
    protected LinkedListQueueNode(final T value) {
      this.data = value;
      next = null;
    }
    /**
     * Get value of this node.
     * @return data in this node.
     */
    protected T getValue() {
      return this.data;
    }
    /**
     * Set value of this node.
     * @param  value          data to be set in this node.
     * @return   boolean if successfully set.
     */
    protected boolean setValue(final T value) {
      this.data = value;
      return true;
    }
    /**
     * Get next node.
     * @return LinkedListQueueNode that this.vext points to.
     */
    protected LinkedListQueueNode<T> getNext() {
      return this.next;
    }
    /**
     * Set Next Node.
     * @param  node      node to be set as next of this
     * @return                        true if successfully set.
     */
    protected boolean setNext(final LinkedListQueueNode<T> node) {
      this.next = node;
      return true;
    }
  }
}
