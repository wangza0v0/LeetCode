class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        loop: for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    break loop;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ret = new int[2];
        ret = new Solution().twoSum(nums, target);
        System.out.println("[" + ret[0] + ", " + ret[1] + "]");
    }
}