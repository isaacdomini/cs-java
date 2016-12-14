package com.cyriacdomini.datastructure;
/**
 * Base tree interface
 */
public interface Tree<T> extends Iterable<T>{
  /**
   * Inserts given data into this tree
   * @param  data          data to be inserted into this
   * @return   true if successfully inserted
   */
  public boolean insert(T data);
  /**
   * Removes given data from the tree
   * @param  data          Data that is to be removed from this
   * @return   data that is removed from this if it exists and null if not
   *           in this.
   */
  public T remove(T data);
  /**
   * Gives number of nodes in tree
   * @return number of nodes in this
   */
  public int size();
  public Queue<T> inOrderQueue();
  public Stack<T> inOrderStack();
  public Queue<T> preOrderQueue();
  public Stack<T> preOrderStack();
  public Queue<T> postOrderQueue();
  public Stack<T> postOrderStack();
  public Set<T> getTreeNodeSet();
}
