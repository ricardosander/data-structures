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
  void shouldBeEmpty_afterOneAddAndOneRemove() {
    Vector vector = new Vector();
    vector.add("element");
    vector.remove(0);
    assertTrue(vector.isEmpty());
  }

  @Test
  void shouldBeEmpty_afterOneAddAndOneRemoveByValue() {
    Vector vector = new Vector();
    vector.add("element");
    vector.remove("element");
    assertTrue(vector.isEmpty());
  }

  @Test
  void shouldReturnTrue_whenRemovingAExistingElementByValue() {
    Vector vector = new Vector();
    vector.add("first");
    vector.add("element");
    vector.add("other");
    assertTrue(vector.remove("element"));
  }

  @Test
  void shouldReturnFalse_whenRemovingNotExistingElementByValue() {
    Vector vector = new Vector();
    vector.add("first");
    vector.add("second");
    vector.add("third");
    assertFalse(vector.remove("element"));
  }

  @Test
  void shouldRetrieveRemovedValue_afterOneAddAndOneRemove() {
    Vector vector = new Vector();
    vector.add("element");
    String element = vector.remove(0);
    assertEquals("element", element);
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
  void shouldRetrieveFirstElement_afterAddTwoElementsAndRemoveSecondOne() {
    Vector vector = new Vector();

    vector.add("first");
    vector.add("second");

    vector.remove(1);

    assertEquals("first", vector.get(0));
  }

  @Test
  void shouldRetrieveSecondElement_afterAddTwoElementsAndRemoveFirstOne() {
    Vector vector = new Vector();

    vector.add("first");
    vector.add("second");

    vector.remove(0);

    assertEquals("second", vector.get(0));
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

  @Test
  void shouldContainElement_afterAddElement() {
    Vector vector = new Vector();
    vector.add("element");

    assertTrue(vector.contains("element"));
  }

  @Test
  void shouldNotContainAElement_afterAddDifferentElements() {
    Vector vector = new Vector();
    vector.add("first");
    vector.add("second");
    vector.add("third");

    assertFalse(vector.contains("element"));
  }

  @Test
  void shouldBeAbleToHandleALotOfValues() {
    Vector vector = new Vector();
    for (int i = 0; i < 110; i++) {
      vector.add(String.valueOf(i));
    }
    assertEquals("0", vector.get(0));
    assertEquals("99", vector.get(99));
    assertEquals("100", vector.get(100));
    assertEquals("108", vector.get(108));
    assertEquals("109", vector.get(109));
  }

  @Test
  void shouldBeAbleToHandleARealLotOfValues() {
    Vector vector = new Vector();
    for (int i = 0; i < 1002; i++) {
      vector.add(String.valueOf(i));
    }
    assertEquals("0", vector.get(0));
    assertEquals("100", vector.get(100));
    assertEquals("200", vector.get(200));
    assertEquals("300", vector.get(300));
    assertEquals("400", vector.get(400));
    assertEquals("500", vector.get(500));
    assertEquals("600", vector.get(600));
    assertEquals("700", vector.get(700));
    assertEquals("800", vector.get(800));
    assertEquals("900", vector.get(900));
    assertEquals("1000", vector.get(1000));
    assertEquals("1001", vector.get(1001));
  }
}