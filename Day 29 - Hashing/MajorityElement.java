import java.util.*;
public class MajorityElement { 
    public static void main(String args[]){ // -> O(n)
        int nums[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            // if(hm.containsKey(nums[i])){
            //     hm.put(nums[i], hm.get(nums[i])+1);
            // }
            // else{
            //     hm.put(nums[i],1);
            // }


            // OR

            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

        }

        for(Integer key: hm.keySet()) {
            if(hm.get(key) > nums.length/3){
                System.out.println(key);
            }
        }
    }
}

