public int sum2(int[] nums) {
  int sum = 0;
  for(int i=0;i<2 && i < nums.length;i++)
    sum += nums[i];
  return sum;
}
