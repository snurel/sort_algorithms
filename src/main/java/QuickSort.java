public class QuickSort implements ISorter, ArraySwapper {
    @Override
    public void sort(int[] arr){
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && rightPointer > leftPointer){
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIndex);
        sort(arr, lowIndex, leftPointer - 1);
        sort(arr, leftPointer + 1, highIndex);
    }

    @Override
    public void printTimeComplexity() {
        String tc = """
                Time Complexity:
                
                	•	Best case: O(n log n)
                This occurs when the pivot divides the array into two roughly equal halves at each step, leading to a balanced recursion tree.
                	•	Average case: O(n log n)
                The average case also yields O(n log n) as the pivot is expected to divide the array reasonably well on average.
                	•	Worst case: O(n²)
                This occurs when the pivot is always the smallest or largest element, resulting in unbalanced partitions (e.g., when the array is already sorted or reverse sorted). In this case, the algorithm may need to perform  n  passes over the array.
                
                Space Complexity:
                
                	•	Space complexity: O(log n)
                Quick Sort is an in-place sorting algorithm, but it requires stack space for recursive calls. In the best and average cases, the recursion depth is logarithmic. However, in the worst case, it can degrade to O(n) due to the recursion stack.
                
                Summary:
                
                	•	Time Complexity:
                	•	Best case: O(n log n)
                	•	Average case: O(n log n)
                	•	Worst case: O(n²)
                	•	Space Complexity: O(log n) (average case), O(n) (worst case)
               """;
        System.out.println(tc);
    }
}

