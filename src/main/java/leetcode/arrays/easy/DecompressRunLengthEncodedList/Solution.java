package leetcode.arrays.easy.DecompressRunLengthEncodedList;


/*
We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are freq elements with value val concatenated in a sublist.
Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed list.

Example:

Given:
nums = [1,2,3,4]
Result:
[2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int outputLen = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            outputLen += nums[i];
        }
        int[] output = new int[outputLen];
        int outputIndex = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                if (outputIndex >= outputLen) {
                    return output;
                }
                output[outputIndex++] = nums[i+1];
            }
        }
        return output;
    }
}
