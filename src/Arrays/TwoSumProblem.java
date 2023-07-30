package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static int[] twoSumBruteForce(int [] nums,int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == (target - nums[i])) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("Pair not found");
    }

    public static int[] usingHashMap(int [] nums,int target){
        HashMap<Integer,Integer> twoSumMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            twoSumMap.put(nums[i],i);
            System.out.println("Two sum Map is "+twoSumMap);
        }
        for(int i=0;i<nums.length;i++){

            int numtoFind=target-nums[i];

            if(twoSumMap.containsKey(numtoFind)&&twoSumMap.get(numtoFind)!=i){
                return new int[] {i,twoSumMap.get(numtoFind)};
            }
        }
        throw new IllegalArgumentException("Pair not found");
    }

    public static void main(String[] args){
        int[] nums = {2, 11, 15, 7};
        int target = 26;
      //  System.out.println("TwoSum using BruteForceAppraoch "+Arrays.toString(twoSumBruteForce(nums,target)));
        System.out.println("TwoSum using HashMapAppraoch "+Arrays.toString(usingHashMap(nums,target)));
    }
}


