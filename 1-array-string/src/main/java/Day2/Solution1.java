package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lzd
 * @Description 26. 删除有序数组中的重复项
 *
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 *
 * @create 2025/2/22 20:11
 */
public class Solution1 {

    public static void main(String[] args) {
        //int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        // 使用 Stream 去重并转换为 int[]
        int[] array = Arrays.stream(nums)
                            .distinct() // 去重
                            .toArray(); // 转换为数组

        // 将去重后的结果复制回原数组（如果原数组足够大）
        System.arraycopy(array, 0, nums, 0, array.length);
        return array.length;
    }

}
