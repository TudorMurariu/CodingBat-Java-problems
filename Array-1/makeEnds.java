public int[] makeEnds(int[] nums) {
  int[] x = new int[2];
  x[0] = nums[0];
  x[1] = nums[nums.length-1];
  return x;
}
