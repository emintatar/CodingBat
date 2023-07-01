public List<Integer> rightDigit(List<Integer> nums) 
{
    List<Integer> newNums = new ArrayList<>();
    for(int i = 0; i < nums.size(); i++)
    {
      int rightDigit =  nums.get(i) % 10;
      newNums.add(rightDigit);
    }
    
    return newNums;
}
