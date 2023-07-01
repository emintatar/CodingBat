public List<Integer> math1(List<Integer> nums) 
{
  List<Integer> newNums = new ArrayList<>();
  for (int i = 0; i < nums.size(); i++)
  {
    int multiplied = (nums.get(i) + 1) * 10;
    newNums.add(multiplied);
  }
  
  return newNums;
}
