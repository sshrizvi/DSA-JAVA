- [Coding Questions](#coding-questions)
  - [TUF Array Series](#tuf-array-series)
    - [Day 1 - Basic](#day-1---basic)
      - [Question 01 : Largest Element in Array](#question-01--largest-element-in-array)


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