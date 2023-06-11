public int close10(int a, int b) 
{
  int distanceA = Math.abs(a - 10);
  int distanceB = Math.abs(b - 10);
  
  if (distanceA == distanceB)
  {
    return 0;
  }
  
  else if (distanceA < distanceB)
  {
    return a;
  }
  
  else 
  {
    return b;
  }
}
