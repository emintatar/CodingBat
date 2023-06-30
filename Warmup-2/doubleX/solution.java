boolean doubleX(String str) 
{
  int i = str.indexOf("x");
  if (i == -1) 
    return false;
    
  if (i + 1 >= str.length()) 
    return false;
    
  if (str.substring(i + 1, i + 2).equals("x"))
  {
    return true;
  }
  
  return false;
}
