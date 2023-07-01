public boolean catDog(String str) 
{
  if (str.length() == 0)
  {
    return true;
  }
  
  int catCounter = 0;
  int dogCounter = 0;
  for (int i = 0; i < str.length() - 2; i++)
  {
    if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't')
    {
      catCounter++;
    }
    
    if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g')
    {
      dogCounter++;
    }
  }
  
  if (catCounter == dogCounter)
  {
    return true;
  }
  
  return false;
}
