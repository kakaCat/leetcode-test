package leetcode51_60;

import java.util.LinkedList;

public class $55 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = canJump(nums);

        if (result) {
            System.out.println("可以到达最后一个位置。");
        } else {
            System.out.println("无法到达最后一个位置。");
        }
    }

    public static boolean canJump(int[] nums) {
        int maxJump = 0; // 当前能够跳到的最远位置

        for (int i = 0; i < nums.length; i++) {
            // 如果当前位置无法到达，则直接返回 false
            if (i > maxJump) {
                return false;
            }
            // 更新当前能够跳到的最远位置
            maxJump = Math.max(maxJump, i + nums[i]);

            // 如果已经可以跳到最后一个位置，则提前结束循环
            if (maxJump >= nums.length - 1) {
                break;
            }
        }

        return true;
    }


}
