public List<String> lower(List<String> strings) 
{
  List<String> newStrings = new ArrayList<>();
  for(int i = 0; i < strings.size(); i++)
  {
    String loweredStr = strings.get(i).toLowerCase();
    newStrings.add(loweredStr);
  }
  
  return newStrings;
}
