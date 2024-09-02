# Data Structures
## Arrays
### Solution 1: Brute force
> The brute force approach to solving this problem involves using two nested loops. Initially, the outer loop traverses each element in the array. For each element, the inner loop calculates the product of all subsequent elements.

> In this approach, we maintain a variable left , which represents the cumulative product of all elements to the left of the current element being considered. This left variable is crucial because it also helps us compute the product of all elements to the right of the current index.

> By multiplying the product of subsequent elements with the cumulative product of elements to the left, we ensure that every element’s product is accurately calculated and updated in the result array. This iterative process covers all elements in the array, ensuring that the product of every element in the original array, excluding the current element itself, is correctly computed.

### Solution 2: Bidirectional product accumulation
> The algorithm first starts by traversing the array from left to right, accumulating the product of all encountered numbers up to the current index while keeping track of the left product. It then iterates through the array from right to left, computing the product of all elements to the right of the current index. At each index, this product is multiplied by the accumulated left product till that index to obtain the final result. After completing both passes, the array will contain the desired product array output.
> 
> Here is the algorithm
> 1. Left product calculation
>    1. We start with left = 1 and iterate through the array from left to right.
>    2. At each step, we accumulate the product of all encountered numbers up to the current index.
>    3. We store this cumulative product in a product array.
>    4. Simultaneously, we update left by multiplying it with the current element in the array.
> 2. Right product calculation
>    1. Similarly, we start with `right = 1` and iterate the array from right to left.
>    2. We update the elements in the product array by multiplying them with `right`, which represents the product of all elements to the right of the current index.
>    3. Simultaneously, `right` is updated by multiplying it with the current element in the array.
> By completing both passes, each element in the product array represents the product of all elements except the one at the corresponding index in the input array.