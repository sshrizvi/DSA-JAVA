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