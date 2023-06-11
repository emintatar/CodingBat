public int sum2(int[] nums) 
{
  int total = 0;
  if (nums.length == 0)
  {
    return 0;
  }
  
  else if (nums.length < 2)
  {
    total = nums[0];
  }
  
  else 
  {
    total = nums[0] + nums[1];
  }
  
  return total;
}
