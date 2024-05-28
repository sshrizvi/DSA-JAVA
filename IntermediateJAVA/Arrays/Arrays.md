# Table Of Contents
- [Table Of Contents](#table-of-contents)
- [Coding Questions](#coding-questions)
  - [TUF Array Series](#tuf-array-series)
    - [Day 1 - Basic](#day-1---basic)
      - [Question 01 : Largest Element in Array](#question-01--largest-element-in-array)
      - [Question 02 : Check If the Array is Sorted \& Rotated](#question-02--check-if-the-array-is-sorted--rotated)
      - [Question 03 : Second Largest Element in Array without Sorting](#question-03--second-largest-element-in-array-without-sorting)
      - [Question 04 : Searching an Element in a Sorted Array](#question-04--searching-an-element-in-a-sorted-array)
      - [Question 05 : Rotate Array](#question-05--rotate-array)
    - [Day 2 - Easy](#day-2---easy)
      - [Question 06 : Maximum Consecutive Ones](#question-06--maximum-consecutive-ones)
      - [Question 07 : Move Zeroes](#question-07--move-zeroes)
      - [Question 08 : Remove Duplicates from Sorted Array](#question-08--remove-duplicates-from-sorted-array)
      - [Question 09 : Missing Number](#question-09--missing-number)


# Coding Questions

## TUF Array Series

### Day 1 - Basic
#### Question 01 : [Largest Element in Array](https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0)

> :bulb: **Intuition** :white_check_mark:
> - We can use a `max` variable to solve the given problem.
> - The idea is simple, we assume that first element of array is the largest one.
> - Then start traversing the array and at each step checking that our variable is greater or not.
> - If not, we update the `max` variable with the new largest value.
> - There's how at the end of the traversal we will have our largest element.

**Syed's Code (*Optimal*)**
[View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/LargestElement.java)
```java
public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
```
---
#### Question 02 : [Check If the Array is Sorted & Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/)

> :bulb: **Intuition (*Optimal*)** :white_check_mark:
> - This question includes an intuition to solve it optimally which is -
> - When a sorted array is rotated, then in the rotated array there is only one point where element at index `k` is *less than* the element at index `k-1`.  
> - **Time Complexity : $O(n)$** 
> 
> :bulb: **Syed's Intuition (*Brute Force*)** :smiley:
> - Since the input array `nums` is rotated by any position `x = {0,1,2,...,n-1}` . 
> - Then we will find the rotated array of `nums` for each value of `x`.
> - If the rotated array is sorted then we `return true`, else `return false`.
> - **Time Complexity : $O(n^2)$** 

**Syed's Code (*Brute Force*)**
[View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/SortedAndRotated.java)
```java
public boolean check(int[] nums) {
        if (nums.length <= 1)
            return true;
        for (int x = 0; x < nums.length; x++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int j = (i + x) % nums.length;
                int k = (j + 1) % nums.length;
                if (nums[j] > nums[k])
                    break;
                else {
                    if (i == nums.length - 2)
                        return true;
                }
            }
        }
        return false;
    }
```

**Optimized Code**
```java
class Solution {
    public boolean check(int[] nums) {
        int ans = 0, size = nums.length;
        if (nums[0] < nums[size - 1]) {
            ans++;
        }
        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i]) {
                ans++;
                if (ans > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
```
---
#### Question 03 : [Second Largest Element in Array without Sorting](https://www.geeksforgeeks.org/problems/second-largest3735/0)

> :bulb: **Intuition (*Optimal*)** :white_check_mark:
> - If we find the largest element using `max` variable. Then the last value dropped by the `max` variable is the second largest element of the array.
> - **Conflicting Case :** If the second largest element is after the largest element in the array.
>   - *Example :* `int[] arr = {12, 35, 1, 10, 34, 1}`
>   - This case is handled using an additional condition in each iteration which is -
>       - `if(arr[i] < max1 && arr[i] > max2) max2 = arr[i];`
> - **Time Complexity :** $O(n)$

**Syed's Code (*Optimal*)**
[View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/SecondLargest.java)
```java
int print2largest(int arr[], int n) {
       int max1 = arr[0];
       int max2 = -1;
       for (int i = 1; i < arr.length; i++){
           if(max1 < arr[i]){
               max2 = max1;
               max1 = arr[i];
           }
           if(arr[i] < max1 && arr[i] > max2) max2 = arr[i];
       }
       return max2;
    }
```
---

#### Question 04 : [Searching an Element in a Sorted Array](https://www.geeksforgeeks.org/problems/who-will-win-1587115621/0)

> :bulb: **Intuition (*Optimal*)** :white_check_mark:
> - Since the given array is sorted, we can implement the Binary Search algorithm to find the target element.
> - For detail, [Click Here](https://youtu.be/C2apEw9pgtw?feature=shared)
> - **Time Complexity :** $O(\log n)$

**Syed's Code (*Optimal*)** [View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/SearchingInSortedArray.java)
```java
static int searchInSorted(int arr[], int N, int K){
        int l = 0;
        int r = N-1;
        int mid = (l+r)/2;
        
        while(l <= r){

            if(arr[mid] == K) return 1;

            else if(arr[mid] < K){
                l = mid+1;
                mid = (l+r)/2;
            }
            else{
                r = mid-1;
                mid = (l+r)/2;
            }
        }
        return -1;
    }
```
---
#### Question 05 : [Rotate Array](https://leetcode.com/problems/rotate-array/description/)

> :bulb: **Intuition (*Optimal*)** :white_check_mark:
> - Considering reversing the array might lead you to a solution for this problem.  
> 
>  **Approach** :smiley:
> 1. First, it calculates the effective rotation amount by taking the modulus of k with the length of the array, ensuring that k is within the range of the array length.
> 2. Then, it calls the reverse function three times:
>       - First, it reverses the entire array, effectively placing the last k elements at the start of the array.
>       - Second, it reverses the first k elements, moving them to the end of the array.
>       - Finally, it reverses the remaining elements, restoring the original order of the array with the elements rotated to the right by k steps.
> - **Time Complexity :** $O(n)$

**Optimal Solution** [View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/RotateArray.java)
```java
public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
    public static void reverseArray(int[] nums, int start, int end) {
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
```
---
### Day 2 - Easy
#### Question 06 : [Maximum Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/description/)

> :bulb: **Intuition** :white_check_mark:
> - The idea is very simple, we will use two variables `consOnes` for storing the current number of consecutive ones, and `prevConsOnes` for storing the previous number of consecutive ones. At the end of the iteration, `max(consOnes,prevConsOnes)` will give the result.
>
> **Approach :** :smiley:
> - Traverse the array.
> - At each iteration, if element is `1`, increment the `consOnes`.
> - If element is `0`, then -
>   - If `prevConsOnes < consOnes`, then - 
>       - `prevConsOnes = consOnes`
>   - Resest the `consOnes` to `0`.
> - After completion of iteration, `return max(consOnes,prevConsOnes)`.
>
> **Time Complexity :** $O(n)$

**Syed's Solution (*Optimal*)**
[View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MaximumConsecutiveOnes.java)

```java
public static int findMaxConsecutiveOnes(int[] nums) {
        int consOnes = 0;
        int prevConsOnes = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                consOnes++;
            }
            else{
                if(prevConsOnes < consOnes){
                    prevConsOnes = consOnes;
                }
                consOnes = 0;
            }
        }
        if(prevConsOnes < consOnes){
            return consOnes;
        }
        else{
            return prevConsOnes;
        }
    }
```
---
#### Question 07 : [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

> :bulb: **Intuition** :white_check_mark:
> - We will use two pointers to solve the problem effectively.
>
> **Approach :** :smiley:
> - Initialize `l = 0;` and `r = n-1;`
> - Run a Loop while `l <= r`.
>   - If the element at current iteration is `0` i.e. `nums[l] == 0`, then -
>       - Shift the elements towards left in the range `[l+1,r]`
>       - Place `0` at nums[r];
>       - Decrement `r` by `1`.
>   - If the element at current iteration is non-zero, then -
>       - Increment the `l` by `1`.
> - **Time Complexity :** $O(n^3/2)$
>
> **Approach (*Optimal*)** :white_check_mark:
> - We will use two pointers.
> - One pointer `i` tracks the position for the next non-zero element, while the other pointer `l` scans the array. When `nums[i]` is `0` and `nums[l]` is `non-zero`, the elements are swapped.
> - **Time Complexity :** $O(n)$

**Syed's Code**
[View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MoveZeroes.java)
```java
public void moveZeroes(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            if(nums[l] == 0){
                //Shifting
                for(int i = l; i < r; i++){
                    nums[i] = nums[i+1];
                }
                //Placing Zero at the end
                nums[r] = 0;
                r--;
            }
            else{
                l++;
            }
        }
    }
```

**Optimized Code** :white_check_mark:
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int l = 1; l < nums.length; l++){
            if(nums[i] != 0){
                i++;
            }
            else {
                if(nums[l] != 0){
                    int temp=nums[i];
                    nums[i]=nums[l];
                    nums[l]=temp;
                    i++;
                }
            }
        }
    }
}
```
---
#### Question 08 : [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)

> ### 💡 Intuition and Approach
>
> The problem at hand is to remove duplicates from a sorted array `nums` and return the new length of the array after removal, ensuring each element appears only once. The modified array should have the unique elements in the first part of the array, and it doesn't matter what you leave beyond the new length.
>
> Given the array is sorted, all duplicates are adjacent. This property can be leveraged to efficiently solve the problem in-place with \(O(n)\) time complexity and \(O(1)\) additional space complexity.
>
> ### 🧠 Intuition
>
> - Since the array is sorted, duplicates are contiguous.
> - We can maintain a pointer (`k`) that keeps track of the position of the last unique element encountered.
> - By iterating through the array and comparing the current element with the last unique element (`nums[k]`), we can identify if the current element is a duplicate.
> - If it's not a duplicate, increment `k` and update `nums[k]` with the current element.
>
> ### 📝 Approach
>
> 1. **Initialization**:
>    - Start with a pointer `k` at position 0, which will track the index of the last unique element in the array.
>
> 2. **Iteration**:
>    - Loop through the array starting from the first element.
>    - For each element `nums[i]`:
>      - Compare it with `nums[k]` (the last unique element).
>      - If they are different, it means `nums[i]` is a new unique element:
>        - Increment `k` to move to the next position for storing this new unique element.
>        - Assign `nums[i]` to `nums[k]`.
>
> 3. **Completion**:
>    - After processing all elements, the first `k + 1` elements of the array `nums` will be unique.
>    - The value `k + 1` represents the new length of the array after removing duplicates.
>
> ### 🔍 Detailed Walkthrough
>
> Let's walk through an example to clarify:
>
> Consider the input array: `nums = [1, 1, 2, 2, 3, 4, 4, 5]`.
>
> - Start with `k = 0`. The first element `nums[0]` is always unique, so it stays in place.
>
> - Loop through the array:
>   - `i = 1`: `nums[1]` (1) is equal to `nums[k]` (1). It's a duplicate, so continue to the next element.
>   - `i = 2`: `nums[2]` (2) is different from `nums[k]` (1). Increment `k` to 1 and set `nums[1]` to `nums[2]`. Now `nums` looks like `[1, 2, 2, 2, 3, 4, 4, 5]`.
>   - `i = 3`: `nums[3]` (2) is equal to `nums[k]` (2). It's a duplicate, so continue to the next element.
>   - `i = 4`: `nums[4]` (3) is different from `nums[k]` (2). Increment `k` to 2 and set `nums[2]` to `nums[4]`. Now `nums` looks like `[1, 2, 3, 2, 3, 4, 4, 5]`.
>   - `i = 5`: `nums[5]` (4) is different from `nums[k]` (3). Increment `k` to 3 and set `nums[3]` to `nums[5]`. Now `nums` looks like `[1, 2, 3, 4, 3, 4, 4, 5]`.
>   - `i = 6`: `nums[6]` (4) is equal to `nums[k]` (4). It's a duplicate, so continue to the next element.
>   - `i = 7`: `nums[7]` (5) is different from `nums[k]` (4). Increment `k` to 4 and set `nums[4]` to `nums[7]`. Now `nums` looks like `[1, 2, 3, 4, 5, 4, 4, 5]`.
>
> - The final value of `k` is 4, so the new length is `k + 1 = 5`.
>
> ### 📜 Code Explanation [View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/RemoveSortedDuplicates.java)
>
> ```java
> public class Solution {
>     public int removeDuplicates(int[] nums) {
>         int n = nums.length; // Length of the input array
>         int k = 0; // Pointer for the position of the last unique element
>
>         // Loop through the array starting from the first element
>         for (int i = 0; i < n; i++) {
>             // If the current element is different from the last unique element
>             if (nums[i] != nums[k]) {
>                 k++; // Increment the pointer for the unique element position
>                 nums[k] = nums[i]; // Update the next position with the current unique element
>             }
>         }
>
>         // The length of the array with unique elements is k + 1
>         return k + 1;
>     }
> }
> ```
>
> This code ensures that all unique elements are shifted to the front of the array and returns the new length, effectively removing duplicates in-place.
> ### Flowchart for Removing Duplicates from Sorted Array
>
> ```mermaid
> graph TD
>     Start["Start"] --> CheckEmpty{"Is the array empty?"}
>     CheckEmpty -->|Yes| ReturnZero["Return 0"]
>     CheckEmpty -->|No| Initialize["Initialize n = nums.length, k = 0"]
>     Initialize --> Loop["For i from 0 to n-1"]
>     Loop --> Condition{"nums[i] != nums[k]"}
>     Condition -->|Yes| IncrementK["k++"]
>     IncrementK --> Update["nums[k] = nums[i]"]
>     Update --> Loop
>     Condition -->|No| Loop
>     Loop -->|End of Loop| ReturnK["Return k + 1"]
>     ReturnK --> End["End"]
> ```
>
---

#### Question 09 : [Missing Number](https://leetcode.com/problems/missing-number/)

> ### 💡 Intuition and Approach
>
> The problem is to find the missing number from an array containing `n` distinct numbers taken from the range `0` to `n`. 
> 
> To solve this problem, we can use the mathematical formula for the sum of the first `n` natural numbers:
>
> \[
> \text{Sum}_{\text{expected}} = \frac{n \cdot (n + 1)}{2}
> \]
>
> ### 🧠 Intuition
> 
> - **Given**: An array `nums` of length `n` containing numbers from `0` to `n` with one missing.
> - **Objective**: Find the missing number.
> - **Approach**:
>   1. **Calculate the expected sum** of the first `n` natural numbers using the formula: \(\frac{n \cdot (n + 1)}{2}\).
>   2. **Calculate the actual sum** of the elements in the array.
>   3. **The difference** between the expected sum and the actual sum is the missing number.
> 
> ### 📝 Steps
> 
> 1. **Initialize**:
>    - Calculate the length `n` of the array.
>    - Initialize a variable `sum` to store the sum of elements in the array.
> 
> 2. **Calculate the sum** of the array elements:
>    - Iterate through each element in the array and add it to `sum`.
> 
> 3. **Calculate the expected sum** using the formula \(\frac{n \cdot (n + 1)}{2}\).
> 
> 4. **Find the missing number** by subtracting the actual sum from the expected sum.
> 
> ### 🔍 Detailed Walkthrough
> 
> - **Example**:
>   - Given array: `[3, 0, 1]`
>   - Length of the array `n = 3`
>   - Expected sum: \(\frac{3 \cdot (3 + 1)}{2} = 6\)
>   - Actual sum: \(3 + 0 + 1 = 4\)
>   - Missing number: \(6 - 4 = 2\)
> 
> ### 📜 Code Explanation [View Full Code](/IntermediateJAVA/Arrays/Striver's%20Array%20Series/MissingNumber.java)
> 
> ```java
> public class Solution {
>     public int missingNumber(int[] nums) {
>         int n = nums.length; // Length of the input array
>         int sum = 0; // Initialize sum to store the sum of elements
>         for (int num : nums) {
>             sum += num; // Calculate the sum of array elements
>         }
>         return ((n * (n + 1)) / 2 - sum); // Return the missing number
>     }
> }
> ```
>
> This code efficiently computes the missing number by leveraging the properties of arithmetic sums, ensuring a time complexity of \(O(n)\) and a space complexity of \(O(1)\).

> ### Flowchart
> 
> Here is the flowchart for the code:
> 
> ```mermaid
> graph TD
>     Start["Start"] --> Initialize["Calculate n = nums.length, Initialize sum = 0"]
>     Initialize --> Loop["For each num in nums"]
>     Loop --> AddNum["sum += num"]
>     AddNum --> Loop
>     Loop -->|All elements processed| CalculateExpectedSum["Calculate expected sum = (n * (n + 1)) / 2"]
>     CalculateExpectedSum --> CalculateMissingNumber["missingNumber = expected sum - sum"]
>     CalculateMissingNumber --> Return["Return missingNumber"]
>     Return --> End["End"]
> ```
>
> This flowchart represents the logic of the `missingNumber` method, showing the steps to calculate the expected sum, the actual sum of array elements, and finally, the missing number by finding the difference between the expected and actual sums.