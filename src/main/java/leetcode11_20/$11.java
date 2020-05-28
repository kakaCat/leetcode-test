package leetcode11_20;

/**
 * @ClassName $11
 * @Description 11. 盛最多水的容器
 * @Author yunp
 * @Date 2020/5/22 10:47
 * @Version 1.0
 **/
public class $11 {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(height);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {

        int l= 0, r =  height.length-1;

        int ans = 0;
        while(l<r){

            int area = getMinHeight(height[l], height[r]) * (r - l);
            ans = getMaxAre(ans, area);

            if(height[l]<height[r]){
                l++;
            }else {
                r--;
            }

        }
        return ans;
    }
    private static int getMinHeight(int l, int r){

        return l<=r?l: r;
    }

    private static int getMaxAre(int ans,int area){
        return ans >= area ? ans : area;
    }


}
