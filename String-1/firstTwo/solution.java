public String firstTwo(String str) {
  if (str.length() < 2)
  {
    return str;
  }
  
  String firstTwoChars = str.substring(0, 2);
  return firstTwoChars;
}
