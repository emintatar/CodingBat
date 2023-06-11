public String backAround(String str) 
{
  if (str.length() >= 1) 
  {
    String lastCh = str.substring(str.length() - 1);
    return lastCh + str + lastCh;
  }
  
  return null;
}
