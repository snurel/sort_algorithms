public class BubbleSort implements ISorter, ArraySwapper {
    @Override
    public void sort(int[] arr) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i=0; i< arr.length - 1; i++){
                int j = i + 1;
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    swapped = true;
                }
            }
        }
    }

    @Override
    public void printTimeComplexity() {
       String tc = """
               Time Complexity:
               
               	•	Best case: O(n)
               This occurs when the array is already sorted. In this case, the swapped flag will be false after the first pass, so the algorithm will stop after the first iteration over the array, making the time complexity linear.
               	•	Average case: O(n²)
               In the average case, the algorithm needs to perform about  \\frac{n(n-1)}{2}  comparisons and swaps, as it potentially checks all adjacent elements multiple times until the array is sorted.
               	•	Worst case: O(n²)
               This occurs when the array is sorted in reverse order. In this case, the algorithm will perform the maximum number of swaps and comparisons, requiring  n-1  passes and approximately  \\frac{n(n-1)}{2}  operations.
               
               Thus, the time complexity for the given implementation of Bubble Sort is:
               
               	•	Best case: O(n)
               	•	Average case: O(n²)
               	•	Worst case: O(n²)
               """;
        System.out.println(tc);
    }
}
