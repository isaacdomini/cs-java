package com.cyriacdomini.datastructure;
public interface Tree<T> extends Iterable<T>{
  public boolean insert(T data);
  public T remove(T data);
  public int size();
  public Queue<T> inOrderQueue();
  public Stack<T> inOrderStack();
  public Queue<T> preOrderQueue();
  public Stack<T> preOrderStack();
  public Queue<T> postOrderQueue();
  public Stack<T> postOrderStack();
  public Set<T> getTreeNodeSet();
}
