package com.cyriacdomini.datastructure;

public class LinkedList<T>{

  private LinkedListNode<T> head;
  private int size;

  public LinkedList(){
    this.head = null;
    this.size = 0;
  }

  public boolean enqueue(T data){
    getLastNode().setNext(new LinkedListNode<T>(data));
    size++;
    return true;
  }

  public T dequeue(){
    LinkedListNode<T> temp = head;
    head = head.getNext();
    return temp==null ? null : temp.getValue();
  }

  public int size(){
    return this.size;
  }

  private LinkedListNode<T> getLastNode(){
    LinkedListNode<T> temp = head;
    LinkedListNode<T> prev = temp;
    while(temp!=null){
      prev = temp;
      temp = temp.getNext();
    }
    return prev;
  }

  private class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data){
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
    LinkedListNode getNext(){
      return this.next;
    }
    boolean setNext(LinkedListNode<T> nextNode){
      this.next = nextNode;
      return true;
    }
  }
}
