
public int sum13(int[] nums) {
  int sum = 0;
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i] == 13)
    {
      i++;
      continue;
    }
    sum += nums[i];
  }
  return sum;
}

// the continue keyword is just like break but intead of jumping 
// out of the loop it jumps to the next iteration 
// more on: https://www.w3schools.com/cpp/cpp_break.asp
