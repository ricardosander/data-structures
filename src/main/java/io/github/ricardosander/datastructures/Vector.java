package io.github.ricardosander.datastructures;

public class Vector {

  private int size = 0;
  private final String[] elements = new String[100];

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(int position, String element) {
    for (int i = this.size; i > position; i--) {
      this.elements[i] = this.elements[i - 1];
    }
    this.elements[position] = element;
    this.size++;
  }

  public void add(String element) {
    this.add(this.size, element);
  }

  public void addAtBeginning(String element) {
    this.add(0, element);
  }

  public String get(int position) {
    return elements[position];
  }

  public String remove(int position) {
    String element = this.get(position);
    this.elements[position] = null;
    size--;
    return element;
  }
}
