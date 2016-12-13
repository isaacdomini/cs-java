package com.cyriacdomini.datastructure;

import org.junit.Test;
import org.junit.Before;
import junit.framework.Assert;

public class QueueTest{
  Queue queue1;
  Queue queue2;

  @Before
  public void init(){
    queue1 = new Queue<Integer>();
    queue2 = new Queue<Integer>();
    for(int i = 0; i< 10; i++){
      queue1.enqueue(i*3);
    }
  }
  @Test
  public void testEnqueue1(){
    Assert.assertTrue(queue2.enqueue(10*3));
  }
  @Test
  public void testSize(){
    Assert.assertEquals(10, queue1.size());
  }

}
