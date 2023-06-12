public String comboString(String a, String b) {
  String shorter = a;
  String longer = b;
  if (b.length() < a.length())
  {
    shorter = b;
    longer = a;
  }
  
  return shorter + longer  + shorter;
}