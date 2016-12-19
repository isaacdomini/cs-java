package com.cyriacdomini.datastructure;
/**
 * Queue Interface for First In First Out data structures.
 * @param <T> Genric type T.
 */
public interface Queue<T> extends Iterable<T> {
  /**
   * Adds data to end of Queue.
   * @param  data          value to enqueue to the end of the Queue.
   * @return   true is successfully enqueued.
   */
  boolean enqueue(T data);

  /**
   * Removes item from the head of the queue and returns it.
   * @return value of data at the head of the queue
   */
   T dequeue();

  /**
   * Returns the size of the queue.
   * @return the length of the queue.
   */
  int size();
}
