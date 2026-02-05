package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solve(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            else {
                map.put(i,nums[i]);
            }
        }
        return new int[]{-1,-1};
    }

}
