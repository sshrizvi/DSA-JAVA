# Striver's Array Series (***Day 5 - Expert***)
- [Striver's Array Series (***Day 5 - Expert***)](#strivers-array-series-day-5---expert)
  - [Question 34 : Three Sum](#question-34--three-sum)
    - [🧠 Intuition](#-intuition)
    - [🛠️ Approach](#️-approach)
    - [🚶 Detailed Walkthrough](#-detailed-walkthrough)
    - [🧪 Dry Run](#-dry-run)
    - [💻 Code](#-code)
    - [📊 Complexity Analysis](#-complexity-analysis)
    - [🔄 Flowchart](#-flowchart)
    - [✨ Summary](#-summary)
  - [Question 35 : Four Sum](#question-35--four-sum)
    - [Intuition 🌟](#intuition-)
    - [Approach 🚀](#approach-)
    - [Detailed Walkthrough 🛤️](#detailed-walkthrough-️)
    - [Code 📝](#code-)
    - [Dry Run 🏃‍♂️](#dry-run-️)
    - [Flowchart 🗺️](#flowchart-️)
    - [Complexity Analysis 🧮](#complexity-analysis-)

## Question 34 : [Three Sum](https://leetcode.com/problems/3sum/description/)

### 🧠 Intuition
The problem aims to find all unique triplets in the array which gives the sum of zero. The approach leverages sorting and the two-pointer technique to efficiently find such triplets.

### 🛠️ Approach
1. **Sorting**: First, sort the array. This helps in easily skipping duplicates and efficiently finding the triplets.
2. **Iteration**: Iterate through the array and use two pointers to find the triplets:
   - Fix one element (`nums[i]`) and use two pointers (`j` and `k`) to find the other two elements such that their sum is zero.
3. **Skip Duplicates**: Ensure that the same triplet is not added multiple times by skipping duplicate values for `i`, `j`, and `k`.

### 🚶 Detailed Walkthrough
1. **Sorting**: Sort the input array.
2. **Outer Loop**: Iterate through the sorted array with index `i`.
   - Skip duplicates for the `i` element to avoid repeated triplets.
3. **Two-Pointer Technique**: For each fixed `i`:
   - Initialize `j` to `i + 1` and `k` to the last index of the array.
   - Calculate the sum of `nums[i] + nums[j] + nums[k]`.
   - If the sum is zero, add the triplet to the result and adjust pointers while skipping duplicates.
   - If the sum is less than zero, increment `j`.
   - If the sum is greater than zero, decrement `k`.

### 🧪 Dry Run
Example: `nums = [-1, 0, 1, 2, -1, -4]`
1. **Sorted Array**: `[-4, -1, -1, 0, 1, 2]`
2. **Iteration**:
   - `i = 0`: `-4`
     - `j = 1`, `k = 5`: `(-4, -1, 2)`, sum = -3, increment `j`
     - `j = 2`, `k = 5`: `(-4, -1, 2)`, sum = -3, increment `j`
     - `j = 3`, `k = 5`: `(-4, 0, 2)`, sum = -2, increment `j`
     - `j = 4`, `k = 5`: `(-4, 1, 2)`, sum = -1, increment `j`
   - `i = 1`: `-1`
     - `j = 2`, `k = 5`: `(-1, -1, 2)`, sum = 0, add `[-1, -1, 2]`
     - Skip duplicates for `j` and `k`
     - `j = 3`, `k = 4`: `(-1, 0, 1)`, sum = 0, add `[-1, 0, 1]`
     - Skip duplicates for `j` and `k`
   - `i = 2`: skip since `nums[2] == nums[1]`
   - `i = 3`: `0`
     - `j = 4`, `k = 5`: `(0, 1, 2)`, sum = 3, decrement `k`

### 💻 Code
```java
public static List<List<Integer>> threeSum3(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i
        int j = i + 1, k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                // Skip duplicates for j
                while (j < k && nums[j] == nums[j + 1]) j++;
                j++;
                // Skip duplicates for k
                while (j < k && nums[k] == nums[k - 1]) k--;
                k--;
            } else if (sum < 0) {
                j++;
            } else {
                k--;
            }
        }
    }
    return ans;
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/ThreeSum.java)

### 📊 Complexity Analysis
- **Time Complexity**: $O(n^2)$
  - Sorting the array takes $O(n log n)$.
  - The nested loops together take $O(n^2)$ in the worst case.
- **Space Complexity**: $O(1)$
  - We are using only constant extra space (not counting the space required for the output list).

### 🔄 Flowchart
```mermaid
graph TD;
    A[Start] --> B[Sort the array]
    B --> C[Initialize ans list]
    C --> D[Outer loop: i from 0 to nums.length - 2]
    D -->|"If i > 0 and nums[i] == nums[i - 1], skip to next i"| D
    D --> E[Initialize j = i + 1, k = nums.length - 1]
    E --> F[Inner loop: while j < k]
    F -->|sum == 0| G[Add triplet to ans]
    G --> H[Skip duplicates for j]
    H --> I[Skip duplicates for k]
    I --> F
    F -->|sum < 0| J[Increment j]
    J --> F
    F -->|sum > 0| K[Decrement k]
    K --> F
    F --> D
    D --> L[Return ans]
    L --> M[End]
```

### ✨ Summary
- **Intuition**: Sort the array and use the two-pointer technique to find unique triplets.
- **Approach**: Use a sorted array and skip duplicates to efficiently find the triplets.
- **Dry Run**: Ensured correctness through step-by-step iteration.
- **Complexity**: Efficient with $O(n^2)$ time complexity and $O(1)$ space complexity.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero/)
> - Video Link for the solution [Link](https://youtu.be/DhFh8Kw7ymk)


## Question 35 : [Four Sum](https://leetcode.com/problems/4sum/description/)

### Intuition 🌟
The 4Sum problem aims to find all unique quadruplets in the array that sum up to a given target. Using sorting and the two-pointer technique helps efficiently narrow down potential candidates.

### Approach 🚀
1. **Sort the Array**: Sorting helps in easily skipping duplicates and applying the two-pointer technique.
2. **Fix Two Numbers and Use Two-Pointer for the Remaining Two**: Iterate through each pair of numbers and use the two-pointer technique to find pairs that sum up to the remaining target.
3. **Skip Duplicates**: Ensure that no duplicate quadruplets are added to the result.

### Detailed Walkthrough 🛤️

1. **Sort the Array**: Sorting the array in ascending order.
2. **Outer Loop**: Iterate through the array to fix the first number.
   - **Skip Duplicates**: Skip the current number if it's the same as the previous number.
3. **Inner Loop**: Iterate through the remaining array to fix the second number.
   - **Skip Duplicates**: Skip the current number if it's the same as the previous number.
4. **Two-Pointer Technique**:
   - Initialize two pointers, one starting right after the second number and the other at the end of the array.
   - Calculate the sum of the four numbers.
   - If the sum equals the target, add the quadruplet to the result and move both pointers inward while skipping duplicates.
   - If the sum is less than the target, move the left pointer to the right to increase the sum.
   - If the sum is greater than the target, move the right pointer to the left to decrease the sum.

### Code 📝
```java
public static List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        for (int j = i + 1; j < nums.length - 2; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            int k = j + 1;
            int l = nums.length - 1;
            while (k < l) {
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    k++;
                    l--;
                    while (k < l && nums[k] == nums[k - 1]) k++;
                    while (k < l && nums[l] == nums[l + 1]) l--;
                } else if (sum < target) {
                    k++;
                } else {
                    l--;
                }
            }
        }
    }
    return ans;
}
```
> [!NOTE]
> To see full code, [click here](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/FourSum.java)

### Dry Run 🏃‍♂️
**Input**: nums = [1, 0, -1, 0, -2, 2], target = 0
1. **Sorted**: [-2, -1, 0, 0, 1, 2]
2. **Iteration**:
   - i = 0 (nums[i] = -2)
     - j = 1 (nums[j] = -1)
       - k = 2, l = 5
         - sum = -2 + (-1) + 0 + 2 = -1 (k++)
         - sum = -2 + (-1) + 0 + 2 = -1 (k++)
         - sum = -2 + (-1) + 1 + 2 = 0 (found, move k and l)
         - ...
     - j = 2 (nums[j] = 0)
       - ...

### Flowchart 🗺️
```mermaid
flowchart TD
    A[Start] --> B[Sort nums]
    B --> C[Initialize ans list]
    C --> D[Iterate i from 0 to nums.length-4]
    D --> E{"Is nums[i] duplicate ?"}
    E -- Yes --> D
    E -- No --> F[Iterate j from i+1 to nums.length-3]
    F --> G{"Is nums[j] duplicate ?"}
    G -- Yes --> F
    G -- No --> H[Initialize k=j+1 and l=nums.length-1]
    H --> I{Is k < l?}
    I -- No --> F
    I -- Yes --> J["Calculate sum = nums[i]+nums[j]+nums[k]+nums[l]"]
    J --> K{Is sum == target?}
    K -- Yes --> L[Add to ans]
    L --> M[Skip duplicates for k and l]
    M --> N[Move k++, l--]
    K -- No, sum < target --> O[Move k++]
    K -- No, sum > target --> P[Move l--]
    N --> I
    O --> I
    P --> I
    F --> D
    D --> Q[Return ans]
```

### Complexity Analysis 🧮
- **Time Complexity**: $O(n^3)$
  - Sorting takes $O(n log n)$.
  - The three nested loops each contribute to $O(n)$ time complexity.
- **Space Complexity**: $O(n)$
  - The result list can store up to $O(n)$ quadruplets in the worst case.

> [!IMPORTANT]
> - Article Link for the solution [Link](https://takeuforward.org/data-structure/4-sum-find-quads-that-add-up-to-a-target-value/)
> - Video Link for the solution [Link](https://youtu.be/eD95WRfh81c)


<!-- ## Question 00 : []()

> [!NOTE]
> To see full code, [click here]()

> [!IMPORTANT]
> - Article Link for the solution [Link]()
> - Video Link for the solution [Link]() -->