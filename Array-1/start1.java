public int start1(int[] a, int[] b) {
  int nr = 0;
  
  for(int i : a)
    if(i == 1)
    {
      nr++;
      break;
    }
    
  for(int i : b)
    if(i == 1)
    {
      nr++;
      break;
    }
    
  return nr;
}

