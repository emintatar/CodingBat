public List<String> moreY(List<String> strings) 
{
  List<String> newStrings = new ArrayList<>();
  for(int i = 0; i < strings.size(); i++)
  {
    String newStr = "";
    newStr += "y" + strings.get(i) +"y";
    newStrings.add(newStr);
  }
  
  return newStrings;
}
