class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr1 = new int[2];

       // int n= nums.length-1;

        for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length;j++){
            if(nums[i] + nums[j] == target && i!=j){
                arr1[0] = i;
                arr1[1] = j;
            }
          }

        }
        return arr1;
    }

}