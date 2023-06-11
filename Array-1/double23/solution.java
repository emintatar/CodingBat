public boolean double23(int[] nums) 
{
  int len = nums.length;
  int countTwo = 0;
  int countThree = 0;
  
  if ((len == 0) || (len == 1) || (len == 2))
  {
    for (int i = 0; i < len; i++)
    {
      if (nums[i] == 2)
      {
        countTwo += 1;
      }
      
      if (nums[i] == 3)
      {
        countThree += 1;
      }
    }
    
    if ((countTwo == 2) || (countThree == 2))
    {
      return true;
    }
  }
  
  return false;
}
