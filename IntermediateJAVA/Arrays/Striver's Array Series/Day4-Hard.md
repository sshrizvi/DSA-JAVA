# Striver's Array Series (***Day 4 - Hard***)
- [Striver's Array Series (***Day 4 - Hard***)](#strivers-array-series-day-4---hard)
  - [🗳️ Question 24 : Majority Element](#️-question-24--majority-element)
    - [🧠 Intuition](#-intuition)
    - [🚀 Approach](#-approach)
    - [📜 Detailed Walkthrough](#-detailed-walkthrough)
    - [🔍 Dry Run](#-dry-run)
    - [🔢 Code](#-code)
    - [🕰️ Complexity Analysis](#️-complexity-analysis)
    - [🗺️ Flowchart](#️-flowchart)
    - [🎉 Summary](#-summary)
  - [Question 25 : Next Permutation](#question-25--next-permutation)
    - [🧠 Intuition](#-intuition-1)
    - [🚀 Approach](#-approach-1)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-1)
    - [🔢 Code](#-code-1)
    - [🔍 Dry Run](#-dry-run-1)
    - [🗺️ Flowchart](#️-flowchart-1)
    - [📋 Summary](#-summary-1)
    - [📈 Complexity Analysis](#-complexity-analysis)
  - [Question 26 : Majority Element - II](#question-26--majority-element---ii)
    - [🧠 Intuition](#-intuition-2)
    - [🚀 Approach](#-approach-2)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-2)
    - [🔍 Dry Run](#-dry-run-2)
    - [🔢 Code](#-code-2)
    - [🗺️ Flowchart](#️-flowchart-2)
    - [📋 Summary](#-summary-2)
    - [📈 Complexity Analysis](#-complexity-analysis-1)
  - [Question 27 : Merge Intervals](#question-27--merge-intervals)
    - [🧠 Intuition](#-intuition-3)
    - [🚀 Approach](#-approach-3)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-3)
    - [🔍 Dry Run](#-dry-run-3)
    - [🔢 Code](#-code-3)
    - [🗺️ Flowchart](#️-flowchart-3)
    - [📋 Summary](#-summary-3)
    - [📈 Complexity Analysis](#-complexity-analysis-2)
  - [Question 28 : Merge Sorted Array](#question-28--merge-sorted-array)
    - [🧠 Intuition](#-intuition-4)
    - [🚀 Approach](#-approach-4)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-4)
    - [🔍 Dry Run](#-dry-run-4)
    - [🔢 Code](#-code-4)
    - [🗺️ Flowchart](#️-flowchart-4)
    - [📋 Summary](#-summary-4)
    - [📈 Complexity Analysis](#-complexity-analysis-3)
  - [Question 29 : Longest Consecutive Sequence](#question-29--longest-consecutive-sequence)
    - [🧠 Intuition](#-intuition-5)
    - [🚀 Approach](#-approach-5)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-5)
    - [🔢 Code](#-code-5)
    - [🔍 Dry Run](#-dry-run-5)
    - [🗺️ Flowchart](#️-flowchart-5)
  - [Question 30 : Longest Subarray with Sum K](#question-30--longest-subarray-with-sum-k)
    - [💡 Intuition](#-intuition-6)
    - [🚀 Approach](#-approach-6)
    - [📝 Detailed Walkthrough](#-detailed-walkthrough-6)
    - [🏃 Dry Run Example](#-dry-run-example)
    - [💻 Code](#-code-6)
    - [🌐 Flowchart](#-flowchart)
  - [Question 31 : Subarray Sum Equals K](#question-31--subarray-sum-equals-k)
  - [Intuition 💡](#intuition-)
  - [Approach 🚀](#approach-)
  - [Detailed Walkthrough 📝](#detailed-walkthrough-)
  - [Dry Run 🏃‍♂️](#dry-run-️)
    - [Example: `nums = {1, -1, 0}`, `k = 0`](#example-nums--1--1-0-k--0)
    - [Result](#result)
  - [Code 💻](#code-)
  - [Flowchart 🖼️](#flowchart-️)
    - [Complexity Analysis 📊](#complexity-analysis-)
  - [Question 32 : Subarrays with given XOR](#question-32--subarrays-with-given-xor)
    - [Intuition 💡](#intuition--1)
    - [Approach 🚀](#approach--1)
    - [Detailed Walkthrough 📝](#detailed-walkthrough--1)
    - [Dry Run 🏃‍♂️](#dry-run-️-1)
    - [Code 💻](#code--1)
    - [Flowchart 🖼️](#flowchart-️-1)
    - [Complexity Analysis 📊](#complexity-analysis--1)
  - [Question 33 : XOR Queries of a Subarray](#question-33--xor-queries-of-a-subarray)
    - [Intuition 💡](#intuition--2)
    - [Approach 🚀](#approach--2)
    - [Code 💻](#code--2)
    - [Dry Run 🏃‍♂️](#dry-run-️-2)
    - [Flowchart 🖼️](#flowchart-️-2)
    - [Complexity Analysis 📊](#complexity-analysis--2)

## 🗳️ Question 24 : [Majority Element](https://leetcode.com/problems/majority-element/description/)

### 🧠 Intuition

The problem is to find the element that appears more than $(n/2)$ times in an array. Using the **Boyer-Moore Voting Algorithm**, we can find this element in linear time and constant space.

### 🚀 Approach

1. **Boyer-Moore Voting Algorithm**:
   - Initialize two variables: `res` to store the candidate for the majority element and `majority` to keep track of the count.
   - Traverse through the array. If the `majority` count is zero, set `res` to the current element.
   - If the current element is equal to `res`, increment the `majority` count. Otherwise, decrement it.
   - At the end of the traversal, `res` will be the majority element.

### 📜 Detailed Walkthrough

1. **Initialization**:
   - `res = 0`: This will store the candidate for the majority element.
   - `majority = 0`: This will count the number of occurrences of the current candidate.

2. **Traversal**:
   - For each element `n` in the array:
     - If `majority` is `0`, set `res = n`.
     - If `n` is equal to `res`, increment `majority` by `1`. Otherwise, decrement `majority` by `1`.

3. **Return Result**:
   - The variable `res` will hold the majority element after the traversal.

### 🔍 Dry Run

Consider `nums = [3, 2, 3]`.

1. **Initialization**:
   - `res = 0`
   - `majority = 0`

2. **First Iteration (n = 3)**:
   - `majority` is `0`, so `res = 3`
   - `majority = 1`

3. **Second Iteration (n = 2)**:
   - `n != res`, so `majority = 0`

4. **Third Iteration (n = 3)**:
   - `majority` is `0`, so `res = 3`
   - `majority = 1`

**Result**: `res = 3`

### 🔢 Code

```java
public static int majorityElement2(int[] nums) { // Without HashTable - Most Optimal
    int res = 0;
    int majority = 0;
    for (int n : nums) {
        if (majority == 0) res = n;
        majority += n == res ? 1 : -1;
    }
    return res;        
}
```

> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MajorityElement.java)

### 🕰️ Complexity Analysis
- **Time Complexity**: O(n)
  - We traverse the array once.
- **Space Complexity**: O(1)
  - We use constant extra space.

### 🗺️ Flowchart

```mermaid
graph TD;
    Start["Start"] --> Init["Initialize res = 0, majority = 0"];
    Init --> Loop["For each n in nums"];
    Loop --> CheckMajority["Is majority == 0?"];
    CheckMajority -->|Yes| SetRes["Set res = n"];
    CheckMajority -->|No| CompareRes["Compare n with res"];
    SetRes --> CompareRes;
    CompareRes -->|n == res| IncrementMajority["Increment majority"];
    CompareRes -->|n != res| DecrementMajority["Decrement majority"];
    IncrementMajority --> Loop;
    DecrementMajority --> Loop;
    Loop -->|End of loop| Return["Return res"];
    Return --> End["End"];
```

### 🎉 Summary
- The **Boyer-Moore Voting Algorithm** efficiently finds the majority element in linear time and constant space.
- By maintaining a count of the majority element and adjusting it based on the current element, we can identify the element that appears more than half the time.


## Question 25 : [Next Permutation](https://leetcode.com/problems/next-permutation/description/)

### 🧠 Intuition

The problem of finding the next permutation is about rearranging the numbers into the next lexicographically larger permutation. If such a permutation is not possible (i.e., the array is sorted in descending order), the function rearranges the array to the lowest possible order (ascending order).

### 🚀 Approach

1. **Identify the first decreasing element**:
   - Traverse from the end of the array to find the first element that is smaller than the element next to it.
2. **Identify the element to swap**:
   - Find the smallest element larger than the identified element in step 1 and swap them.
3. **Reverse the suffix**:
   - Reverse the sequence after the original position of the element found in step 1 to get the next permutation.

### 📝 Detailed Walkthrough

1. **Finding the first decreasing element (`fi`)**:
   - Traverse from the end of the array. The first element `nums[i]` such that `nums[i] < nums[i+1]` is our `fi`.
   
2. **Finding the swap index (`si`)**:
   - From the end of the array, find the first element `nums[j]` greater than `nums[fi]` to swap with `nums[fi]`.

3. **Swapping the elements**:
   - Swap `nums[fi]` and `nums[si]`.

4. **Reversing the suffix**:
   - Reverse the elements from `fi + 1` to the end of the array.

### 🔢 Code

```java
public static void nextPermutation(int[] nums) {
    int fi = -1;
    int si = Integer.MIN_VALUE;

    // Step 1: Find the first decreasing element from the end
    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            fi = i;
            break;
        }
    }

    // Step 2: If fi is not -1, find the element to swap with
    if (fi != -1) {
        for (int i = nums.length - 1; i > fi; i--) {
            if (nums[i] > nums[fi]) {
                si = i;
                break;
            }
        }
        // Swap
        int temp = nums[fi];
        nums[fi] = nums[si];
        nums[si] = temp;
    }

    // Step 3: Reverse the elements from fi+1 to end
    int l = fi + 1, r = nums.length - 1;
    while (l < r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
    }
}
```

> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/NextPermutation.java)

### 🔍 Dry Run

**Input**: `[1, 2, 3]`

1. **Finding the first decreasing element (`fi`)**:
   - Traverse from the end: `nums[2] (3) > nums[1] (2)` → No change
   - Traverse next: `nums[1] (2) > nums[0] (1)` → `fi = 0`
2. **Finding the element to swap (`si`)**:
   - Traverse from the end: `nums[2] (3) > nums[0] (1)` → `si = 2`
3. **Swapping**:
   - Swap `nums[0]` and `nums[2]`: `[3, 2, 1]`
4. **Reversing the suffix**:
   - Reverse from `fi+1` (index 1) to end: `[3, 1, 2]`

**Output**: `[1, 3, 2]`

### 🗺️ Flowchart

```mermaid
graph TD;
    Start["Start"] --> Init["Initialize fi = -1, si = Integer.MIN_VALUE"];
    Init --> FindFI["Find first decreasing element (fi)"];
    FindFI --> CheckFI["Is fi != -1?"];
    CheckFI -->|Yes| FindSI["Find element to swap (si)"];
    FindSI --> Swap["Swap nums[fi] and nums[si]"];
    Swap --> Reverse["Reverse elements from fi+1 to end"];
    CheckFI -->|No| Reverse;
    Reverse --> End["End"];
```

### 📋 Summary

The `nextPermutation` method:
1. Identifies the first decreasing element from the end of the array.
2. Finds the smallest element larger than this element to swap.
3. Swaps the two elements and reverses the suffix of the array to get the next lexicographical permutation.

### 📈 Complexity Analysis

- **Time Complexity**: $O(n)$, where `n` is the length of the array. Each step (finding `fi`, finding `si`, swapping, and reversing) takes linear time.
- **Space Complexity**: $O(1)$, since the algorithm modifies the array in place without requiring additional storage.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/)
> - Video Link for the solution [Link](https://youtu.be/JDOXKqF60RQ)

## Question 26 : [Majority Element - II](https://leetcode.com/problems/majority-element-ii/description/)

### 🧠 Intuition

The problem is to find all elements that appear more than ⌊n/3⌋ times in an array. This is an extension of the classic Boyer-Moore Voting Algorithm, which is used to find the majority element that appears more than ⌊n/2⌋ times. Since an element appearing more than ⌊n/3⌋ times can have at most two such elements, we use two counters and two candidate variables.

### 🚀 Approach

1. **First Pass**:
   - Identify two potential majority candidates using a modified Boyer-Moore Voting Algorithm.
2. **Second Pass**:
   - Count the occurrences of these two candidates to confirm if they appear more than ⌊n/3⌋ times.

### 📝 Detailed Walkthrough

1. **Initialization**:
   - `count1`, `count2` for counting the potential majority elements.
   - `candidate1`, `candidate2` for storing the potential majority element candidates.

2. **First Pass**:
   - Traverse through the array to find two potential candidates.
   - If `count1` is 0 and the current number is not `candidate2`, update `candidate1`.
   - If `count2` is 0 and the current number is not `candidate1`, update `candidate2`.
   - If the current number matches `candidate1` or `candidate2`, increment their respective counters.
   - If the current number doesn't match either candidate, decrement both counters.

3. **Second Pass**:
   - Reset `count1` and `count2` to count the actual occurrences of `candidate1` and `candidate2`.
   - Traverse through the array to count the occurrences.
   - If the count of a candidate is greater than ⌊n/3⌋, add it to the result list.

### 🔍 Dry Run

**Input**: `[3, 2, 3]`

1. **First Pass**:
   - Initial: `count1=0, candidate1=0, count2=0, candidate2=0`
   - Iteration 1: `nums[0]=3`
     - `count1=1, candidate1=3`
   - Iteration 2: `nums[1]=2`
     - `count2=1, candidate2=2`
   - Iteration 3: `nums[2]=3`
     - `count1=2, candidate1=3`

2. **Second Pass**:
   - Reset: `count1=0, count2=0`
   - Count occurrences:
     - `nums[0]=3`: `count1=1`
     - `nums[1]=2`: `count2=1`
     - `nums[2]=3`: `count1=2`

3. **Result**:
   - `count1=2` (threshold is 1), so `candidate1=3` is added to the result.

**Output**: `[3]`

### 🔢 Code

```java
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0; // Counters for the potential majority elements
        int candidate1 = 0, candidate2 = 0; // Potential majority element candidates

        // First pass to find potential majority elements.
        for (int i = 0; i < nums.length; i++) {
            // If count1 is 0 and the current number is not equal to candidate2, update candidate1.
            if (count1 == 0 && nums[i] != candidate2) {
                count1 = 1;
                candidate1 = nums[i];
            } 
            // If count2 is 0 and the current number is not equal to candidate1, update candidate2.
            else if (count2 == 0 && nums[i] != candidate1) {
                count2 = 1;
                candidate2 = nums[i];
            } 
            // Update counts for candidate1 and candidate2.
            else if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            } 
            // If the current number is different from both candidates, decrement their counts.
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3; // Threshold for majority element

        // Second pass to count occurrences of the potential majority elements.
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            }
        }

        // Check if the counts of potential majority elements are greater than n/3 and add them to the result.
        if (count1 > threshold) {
            result.add(candidate1);
        }
        if (count2 > threshold) {
            result.add(candidate2);
        }

        return result;
    }
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MajorityElementTwo.java)

### 🗺️ Flowchart

```mermaid
graph TD;
    Start["Start"] --> Init["Initialize count1, count2, candidate1, candidate2"];
    Init --> FirstPass["First Pass to find potential majority elements"];
    FirstPass --> CheckCount1["If count1 == 0 and current != candidate2"];
    CheckCount1 -->|Yes| UpdateCandidate1["Update candidate1 and set count1 to 1"];
    CheckCount1 -->|No| CheckCount2["If count2 == 0 and current != candidate1"];
    CheckCount2 -->|Yes| UpdateCandidate2["Update candidate2 and set count2 to 1"];
    CheckCount2 -->|No| CheckCandidates["If current == candidate1 or candidate2"];
    CheckCandidates -->|Yes| IncrementCount["Increment count1 or count2"];
    CheckCandidates -->|No| DecrementCount["Decrement count1 and count2"];
    DecrementCount --> FirstPass;
    IncrementCount --> FirstPass;
    UpdateCandidate1 --> FirstPass;
    UpdateCandidate2 --> FirstPass;
    FirstPass --> SecondPass["Second Pass to count occurrences of candidates"];
    SecondPass --> CountOccurrences["Count occurrences of candidate1 and candidate2"];
    CountOccurrences --> CheckThreshold["Check if counts are greater than n/3"];
    CheckThreshold -->|Yes| AddToResult["Add candidates to result list"];
    CheckThreshold --> End["End"];
    AddToResult --> End;
```

### 📋 Summary

The `majorityElement` method:
1. **First Pass**:
   - Identifies two potential majority candidates using a modified Boyer-Moore Voting Algorithm.
2. **Second Pass**:
   - Counts the occurrences of these candidates and confirms if they appear more than ⌊n/3⌋ times.

### 📈 Complexity Analysis
- **Time Complexity**: O(n), where `n` is the length of the array. The algorithm requires two passes through the array.
- **Space Complexity**: O(1), since the algorithm uses a constant amount of extra space for the counters and candidates.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/)
> - Video Link for the solution [Link](https://youtu.be/vwZj1K0e9U8)

## Question 27 : [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/)

### 🧠 Intuition

The problem is to merge overlapping intervals. This can be visualized by sorting the intervals by their starting points and then iterating through them to merge where overlaps occur. Overlapping intervals have the property that the start of one interval lies between the start and end of another interval.

### 🚀 Approach

1. **Sort the intervals** based on the starting point.
2. **Iterate through the sorted intervals** and merge overlapping intervals by updating the end points.
3. **Store non-overlapping intervals** in an output list.
4. **Convert the output list** to a 2D array to return the result.

### 📝 Detailed Walkthrough

1. **Initialization**:
   - An `ArrayList` is used to store the merged intervals.
   - Sort the intervals based on the starting point using `Arrays.sort`.

2. **Merge Logic**:
   - Iterate through the sorted intervals.
   - If the current interval overlaps with the next interval, merge them by updating the start and end points of the next interval.
   - Mark the current interval as merged by setting its start and end points to `-1`.

3. **Retrieve Merged Intervals**:
   - Iterate through the intervals again.
   - Add non-merged intervals to the output list.

4. **Convert to 2D Array**:
   - Convert the `ArrayList` to a 2D array for the final result.

### 🔍 Dry Run

**Input**: `[[1, 3], [2, 6], [8, 10], [15, 18]]`

1. **Sort**:
   - Sorted intervals: `[[1, 3], [2, 6], [8, 10], [15, 18]]`

2. **Merge**:
   - Iteration 1: `[[1, 6], [-1, -1], [8, 10], [15, 18]]`
   - Iteration 2: No merge.
   - Iteration 3: No merge.

3. **Retrieve**:
   - Result list: `[[1, 6], [8, 10], [15, 18]]`

4. **Convert**:
   - Final output: `[[1, 6], [8, 10], [15, 18]]`

### 🔢 Code

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> output = new ArrayList<>();
        // Sorting Matrix - Intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Logic
        for(int i = 0; i < intervals.length-1; i++){
            if(intervals[i+1][0] >= intervals[i][0] && intervals[i+1][0] <= intervals[i][1]){
                intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
                intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                intervals[i][0] = -1;
                intervals[i][1] = -1;
            }
        }
        // Retreiving the Merged Intervals
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] == -1 && intervals[i][1] == -1) continue;
            output.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        // Converting the ArrayList to 2D matrix
        int[][] mergedList = convertTo2DArray(output);
        // Return Statement
        return mergedList;
    }

    public static int[][] convertTo2DArray(ArrayList<int[]> list) {
        if (list.isEmpty()) {
            return new int[0][0];
        }
        int rowCount = list.size();
        int colCount = list.get(0).length; // Assuming all rows have the same number of columns
        int[][] matrix = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            matrix[i] = list.get(i);
        }
        return matrix;
    }
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MergeIntervals.java)

### 🗺️ Flowchart

```mermaid
graph TD;
    Start["Start"] --> Sort["Sort intervals by start point"];
    Sort --> Iterate["Iterate through intervals"];
    Iterate --> CheckOverlap["Check if current interval overlaps with next"];
    CheckOverlap -->|Yes| Merge["Merge intervals"];
    CheckOverlap -->|No| Continue["Continue to next interval"];
    Merge --> MarkMerged["Mark current interval as merged"];
    MarkMerged --> Iterate;
    Continue --> Iterate;
    Iterate --> Retrieve["Retrieve non-merged intervals"];
    Retrieve --> Convert["Convert list to 2D array"];
    Convert --> End["End"];
```

### 📋 Summary

The `merge` method:
1. **Sorts intervals** by their starting points.
2. **Merges overlapping intervals** using a loop and conditions.
3. **Stores non-overlapping intervals** in an output list.
4. **Converts the list to a 2D array** for the final result.

### 📈 Complexity Analysis

- **Time Complexity**: $O(n log n)$ due to sorting, where `n` is the number of intervals.
- **Space Complexity**: $O(n)$ for the output list and the final 2D array.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/)
> - Video Link for the solution [Link](https://youtu.be/IexN60k62jo)


## Question 28 : [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### 🧠 Intuition

The problem is to merge two sorted arrays (`nums1` and `nums2`) into one sorted array in place. The `nums1` array has enough space to hold elements from both arrays. We can take advantage of the fact that both arrays are already sorted by starting the merge process from the end of both arrays.

### 🚀 Approach

1. **Initialize Pointers**:
   - `i` for the last element in the initialized part of `nums1`.
   - `j` for the last element in `nums2`.
   - `k` for the last position in `nums1` (which can accommodate elements from both arrays).

2. **Merge from the End**:
   - Compare the elements pointed to by `i` and `j`.
   - Place the larger element at the position pointed to by `k` in `nums1`.
   - Move the respective pointer (`i`, `j`, or `k`) accordingly.

3. **Repeat Until All Elements from `nums2` are Merged**:
   - Continue the process until `j` becomes less than 0.

### 📝 Detailed Walkthrough

1. **Initialization**:
   - `i = m - 1` points to the last initialized element in `nums1`.
   - `j = n - 1` points to the last element in `nums2`.
   - `k = m + n - 1` points to the last position in `nums1`.

2. **Merge Process**:
   - While `j >= 0`:
     - If `i >= 0` and `nums1[i] > nums2[j]`, place `nums1[i]` at `nums1[k]` and decrement `i` and `k`.
     - Otherwise, place `nums2[j]` at `nums1[k]` and decrement `j` and `k`.

### 🔍 Dry Run

**Input**: `nums1 = [1, 2, 3, 0, 0, 0]`, `m = 3`, `nums2 = [2, 5, 6]`, `n = 3`

1. **Initialization**:
   - `i = 2`, `j = 2`, `k = 5`

2. **Merge**:
   - `nums1[2] < nums2[2]` → `nums1[5] = nums2[2]` → `k = 4`, `j = 1`
   - `nums1[2] < nums2[1]` → `nums1[4] = nums2[1]` → `k = 3`, `j = 0`
   - `nums1[2] > nums2[0]` → `nums1[3] = nums1[2]` → `k = 2`, `i = 1`
   - `nums1[1] < nums2[0]` → `nums1[2] = nums2[0]` → `k = 1`, `j = -1`

3. **Result**:
   - `nums1 = [1, 2, 2, 3, 5, 6]`

### 🔢 Code

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MergeSortedArray.java)

### 🗺️ Flowchart

```mermaid
graph TD;
    Start["Start"] --> Init["Initialize i = m-1, j = n-1, k = m+n-1"];
    Init --> Loop["While j >= 0"];
    Loop --> Cond1{"i >= 0 and nums1[i] > nums2[j]"};
    Cond1 -->|True| PlaceNums1["nums1[k] = nums1[i]; Decrement i, k"];
    Cond1 -->|False| PlaceNums2["nums1[k] = nums2[j]; Decrement j, k"];
    PlaceNums1 --> Loop;
    PlaceNums2 --> Loop;
    Loop -->|j < 0| End["End"];
```

### 📋 Summary

The `merge` method:
1. **Initializes pointers** for both arrays and the position in `nums1`.
2. **Merges the arrays** from the end, ensuring sorted order.
3. **Places elements** from `nums2` and `nums1` into their correct positions.

### 📈 Complexity Analysis

- **Time Complexity**: O(m + n) where `m` and `n` are the lengths of `nums1` and `nums2` respectively.
- **Space Complexity**: O(1) as the merging is done in place.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/)
> - Video Link for the solution [Link](https://youtu.be/n7uwj04E0I4)

## Question 29 : [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/)

### 🧠 Intuition
The goal is to find the length of the longest consecutive sequence in an unsorted array of integers. Using a `HashSet` allows us to efficiently check for the existence of elements and ensures linear time complexity.

### 🚀 Approach
1. **Insert all elements into a `HashSet`:** This allows for O(1) average time complexity for checking the existence of an element.
2. **Iterate through the set:** For each element, check if it is the start of a sequence (i.e., the element before it does not exist in the set). If it is, count the length of the consecutive sequence starting from this element.
3. **Track the maximum length:** Keep a variable to store the maximum length of consecutive sequences found.

### 📝 Detailed Walkthrough
1. **Initialization:**
   - If the input array is empty, return 0.
   - Create a `HashSet` and add all elements from the array to the set.

2. **Iterate through the set:**
   - For each element, check if it is the start of a sequence by checking if `x - 1` is not in the set.
   - If it is the start, count the length of the sequence by incrementing and checking for subsequent elements in the set.
   - Update the maximum length if the current sequence length is greater than the previous maximum.

3. **Return the maximum length found.**

### 🔢 Code
```java
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Base case: empty array

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // Add all elements to the set

        int maxLength = 1; // To store the maximum length of consecutive sequence
        int currentLength = 0; // To store the current sequence length

        for (int x : set) {
            // If x is the start of a sequence
            if (set.contains(x - 1)) continue;
            
            int y = x;
            while (set.contains(y++)) currentLength++; // Count the length of the sequence
            
            maxLength = Math.max(maxLength, currentLength); // Update maximum length
            currentLength = 0; // Reset current length for the next sequence
        }

        return maxLength;
    }
}
```

> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/LongestConsecutiveSequence.java)

### 🔍 Dry Run
Let's dry run the code with the input array: `[100, 4, 200, 1, 3, 2]`.

1. **Initialization:**
   - `set` = `{100, 4, 200, 1, 3, 2}`
   - `maxLength` = 1
   - `currentLength` = 0

2. **Iteration:**
   - For `x = 1`:
     - Start of a sequence.
     - Count sequence: `1, 2, 3, 4` (currentLength = 4)
     - Update `maxLength` to 4.
   - For `x = 2`:
     - Not the start of a sequence (`1` exists in the set).
   - For `x = 3`:
     - Not the start of a sequence (`2` exists in the set).
   - For `x = 4`:
     - Not the start of a sequence (`3` exists in the set).
   - For `x = 100`:
     - Start of a sequence.
     - Count sequence: `100` (currentLength = 1)
     - `maxLength` remains 4.
   - For `x = 200`:
     - Start of a sequence.
     - Count sequence: `200` (currentLength = 1)
     - `maxLength` remains 4.

3. **Return `maxLength`:**
   - The final `maxLength` is 4.

### 🗺️ Flowchart
```mermaid
graph TD;
    Start["Start"] --> CheckEmpty["Is nums array empty?"]
    CheckEmpty -->|Yes| ReturnZero["Return 0"]
    CheckEmpty -->|No| InitializeSet["Initialize HashSet and add all elements"]
    InitializeSet --> InitializeVars["Initialize maxLength = 1, currentLength = 0"]
    InitializeVars --> IterateSet["Iterate through each element in the set"]
    
    IterateSet --> CheckStart["Is (x - 1) not in set?"]
    CheckStart -->|No| ContinueIterate["Continue to next element"]
    ContinueIterate --> IterateSet
    CheckStart -->|Yes| InitializeY["Initialize y = x"]
    
    InitializeY --> CountSequence["While set contains y, increment y and currentLength"]
    CountSequence --> UpdateMax["Update maxLength if currentLength > maxLength"]
    UpdateMax --> ResetCurrentLength["Reset currentLength to 0"]
    ResetCurrentLength --> IterateSet
    
    IterateSet --> EndIterate["End of iteration"]
    EndIterate --> ReturnMax["Return maxLength"]
    ReturnMax --> End["End"]
```

This approach ensures you efficiently find the longest consecutive sequence in linear time while using additional space for the `HashSet`.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/)
> - Video Link for the solution [Link](https://youtu.be/n7uwj04E0I4)

## Question 30 : [Longest Subarray with Sum K](https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1)

### 💡 Intuition 
To find the length of the longest subarray with a given sum $K$, we can utilize a `HashMap` to store the prefix sums and their corresponding indices. By leveraging the prefix sum technique, we can efficiently determine subarrays that add up to $K$.

### 🚀 Approach 
1. **Initialize a `HashMap` and variables:**
   - `map` to store prefix sums and their indices.
   - `prefixSum` to keep track of the cumulative sum.
   - `maxL` to store the maximum length of subarray found.
2. **Iterate through the array:**
   - Update the `prefixSum` with the current element.
   - Store the first occurrence of each `prefixSum` in the `map`.
   - Check if the current `prefixSum` equals $K$.
   - Check if there exists a subarray with sum $K$ using the difference between the current `prefixSum` and $K$.

### 📝 Detailed Walkthrough 
1. **Initialization:**
   - Create a `HashMap` called `map` to store prefix sums and their indices.
   - Initialize `prefixSum` to 0 and `maxL` to 0.
2. **Iterate through the array $A$:**
   - For each element $A[i]$, add it to `prefixSum`.
   - Use `map.putIfAbsent(prefixSum, i)` to store the index of the first occurrence of `prefixSum`.
   - If `prefixSum` equals $K$, update `maxL` to the maximum of its current value and $i + 1$.
   - Check if `prefixSum - K` exists in `map`. If it does, update `maxL` to the maximum of its current value and the difference between the current index $i$ and the index stored in `map` for `prefixSum - K`.

### 🏃 Dry Run Example 
For `A = [10, 5, 2, 7, 1, 9]` and $K = 15$:
1. **Initialization:**
   - `map = {}`
   - `prefixSum = 0`
   - `maxL = 0`
2. **Iteration:**
   - For $i = 0$ : `prefixSum = 10`, `map = {10: 0}`
   - For $i = 1$ : `prefixSum = 15`, `maxL = 2` (subarray [10, 5]), `map = {10: 0, 15: 1}`
   - For $i = 2$ : `prefixSum = 17`, `map = {10: 0, 15: 1, 17: 2}`
   - For $i = 3$ : `prefixSum = 24`, `maxL = 2`, `map = {10: 0, 15: 1, 17: 2, 24: 3}`
   - For $i = 4$ : `prefixSum = 25`, `maxL = 2`, `map = {10: 0, 15: 1, 17: 2, 24: 3, 25: 4}`
   - For $i = 5$ : `prefixSum = 34`, `maxL = 3` (subarray [7, 1, 9]), `map = {10: 0, 15: 1, 17: 2, 24: 3, 25: 4, 34: 5}`

Final `maxL` is `3`.

### 💻 Code 
```java
public static int lenOfLongSubarr2 (int A[], int N, int K) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0, maxL = 0;
    for (int i = 0; i < N; i++) {
        prefixSum += A[i];
        map.putIfAbsent(prefixSum, i);
        if (prefixSum == K) maxL = Math.max(maxL, i + 1);
        else maxL = Math.max(maxL, i - map.getOrDefault(prefixSum - K, Integer.MAX_VALUE));
    }
    return maxL;
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/LongestSubarrayWithSumK.java)

### 🌐 Flowchart 
```mermaid
graph TD;
    A[Start] --> B[Initialize map, prefixSum, maxL]
    B --> C[Iterate through array A]
    C --> D["Update prefixSum with A[i]"]
    D --> E["map.putIfAbsent(prefixSum, i)"]
    E --> F{prefixSum == K?}
    F -->|Yes| G[Update maxL to i + 1]
    F -->|No| H[Check if prefixSum - K exists in map]
    H --> I{Exists?}
    I -->|Yes| J["Update maxL to max(maxL, i - map.get(prefixSum - K))"]
    I -->|No| K[Continue loop]
    G --> K
    J --> K
    K --> C
    C --> L[Return maxL]
    L --> M[End]
```

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/)
> - Video Link for the solution [Link](https://youtu.be/frf7qxiN2qU)


## Question 31 : [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

## Intuition 💡
The problem is to find the number of continuous subarrays whose sum equals to `k`. We use a hashmap to keep track of the cumulative sum (`prefixSum`) and the number of times this sum has occurred. This way, we can efficiently determine if there is a subarray sum that equals `k`.

## Approach 🚀
1. **HashMap Initialization**: Initialize a hashmap to store cumulative sums and their counts.
2. **Prefix Sum Calculation**: Traverse through the array, updating the cumulative sum (`prefixSum`) and checking if the difference between `prefixSum` and `k` exists in the hashmap.
3. **Count Update**: If the difference exists, add the count of that difference to the result count.
4. **HashMap Update**: Update the hashmap with the current cumulative sum.

## Detailed Walkthrough 📝
1. **Initialization**: 
   - `count = 0`: To store the number of valid subarrays.
   - `prefixSum = 0`: To store the cumulative sum of elements.
   - `map = new HashMap<>()`: To store cumulative sums and their counts.
   - `map.put(0, 1)`: Initialize with 0 sum having one count to handle subarrays starting from index 0.

2. **Iteration**:
   - For each element in the array:
     - Update `prefixSum` by adding the current element.
     - Check if `(prefixSum - k)` exists in the hashmap.
     - If exists, add the count of `(prefixSum - k)` to `count`.
     - Update the hashmap with the current `prefixSum`.

## Dry Run 🏃‍♂️
### Example: `nums = {1, -1, 0}`, `k = 0`
1. **Initial State**:
   - `count = 0`
   - `prefixSum = 0`
   - `map = {0: 1}`

2. **First Iteration (i = 0)**:
   - `prefixSum = 1` (1 + 0)
   - `prefixSum - k = 1 - 0 = 1` (not in map)
   - Update `map`: `{0: 1, 1: 1}`

3. **Second Iteration (i = 1)**:
   - `prefixSum = 0` (1 - 1)
   - `prefixSum - k = 0 - 0 = 0` (exists in map)
   - `count += map.get(0) = 1`
   - `count = 1`
   - Update `map`: `{0: 2, 1: 1}`

4. **Third Iteration (i = 2)**:
   - `prefixSum = 0` (0 + 0)
   - `prefixSum - k = 0 - 0 = 0` (exists in map)
   - `count += map.get(0) = 2`
   - `count = 3`
   - Update `map`: `{0: 3, 1: 1}`

### Result
- `count = 3`

## Code 💻
```java
public static int subarraySum(int[] nums, int k) {
    int count = 0, prefixSum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // To handle the case where the subarray starts from index 0
    for(int i = 0; i < nums.length; i++){
        prefixSum += nums[i];
        if(map.containsKey(prefixSum - k)) {
            count += map.get(prefixSum - k);
        }
        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/SubarraySumEqualsK.java)

## Flowchart 🖼️
```mermaid
graph TD
    A[Start] --> B[Initialize variables: count, prefixSum, map]
    B --> C[Iterate over nums array]
    C --> D["Update prefixSum with nums[i]"]
    D --> E{"Check if (prefixSum - k) is in map"}
    E -->|Yes| F["Update count with map.get(prefixSum - k)"]
    E -->|No| G[Do nothing]
    F --> H[Update map with prefixSum]
    G --> H[Update map with prefixSum]
    H -->|More elements| C
    H -->|No more elements| I[Return count]
    I --> J[End]
```

### Complexity Analysis 📊

1. ***Time Complexity*** ⏱️
   - **O(n)**: The algorithm traverses the array only once. Each lookup and insertion in the hashmap takes O(1) time on average. Hence, the overall time complexity is O(n), where n is the length of the array.
2. ***Space Complexity*** 🧠
   - **O(n)**: In the worst case, all elements could have different prefix sums, resulting in storing n prefix sums in the hashmap. Thus, the space complexity is O(n).


> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/arrays/count-subarray-sum-equals-k/)
> - Video Link for the solution [Link](https://youtu.be/xvNwoz-ufXA)


## Question 32 : [Subarrays with given XOR](https://www.interviewbit.com/problems/subarray-with-given-xor/)

### Intuition 💡
The goal is to find the number of subarrays whose XOR equals a given value `B`. The idea is to use a hashmap to store the XOR values encountered so far and their frequencies. This helps in efficiently finding the count of subarrays that meet the condition.

### Approach 🚀
1. **HashMap Initialization**: Initialize a hashmap to store XOR values and their counts.
2. **XOR Calculation**: Traverse through the array, updating the cumulative XOR.
3. **Count Update**: Check if `(XOR ^ B)` exists in the hashmap. If it does, add the count of this XOR to the result count.
4. **HashMap Update**: Update the hashmap with the current XOR.

### Detailed Walkthrough 📝
1. **Initialization**: 
   - `map = new HashMap<>()`: To store XOR values and their counts.
   - `map.put(0, 1)`: Initialize with XOR 0 having one count to handle subarrays starting from index 0.
   - `XOR = 0`: To store the cumulative XOR of elements.
   - `count = 0`: To store the number of valid subarrays.

2. **Iteration**:
   - For each element in the array:
     - Update `XOR` by applying XOR with the current element.
     - Check if `(XOR ^ B)` exists in the hashmap.
     - If exists, add the count of `(XOR ^ B)` to `count`.
     - Update the hashmap with the current XOR.

### Dry Run 🏃‍♂️
Example: `A = [4, 2, 2, 6, 4]`, `B = 6`
1. **Initial State**:
   - `count = 0`
   - `XOR = 0`
   - `map = {0: 1}`

2. **First Iteration (x = 4)**:
   - `XOR = 4` (0 ^ 4)
   - `XOR ^ B = 4 ^ 6 = 2` (not in map)
   - Update `map`: `{0: 1, 4: 1}`

3. **Second Iteration (x = 2)**:
   - `XOR = 6` (4 ^ 2)
   - `XOR ^ B = 6 ^ 6 = 0` (exists in map)
   - `count += map.get(0) = 1`
   - `count = 1`
   - Update `map`: `{0: 1, 4: 1, 6: 1}`

4. **Third Iteration (x = 2)**:
   - `XOR = 4` (6 ^ 2)
   - `XOR ^ B = 4 ^ 6 = 2` (not in map)
   - Update `map`: `{0: 1, 4: 2, 6: 1}`

5. **Fourth Iteration (x = 6)**:
   - `XOR = 2` (4 ^ 6)
   - `XOR ^ B = 2 ^ 6 = 4` (exists in map)
   - `count += map.get(4) = 2`
   - `count = 3`
   - Update `map`: `{0: 1, 4: 2, 6: 1, 2: 1}`

6. **Fifth Iteration (x = 4)**:
   - `XOR = 6` (2 ^ 4)
   - `XOR ^ B = 6 ^ 6 = 0` (exists in map)
   - `count += map.get(0) = 1`
   - `count = 4`
   - Update `map`: `{0: 1, 4: 2, 6: 2, 2: 1}`

7. **Result**
   - `count = 4`

### Code 💻
```java
public static int solve(ArrayList<Integer> A, int B) {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int XOR = 0, count = 0;
    for(int x : A){
        XOR ^= x;
        if(map.containsKey(XOR ^ B)){
            count += map.get(XOR ^ B);
        }
        map.put(XOR, map.getOrDefault(XOR, 0) + 1);
    }
    return count;
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/SubarrayWithGivenXOR.java)

### Flowchart 🖼️
```mermaid
graph TD
    A[Start] --> B["Initialize map with (0,1)"]
    B --> C[Initialize XOR and count to 0]
    C --> D[Iterate over each element in A]
    D --> E[Update XOR with current element]
    E --> F{"Is (XOR ^ B) in map ?"}
    F -->|Yes| G["Update count with map.get(XOR ^ B)"]
    F -->|No| H[Do nothing]
    G --> I[Update map with current XOR]
    H --> I[Update map with current XOR]
    I -->|More elements| D
    I -->|No more elements| J[Return count]
    J --> K[End]
```

### Complexity Analysis 📊

1. ***Time Complexity*** ⏱️
- $O(n)$: The algorithm traverses the array only once. Each lookup and insertion in the hashmap takes O(1) time on average. Hence, the overall time complexity is O(n), where n is the length of the array.

2. ***Space Complexity*** 🧠
- $O(n)$: In the worst case, all elements could have different XOR values, resulting in storing n XOR values in the hashmap. Thus, the space complexity is O(n).

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/)
> - Video Link for the solution [Link](https://youtu.be/eZr-6p0B7ME)


## Question 33 : [XOR Queries of a Subarray](https://leetcode.com/problems/xor-queries-of-a-subarray/)

### Intuition 💡
The goal is to find the XOR of elements between two indices for multiple queries efficiently. Using a prefix XOR array helps in reducing the time complexity for each query.

### Approach 🚀
1. **Prefix XOR Calculation**:
   - Create a prefix XOR array where each element at index `i` contains the XOR of all elements from the start to `i`.
   - This helps in computing the XOR of any subarray in constant time.

2. **Query Processing**:
   - For each query, use the prefix XOR array to find the XOR of the subarray.
   - If `left` is the starting index, and `right` is the ending index:
     - XOR from `left` to `right` can be found using the formula: `prefixXOR[right] ^ prefixXOR[left-1]`.
     - Handle the edge case where `left` is `0` by directly using `prefixXOR[right]`.

### Code 💻
```java
public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] prefixXOR = new int[arr.length];
        
        // Step 1: Calculate prefix XOR array
        prefixXOR[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixXOR[i] = prefixXOR[i-1] ^ arr[i];
        }
        
        // Step 2: Process each query using prefix XOR array
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                answer[i] = prefixXOR[right];
            } else {
                answer[i] = prefixXOR[right] ^ prefixXOR[left-1];
            }
        }
        
        return answer;
    }
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/XORQueriesOfASubarray.java)

### Dry Run 🏃‍♂️
Example: `arr = [1,3,4,8]`, `queries = [[0,1],[1,2],[0,3],[3,3]]`
1. **Initial State**:
   - `arr = [1, 3, 4, 8]`
   - `queries = [[0,1],[1,2],[0,3],[3,3]]`

2. **Prefix XOR Calculation**:
   - `prefixXOR[0] = 1`
   - `prefixXOR[1] = 1 ^ 3 = 2`
   - `prefixXOR[2] = 2 ^ 4 = 6`
   - `prefixXOR[3] = 6 ^ 8 = 14`
   - `prefixXOR = [1, 2, 6, 14]`

3. **Query Processing**:
   - Query `[0,1]`: `prefixXOR[1] = 2`
   - Query `[1,2]`: `prefixXOR[2] ^ prefixXOR[0] = 6 ^ 1 = 7`
   - Query `[0,3]`: `prefixXOR[3] = 14`
   - Query `[3,3]`: `prefixXOR[3] ^ prefixXOR[2] = 14 ^ 6 = 8`
   - Result: `[2, 7, 14, 8]`

### Flowchart 🖼️
```mermaid
graph TD
    A[Start] --> B[Initialize answer array]
    B --> C[Calculate prefix XOR array]
    C --> D[Iterate through queries]
    D --> E[For each query, determine left and right indices]
    E --> F{Is left == 0?}
    F -->|Yes| G["answer[i] = prefixXOR[right]"]
    F -->|No| H["answer[i] = prefixXOR[right] ^ prefixXOR[left-1]"]
    G --> I[Move to next query]
    H --> I[Move to next query]
    I -->|More queries| D
    I -->|No more queries| J[Return answer array]
    J --> K[End]
```

### Complexity Analysis 📊

1. ***Time Complexity*** ⏱️
- $O(n + m)$:
  - `O(n)` for calculating the prefix XOR array.
  - `O(m)` for processing the `m` queries.

2. ***Space Complexity*** 🧠
- $O(n)$:
  - Space for the prefix XOR array.

This approach ensures efficient handling of the XOR queries using the prefix XOR technique, which allows subarray XOR computation in constant time.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://leetcode.com/problems/xor-queries-of-a-subarray/solutions/5383240/easy-prefix-xor-approach-java-optimal-solution/)
> - Video Link for the solution [Link](https://youtu.be/vc7XCIbRig8)


<!-- ## Question 00 : []()

> [!NOTE]
> To see full code, [click here]()

> [!IMPORTANT]
> - Article Link for the solution [Link]()
> - Video Link for the solution [Link]() -->