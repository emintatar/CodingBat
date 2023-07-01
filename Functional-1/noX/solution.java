public List<String> noX(List<String> strings) 
{
  List<String> newStrings = new ArrayList<>();
  
  for (int i = 0; i < strings.size(); i++) 
  {
    String str = strings.get(i);
    String newStr = str.replace("x", "");
    newStrings.add(newStr);
  }
  
  return newStrings;
}
