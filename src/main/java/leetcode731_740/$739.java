package leetcode731_740;

import java.util.Stack;

public class $739 {

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        final int[] ints = dailyTemperatures2(temperatures);
    }
    public static int[] dailyTemperatures2(int[] temperatures) {
        int count =0 ,len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack();
        for(int i=0;i<len;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int idx = stack.pop();
                ans[idx] = i-idx;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int count =0 ,len = temperatures.length;

        int[] ans = new int[len];
        for(int i =1;i<len;i++){
            int prev =  temperatures[i-1];
            while(count+i<len){
                int cur = count+i;
                int next =  temperatures[cur];
                if(prev>next){
                    count ++;
                    break;
                }
            }
            ans[i-1] = count;
            count = 0;
        }
        return ans;
    }
}
