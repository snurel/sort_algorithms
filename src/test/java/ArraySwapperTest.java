import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySwapperTest {
    static class DummySwapper implements ArraySwapper {}

    @Test
    void testSwap() {
        ArraySwapper swapper = new DummySwapper();

        int[] array = {1, 2, 3, 4, 5};
        swapper.swap(array, 1, 3);

        assertArrayEquals(new int[] {1, 4, 3, 2, 5}, array, "Array elements at index 1 and 3 should be swapped");
    }

    @Test
    void testSwapSameIndex() {
        ArraySwapper swapper = new DummySwapper();

        int[] array = {1, 2, 3, 4, 5};
        swapper.swap(array, 2, 2);  // Swap element with itself

        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array, "Array should remain unchanged when swapping the same index");
    }

    @Test
    void testSwapOutOfBounds() {
        ArraySwapper swapper = new DummySwapper();

        int[] array = {1, 2, 3, 4, 5};

        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            swapper.swap(array, 1, 5);
        });

        assertTrue(exception.getMessage().contains("Index 5"), "Expected ArrayIndexOutOfBoundsException for invalid index");
    }

}