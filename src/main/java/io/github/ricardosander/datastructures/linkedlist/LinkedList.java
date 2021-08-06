package io.github.ricardosander.datastructures.linkedlist;

public class LinkedList {

  private boolean isEmpty = true;

  public boolean isEmpty() {
    return this.isEmpty;
  }

  public void add(String element) {
    this.isEmpty = false;
  }
}
