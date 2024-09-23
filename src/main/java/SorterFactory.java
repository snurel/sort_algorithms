public class SorterFactory {
    public static ISorter getSorter(SortAlgorithm algorithm) {
        return switch (algorithm) {
            case SortAlgorithm.BUBBLE -> new BubbleSort();
            case SortAlgorithm.INSERTION -> new InsertionSort();
            case SortAlgorithm.MERGE -> new MergeSort();
            case SortAlgorithm.QUICK -> new QuickSort();
            case SortAlgorithm.SELECTION -> new SelectionSort();
            default -> throw new IllegalArgumentException("Unsupported sort algorithm: " + algorithm);
        };
    }
}