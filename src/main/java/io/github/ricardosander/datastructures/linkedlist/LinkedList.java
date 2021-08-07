package io.github.ricardosander.datastructures.linkedlist;

public class LinkedList {

  private Node first;

  public boolean isEmpty() {
    return this.first == null;
  }

  public void add(String element) {
    if (this.isEmpty()) {
      this.first = new Node(element);
      return;
    }
    getLastNode().setNext(element);
  }

  public String get(int position) {
    Node actual = this.first;
    for (int i = 0; i < position; i++) {
      actual = actual.getNext();
    }
    return actual.getValue();
  }

  public boolean remove(String element) {
    if (this.first.getValue().equals(element)) {
      this.first = null;
      return true;
    }
    Node actual = this.first;
    while (actual.getNext() != null) {
      actual = actual.getNext();
      if (actual.getValue().equals(element)) {
        return true;
      }
    }
    return false;
  }

  private Node getLastNode() {
    Node actual = this.first;
    while (actual.getNext() != null) {
      actual = actual.getNext();
    }
    return actual;
  }
}
