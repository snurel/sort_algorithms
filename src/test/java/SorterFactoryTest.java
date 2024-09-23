import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterFactoryTest {

    @Test
    void should_create_bubble_sorter() {
        ISorter sorter = SorterFactory.getSorter(SortAlgorithm.BUBBLE);
        assertNotNull(sorter);
        assertInstanceOf(BubbleSort.class, sorter, "Expected a BubbleSort instance");
    }

    @Test
    void should_create_merge_sorter() {
        ISorter sorter = SorterFactory.getSorter(SortAlgorithm.MERGE);
        assertNotNull(sorter);
        assertInstanceOf(MergeSort.class, sorter, "Expected a MergeSort instance");
    }

    @Test
    void should_create_quick_sorter() {
        ISorter sorter = SorterFactory.getSorter(SortAlgorithm.QUICK);
        assertNotNull(sorter);
        assertInstanceOf(QuickSort.class, sorter, "Expected a QuickSort instance");
    }

    @Test
    void should_create_selection_sorter() {
        ISorter sorter = SorterFactory.getSorter(SortAlgorithm.SELECTION);
        assertNotNull(sorter);
        assertInstanceOf(SelectionSort.class, sorter, "Expected a SelectionSort instance");
    }

    @Test
    void should_create_insertion_sorter() {
        ISorter sorter = SorterFactory.getSorter(SortAlgorithm.INSERTION);
        assertNotNull(sorter);
        assertInstanceOf(InsertionSort.class, sorter, "Expected a InsertionSort instance");
    }
}