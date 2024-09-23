import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void testSortAlreadySortedArray() {
        ISorter sorter = new QuickSort();
        int[] array = {1, 2, 3, 4, 5};

        sorter.sort(array);

        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array, "Array should remain sorted if it was already sorted");
    }

    @Test
    void testSortReverseArray() {
        ISorter sorter = new QuickSort();
        int[] array = {5, 4, 3, 2, 1};

        sorter.sort(array);

        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array, "Array should be sorted in ascending order");
    }

    @Test
    void testSortUnsortedArray() {
        ISorter sorter = new QuickSort();
        int[] array = {3, 1, 4, 5, 2};

        sorter.sort(array);

        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array, "Array should be sorted in ascending order");
    }

    @Test
    void testSortArrayWithDuplicates() {
        ISorter sorter = new QuickSort();
        int[] array = {5, 1, 3, 3, 2, 1};

        sorter.sort(array);

        assertArrayEquals(new int[] {1, 1, 2, 3, 3, 5}, array, "Array with duplicates should be sorted correctly");
    }

    @Test
    void testSortSingleElementArray() {
        ISorter sorter = new QuickSort();
        int[] array = {1};

        sorter.sort(array);

        assertArrayEquals(new int[] {1}, array, "Array with a single element should remain unchanged");
    }

    @Test
    void testSortEmptyArray() {
        ISorter sorter = new QuickSort();
        int[] array = {};

        sorter.sort(array);

        assertArrayEquals(new int[] {}, array, "Empty array should remain unchanged");
    }

    @Test
    void testSortArrayWithNegativeNumbers() {
        ISorter sorter = new QuickSort();
        int[] array = {5, -1, 3, -5, 2};

        sorter.sort(array);

        assertArrayEquals(new int[] {-5, -1, 2, 3, 5}, array, "Array with negative numbers should be sorted correctly");
    }
}