public int[] makeLast(int[] nums) 
{
  int len = nums.length;
  if (len < 1)
  {
    return new int[0];
  }
  
  int[] newNums = new int[len * 2];
  newNums[newNums.length - 1] = nums[nums.length - 1];
  for (int i = 0; i < newNums.length - 1; i++)
  {
    newNums[i] = 0;
  }
  
  return newNums;
}
