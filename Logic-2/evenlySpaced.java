public boolean evenlySpaced(int a, int b, int c) {
  if(a > c)
  {
    int aux = a;
    a = c;
    c = aux;
  }
  
  if(a > b)
  {
    int aux = a;
    a = b;
    b = aux;
  }
  
  if(b > c)
  {
    int aux = b;
    b = c;
    c = aux;
  }
  
  return a-b == b-c;
}

// we sort the 3 nums fisrt
