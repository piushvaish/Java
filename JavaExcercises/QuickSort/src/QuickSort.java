import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 https://class.coursera.org/algo-006/quiz/attempt
 Question 1
 GENERAL DIRECTIONS:
 Download the text file here.

 The file contains all of the integers between 1 and 10,000 (inclusive, with no repeats) in unsorted order. The integer in the ith row of the file gives you the ith entry of an input array.

 Your task is to compute the total number of comparisons used to sort the given input file by QuickSort. As you know, the number of comparisons depends on which elements are chosen as pivots, so we'll ask you to explore three different pivoting rules.
 You should not count comparisons one-by-one. Rather, when there is a recursive call on a subarray of length m, you should simply add m−1 to your running total of comparisons. (This is because the pivot element is compared to each of the other m−1 elements in the subarray in this recursive call.)

 WARNING: The Partition subroutine can be implemented in several different ways, and different implementations can give you differing numbers of comparisons. For this problem, you should implement the Partition subroutine exactly as it is described in the video lectures (otherwise you might get the wrong answer).

 DIRECTIONS FOR THIS PROBLEM:

 For the first part of the programming assignment, you should always use the first element of the array as the pivot element.

 HOW TO GIVE US YOUR ANSWER:

 Type the numeric answer in the space provided.
 So if your answer is 1198233847, then just type 1198233847 in the space provided without any space / commas / other punctuation marks. You have 5 attempts to get the correct answer.
 (We do not require you to submit your code, so feel free to use the programming language of your choice, just type the numeric answer in the following space.)

 Answer for Question 1

 Question 2
 GENERAL DIRECTIONS AND HOW TO GIVE US YOUR ANSWER:
 See the first question.

 DIRECTIONS FOR THIS PROBLEM:

 Compute the number of comparisons (as in Problem 1), always using the final element of the given array as the pivot element. Again, be sure to implement the Partition subroutine exactly as it is described in the video lectures. Recall from the lectures that, just before the main Partition subroutine, you should exchange the pivot element (i.e., the last element) with the first element.

 Answer for Question 2

 Question 3
 GENERAL DIRECTIONS AND HOW TO GIVE US YOUR ANSWER:
 See the first question.

 DIRECTIONS FOR THIS PROBLEM:

 Compute the number of comparisons (as in Problem 1), using the "median-of-three" pivot rule. [The primary motivation behind this rule is to do a little bit of extra work to get much better performance on input arrays that are nearly sorted or reverse sorted.] In more detail, you should choose the pivot as follows. Consider the first, middle, and final elements of the given array. (If the array has odd length it should be clear what the "middle" element is; for an array with even length 2k, use the kth element as the "middle" element. So for the array 4 5 6 7, the "middle" element is the second one ---- 5 and not 6!) Identify which of these three elements is the median (i.e., the one whose value is in between the other two), and use this as your pivot. As discussed in the first and second parts of this programming assignment, be sure to implement Partition exactly as described in the video lectures (including exchanging the pivot element with the first element just before the main Partition subroutine).

 EXAMPLE: For the input array 8 2 4 5 7 1 you would consider the first (8), middle (4), and last (1) elements; since 4 is the median of the set {1,4,8}, you would use 4 as your pivot element.

 SUBTLE POINT: A careful analysis would keep track of the comparisons made in identifying the median of the three candidate elements. You should NOT do this. That is, as in the previous two problems, you should simply add m−1 to your running total of comparisons every time you recurse on a subarray with length m.

 Answer for Question 3
 */

public class QuickSort{

    private static long numberOfComparisons;

    public static void main(String[] args){
        Integer[] input = new Integer[10000];
        readInputIntoArray(input);
        partitionizeAndSort(input, 0, input.length-1);
        System.out.println("Number of comparisons => "+ numberOfComparisons);

        //compariton count with last element as pivot
        input = new Integer[10000];
        readInputIntoArray(input);
        numberOfComparisons = 0; //reset comparison count
        partitionizeUsingLastElementAndSort(input, 0, input.length-1);
        System.out.println("Number of comparisons => "+ numberOfComparisons);

        //comparison count with medium as pivot
        input = new Integer[10000];
        readInputIntoArray(input);
        numberOfComparisons = 0; //reset comparison count
        partitionizeUsingMediumOfThreeAndSort(input, 0, input.length-1);
        System.out.println("Number of comparisons => "+ numberOfComparisons);
    }

    static void readInputIntoArray(Integer[] input) {
        BufferedReader br = null;
        int i = 0;
        try {
            String sCurrentLine = null;
            br = new BufferedReader(new FileReader("QuickSort.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                input[i++] = Integer.parseInt(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println("exception => " + e);
        }
    }

    private static Integer[] partitionizeAndSort(Integer[] inputArray, int startIndex, int endIndex){
        //base case
        if(startIndex >= endIndex){
            return inputArray;
        }else{
            int newPivot = partitionize(inputArray, startIndex, endIndex);
            numberOfComparisons += endIndex - startIndex;

            //sort left subarray
            partitionizeAndSort(inputArray, startIndex, newPivot-1);
            partitionizeAndSort(inputArray, newPivot+1, endIndex);
        }
        return inputArray;
    }

    /**
     * Partitioning method that takes the first element of the array as its pivot
     */
    private static int partitionize(Integer[] inputArray, int start, int end){
        //The pivot corresponds to the first element of the array
        int pivot = inputArray[start];
        int innerCounter = start+1;
        for(int i=start+1; i<=end;i++){
            //If the current input is lower than the pivot then swap pivots
            if(inputArray[i] < pivot){
                int temp = inputArray[i];
                inputArray[i] = inputArray[innerCounter];
                inputArray[innerCounter] = temp;
                innerCounter++;
            }
        }
        swap(inputArray, start, innerCounter);
        return innerCounter-1;
    }

    /**
     * quick sort algorithm implementation using the last element as the pivot
     */
    private static Integer[] partitionizeUsingLastElementAndSort(Integer[] inputArray, int startIndex, int endIndex){
        //Base case
        if(startIndex >= endIndex){
            return inputArray;
        }else{
            int newPivot = partitionizePivotAsLast(inputArray, startIndex, endIndex);
            numberOfComparisons += endIndex - startIndex;
            partitionizeUsingLastElementAndSort(inputArray, startIndex, newPivot-1);
            partitionizeUsingLastElementAndSort(inputArray, newPivot+1, endIndex);
        }
        return inputArray;
    }

    /**
     * Partitioning method that takes the last element of the array as its pivot
     */
    private static int partitionizePivotAsLast(Integer[] inputArray, int start, int end){
        //Switching the last element to be the first before partition
        int temp = inputArray[end];
        inputArray[end] = inputArray[start];
        inputArray[start] = temp;

        //putting the last element as the first
        int pivot = inputArray[start];

        int innerCounter = start+1;
        for(int i=start+1; i<= end; i++){
            //If the current element is lower than pivot, then swap
            if(inputArray[i] < pivot){
                int tmp = inputArray[i];
                inputArray[i] = inputArray[innerCounter];
                inputArray[innerCounter] = tmp;
                innerCounter++;
            }
        }

        swap(inputArray, start, innerCounter);
        return innerCounter-1;
    }

    /**
     * quick sort algorithm implemented using medium of three as pivot
     */
    private static Integer[] partitionizeUsingMediumOfThreeAndSort(Integer[] inputArray, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return inputArray;
        }else{
            int newPivot = partitionizePivotAsMediumOfThree(inputArray, startIndex, endIndex);
            numberOfComparisons += endIndex - startIndex;
            partitionizeUsingMediumOfThreeAndSort(inputArray, startIndex, newPivot-1);
            partitionizeUsingMediumOfThreeAndSort(inputArray, newPivot+1, endIndex);
        }
        return inputArray;
    }

    /**
     * Partitioning method that uses the median of three pivot rule
     */
    private static int partitionizePivotAsMediumOfThree(Integer[] inputArray, int start, int end){
        int firstElement = inputArray[start];
        int finalElement = inputArray[end];

        int medianIndex =  start + (end - start)/2;
        int middleElement = inputArray[(medianIndex)];
        int median = start;
        if((firstElement > middleElement && firstElement < finalElement) || (firstElement < middleElement && finalElement > finalElement)){
            median = start;
        }

        if((middleElement > firstElement && middleElement < finalElement) || (middleElement < firstElement && middleElement > finalElement)){
            median = medianIndex;
        }

        if((finalElement > firstElement && finalElement<middleElement) || (finalElement < firstElement && finalElement > middleElement)){
            median = end;
        }

        if(median != start){
            int tmpValue = inputArray[median];
            inputArray[median] = inputArray[start];
            inputArray[start] = tmpValue;
        }

        //Putting the last element as the first
        int pivot = inputArray[start];

        //Boundary of the latest element <p
        int innerCounter = start + 1;
        for (int i = start + 1; i <= end; i++) {
            // If the current input is lower that the pivot then swap pivots.
            if (inputArray[i] < pivot) {
                int tmp = inputArray[i];
                inputArray[i] = inputArray[innerCounter];
                inputArray[innerCounter] = tmp;
                innerCounter++;
            }
        }
        swap(inputArray, start, innerCounter);
        return innerCounter-1;
    }

    private static void swap(Integer[] inputArray, int start, int innerCounter){
        int temp = inputArray[start];
        inputArray[start] = inputArray[innerCounter-1];
        inputArray[innerCounter-1] = temp;
    }
}
