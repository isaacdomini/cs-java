package com.cyriacdomini;

public class LinkedList{

  private LinkedListNode head;
  private int size;

  public LinkedList(){
    this.head = null;
    this.size = 0;
  }

  public boolean enqueue(T data){
    getLastNode().setNext(new LinkedListNode(data));
    size++;
    return true;
  }

  public T dequeue(){
    LinkedListNode temp = head;
    head = head.getNext();
    return temp==null ? null : temp.getValue();
  }

  public int size(){
    return this.size;
  }

  private LinkedListNode getLastNode(){
    LinkedListNode temp = head;
    LinkedListNode prev = temp;
    while(temp!=null){
      prev = temp;
      temp = temp.getNext();
    }
    return prev;
  }

  private class LinkedListNode{
    T data;
    LinkedListNode next;
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
    boolean setNext(LinkedListNode nextNode){
      this.next = nextNode;
      return true;
    }
  }
}
