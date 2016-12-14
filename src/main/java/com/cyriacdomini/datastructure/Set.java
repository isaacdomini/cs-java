package com.cyriacdomini.datastructure;

public interface Set<T> extends Iterable<T>{
  /**
   * Adds data to set
   * @param  data          data to add to this
   * @return   true if successfully added to this
   */
  public boolean add(T data);
  /**
   * Removes data from this
   * @param  data          data to remove from this
   * @return   removed data from this or null if not in this
   */
  public T remove(T data);
  /**
   * returns an arbitrary element of this, deleting it from this
   * @return returns an arbitrary element of this
   */
  public T pop();
  /**
   * Joins this with a given set
   * @param  s           Set to be joined with this
   * @return        true if successfully joined
   */
  public boolean union(Set<T> s);//: returns the union of sets S and T.
  /**
   * Returns intersection of this and a given set
   * @param  s           Set to check for intersection with this
   * @return        intersection of this and s
   */
  public Set<T> intersection(Set<T> s);//: returns the intersection of sets S and T.
  /**
   * Returns difference of this and a given set
   * @param  s           Set to check for difference with this
   * @return        difference of this and s
   */
  public Set<T> difference(Set<T> s);// returns the difference of sets S and T.
  /**
   * Checks if a given set is a subset of this
   * @param  s           Set to check if it is a subset of this
   * @return        true if s is a subset of this and false otherwise
   */
  public boolean subset(Set<T> s);

  /**
   * Checks if a given data is an element of this
   * @param  data          data to check if it is in this
   * @return   true is data is an element of this and false otherwise
   */
  public boolean isElementof(T data);//: checks whether the value x is in the set S.
  /**
   * Checks if this is empty
   * @return true if this is empty and flase otherwise
   */
  public boolean isEmpty();//: checks whether the set S is empty.
  /**
   * Size of this
   * @return size of this
   */
  public int size();// or cardinality(S): returns the number of elements in S.
  // iterate(S): returns a function that returns one more value of S at each call, in some arbitrary order.
  // enumerate(S): returns a list containing the elements of S in some arbitrary order.
  // build(x1,x2,…,xn,): creates a set structure with values x1,x2,…,xn.
  // create_from(collection): creates a new set structure containing all the elements of the given collection or all the elements returned by the given iterator.
  // Dynamic sets[edit]
  // Dynamic set structures typically add:
  // map(F,S): returns the set of distinct values resulting from applying function F to each element of S.
  // filter(P,S): returns the subset containing all elements of S that satisfy a given predicate P.
  // fold(A0,F,S): returns the value A|S| after applying Ai+1 := F(Ai, e) for each element e of S, for some binary operation F. F must be associative and commutative for this to be well-defined.
  /**
   * Removes all elements from this
   * @return true if successfully cleared
   */
  public boolean clear(); //delete all elements of S.
  // public static abstract boolean equal(Set<T> s1, Set<T> s2);//: checks whether the two given sets are equal (i.e. contain all and only the same elements).
  // hash(S): returns a hash value for the static set S such that if equal(S1, S2) then hash(S1) = hash(S2)
  // Other operations can be defined for sets with elements of a special type:

  // sum(S): returns the sum of all elements of S for some definition of "sum". For example, over integers or reals, it may be defined as fold(0, add, S).
  // collapse(S): given a set of sets, return the union.[9] For example, collapse({{1}, {2, 3}}) == {1, 2, 3}. May be considered a kind of sum.
  // flatten(S): given a set consisting of sets and atomic elements (elements that are not sets), returns a set whose elements are the atomic elements of the original top-level set or elements of the sets it contains. In other words, remove a level of nesting – like collapse, but allow atoms. This can be done a single time, or recursively flattening to obtain a set of only atomic elements.[10] For example, flatten({1, {2, 3}}) == {1, 2, 3}.
  // nearest(S,x): returns the element of S that is closest in value to x (by some metric).
  // min(S), max(S): returns the minimum/maximum element of S.
}
