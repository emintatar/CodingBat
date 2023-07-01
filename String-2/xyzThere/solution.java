public boolean xyzThere(String str) 
{
  for (int i = 0; i < str.length() - 2; i++)
  {
    if (i == 0 && str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' 
      && str.charAt(i + 2) == 'z') 
    {
      return true;
    }
    
    if (i > 0 && str.charAt(i - 1) != '.' && str.charAt(i) == 'x' 
      && str.charAt(i + 1) == 'y' 
      && str.charAt(i + 2) == 'z')
    {
      return true;
    }
  }
  
  return false;
}
