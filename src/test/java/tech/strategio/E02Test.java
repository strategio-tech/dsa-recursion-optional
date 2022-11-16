package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E02Test {
    @DisplayName("Factorial")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("argumentStream")
        // replace int[] and Boolean with the appropriate types
    void argumentStream(int value, int result) {
        E02 exercise = new E02();
        int val = exercise.factorial(value);
        assertEquals(result, val);
    }

    private static Stream<Arguments> argumentStream() {
        return Stream.of(
                Arguments.arguments(0, 1),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 2),
                Arguments.arguments(3, 6),
                Arguments.arguments(4, 24),
                Arguments.arguments(5, 120),
                Arguments.arguments(6, 720));
    }

}
