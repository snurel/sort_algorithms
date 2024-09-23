public class SelectionSort implements ISorter, ArraySwapper{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j= minIndex + 1; j <arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    @Override
    public void printTimeComplexity() {
        String tc = """
                Time Complexity:
                
                	•	Best case: O(n²)
                Selection Sort always goes through the entire array to find the minimum value for each position, regardless of the initial order of the elements.
                	•	Average case: O(n²)
                Similar to the best case, the average case also requires scanning the remaining unsorted portion of the array, leading to a quadratic number of comparisons.
                	•	Worst case: O(n²)
                In the worst case, the algorithm performs the same number of comparisons as in the average case, as it still checks each element to find the minimum.
                
                Space Complexity:
                
                	•	Space complexity: O(1)
                Selection Sort is an in-place sorting algorithm, meaning it requires a constant amount of additional space.
                
                Summary:
                
                	•	Time Complexity:
                	•	Best case: O(n²)
                	•	Average case: O(n²)
                	•	Worst case: O(n²)
                	•	Space Complexity: O(1)
               """;
        System.out.println(tc);
    }
}
