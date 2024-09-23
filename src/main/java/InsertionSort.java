public class InsertionSort implements ISorter {
    @Override
    public  void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }

    @Override
    public void printTimeComplexity() {
        String tc = """
                Time Complexity:
                
                	•	Best case: O(n)
                This occurs when the array is already sorted. In this case, the inner while loop never executes, so the algorithm only makes  n-1  comparisons, leading to a linear time complexity.
                	•	Average case: O(n²)
                In the average case, each element is compared with half of the previously sorted elements (on average), leading to a quadratic number of comparisons and shifts.
                	•	Worst case: O(n²)
                This occurs when the array is sorted in reverse order. In this case, for each element, the inner while loop will perform  i  comparisons and shifts, where  i  is the position of the element. This results in  \\frac{n(n-1)}{2}  operations, giving a time complexity of O(n²).
                
                Thus, the time complexity for the given implementation of Insertion Sort is:
                
                •	Best case: O(n)
                •	Average case: O(n²)
                •	Worst case: O(n²)
               """;
        System.out.println(tc);
    }
}

