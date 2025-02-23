package Day3;

/**
 * @author lzd
 * @Description 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * @create 2025/2/23 19:53
 */

public class Solution2 {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        // 拷贝一份数组
        int[] temp = nums.clone();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[(i + k) % len] = temp[i];
        }
    }
}
