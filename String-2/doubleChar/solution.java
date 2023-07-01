public String doubleChar(String str) 
{
  String newStr = "";
  for (int i = 0; i < str.length(); i++) 
  {
    newStr += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
  }
  
  return newStr;
}
