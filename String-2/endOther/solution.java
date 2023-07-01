public boolean endOther(String a, String b) 
{
  if (a.toLowerCase().endsWith(b.toLowerCase()))
  {
    return true;
  }
  
  if (b.toLowerCase().endsWith(a.toLowerCase()))
  {
    return true;
  }
  
  return false;
}
