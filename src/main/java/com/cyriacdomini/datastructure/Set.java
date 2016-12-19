package com.cyriacdomini.datastructure;
/**
 * Set interface.
 * @param <T> generic type T.
 */
public interface Set<T> extends Iterable<T> {
  /**
   * Adds data to set.
   * @param  data          data to add to this
   * @return   true if successfully added to this
   */
  boolean add(T data);
  /**
   * Removes data from this.
   * @param  data          data to remove from this
   * @return   removed data from this or null if not in this
   */
  T remove(T data);
  /**
   * returns an arbitrary element of this, deleting it from this.
   * @return returns an arbitrary element of this
   */
  T pop();
  /**
   * Joins this with a given set.
   * @param  s           Set to be joined with this
   * @return        true if successfully joined
   */
  boolean union(Set<T> s);
  /**
   * Returns intersection of this and a given set.
   * @param  s           Set to check for intersection with this
   * @return        intersection of this and s
   */
  Set<T> intersection(Set<T> s);
  /**
   * Returns difference of this and a given set.
   * @param  s           Set to check for difference with this
   * @return        difference of this and s
   */
  Set<T> difference(Set<T> s);
  /**
   * Checks if a given set is a subset of this.
   * @param  s           Set to check if it is a subset of this
   * @return        true if s is a subset of this and false otherwise
   */
  boolean subset(Set<T> s);

  /**
   * Checks if a given data is an element of this.
   * @param  data          data to check if it is in this
   * @return   true is data is an element of this and false otherwise
   */
  boolean isElementof(T data);
  /**
   * Checks if this is empty.
   * @return true if this is empty and flase otherwise
   */
  boolean isEmpty();
  /**
   * Number of elements in this.
   * @return size of this
   */
  int size();
  /**
   * Removes all elements from this.
   * @return true if successfully cleared
   */
  boolean clear();
}
