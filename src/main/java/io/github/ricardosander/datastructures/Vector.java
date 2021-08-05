package io.github.ricardosander.datastructures;

public class Vector {

  private boolean isEmpty = true;
  private String element = null;

  public boolean isEmpty() {
    return isEmpty;
  }

  public void add(String element) {
    this.element = element;
    isEmpty = false;
  }

  public String get(int position) {
    return element;
  }
}
