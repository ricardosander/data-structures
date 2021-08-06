package io.github.ricardosander.datastructures.linkedlist;

class Node {
  private final String value;
  private Node next;

  Node(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
