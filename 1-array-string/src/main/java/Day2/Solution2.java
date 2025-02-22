package Day2;

/**
 * @author lzd
 * @Description 80. 删除有序数组中的重复项 II
 * @create 2025/2/22 20:27
 */
public class Solution2 {


    public static int removeDuplicates(int[] nums) {
        int stackSize = 2; // 栈的大小，前两个元素默认保留
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[stackSize - 2]) { // 和栈顶下方的元素比较
                nums[stackSize++] = nums[i]; // 入栈
            }
        }
        return Math.min(stackSize, nums.length);
    }

}
