package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OutrosTestes {
  @Order(2)
  @Test
  void validarArrays() {
    int[] arr1 = { 10, 20, 30, 40, 50 };
    int[] arr2 = { 1, 2, 3, 4, 5 };
    int[] arr3 = { 10, 20, 30, 40, 50 };

    assertArrayEquals(arr1, arr3);
    assertNotEquals(arr2, arr3);
  }

  @Order(1)
  @Test
  @EnabledOnOs(OS.LINUX)
  void validarComAssumption() {
    assertTrue(true);
  }
}
