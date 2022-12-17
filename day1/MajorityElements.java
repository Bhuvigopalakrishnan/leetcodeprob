class Solution 
{
    public int majorityElement(int[] nums) 
    {
        //int val= (nums.length/2)+1;
        int count=0,curr=0;
        for(int i=0;i<nums.length;i++)
        {
             curr=nums[i];
             for(int j=0;j<nums.length;j++)
             {
                 if(curr==nums[j])
                 {
                     count++;
                 }
                 if(count>=((nums.length/2)+1))
                 {
                    return curr;
                 }
             }
        }
        return -1;
    }
}
