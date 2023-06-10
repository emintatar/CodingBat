public String startOz(String str) {
  if (str.length() >= 2) 
  {
    if (str.charAt(0) == 'o' && str.charAt(1) == 'z') 
    {
      return "oz";
    } 
    
    else if (str.charAt(0) == 'o') 
    {
      return "o";
    } 
    
    else if (str.charAt(1) == 'z') {
      return "z";
    }
  } 
  
  else if (str.length() == 1 && str.charAt(0) == 'o') 
  {
    return "o";
  }

  return "";
}
