package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lzd
 * @Description 88. 合并两个有序数组
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * @create 2025/2/22 19:58
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = new ArrayList();
        for(int i = 0; i < m; i++){
            list1.add(nums1[i]);
        }

        List<Integer> list2 = new ArrayList();
        for(int i = 0; i < n; i++){
            list2.add(nums2[i]);
        }

        list1.addAll(list2);
        Collections.sort(list1);

        for(int i = 0; i < list1.size(); i++){
            nums1[i] = list1.get(i);
        }

    }


}
