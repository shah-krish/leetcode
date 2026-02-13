//https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequent {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                map1.put(nums[i], map1.get(nums[i])+1);
            }
            else{
                map1.put(nums[i],1);
            }
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i : map1.keySet()){
            int freq = map1.get(i);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);
        }
        int counter = 0;
        int[] ans = new int[k];
        for (int i = bucket.length - 1; i >= 0; i--) {
            if(bucket[i]!=null){
                for (int j = 0; j < bucket[i].size() && counter < k; j++) {
                    ans[counter] = bucket[i].get(j);
                    counter++;
                }
            }
        }
        return ans;
    }
}
