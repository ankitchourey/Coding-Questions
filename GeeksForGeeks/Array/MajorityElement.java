class MajorityElement {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=nums[0];
        count=1;
        
        
        for(int i=1;i<n;i++)
        {
            if(majority==nums[i])
            {
                count++;
            }
            else
            {
                count--;
                if(count==0)
                {
                majority=nums[i];
                count=1;
                }
            }
        }
        return majority;
    }
}