package io.github.ricardosander.datastructures;

public class Vector {

  private boolean isEmpty = true;

  public boolean isEmpty() {
    return isEmpty;
  }

  public void add(String element) {
    isEmpty = false;
  }
}
