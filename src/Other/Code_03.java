package Other;

import java.util.HashSet;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 */
//hashset 去重
public class Code_03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> store = new HashSet<Integer>();
        int result = 0;
        for(int i = 0; i<nums.length;i++){
            if(store.contains(nums[i])){
                result = nums[i];
                break;
            }
            else{
                store.add(nums[i]);
            }
        }
        return result;

    }
}
