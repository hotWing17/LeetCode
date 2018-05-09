// Given a 32-bit signed integer, reverse digits of an integer.

// Note:

// Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 

// For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

class Solution {
    public int reverse(int x) {

        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        /*
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
        */
        // ??????
        int test = (int) result;
        return result == test ? test : 0;
    }
}