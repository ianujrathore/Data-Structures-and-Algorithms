# Data-Structures-and-Algorithms

---

## 🧮 Basic Math
**Definition:** Problems based on number manipulation, digit extraction, and mathematical properties.

**Problems:**  
Count Digits, Reverse Number, Palindrome Number, GCD, Armstrong Number, Print Divisors, Prime Number

**Key Concepts / Algorithms:**  
- Modulo `%` and Division `/`
- Digit extraction
- Number reversal
- Euclidean Algorithm (GCD)
- Factor checking
- Square root optimization

**Pattern Recognition:**  
- If problem involves **digits** → use `% 10` and `/ 10`
- If problem involves **factors/divisors** → loop till `√n`
- If problem asks for **common divisor** → use GCD
- If checking number property → simulate mathematically

---

## 🔁 Recursion
**Definition:** A method where a function calls itself to solve smaller subproblems.

**Problems:**  
Print N Times, Print 1 to N, Print N to 1, Sum of N Numbers, Factorial, Reverse Array, String Palindrome, Fibonacci

**Key Concepts / Algorithms:**  
- Base Case
- Recursive Call
- Backtracking
- Function Stack
- Parameterized / Functional Recursion

**Pattern Recognition:**  
- If problem repeats in the **same smaller form** → recursion
- If problem works on **indexes / ranges** → recursion fits well
- If sequence or repeated action is needed → recursion is common

---

## 📊 Arrays
**Definition:** Problems focused on storing, traversing, updating, and optimizing operations on elements.

**Problems:**  
Largest Element, Second Largest, Check Sorted, Remove Duplicates, Left Rotate, Move Zeros, Linear Search, Union, Missing Number, Consecutive Ones, Single Number, Longest Subarray Sum K

**Key Concepts / Algorithms:**  
- Traversal
- Two Pointers
- Sliding Window
- Hashing
- Prefix Sum
- In-place Modification

**Pattern Recognition:**  
- If array is **sorted** → use two pointers
- If problem asks for **subarray sum** → sliding window / prefix sum
- If problem asks for **frequency / unique** → hashing
- If problem asks to **move / rotate / rearrange** → in-place logic

---

## 📊 Arrays (Medium)
**Definition:** Medium-level array problems focus on **optimization, pattern recognition, and efficient traversal techniques**.

**Problems:**  
Two Sum, Sort an Array of 0's 1's and 2's, Majority Element-I, Kadane’s Algorithm, Print Maximum Subarray, Stock Buy and Sell, Rearrange Array by Sign, Next Permutation, Leaders in an Array, Longest Consecutive Sequence, Set Matrix Zeroes, Rotate Matrix by 90°, Spiral Matrix, Count Subarrays with Given Sum

**Key Concepts / Algorithms:**  
- Hashing
- Two Pointers
- Dutch National Flag Algorithm
- Boyer-Moore Voting Algorithm
- Kadane’s Algorithm
- Prefix Sum
- Greedy Approach
- Matrix Traversal
- In-place Modification

**Pattern Recognition:**  
- If problem asks for **target pair / lookup** → use hashing
- If array contains only **0,1,2** → use Dutch National Flag
- If problem asks for **majority frequency** → use Boyer-Moore
- If problem asks for **maximum subarray / best profit** → think Kadane / greedy
- If problem asks for **subarray count / sum** → use prefix sum + hashing
- If matrix problem asks for **transformation / traversal** → use row-column logic
- If permutation / ordering problem appears → think pivot + reverse
- If problem asks for **next greater arrangement** → use next permutation logic
