public String extraEnd(String str) {
  String newString = "";
  String TwoChars = str.substring(str.length() - 2);
  for (int i = 0; i < 3; i++)
  {
    newString = newString.concat(TwoChars);
  }
  
  return newString;
}