class Solution {
    //it is not handle the big size array
    public void rotate(int[] nums, int k) {

        int count=0;
        int minusOne;

        while(count<k){
            minusOne=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=minusOne;
            count++;
        }
        
    }

    public void reverse(int[] nums,int si,int ei){
        while(si<=ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;

            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
}
