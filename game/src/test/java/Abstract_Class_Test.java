import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Abstract_Class_Test {

    @Test
    @DisplayName("book weight test")
    void book() {
        // Given
        Thing thing = new Book("bo",20,"red",3,"asdf");

        // When
        thing.setWeight(5.5);

        // Then
        assertEquals(5.5, thing.getWeight());
    }
}