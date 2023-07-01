public int centeredAverage(int[] nums) 
{
  for (int i = 0; i < nums.length; i++)
  {
    for (int j = i + 1; j < nums.length; j++)
    {
      if (nums[i] > nums[j])
      {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
  }
  
  if (nums.length % 2 == 1)
  {
    int mid = nums.length / 2;
    return nums[mid];
  }
  
  if (nums.length % 2 == 0)
  {
    int mid = nums.length / 2;
    return (nums[mid] + nums[mid - 1]) / 2;
  }
  
  return 0;
}
