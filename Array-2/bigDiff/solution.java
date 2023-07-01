public int bigDiff(int[] nums) 
{
  int largest = nums[0];
  int smallest = nums[0];
  int result;
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] > largest)
    {
      largest = nums[i];
    }
    
    if (nums[i] < smallest)
    {
      smallest = nums[i];
    }
  }
  
  result = largest - smallest;
  return result;
}
