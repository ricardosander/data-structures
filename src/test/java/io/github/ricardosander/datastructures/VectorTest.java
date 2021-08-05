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

  @Test
  void shouldRetrieveFirstElement_afterAddOneElement() {
    Vector vector = new Vector();
    vector.add("element");
    String element = vector.get(0);
    assertEquals("element", element);
  }

  @Test
  void shouldRetrieveTwoElements_afterAddTwoElements() {
    Vector vector = new Vector();

    vector.add("first");
    vector.add("second");

    String firstElement = vector.get(0);
    String secondElement = vector.get(1);

    assertEquals("first", firstElement);
    assertEquals("second", secondElement);
  }

  @Test
  void shouldRetrieveThreeElements_afterAddThreeElementsAtBeginning() {
    Vector vector = new Vector();

    vector.addAtBeginning("first");
    vector.addAtBeginning("second");
    vector.addAtBeginning("third");

    assertEquals("third", vector.get(0));
    assertEquals("second", vector.get(1));
    assertEquals("first", vector.get(2));
  }

  @Test
  void shouldRetrieveThreeElements_afterAddOneElementAtMiddleOfOtherTwoElements() {
    Vector vector = new Vector();

    vector.add("first");
    vector.add("second");
    vector.add(1, "third");

    assertEquals("first", vector.get(0));
    assertEquals("third", vector.get(1));
    assertEquals("second", vector.get(2));
  }
}