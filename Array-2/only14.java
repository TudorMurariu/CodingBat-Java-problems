public boolean only14(int[] nums) {
  for(int x : nums)
    if(x != 1 && x != 4)
      return false;
  return true;
}
