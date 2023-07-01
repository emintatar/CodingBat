public List<Integer> square(List<Integer> nums) 
{
  List<Integer> newNums = new ArrayList<>();
  for(int i = 0; i < nums.size(); i++)
  {
    newNums.add(nums.get(i) * nums.get(i));
  }
  
  return newNums;
}
