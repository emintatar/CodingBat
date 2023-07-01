public List<String> addStar(List<String> strings) 
{
  List<String> newStrings = new ArrayList<>();
  for(int i = 0; i < strings.size(); i++)
  {
    newStrings.add(strings.get(i) + "*");
  }
  
  return newStrings;
}
