package io.github.ricardosander.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void shouldBeEmpty_afterCreatingList() {
    LinkedList linkedList = new LinkedList();
    assertTrue(linkedList.isEmpty());
  }
}