package array;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 两个数组的交集II {


    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1,nums2);

        Arrays.stream(result).forEach(System.out::print);

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter = new HashMap();
        for (int i : nums1) {
            if(counter.containsKey(i)){
                counter.put(i, counter.get(i) + 1);
            }else {
                counter.put(i, 1);
            }
        }

        List<Integer> tempList = new ArrayList<>(nums1.length);
        for (int i : nums2) {
            if(counter.containsKey(i)&&counter.get(i)>0){
                counter.put(i, counter.get(i) - 1);
                tempList.add(i);
            }
        }
        int[] result = new int[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }

        return result;
    }


}
