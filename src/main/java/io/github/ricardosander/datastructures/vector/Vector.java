package io.github.ricardosander.datastructures.vector;

public class Vector {

  private int size = 0;
  private String[] elements = new String[100];

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(int position, String element) {
    if (this.size + 1 > this.elements.length) {
      resize();
    }
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
    if (isFinalPosition(position)) {
      removesFromEnding();
      return element;
    }
    removesFrom(position);
    return element;
  }

  public boolean remove(String element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        remove(i);
        return true;
      }
    }
    return false;
  }

  public boolean contains(String element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  private boolean isFinalPosition(int position) {
    return position == this.size - 1;
  }

  private void removesFromEnding() {
    this.elements[size--] = null;
  }

  private void removesFrom(int position) {
    for (int i = position; i < this.size; i++) {
      this.elements[i] = this.elements[i + 1];
    }
    removesFromEnding();
  }

  private void resize() {
    String[] newElements = new String[this.elements.length * 2];
    for (int i = 0; i < this.size; i++) {
      newElements[i] = this.elements[i];
    }
    this.elements = newElements;
  }
}
