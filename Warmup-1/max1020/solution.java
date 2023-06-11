public int max1020(int a, int b) 
{
  if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20))
  {
    int larger = 0;
    if (a >= 10 && a <= 20)
    {
      larger = a;
    }
    
    if ((b >= 10 && b <= 20) && larger < b)
    {
      larger = b;
    }
    
    return larger;
  }
  
  return 0;
}
