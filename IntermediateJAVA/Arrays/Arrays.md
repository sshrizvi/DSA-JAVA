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


# Coding Questions

## TUF Array Series

### Day 1 - Basic
#### Question 01 : [Largest Element in Array](https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0)

> **Intuition**
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
> :tip: **Approach** :smiley:
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