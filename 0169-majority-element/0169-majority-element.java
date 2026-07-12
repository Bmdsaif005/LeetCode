class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        for (int i=0;i<n;i++){
            int majority = 0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    majority++;
                }
            }
            if(majority>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}