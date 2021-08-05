package io.github.ricardosander.datastructures;

public class Vector {

  private int size = 0;
  private String[] elements = new String[100];

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(int position, String element) {
    for (int i = this.size; i >= position; i--) {
      this.elements[i] = this.elements[i - 1];
    }
    this.elements[position] = element;
    this.size++;
  }

  public void add(String element) {
    this.elements[size++] = element;
  }

  public void addAtBeginning(String element) {
    for (int i = this.size; i > 0; i--) {
      this.elements[i] = this.elements[i - 1];
    }
    this.elements[0] = element;
    this.size++;
  }

  public String get(int position) {
    return elements[position];
  }
}
