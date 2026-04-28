1)Which sorting algorithm performed faster? Why? 

Advanced quick sort was faster on bigger arrays,because it's Big O notation is nlogn and it makes less comparisons than O(n^2) of bubble sort.

2)How does performance change with input size? 

Since bubble sort's increase factor is greater, it increases roughly by x100( 10^2), on the other way quick sort grows slower.

3)How does sorted vs unsorted data affect performance? 

Quick sort slows on sorted data if the last element is always pivot(wosrt case). Bubble sort performs better on sorted data.

4)Do the results match the expected Big-O complexity? 

Yep, their difference gorw bigger  as in matematical graph model predicts.

5)Which searching algorithm is more efficient? Why? 

Binary search is more effective than linear, because it eliminates half of data with every step, by the way linear search is checks every element.

6)Why does Binary Search require a sorted array?

Because the algorithm is constructed on idea that target is at left side, if its less than mid. If the list is unsorted and they are located randomly, logic fails.


The purpose of this experiment is to measure and compare the practical performance of different algorithms using Java. By testing algorithms on various data sizes and states, we can see if theoretical Big-O complexity matches real-world execution time .

Bubble Sort(O(n^2)): A basic, comparison-based sorting algorithm.

It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process repeats until the largest elements "bubble" to the end.

Quick Sort(O(n log n)): An advanced, divide-and-conquer sorting algorithm.

It picks a "pivot" element and partitions the array so that all smaller elements move to the left and larger ones to the right. It then recursively sorts the sub-arrays.

Binary Search(O(log n)): An efficient search algorithm for sorted datasets.

It finds a target by repeatedly dividing the search interval in half. It starts with the middle element; if it's not the target, it eliminates the half where the target cannot be.

<img width="2873" height="1724" alt="image" src="https://github.com/user-attachments/assets/dc79f1b8-738d-4bf2-b1ef-e9d0b0aca027" />
//I couldn't place a table here, but printed results in following orders as you can see above.

During these assignment i understood that theoretical complexity is very accurate predictor of how program will behave in as data scales. While Bubble Sort is easy to write, it is practically useless for large datasets. For this situation Merge sort will be more accuracte for usage.Quick sort is highly efficient on average(O(n log n)) but can edgrade to O(n^2) in wost case if the pivot selection is poor(alwys choosing top or bottom).
The biggest challenge was implementing Quick Sort’s recursion and partitioning logic. I initially faced an ArrayIndexOutOfBoundsException because I forgot the base case (if (low < high)), which taught me that recursive functions always need a base case to prevent them from running forever.
