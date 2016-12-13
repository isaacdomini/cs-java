package com.cyriacdomini.datastructure;

public interface Stack<T>{

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
}
