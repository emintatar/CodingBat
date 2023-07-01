public List<Integer> doubling(List<Integer> nums) 
{
  List<Integer> newNums = new ArrayList<>();

  for (int i = 0; i < nums.size(); i++) 
  {
    newNums.add(nums.get(i) * 2);
  }
  
  return newNums;
}
