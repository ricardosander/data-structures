package io.github.ricardosander.datastructures.linkedlist;

public class LinkedList {

  private String element;

  public boolean isEmpty() {
    return this.element == null;
  }

  public void add(String element) {
    this.element = element;
  }

  public String get(int position) {
    return this.element;
  }
}
