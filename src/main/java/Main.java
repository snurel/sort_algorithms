import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int itemCount = 200_000;
        SortAlgorithm algo = SortAlgorithm.MERGE;

        int[] array = getNewArray(itemCount);

        long timeStart = System.currentTimeMillis();

        System.out.printf(algo.name() + " sorting started with " + itemCount + " items.\n");

        ISorter sorter = SorterFactory.getSorter(algo);
        sorter.sort(array);

        long timeEnd = System.currentTimeMillis();

        System.out.print((timeEnd - timeStart) + " ms passed... \n");

        sorter.printTimeComplexity();

//        200_000 items
//        Bubble: 64646 ms passed...
//        Selection: 12626 ms passed...
//        Insertion: 2125 ms passed...
//        Merge: 47 ms passed...
//        Quick: 37 ms passed...
    }

    public static int[] getNewArray(int itemCount) {
        int[] arr = new int[itemCount];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1_000_000);
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.println(item);
        }
    }
}
