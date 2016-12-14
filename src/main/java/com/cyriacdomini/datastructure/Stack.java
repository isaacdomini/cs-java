package com.cyriacdomini.datastructure;
/**
 * Stack interface for First In Last Out data structures
 */
public interface Stack<T> extends Iterable<T>{

  /**
   * Push data at the top of the stack
   * @param  data          data to put at the top of the stack
   * @return   true if successfully added
   */
  public boolean push(T data);

  /**
   * Removes data from the top of the stack
   * @return data that is removed from the top of the stack
   */
  public T pop();

  /**
   * Returns the size of the stack
   * @return Size of the stack
   */
  public int size();

  /**
   * Get value of node at a given index
   * @param  index         index of item to be looked for
   * @return     value of item at index index
   */
  public T get(int index);


}
