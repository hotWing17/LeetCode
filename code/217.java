//217.存在重复元素 
//
//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

// 思路：
// 1、先把数组排序，然后遍历，查看前后两个元素是否相等
import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i-1])return true;
        }
        return false;
    }
}