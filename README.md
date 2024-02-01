# Daily-Temperatures

## Problem Description
Given an array of integers temperatures, where temperatures[i] is the temperature of the ith day, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] equal to 0.
## Example 
Input: temperatures = [73, 74, 75, 71, 69, 72, 76, 73]

Output: [1, 1, 4, 2, 1, 1, 0, 0]

Explanation: On the first day, the temperature is 73, and there is a warmer day (74) after it. Similarly,
on the second day, the temperature is 74, and there is a warmer day (75) after it.
The same logic applies to other days in the array.

## Solution Approach

The provided solution uses a monotonic stack to keep track of the temperatures and their corresponding indices. It iterates through the given temperatures array in reverse order. For each temperature, it checks whether there is a warmer day after the current day. If found, it updates the result array accordingly. The stack helps in maintaining a decreasing order of temperatures, ensuring an efficient way to find the next warmer day.

## Time Complexity

The time complexity of this solution is O(n), where n is the length of the input array temperatures. This is because each element is pushed and popped from the stack at most once.
## SpaceComplexity
The space complexity of this solution is o(n) where n is the length of the input array 'temperatures' .This is because the stack can potentially store information for each day in the input array. In the worst case, if all temperatures are in non-decreasing order, the stack will have to store information for each day until it reaches the last day. Therefore, the space required for the stack is proportional to the length of the input array.
