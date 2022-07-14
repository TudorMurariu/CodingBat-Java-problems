public int countHi(String str) 
{
  int c = 0;
  for(int i=0;i<str.length()-1;i++)
    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
      c++;
  return c;
}
