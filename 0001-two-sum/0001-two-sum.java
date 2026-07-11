class Solution {
    public int[] twoSum(int[] nums, int target) {
        int array_size=nums.length;
        for(int i=0;i<array_size-1;i++){
            for(int j=i+1;j<array_size;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

//BRUTE FORCE METHOD
//TIME COMPLEXITY O(n^2)  SPACE COMPLEXITY O(1)

