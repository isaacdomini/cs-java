package com.cyriacdomini.datastructure;

public interface Queue<T>{
  /**
   * Adds data to end of Queue
   * @param  data          value to enqueue to the end of the Queue
   * @return   true is successfully enqueued
   */
  public boolean enqueue(T data);

  /**
   * Removes item from the head of the queue and returns it
   * @return value of data at the head of the queue
   */
  public T dequeue();

  /**
   * Returns the size of the queue
   * @return the length of the queue
   */
  public int size();
}
