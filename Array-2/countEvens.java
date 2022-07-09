public int countEvens(int[] nums) {
  int c = 0;
  for(int x : nums)
    if(x % 2 == 0)
      c++;
  return c;
}
