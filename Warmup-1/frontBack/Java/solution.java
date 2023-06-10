public String frontBack(String str) 
{
  if (str.length() <= 1)
  {
    return str;
  }
  
  char[] charArray = str.toCharArray();
  
  char temp = charArray[0];
  charArray[0] = charArray[str.length() - 1];
  charArray[str.length() - 1] = temp;
  
  return new String(charArray);
}
