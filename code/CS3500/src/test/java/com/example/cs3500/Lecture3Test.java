package com.example.cs3500;

import org.junit.jupiter.api.Test;

import cs3500.hw01.publication.ConferenceProceedings;
import cs3500.hw01.publication.Publication;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lecture3Test {
    @Test
    public void testAPAWithNormalEditor() {
    Publication pub = new ConferenceProceedings(
            "Nguyen", "An", "Proceedings of the Future of AI",
            "Hanoi", 2025, "Springer");

    String expected = "Nguyen, A. (Ed.). (2025). Proceedings of the Future of AI (Hanoi). Springer.";
    assertEquals(expected, pub.citeApa());
  }
}
