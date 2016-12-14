package com.cyriacdomini.datastructure;
import java.util.Iterator;
public class LinkedListQueue<T> implements Queue<T>{

  private LinkedListQueueNode<T> head;
  private int size;

  public LinkedListQueue(){
    this.head = null;
    this.size = 0;
  }
  /**
   * Get the value of item in the given index
   * @param  index         index of item to be fetched
   * @return     Item at index index
   */
  public T get(int index){
    LinkedListQueueNode<T> temp = head;
    for(int i=0;i<index;i++){
      //TODO: create custom exception
      temp =temp.getNext();
    }
    return temp.getValue();
  }
  /**
   * Adds data to end of Queue
   * @param  data          value to enqueue to the end of the Queue
   * @return   true is successfully enqueued
   */
  public boolean enqueue(T data){
    if(head == null){
      head = new LinkedListQueueNode<T>(data);
    }else{
      getLastNode().setNext(new LinkedListQueueNode<T>(data));
    }
    size++;
    return true;
  }

  /**
   * Removes item from the head of the queue and returns it
   * @return value of data at the head of the queue
   */
  public T dequeue(){
    LinkedListQueueNode<T> temp = head;
    head = head.getNext();
    return temp==null ? null : temp.getValue();
  }

  /**
   * Returns the size of the queue
   * @return the length of the queue
   */
  public int size(){
    return this.size;
  }

  private LinkedListQueueNode<T> getLastNode(){
    LinkedListQueueNode<T> temp = head;
    LinkedListQueueNode<T> prev = temp;
    while(temp!=null){
      prev = temp;
      temp = temp.getNext();
    }
    return prev;
  }
  public Iterator<T> iterator() {
      return new LinkedListQueueIterator<T>();
  }

  class LinkedListQueueIterator<T> implements Iterator<T> {

      private int index = 0;

      public boolean hasNext() {
          return index < size();
      }

      public T next() {
          return (T)get(index++);
      }

      public void remove() {
          throw new UnsupportedOperationException("not supported yet");

      }
 }
  private class LinkedListQueueNode<T>{
    T data;
    LinkedListQueueNode<T> next;
    LinkedListQueueNode(T data){
      this.data = data;
      next = null;
    }
    T getValue(){
      return this.data;
    }
    boolean setValue(T data){
      this.data = data;
      return true;
    }
    LinkedListQueueNode<T> getNext(){
      return this.next;
    }
    boolean setNext(LinkedListQueueNode<T> nextNode){
      this.next = nextNode;
      return true;
    }
  }
}
