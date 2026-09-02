package sg.edu.nus.iss.d13revision.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataControllerTest {

    private DataController controller;

    @BeforeEach
    void setUp() {
        controller = new DataController();
    }

    @Test
    void testHealthCheck() {
        assertEquals("HEALTH CHECK OK!", controller.healthCheck());
    }

    @Test
    void testVersion() {
        assertEquals("The actual version is 1.0.0", controller.version());
    }

    @Test
    void testNations() {
        assertEquals(10, controller.nations().size());
    }

    @Test
    void testCurrencies() {
        assertEquals(20, controller.currencies().size());
    }
}
