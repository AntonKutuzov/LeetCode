package leetcode.arrays.easy.SortArrayByParity;


import java.util.HashMap;
import java.util.Map;

/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Example:
Given:
[3,1,2,4]
Result:
[2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Solution:
1. This solution is very similar with partition of quicksort
*/
public class Solution {
    public int[] sortArrayByParity(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            while (i < j && a[i] % 2 == 0) {
                ++i;
            }
            while (i < j && a[j] % 2 != 0) {
                --j;
            }
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            ++i;
            --j;
        }
        return a;
    }
}
