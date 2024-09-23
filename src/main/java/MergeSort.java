public class MergeSort implements ISorter {
    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return;
        }
        int mid = len / 2;

        int[] leftSide = new int[mid];
        int[] rightSide = new int[len - mid];

        for(int i=0; i<len; i++){
            if(i < mid){
                leftSide[i] = arr[i];
            }else{
                rightSide[i-mid] = arr[i];
            }
        }
        sort(leftSide);
        sort(rightSide);
        merge(arr, leftSide, rightSide);
    }

    private void merge(int[] arr, int[] leftSide, int[] rightSide){
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;
        while(leftIndex < leftSize && rightIndex < rightSize){
            if(leftSide[leftIndex] <= rightSide[rightIndex]){
                arr[mergeIndex] = leftSide[leftIndex];
                leftIndex++;
            }else{
                arr[mergeIndex] = rightSide[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }

        while(leftIndex < leftSize){
            arr[mergeIndex] = leftSide[leftIndex];
            mergeIndex++;
            leftIndex++;
        }

        while(rightIndex < rightSize){
            arr[mergeIndex] = rightSide[rightIndex];
            mergeIndex++;
            rightIndex++;
        }
    }

    @Override
    public void printTimeComplexity() {
        String tc = """
                Time Complexity:
                
                	•	Best case: O(n log n)
                Even in the best case, Merge Sort divides the array in half recursively and requires linear time to merge the sorted halves.
                	•	Average case: O(n log n)
                The average case is also O(n log n) for the same reasons—each level of recursion takes linear time to merge.
                	•	Worst case: O(n log n)
                The worst case remains O(n log n) since the division and merging processes do not change based on input distribution.
                
                Space Complexity:
                
                	•	Space complexity: O(n)
                Merge Sort requires additional space for the temporary arrays (leftSide and rightSide) used during the merge process, resulting in a linear space requirement.
                
                Summary:
                
                	•	Time Complexity:
                	•	Best case: O(n log n)
                	•	Average case: O(n log n)
                	•	Worst case: O(n log n)
                	•	Space Complexity: O(n)
               """;
        System.out.println(tc);
    }
}

