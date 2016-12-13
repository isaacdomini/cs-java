package com.cyriacdomini.datastructure;

public class Queue<T>{

  private QueueNode<T> head;
  private int size;

  public Queue(){
    this.head = null;
    this.size = 0;
  }

  /**
   * Adds data to end of Queue
   * @param  T data          value to enqueue to the end of the Queue
   * @return   true is successfully enqueued
   */
  public boolean enqueue(T data){
    if(head == null){
      head = new QueueNode<T>(data);
    }else{
      getLastNode().setNext(new QueueNode<T>(data));
    }
    size++;
    return true;
  }

  /**
   * Removes item from the head of the queue and returns it
   * @return value of data at the head of the queue
   */
  public T dequeue(){
    QueueNode<T> temp = head;
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

  private QueueNode<T> getLastNode(){
    QueueNode<T> temp = head;
    QueueNode<T> prev = temp;
    while(temp!=null){
      prev = temp;
      temp = temp.getNext();
    }
    return prev;
  }

  private class QueueNode<T>{
    T data;
    QueueNode<T> next;
    QueueNode(T data){
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
    QueueNode<T> getNext(){
      return this.next;
    }
    boolean setNext(QueueNode<T> nextNode){
      this.next = nextNode;
      return true;
    }
  }
}
