package io.github.ricardosander.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void shouldBeEmpty_afterCreatingList() {
    LinkedList linkedList = new LinkedList();
    assertTrue(linkedList.isEmpty());
  }

  @Test
  void shouldNotBeEmpty_afterAddElement() {
    LinkedList linkedList = new LinkedList();
    linkedList.add("element");
    assertFalse(linkedList.isEmpty());
  }

  @Test
  void shouldBeEmpty_afterAddOneElementAndRemoveOneElement() {
    LinkedList linkedList = new LinkedList();
    linkedList.add("element");
    linkedList.remove("element");
    assertTrue(linkedList.isEmpty());
  }

  @Test
  void shouldReturnTrue_whenRemoveAExistingElement() {
    LinkedList linkedList = new LinkedList();
    linkedList.add("element");
    assertTrue(linkedList.remove("element"));
  }

  @Test
  void shouldRetrieveElement_afterAddElement() {
    LinkedList linkedList = new LinkedList();
    linkedList.add("element");
    assertEquals("element", linkedList.get(0));
  }

  @Test
  void shouldRetrieveTwoElements_afterAddTwoElements() {
    LinkedList linkedList = new LinkedList();
    linkedList.add("first");
    linkedList.add("second");
    assertEquals("first", linkedList.get(0));
    assertEquals("second", linkedList.get(1));
  }
}