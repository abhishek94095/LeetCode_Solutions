class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> records = new HashMap<Integer, Integer>();
        int[] output=new int[2];
        for(int index=0;index<nums.length;index++){
            if(records.get(target-nums[index])!=null){
                 // output[0]=index;
                output[0]=records.get(target-nums[index]);
                output[1]=index;
                return output;
            }else{
                records.put(nums[index],index);
            }
        }
    return output;
    }
}
