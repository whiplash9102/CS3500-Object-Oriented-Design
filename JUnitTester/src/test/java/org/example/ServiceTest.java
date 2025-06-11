package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ServiceTest {
    @Test
    void getNameNegativeTest() {
        Service service = new Service();
        String result = service.getName(-1);
        Assertions.assertEquals("a", result);
    }
}