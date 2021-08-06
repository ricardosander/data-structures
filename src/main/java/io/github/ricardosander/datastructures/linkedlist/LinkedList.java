package io.github.ricardosander.datastructures.linkedlist;

public class LinkedList {

  private Node first;

  public boolean isEmpty() {
    return this.first == null;
  }

  public void add(String element) {
    if (this.first == null) {
      this.first = new Node(element);
    } else {
      Node actual = this.first;
      while (actual.getNext() != null) {
        actual = actual.getNext();
      }
      actual.setNext(new Node(element));
    }
  }

  public String get(int position) {
    Node actual = this.first;
    for (int i = 0; i < position; i++) {
      actual = actual.getNext();
    }
    return actual.getValue();
  }

}
