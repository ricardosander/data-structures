package io.github.ricardosander.datastructures;

public class Vector {

  private int size = 0;
  private String[] elements = new String[100];

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(String element) {
    this.elements[size++] = element;
  }

  public String get(int position) {
    return elements[position];
  }
}
