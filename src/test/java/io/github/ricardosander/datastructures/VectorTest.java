package io.github.ricardosander.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

  @Test
  void shouldBeEmpty_whenVectorIsCreated() {
    Vector vector = new Vector();
    assertTrue(vector.isEmpty());
  }

  @Test
  void shouldNotBeEmpty_afterAdd() {
    Vector vector = new Vector();
    vector.add("element");
    assertFalse(vector.isEmpty());
  }
}