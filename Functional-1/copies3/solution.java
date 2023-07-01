public List<String> copies3(List<String> strings) 
{
  List<String> newStrings = new ArrayList<>();
  for(int i = 0; i < strings.size(); i++)
  {
    String mergedStr = "";
    for(int j = 0; j < 3; j++)
    {
      mergedStr += strings.get(i);
    }
    
    newStrings.add(mergedStr);
  }
  
  return newStrings;
}
