package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HomeWorkTest {

    @Test
    void partitionByTest() {
        Node<Integer> root = new Node<>(1);
        root.add(2);
        root.add(3);
        root.add(4);
        root.add(5);

        HomeWork hw = new HomeWork();
        assertEquals(3, hw.partitionBy(root, x -> x < 4));
        assertEquals(4, hw.partitionBy(root, x -> x <= 4));
        assertEquals(0, hw.partitionBy(root, x -> x < 0));
        assertEquals(5, hw.partitionBy(root, x -> x < 10));
    }

    @Test
    void findNthElement() {
        Node<String> root = new Node<>(" Нулевой элемент");
        root.add("Первый элемент");
        root.add("Второй элемент");
        root.add("Третий элемент");
        root.add("Четверный элемент");
        HomeWork hw = new HomeWork();
        assertEquals("Первый элемент", hw.findNthElement(root, 1));
        assertEquals("Третий элемент", hw.findNthElement(root, 3));
        assertEquals("Четверный элемент", hw.findNthElement(root,4));
        assertThrows(IndexOutOfBoundsException.class, () -> hw.findNthElement(root, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> hw.findNthElement(root, -10));
    }
}