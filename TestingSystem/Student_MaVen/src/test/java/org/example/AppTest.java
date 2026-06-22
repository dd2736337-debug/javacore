package org.example;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void handleChoiceShouldContinueForUnsupportedOption() {
        assertTrue(Program.handleChoice(99));
    }

    @Test
    void handleChoiceShouldStopForExitOption() {
        assertFalse(Program.handleChoice(0));
    }
}
