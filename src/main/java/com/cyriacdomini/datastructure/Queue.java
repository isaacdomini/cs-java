package com.cyriacdomini.datastructure;

public interface Queue<T>{
  public boolean enqueue(T data);
  public T dequeue();
  public int size();
}
